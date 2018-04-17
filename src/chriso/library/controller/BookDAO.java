/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.controller;

import chriso.library.miscelleneous.CreateNewConnection;
import chriso.library.miscelleneous.ErrorOutputHolder;
import chriso.library.model.Book;
import chriso.library.model.LocalBookEntry;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amit
 */
public class BookDAO {

    public boolean insertBookRecord(Book obj, LocalBookEntry obj1) {
        boolean success = false;
        try {
            
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            con.setAutoCommit(false);
            
            //sql query to insert the book record 
            String sql = "insert into book(isbn,bookTitle, bookAuthor, stockAvailable, bookShelf, columnNo, rowNo, localCodeFrom, localCodeTo, bookCover)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            System.out.println("entry in the block insert Book Record success after auto commit is false)");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setLong(1,obj.getIsbn());
            pst.setString(2,obj.getBookTitle());
            pst.setString(3, obj.getBookAuthor());
            pst.setInt(4,obj.getStockAvailable());
            pst.setInt(5,obj.getBookShelf());
            pst.setInt(6,obj.getCol());
            pst.setInt(7,obj.getRow());
            pst.setInt(8, obj.getLocalCodeFrom());
            pst.setInt(9,obj.getLocalCodeTo());
            //now prepareing the book cover image to process for the insertion
            
            FileInputStream fis = new FileInputStream(new File(obj.getBookURL()));
            pst.setBinaryStream(10, fis);
            pst.executeUpdate();
            
            System.out.println("first book table data inserted ");
            String sql1 ="insert into localbookentry (bookCode, isbn, Status)values(?,?,?)";
            PreparedStatement pst1 = con.prepareStatement(sql1);
            //this loop will insert the record in the child table 
            //localbookentry so that each book of same type can be handled individually;
            //it means as many stock, as many records with their status 
            System.out.println("exactly before the loop begins;");
            for(int i=obj1.getFrom() ; i<=obj1.getTo();i++){
            System.out.println("loop begin here for "+i);
            pst1.setInt(1,i);
            pst1.setLong(2, obj1.getIsbn());
            pst1.setString(3, obj1.getBookStatus());
            
            pst1.executeUpdate();
            System.out.println("record in child table localbookentry inseted for code"+i);
            }
            success= true;
            con.commit(); //commit the transaction 
            con.close();
            
        } catch (Exception ex) {
            ErrorOutputHolder.errorText = ex.getMessage();
         }

        return success;
    }//end of the insertion of the new book record block
    
    
    
    //this function will return the list of all the book record currently stored in the 
    //libraray by returning the object of book type that consist  of all the information 
    //of the each book distinguished by the isbn number 
    //this doesnot hold the information about the local code
    public List<Book> getAllBookDetailList(){
        List<Book> list  = new ArrayList();
      
        try{
            //creating the new connection ;
              CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            String sql = "Select * from book ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
              Book book = new Book();  //create new object each time the new row is encountered
                book.setIsbn(rs.getLong("isbn"));
                book.setBookAuthor(rs.getString("bookAuthor"));
                book.setBookTitle(rs.getString("bookTitle"));
                book.setStockAvailable(rs.getInt("stockAvailable"));
                book.setBookShelf(rs.getInt("bookShelf"));
                book.setCol(rs.getInt("columnNo"));
                book.setRow(rs.getInt("rowNo"));
                book.setLocalCodeFrom(rs.getInt("localCodeFrom"));
                book.setLocalCodeTo(rs.getInt("localCodeTO"));
                
                System.out.println("All information of the book is new object is stored "); 
               list.add(book);
             }
            con.close();
         }
         catch(Exception ex){
             System.out.println("form the getAllBookList block in BookDAO"+ex);
         }
      return list ;
    }

    
    //this function will return the book object with all the information stored 
    //in it about the book for which the request of search is generated 
    public List<Book> getBookSearchFilterResult(Book obj, String searchCategory){
       if(obj!=null){ //only execute the below code if obj consist of some value
        List<Book> bookList = new ArrayList();
        int count =0;
        String sql ;
        PreparedStatement  pst;
        ResultSet rs ;
        try{
              CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            
            //HINT: searchCategory may have:  "Book code", "Title", "Author"
            if(searchCategory.equalsIgnoreCase("Book code")){
                sql = "SELECT * FROM book  INNER JOIN localbookentry ON book.isbn = localbookentry.isbn WHERE localbookentry.bookCode LIKE ? GROUP BY book.isbn";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getBookCode()+"%");
                rs= pst.executeQuery();
            }
            else if(searchCategory.equalsIgnoreCase("Title")){
                sql = "SELECT * FROM book INNER JOIN localbookentry ON book.isbn = localbookentry.isbn WHERE book.bookTitle LIKE ? GROUP BY book.isbn";
                pst = con.prepareStatement(sql);
                pst.setString(1, "%"+ obj.getBookTitle()+"%");
                rs= pst.executeQuery();
            }
            else if(searchCategory.equalsIgnoreCase("Author")){
                sql = "SELECT * FROM book INNER JOIN localbookentry ON book.isbn = localbookentry.isbn WHERE book.bookAuthor LIKE ? GROUP BY book.isbn";
                pst = con.prepareStatement(sql);
                pst.setString(1, "%"+obj.getBookAuthor()+"%");
                rs= pst.executeQuery();
            }
            else{
                rs=null;
            }
           while(rs.next()){
               count++;
               Book book = new Book();
               book.setBookAuthor(rs.getString("bookAuthor"));
               book.setBookCode(rs.getInt("bookCode"));
               book.setBookTitle(rs.getString("bookTitle"));
               book.setBookStatus(rs.getString("status"));
               book.setBookShelf(rs.getInt("bookShelf"));
               book.setStockAvailable(rs.getInt("stockAvailable"));
               book.setCol(rs.getInt("columnNo"));
               book.setRow(rs.getInt("rowNo"));
               book.setIsbn(rs.getLong("book.isbn"));
               book.setLocalCodeFrom(rs.getInt("localCodeFrom"));
               book.setLocalCodeTo(rs.getInt("localCodeTo"));
               
               System.out.println(count+"Success fully added the data in book object after search");
               bookList.add(book);
           }
            
            con.close();
        }
        catch(Exception ex){
            System.out.println("from the get Book Search Result "+ex);
        }
        return bookList;
       }
       else return null; //when the book object received has no value then 
       //null list is returned;
    }
    
    
    //this function will update the book record if one record is selected 
    //from the display all book list table
    public Book getSearchResultAndUpdate(Book book){
        try{
              CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
         String sql = "SELECT * FROM book  INNER JOIN localbookentry ON book.isbn = localbookentry.isbn WHERE localbookentry.bookCOde=? ";
                
         PreparedStatement pst = con.prepareStatement(sql);
         pst.setInt(1,book.getBookCode());
         ResultSet rs = pst.executeQuery();
         while(rs.next()){
               book.setBookAuthor(rs.getString("bookAuthor"));
               book.setBookCode(rs.getInt("bookCode"));
               book.setBookTitle(rs.getString("bookTitle"));
               book.setBookStatus(rs.getString("status"));
               book.setBookShelf(rs.getInt("bookShelf"));
               book.setStockAvailable(rs.getInt("stockAvailable"));
               book.setCol(rs.getInt("columnNo"));
               book.setRow(rs.getInt("rowNo"));
               book.setIsbn(rs.getLong("book.isbn"));
               book.setLocalCodeFrom(rs.getInt("localCodeFrom"));
               book.setLocalCodeTo(rs.getInt("localCodeTo"));
               book.setBookCover(rs.getBlob("bookCover"));
               System.out.println("Success fully added the data in book object after search");
         }
         
           
        }
        catch(Exception ex){
            System.out.println("from the getSearchResultAndUpdate book block"+ex);
        }
        return book;
    }
    
    //this function will perform the task of updating hte book record 
    //if the admin tries to update it
    public boolean updateBookRecord(Book obj, LocalBookEntry obj1) {
        boolean success = false;
        PreparedStatement pst ; 
        try {
            
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            con.setAutoCommit(false);
            
            //sql query to insert the book record 
            String sql = "update localbookentry inner join book on "
                    + "localbookentry.isbn = book.isbn set "
                    + "book.isbn=?, localbookentry.isbn = ?, bookTitle=?,"
                    + " bookAuthor=?, "
                    + "stockAvailable=?, bookShelf=?, columnNo=?, rowNo=?, "
                    + "bookCover=? where localbookentry.bookCode>=?"
                    + " AND localbookentry.bookCode<=?";
            
            System.out.println("entry in the block update Book Record success after auto commit is false)");
            
            pst = con.prepareStatement(sql);
            pst.setLong(1,obj.getNewIsbn());
            pst.setLong(2,obj.getNewIsbn());
            pst.setString(3,obj.getBookTitle());
            pst.setString(4, obj.getBookAuthor());
            pst.setInt(5,obj.getStockAvailable());
            pst.setInt(6,obj.getBookShelf());
            pst.setInt(7,obj.getCol());
            pst.setInt(8,obj.getRow());
                        //now prepareing the book cover image to process for the insertion
            if(!obj.getBookURL().equals("")){
            FileInputStream fis = new FileInputStream(new File(obj.getBookURL()));
            pst.setBinaryStream(9, fis); //this is setting for the book cover
            }
            else{
                pst.setBinaryStream(9,null);
            }
            pst.setInt(10, obj.getLocalCodeFrom());
            pst.setInt(11,obj.getLocalCodeTo());
            pst.executeUpdate();
            
            con.commit(); //commit the transaction 
            success= true;
            con.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
       return success;
    }//end of the insertion of the new book record block

    
    
}
