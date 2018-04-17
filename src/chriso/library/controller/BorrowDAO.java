/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.controller;

import chriso.library.miscelleneous.CreateNewConnection;
import chriso.library.miscelleneous.ErrorOutputHolder;
import chriso.library.model.Book;
import chriso.library.model.Borrow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class BorrowDAO {

    public boolean insertBorrowRecord(Borrow obj) {
        boolean success = false;
        int bookCode, currentStock,requestQuantity, newStock;
        System.out.println("inside the insert borroww function :");
        try {
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            
            BookDAO  bd = new BookDAO();
            Book book = new Book();
            bookCode = obj.getBookId();
            book.setBookCode(bookCode);
            book  = bd.getSearchResultAndUpdate(book);
            currentStock = book.getStockAvailable();
            requestQuantity = obj.getBorrowQuantity();
            newStock = currentStock-requestQuantity;
            if(book.getStockAvailable()==0){
                JOptionPane.showMessageDialog(null,"Your requested book has Zero Stock,"
                        + "\n so you can't borrow it currently");
                return false;
            }
            else if(newStock<0){
                JOptionPane.showMessageDialog(null,"Can't fulfill your request "+AdminDAO.CURRENT_ADMIN_NAME+
                        "\n Only "+currentStock+" book(s) are in our stock");
                return false;
            }
                  
            
            con.setAutoCommit(false);
            //now we also need to update the book quantity of the book table 
            String sql1 =" update book left join localbookentry on localbookentry.isbn=book.isbn"
                    + " set book.stockAvailable=? where localbookentry.bookCode=?";
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst1.setInt(1,newStock);
            pst1.setInt(2,bookCode);
            pst1.executeUpdate();
            
            
            String sql = "insert into borrow(borrowDate,dueDate, borrowQuantity, adminId, studentId, bookCode)"
                    + "values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDate(1, obj.getBorrowDate());
            pst.setDate(2,obj.getSubmisionDate());
            pst.setInt(3, obj.getBorrowQuantity());
            pst.setInt(4, obj.getAdminId());
            pst.setInt(5, obj.getStudentId());
            pst.setInt(6, obj.getBookId());
            pst.executeUpdate();
                      
            con.commit();
            success = true;
            System.out.println("insided try");
        } catch (Exception ex) {
            ErrorOutputHolder.borrowErrorText = ex.getMessage();
            System.out.println("from the BOrrowDAO insert new record" + ex);
        }
        return success;
    }

    //this function will return all the borrow list of the 
    //library being manageed with full description
    public List<Borrow> getAllBorrowList() {
        List<Borrow> list = new ArrayList();
        try {
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            String sql = "Select student.studentId, student.firstName, student.lastName, department,"
                    + " student.contact, localbookentry.bookCode, bookTitle,"
                    + " borrowQuantity, borrowDate, dueDate, borrow.adminId,"
                    + " librarian.firstName, librarian.lastName,clearStatus"
                    + " from book inner join localbookentry"
                    + " on book.isbn=localbookentry.isbn"
                    + " inner join borrow on localbookentry.bookCode=borrow.bookCode"
                    + " inner join librarian on borrow.adminId = librarian.adminId"
                    + " inner join student on borrow.studentId = student.studentId"
                    + " GROUP BY borrow.bookCode";
     //Hint: total column to fetch "StudentId", "Full Name","Department",
            // "contact", "Book Code", "Book Title", "Taken",
            //"Borrow Date","Submisstion Date", "Issued By", "Librarian ID"

            //now storing it in the variable
            ResultSet rs = con.prepareStatement(sql).executeQuery();
            while (rs.next()) {
                Borrow b = new Borrow();
                b.setAdminId(rs.getInt("borrow.adminId"));
                b.setStudentId(rs.getInt("student.studentId"));
                b.setStudentName(rs.getString("student.firstName") + " " + rs.getString("student.lastName"));
                b.setDepartment(rs.getString("department"));
                b.setContact(rs.getLong("student.contact"));
                b.setBookId(rs.getInt("localbookentry.bookCode"));
                b.setBookTitle(rs.getString("bookTitle"));
                b.setBorrowQuantity(rs.getInt("borrowQuantity"));
                b.setBorrowDate(rs.getDate("borrowDate"));
                b.setSubmisionDate(rs.getDate("dueDate"));
                b.setLibrarianId(rs.getInt("borrow.adminId"));
                b.setLibrarianName(rs.getString("librarian.firstName") + " " + rs.getString("librarian.lastName"));
                b.setClearStatus(rs.getString("clearStatus"));
// HInt : column to store value from                
//                student.studentId, student.firstName, student.lastName, department,"
//                + "student.contact, localbookentry.bookCode, bookTitle,"
//                + "borrowQuantity, borrowDate, dueDate, borrow.adminId,"
//                + "librarian.firstName, librarian.lastName"
                list.add(b);
                System.out.println("SuccessfullyAdded the borrowed data in the list");
            }
        } catch (Exception ex) {
            System.out.println("form the getAllBorrowList Block BorrowDAO" + ex);

        }
        return list;
    }

    public List <Borrow> getFilterSearch(Borrow obj, String searchCategory) {
        List<Borrow> list = new ArrayList();
        PreparedStatement pst;
        ResultSet rs;
        try {
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            //this query will be similar 
            String sql = "Select student.studentId, student.firstName, student.lastName, department,"
                    + " student.contact, localbookentry.bookCode, bookTitle,"
                    + " borrowQuantity, borrowDate, dueDate, borrow.adminId,"
                    + " librarian.firstName, librarian.lastName,clearStatus"
                    + " from book inner join localbookentry"
                    + " on book.isbn=localbookentry.isbn"
                    + " inner join borrow on localbookentry.bookCode=borrow.bookCode"
                    + " inner join librarian on borrow.adminId = librarian.adminId"
                    + " inner join student on borrow.studentId = student.studentId";

            if (searchCategory.equalsIgnoreCase("Isbn No.")) {
                sql += " where localbookentry.isbn LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getIsbn()+"%");
                rs = pst.executeQuery();

            } else if (searchCategory.equalsIgnoreCase("bookCode")) {
                sql += " where borrow.bookCode LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getBookId()+"%");
                rs = pst.executeQuery();

            } else if (searchCategory.equalsIgnoreCase("Book Name")) {
                sql += " where book.bookTitle LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getBookName()+"%");
                rs = pst.executeQuery();
            } else if (searchCategory.equalsIgnoreCase("Book Status")) {
                sql += " where localbookentry.status LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getBookStatus()+"%");
                rs = pst.executeQuery();

            } else if (searchCategory.equalsIgnoreCase("Student Id")) {
                sql += " where borrow.studentId LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getStudentId()+"%");
                rs = pst.executeQuery();
            } else if (searchCategory.equalsIgnoreCase("StudentName")) {
                sql += " where student.firstName LIKE ? OR student.lastName LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getStudentName()+"%");
                 pst.setString(2,"%"+obj.getStudentName()+"%");
                rs = pst.executeQuery();
            } else if (searchCategory.equalsIgnoreCase("DepartMent")) {
                sql += " where student.department LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getDepartment()+"%");
                rs = pst.executeQuery();

            } else if (searchCategory.equalsIgnoreCase("Admin Id")) {
                sql += " where borrow.adminId LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getLibrarianId()+"%");
                rs = pst.executeQuery();
            } else if (searchCategory.equalsIgnoreCase("Admin Name")) {
                sql += " where librarian.firstName LIKE ? OR librarian.lastName LIKE ?";
                pst = con.prepareStatement(sql);
                pst.setString(1,"%"+obj.getLibrarianName()+"%");
                pst.setString(2,"%"+obj.getLibrarianName()+"%");
                rs = pst.executeQuery();
            } else {
                rs  = null;
            }
            while(rs.next()){
                
                Borrow b = new Borrow();
                b.setAdminId(rs.getInt("borrow.adminId"));
                b.setStudentId(rs.getInt("student.studentId"));
                b.setStudentName(rs.getString("student.firstName") + " " + rs.getString("student.lastName"));
                b.setDepartment(rs.getString("department"));
                b.setContact(rs.getLong("student.contact"));
                b.setBookId(rs.getInt("localbookentry.bookCode"));
                b.setBookTitle(rs.getString("bookTitle"));
                b.setBorrowQuantity(rs.getInt("borrowQuantity"));
                b.setBorrowDate(rs.getDate("borrowDate"));
                b.setSubmisionDate(rs.getDate("dueDate"));
                b.setLibrarianId(rs.getInt("borrow.adminId"));
                b.setLibrarianName(rs.getString("librarian.firstName") + " " + rs.getString("librarian.lastName"));
                b.setClearStatus(rs.getString("clearStatus"));
// HInt : column to store value from                
//                student.studentId, student.firstName, student.lastName, department,"
//                + "student.contact, localbookentry.bookCode, bookTitle,"
//                + "borrowQuantity, borrowDate, dueDate, borrow.adminId,"
//                + "librarian.firstName, librarian.lastName"
                list.add(b); //adding the object in the list 
            }
                       
        } catch (Exception ex) {
            System.out.println("from the getFiltersearch of the BorrowDAO" + ex);
        }
        return list;
    }
}
