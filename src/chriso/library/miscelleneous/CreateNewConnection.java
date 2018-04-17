/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.miscelleneous;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class CreateNewConnection {
 Connection con = null;


//creating the new method for the connection setup task performing
 public Connection createConnection(){
     try{
         Class.forName("com.mysql.jdbc.Driver");// this will throw the ClassNotFoundException if no driver is found
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chriso_library", "root", "");
       }
     catch(Exception ex){
         System.out.println(ex);
     }
     if(con==null){
         JOptionPane.showMessageDialog(null, "Dear User, Application Failed to connect to the database, \nPlease Check your connection\n"
                 + "\t Thank you ...!!!");
     }
        return con; //return the connection object of the new connection 
       
    }
}