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
public class Admin {
  private int adminId;
  private String firstName;
  private String lastName;
  private String userName;
  private String password;
  private String email;
  private long contact;
  private int reportTo; // all normal admin will report to the super admin with
  // his id is 0 and this value is automatically set when the new entry is 
  // inserted in the table of the Admin 
  // it can also be controlled with this java class
  
  private Blob adminPhoto;
  private String adminProfileImageUrl;
  

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getReportTo() {
        return reportTo;
    }

    public void setReportTo(int reportTo) {
        this.reportTo = reportTo;
    }

    public Blob getAdminPhoto() {
        return adminPhoto;
    }

    public void setAdminPhoto(Blob adminPhoto) {
        this.adminPhoto = adminPhoto;
    }

    public String getAdminProfileImageUrl() {
        return adminProfileImageUrl;
    }

    public void setAdminProfileImageUrl(String adminProfileImageUrl) {
        this.adminProfileImageUrl = adminProfileImageUrl;
    }
  
    
}
