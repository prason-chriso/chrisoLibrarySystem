/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.model;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Date;
//import java.util.Date;


/**
 *
 * @author Amit
 */
public class Student {
    private int studentId;
    private long contact;
    private int batch;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Date dateOfBirth;
    private String  email;
    private String gender ;
    private String department;
    private Blob studentPhoto;
    private String url ; 

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    private int studentIdNew;//this varaibble is used when the 
    //record is to be updated to hold the data that means the new 
    //id of the student ;

    public int getStudentIdNew() {
        return studentIdNew;
    }

    public void setStudentIdNew(int studentIdNew) {
        this.studentIdNew = studentIdNew;
    }
    

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Blob getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(Blob studentPhoto) {
        this.studentPhoto = studentPhoto;
    }    
}
