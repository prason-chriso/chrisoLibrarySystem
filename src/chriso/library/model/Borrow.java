/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.model;

import java.sql.Date;

/**
 *
 * @author Amit
 */
public class Borrow {
    private int borrowId;
    private int adminId;
    private int bookId;
    private int studentId;
    private Date borrowDate;
    private Date submisionDate;
    private Date returnDate;
    private int borrowQuantity;
    
    public Date getReturnDate() {
        return returnDate;
    }

    //further more variable that is used when displaying the borrow list in the table
    //like : 
    //"StudentId", "Full Name","Department", "contact", "Book Code", "Book Title", "Taken",
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
     //"Borrow Date","Submisstion Date", "Issued By", "Librarian ID"
    private String studentName;
    private String department;
    private long contact;
    private String bookTitle;
    private int librarianId;
    private String librarianName;
    private String bookName;
    private String bookStatus;
    private long isbn;
    private String clearStatus;

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus;
    }
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
    
    

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getSubmisionDate() {
        return submisionDate;
    }

    public void setSubmisionDate(Date submisionDate) {
        this.submisionDate = submisionDate;
    }

    public int getBorrowQuantity() {
        return borrowQuantity;
    }

    public void setBorrowQuantity(int borrowQuantity) {
        this.borrowQuantity = borrowQuantity;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }    
}
