/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.model;

/**
 *
 * @author Amit
 */
public class LocalBookEntry {
long isbn;
int bookCode;
String bookStatus;
int to;
int from;
private int oldBookCode;

    public int getOldBookCode() {
        return oldBookCode;
    }

    public void setOldBookCode(int oldBookCode) {
        this.oldBookCode = oldBookCode;
    }


    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
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

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

}
