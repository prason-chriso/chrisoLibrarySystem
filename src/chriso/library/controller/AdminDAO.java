/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.controller;

import chriso.library.miscelleneous.CreateNewConnection;
import chriso.library.model.Admin;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class AdminDAO {
//function to insert the new admin record
//            in the database table name "admin" 
    public static int CURRENT_ADMIN=-1;
    public static String CURRENT_ADMIN_NAME;
    public boolean insertAdminRecord(Admin obj){
        String sql;
        boolean success =false;
        //create the connection 
        CreateNewConnection c = new CreateNewConnection();
        Connection con = c.createConnection();
       try{
        
        if(CURRENT_ADMIN==-1){
        //Sql query for the insertion of thhe data in the database table
        //when new user tries to register then the CURRENT_ADMIN variable 
        //value won't have been updated so its is -1 as initialized it means
        //the task required to perform is registration;
        sql = "insert into librarian(firstName, lastName,username, password, email, contactNo,adminPhoto)"
                + "values(?,?,?,?,?,?,?)";
        }
        else{
            return false;
        }
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,obj.getFirstName());
        pst.setString(2,obj.getLastName());
        pst.setString(3,obj.getUserName());
        pst.setString(4,obj.getPassword());
        pst.setString(5,obj.getEmail());
        pst.setLong(6,obj.getContact());
        //now presparing to  set hte image object 
        FileInputStream fis = new FileInputStream(new File(obj.getAdminProfileImageUrl()));
        pst.setBinaryStream(7, fis);
               
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Congratulation "+obj.getFirstName()+" "
                        +obj.getLastName()+",\n\n\t\t You are our new Admin");
        
        success= true;
        con.close();
       }// end of the try block that generate the SQLException 
       catch(Exception ex){
          System.out.println(ex); 
       }//end of the catch
       return success;
     }//end of the fuction insert new admin record 
    
    
    
    
    
    // this function will check for the authorized user to log in to the system
    public boolean checkValidAdmin(Admin obj){
        //initialize the user as unauthorized firstly 
        boolean authorized = false;
        int count=0 ; //to keep track of how many record are fetched 
        try{
        //create the new Connection 
        CreateNewConnection c = new CreateNewConnection();
        Connection con = c.createConnection();
        if(con==null) return authorized; //if no connection has been established then go back    
        String sql ="select * from librarian where username=?  and  password=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, obj.getUserName());
        pst.setString(2, obj.getPassword());
        System.out.println(obj.getUserName() + " and "+obj.getPassword());
        ResultSet rs = pst.executeQuery();
        
      while(rs.next()){
          CURRENT_ADMIN =Integer.parseInt(rs.getString("adminId"));
          CURRENT_ADMIN_NAME = rs.getString("firstName")+" "+rs.getString("lastName");
          count+=1;
      }
        System.out.println(count);
        if(count>=1){
           authorized = true;
           System.out.println("congratulations");
           }
        con.close();
        }//end of the try
        catch(SQLException ex){
            System.out.println(ex);
        }//end of the catch
        
        return authorized;
    }
  
    
    
    
    
    
    //creating the function to check the current password if the admin user 
    //have typed it correctly during the change password process
    public boolean checkCurrentAdminPassword(Admin obj){
        boolean success = false;
        int rowAffected=0;
            try{
                CreateNewConnection c = new CreateNewConnection();
                Connection con = c.createConnection();
                String sql = "select username from librarian where password=?";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1, obj.getPassword());
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    rowAffected++;
                }
                if(rowAffected>0){
                    success=true;
                }
                else{
                    System.out.println("no such password found: from checkCurrentAdminPassword ");
                }
                
                con.close();//close connection
            }
            catch(Exception ex){
                System.out.println("from checkCurrentAdminPassword"+ex);
            }
        return success;
    }//end of the checking current admin password
    
    //function to update the new Admin password
    public boolean editAdminPassword(Admin obj){
       boolean success = false;
       try{
           CreateNewConnection c = new CreateNewConnection();
                Connection con = c.createConnection();
                String sql = "update librarian set password=? where adminId=?";
               
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1, obj.getPassword());
                pst.setInt(2,CURRENT_ADMIN);
                pst.executeUpdate();
                success=true;
                con.close();
       }
       catch(Exception ex){
           System.out.println("form the update admin password block"+ex);
       }
       return success;
    }//end of editing the admin password task
    
    






//this function will return the object of the admin containing the all information
    //about the admin that is currently logged in as
    public Admin getAllAdminData(){
        Admin adminAllData = new Admin();
       try{
            //create the new Connection 
        CreateNewConnection c = new CreateNewConnection();
        Connection con = c.createConnection();
            
        String sql ="select * from librarian where adminId=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,CURRENT_ADMIN);
       
        ResultSet rs = pst.executeQuery();//now the  record of admin is loaded  in memory
        while(rs.next()){
            //we Store all the required info about the admin user in the admin object to 
            // return it in the future statement
            adminAllData.setFirstName(rs.getString("firstName")); //set the firstName
            adminAllData.setLastName(rs.getString("lastName"));//set the lastName
            adminAllData.setEmail(rs.getString("email"));//set the email
            adminAllData.setUserName(rs.getString("username"));//set the userName
            adminAllData.setContact(rs.getLong("contactNo"));//set the contack
            adminAllData.setAdminPhoto(rs.getBlob("adminPhoto"));
        }
        
       }
       catch(Exception ex){
           System.out.println("form the Admin DAO get all admin data "+ex);
       }
       return adminAllData; 
    }
  
    
    
    
    //this is the function to update the admin profile data except the password
    public boolean updateAdminProfile(Admin obj){
        boolean success = false;
        String sql ;
        PreparedStatement pst;
        //create the connection 
        CreateNewConnection c = new CreateNewConnection();
        Connection con = c.createConnection();
        try{
         
       
            //Sql query for the update of thhe data in the database table
        //when new user tries to update then the CURRENT_ADMIN variable 
        //value will have been updated with the currently logged in AdminId 
        //so its isn't  -1  anymore as initialized it means
        //the task required to perform is update;
        if(obj.getAdminProfileImageUrl().equals(null)){
            //this block will be exeecuted if the user has not provided the 
            //image location to upadte it or user don't want to updataee it
            
            sql ="update librarian set firstName=?,lastName=?,username=?"
                   + ",email=?,contactNo=?"
                   + "where adminId=?"; 
        pst = con.prepareStatement(sql);
        pst.setString(1,obj.getFirstName());
        pst.setString(2,obj.getLastName());
        pst.setString(3,obj.getUserName());
        pst.setString(4,obj.getEmail());
        pst.setLong(5,obj.getContact());
        pst.setInt(6, CURRENT_ADMIN);
        }
        else {
            //this block will be executed when the immage url is provided to update
            //it
            sql = "update librarian set firstName=?,lastName=?,username=?"
                   + ",email=?,contactNo=?, adminPhoto=? "
                   + "where adminId=?"; 
        pst = con.prepareStatement(sql);
        pst.setString(1,obj.getFirstName());
        pst.setString(2,obj.getLastName());
        pst.setString(3,obj.getUserName());
        pst.setString(4,obj.getEmail());
        pst.setLong(5,obj.getContact());
        
        //for setting the byte strem form the image ot the database server ;
        FileInputStream fis = new FileInputStream(new File(obj.getAdminProfileImageUrl()));
        pst.setBinaryStream(6, fis);
        pst.setInt(7, CURRENT_ADMIN);
        }//end of the else executed when the user provide the image url to update it
        
        
            pst.executeUpdate();//executing tthe statemennt whichever is choosen 
            JOptionPane.showMessageDialog(null,"Successfully Updated your New Information");
            success=true;
            con.close();
       }
        catch(Exception ex){
            System.out.println("form Admin  DAO update admin profile"+ex);
        }
        
        return success;
    }
}
