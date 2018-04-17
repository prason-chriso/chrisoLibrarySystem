/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.model;

import java.awt.Image;
import java.sql.Blob;

/**
 *
 * @author Amit
 */
public class Book {
private int bookCode;
private int localCodeFrom;
private int localCodeTo;
private long isbn;
private String bookAuthor;
private String bookTitle;
private String bookStatus;
private int stockAvailable;
private int bookShelf;
private int col;
private int row;
private Blob bookCover;
private String bookURL; 
private long newIsbn;//used when updating the iisbn of the old book;

    public long getNewIsbn() {
        return newIsbn;
    }

    public void setNewIsbn(long newIsbn) {
        this.newIsbn = newIsbn;
    }


    public String getBookURL() {
        return bookURL;
    }

    public void setBookURL(String bookURL) {
        this.bookURL = bookURL;
    }


    public Blob getBookCover() {
        return bookCover;
    }

    public void setBookCover(Blob bookCover) {
        this.bookCover = bookCover;
    }

    public int getLocalCodeFrom() {
        return localCodeFrom;
    }

    public void setLocalCodeFrom(int localCodeFrom) {
        this.localCodeFrom = localCodeFrom;
    }

    public int getLocalCodeTo() {
        return localCodeTo;
    }

    public void setLocalCodeTo(int localCodeTo) {
        this.localCodeTo = localCodeTo;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(int stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public int getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(int bookShelf) {
        this.bookShelf = bookShelf;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }
    
    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus){
        this.bookStatus = bookStatus;
    }

}
