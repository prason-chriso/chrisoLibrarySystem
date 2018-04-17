/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.controller;
import chriso.library.miscelleneous.CreateNewConnection;
import chriso.library.model.Student;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amit
 */
public class StudentDAO {

    public static int CURRENT_STUDENT=-1;
    public static String CURRENT_STUDENT_NAME;
    
    public boolean insertStudentRecord(Student obj) {
        boolean success = false;
        try {
            //inserting the record for the student;
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();

            String sql = "insert into student(firstName, lastName, userName, password, dob, email,"
                    + "contact, gender, batch, department,studentPhoto) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getFirstName());
            pst.setString(2, obj.getLastName());
            pst.setString(3, obj.getUserName());
            pst.setString(4, obj.getPassword());
            pst.setDate(5, obj.getDateOfBirth());
            pst.setString(6, obj.getEmail());
            pst.setLong(7, obj.getContact());
            pst.setString(8, obj.getGender());
            pst.setInt(9, obj.getBatch());
            pst.setString(10, obj.getDepartment());
            
            FileInputStream fis = new FileInputStream(new File(obj.getUrl()));
            pst.setBinaryStream(11, fis);

            pst.executeUpdate();
            success = true;
            con.close();

        } catch (Exception ex) {
            System.out.println("inside the Student DAO file: " + ex);
        }

        return success;
    }

    //this function will return the values of detail of the student to be displayed
    //in the field of the DisplayStudentDetaiil page by returning the student object
    public Student getAllStudentRecord(Student obj) {
        int count = 0; //this is to count the total record matched must be 1 else error
        try {

            //inserting the record for the student;
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            //sql query to fetch the records;
            String sql = "Select * from student where studentId=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, obj.getStudentId());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                count++;
            }
            rs.first();
            if (count == 1) {
                obj.setFirstName(rs.getString("firstName"));
                obj.setLastName(rs.getString("lastName"));
                obj.setUserName(rs.getString("userName"));
                obj.setPassword(new String(rs.getString("password")));
                obj.setDateOfBirth(rs.getDate("dob"));
                obj.setDepartment(rs.getString("department"));
                obj.setBatch(rs.getInt("batch"));
                obj.setGender(rs.getString("gender"));
                obj.setEmail(rs.getString("email"));
                obj.setContact(rs.getLong("contact"));
                obj.setStudentPhoto(rs.getBlob("studentPhoto")); 
                
                System.out.println("All Record for the student is saved in the object");
            } else {
                obj = null;
                return obj;
            }

        } catch (Exception ex) {
            System.out.println("this is from the getAllStudentRecord block" + ex);
        }
        return obj;
    }

    //thsi is the function written for updating the record of the student 
    //by the admin when ever he feels the wrong information is being stored in the 
    //library system database;
    public boolean adminUpdateStudentRecord(Student obj) {
        boolean success = false;
        try {
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            
            String sql = "update student set firstName=?, lastName=?, "
                    + "username=?, password=?, dob=?, email=?, contact=?, "
                    + "gender=?, batch=?, department=?, studentId=?, coverPhoto=? "
                    + "where studentId =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getFirstName());
            pst.setString(2, obj.getLastName());
            pst.setString(3, obj.getUserName());
            pst.setString(4, obj.getPassword());
            pst.setDate(5, obj.getDateOfBirth());
            pst.setString(6, obj.getEmail());
            pst.setLong(7, obj.getContact());
            pst.setString(8, obj.getGender());
            pst.setInt(9, obj.getBatch());
            pst.setString(10, obj.getDepartment());
            pst.setInt(11,obj.getStudentIdNew());
            //now setting the parameter for the student image photo
            FileInputStream fis = new FileInputStream(new File(obj.getUrl()));
            pst.setBinaryStream(12, fis);
            pst.setInt(13,obj.getStudentId());
            
             pst.executeUpdate();
            success = true;
            con.close();


        } catch (Exception ex) {
                System.out.println("form the update Student Block "+ex);
        }

        return success;
    }
    
//this funtion will return the boolean value for the success of the log in attempt 
    //by the user by tallying the record of the system with that of the username 
    //and student password provided;
    public boolean checkValidStudent(Student obj){
        //initialize the user as unauthorized firstly 
        boolean authorized = false;
        int count=0 ; //to keep track of how many record are fetched 
        try{
        //create the new Connection 
        CreateNewConnection c = new CreateNewConnection();
        Connection con = c.createConnection();
         if(con==null) return authorized; //if no connection has been established then go back    
        String sql ="select * from student where userName=?  and  password=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, obj.getUserName());
        pst.setString(2, obj.getPassword());
        
        ResultSet rs = pst.executeQuery();
        
      while(rs.next()){
          CURRENT_STUDENT =Integer.parseInt(rs.getString("studentId"));
          CURRENT_STUDENT_NAME = rs.getString("firstName")+" "+rs.getString("lastName");
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
    
//this function will be executed whenever the student will try to update his record by 
    //himself, however, it is to be noted that the student isn't allowed ot change his 
    //critical informations like first Name, lastName, StudentId, image, and other some details
    
    public boolean studentUpdateHisRecord(Student obj){
        boolean success = false; 
        try {
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            String sql = "update student set dob=?, email=?, contact=?, "
                    + "batch=?, department=? " 
                    + "where studentId =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDate(1, obj.getDateOfBirth());
            pst.setString(2, obj.getEmail());
            pst.setLong(3, obj.getContact());
            pst.setInt(4, obj.getBatch());
            pst.setString(5, obj.getDepartment());
            pst.setInt(6,obj.getStudentId());
            pst.executeUpdate();
            con.close();
            success = true;

        } catch (Exception ex) {
                System.out.println("form the update Student Block "+ex);
        }
        return success;
    }
    
    //the function below will be executed whenever the student will 
    //try to update his useName or password only
        public boolean studentUpdateUsernamePassword(Student obj){
        boolean success = false; 
        try {
            CreateNewConnection c = new CreateNewConnection();
            Connection con = c.createConnection();
            String sql = "update student set userName=?, password=? " 
                    + "where studentId =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getUserName());
            pst.setString(2, obj.getPassword());
            pst.setInt(3,obj.getStudentId());
            pst.executeUpdate();
            con.close();
            success = true;

        } catch (Exception ex) {
                System.out.println("form the update Student Block "+ex);
        }
        return success;
    }
}
