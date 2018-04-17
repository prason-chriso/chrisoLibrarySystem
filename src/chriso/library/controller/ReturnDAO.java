/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.controller;

import chriso.library.miscelleneous.CreateNewConnection;
import chriso.library.model.Return;
import chriso.library.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amit
 */
public class ReturnDAO {
    
    //this function will help to return list of total bookk borrwed by the 
    //particular student
    public List<Return> getBorrowBookList(Return obj){
      List<Return> list = new ArrayList();
      //initialize as null
      try{
          //creating the connection
        CreateNewConnection c =new  CreateNewConnection();
        Connection con = c.createConnection();
        //fetching the record query
        String sql = "SELECT borrowId, borrowDate, dueDate, borrowQuantity, adminId, bookCode, firstName, lastName"
                + " FROM borrow LEFT JOIN student ON borrow.studentId=student.studentId "
                + "WHERE student.studentId=? AND borrow.clearStatus!='CLEAR'";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,obj.getStudentId());
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            //untill the record is present in the resultset next row
            Return retObj = new Return();
            retObj.setBookCode(rs.getInt("bookCode"));
            retObj.setBorrowDate(rs.getDate("borrowDate"));
            retObj.setDueDate(rs.getDate("dueDate"));
            retObj.setStudentId(obj.getStudentId());
            retObj.setBorrowQuantity(rs.getInt("borrowQuantity"));
            retObj.setStudentName(rs.getString("firstName")+" "+rs.getString("lastName"));
            retObj.setBorrowId(rs.getInt("borrowId"));
            //add the object to the list;
            list.add(retObj);
        }//end of while loop 
        con.close();      
      }
      catch(Exception ex){
          System.out.println("from the ReturnDAO block getBorrowBookList"+ex);
      }
      return list; //now the list consist of seperate object 
      //for each row holding the information about the borrow made by
      //the student with the given student id
    }
    

    //this function will do the task of deleting the record from the
    //borrow table whenever the librarian will comfirm the return of the 
    //book from the student 
    public boolean studentReturnBookConfirmed(Return obj){
        boolean success = false;
        int bookBorrowQuantity, code, previousStock=0, newStock=0;
        try{
        //creating the connection
        CreateNewConnection c =new  CreateNewConnection();
        Connection con = c.createConnection();
        con.setAutoCommit(false); //when multiple sql queries are to perform the 
        //singel task then its good practise to set autoCOmmit ffalse
        //if prevent the partial value update in the data base
        
        bookBorrowQuantity = obj.getBorrowQuantity(); //tracking the curren borrowed quantity
        code= obj.getBookCode();//tracking the code of book being returned
        
        
        //query to fecth the current stock available in the library
        String sql1 ="SELECT stockAvailable FROM book INNER JOIN localbookentry ON localbookentry.isbn = book.isbn INNER JOIN borrow ON localbookentry.bookCode=borrow.bookCode WHERE borrow.bookCode = ?";
        PreparedStatement pst1 = con.prepareStatement(sql1);
        pst1.setLong(1, obj.getBookCode());
        ResultSet rs = pst1.executeQuery();
        while(rs.next()){
            previousStock = rs.getInt("stockAvailable");
            System.out.println("preevious stock  by stock available in the library is "+rs.getInt("stockAvailable"));
        }
                System.out.println("preevious stock in the library is "+previousStock);
                
            newStock = previousStock + bookBorrowQuantity; //updated stock after the 
            //book is returned by the student
        
        
             
        //query to INSERT the record into the return table
        String sql ="Insert into returntable(borrowID,returnDate)values(?,?)";
        PreparedStatement pst  = con.prepareStatement(sql);
        pst.setInt(1, obj.getBorrowId());
        pst.setDate(2, obj.getReturnedDate());
        pst.executeUpdate();
        
       
        
            
        //Also we have to update the book Stock quantity in the book table
        String sql2 = "update book left join localbookentry on localbookentry.isbn=book.isbn"
                    + " set book.stockAvailable=? where localbookentry.bookCode=?";
        PreparedStatement pst2 = con.prepareStatement(sql2);
        pst2.setInt(1,newStock );
        pst2.setInt(2,code);
        System.out.println("done the task for updating the book of returned quantity");
        pst2.executeUpdate();
        
        
       //query to update the clear status of the borrow
        String sql3 = "update borrow set clearStatus=? where borrowId=?";
        PreparedStatement pst3 = con.prepareStatement(sql3);
        pst3.setString(1,"CLEAR");
        pst3.setInt(2,obj.getBorrowId());
        System.out.println("done the task for updating the clear status of the borrow table");
        pst3.executeUpdate();
        
        success=true; //successfully delete the record 
        con.commit();
        con.close();
        }
        catch(Exception ex){
            System.out.println("form Return DAO form the return confirmed block"+ex);
        }
        return success;
    }
    
}
