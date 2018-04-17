/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.view;

import chriso.library.controller.ReturnDAO;
import chriso.library.miscelleneous.DateManager;
import chriso.library.miscelleneous.InputController;
import chriso.library.model.Return;
import chriso.library.model.Student;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amit
 */
public class ReturnBookUpdate extends javax.swing.JPanel {

    int currentRowBorrowID ;
   String search ;
    int borrowQty; //to store how many item of the single book has been taken by the studet 
   //also used in return process to add up in previous stock of book
   DefaultTableModel model;
   String columns[] ={"Student Name", "Book code", "Borrow Date","Return Date","Qty","Identifier"};
    public ReturnBookUpdate() {
        initComponents();
       model = new DefaultTableModel(null,columns);
        jTable_displayAllBorrow.setModel(model);
    }
   public void clearRowData(){
        int rowCount = jTable_displayAllBorrow.getRowCount();
        for(int i =0; i<rowCount; i++){
            model.removeRow(0);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_bookCode = new javax.swing.JTextField();
        jTextField_delsy = new javax.swing.JTextField();
        jTextField_borrowDate = new javax.swing.JTextField();
        jTextField_fine = new javax.swing.JTextField();
        jTextField_returnDateGiven = new javax.swing.JTextField();
        jButton_confirmReturn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_studentId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_displayAllBorrow = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel_errorStudentId = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Code no.");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Delay(days)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Borrow Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Fine");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 30, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Given due Date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, -1));

        jTextField_bookCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_bookCodeActionPerformed(evt);
            }
        });
        add(jTextField_bookCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 147, 184, 41));

        jTextField_delsy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_delsyActionPerformed(evt);
            }
        });
        add(jTextField_delsy, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 300, 186, 41));

        jTextField_borrowDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_borrowDateActionPerformed(evt);
            }
        });
        add(jTextField_borrowDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 199, 184, 41));

        jTextField_fine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fineActionPerformed(evt);
            }
        });
        add(jTextField_fine, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 352, 186, 41));

        jTextField_returnDateGiven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_returnDateGivenActionPerformed(evt);
            }
        });
        add(jTextField_returnDateGiven, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 184, 39));

        jButton_confirmReturn.setBackground(new java.awt.Color(0, 102, 102));
        jButton_confirmReturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_confirmReturn.setForeground(new java.awt.Color(51, 51, 51));
        jButton_confirmReturn.setText("Confirm Return");
        jButton_confirmReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmReturnActionPerformed(evt);
            }
        });
        add(jButton_confirmReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 184, 52));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Returned Book infomation ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel7)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 810, 80));

        jTextField_studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_studentIdActionPerformed(evt);
            }
        });
        jTextField_studentId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_studentIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_studentIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_studentIdKeyTyped(evt);
            }
        });
        add(jTextField_studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 89, 199, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Student Id: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 87, -1, 32));

        jTable_displayAllBorrow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_displayAllBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_displayAllBorrowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_displayAllBorrow);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 500, 310));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("List of Book Borrowed");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 200, -1));

        jLabel_errorStudentId.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabel_errorStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 200, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, 810, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_fineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fineActionPerformed

    private void jTextField_returnDateGivenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_returnDateGivenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_returnDateGivenActionPerformed

    private void jTextField_delsyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_delsyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_delsyActionPerformed

    private void jTextField_borrowDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_borrowDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_borrowDateActionPerformed

    private void jTextField_bookCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_bookCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_bookCodeActionPerformed

    private void jTextField_studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_studentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_studentIdActionPerformed
    
    
    int id;
    public void displayDataInTable(String value){ //this value is local variable
        
        
 
        id = Integer.parseInt(value);
        Return sId = new Return();
        sId.setStudentId(id);
        
        ReturnDAO returnBookControl = new ReturnDAO();
        List<Return> totalBorrowList = new ArrayList();
        totalBorrowList = returnBookControl.getBorrowBookList(sId);
        
        if(totalBorrowList.size()>0){
            clearRowData();
            System.out.println("we have found some records of total "+totalBorrowList.size());
       jLabel_errorStudentId.setText("");
            for(int i=0;i<totalBorrowList.size();i++){
            //this loop will dynamically add the record in each row 
            //so that the numer of row are dynamically created 
            //equals to the number of book lended by the librarian
            model.addRow(new Object[]{
                                      totalBorrowList.get(i).getStudentName(),
                                      totalBorrowList.get(i).getBookCode(),
                                      totalBorrowList.get(i).getBorrowDate(),
                                      totalBorrowList.get(i).getDueDate(),
                                      totalBorrowList.get(i).getBorrowQuantity(),
                                      totalBorrowList.get(i).getBorrowId()});
                            }
       } //end of if when list is not null
       else{ //when returned list is null
            System.out.println("empty records");
            jLabel_errorStudentId.setText("No Borrow Record for this Student...!!!");
            clearRowData();
        }
      
    }//end of display data in table 
    
    private void jTextField_studentIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_studentIdKeyTyped
      char c  = (char)evt.getKeyChar();
     InputController.allowOnlyNumber(evt, c);
          
    }//GEN-LAST:event_jTextField_studentIdKeyTyped

    private void jTextField_studentIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_studentIdKeyReleased
        // TODO add your handling code here:
        
        search = jTextField_studentId.getText();
        if(!search.equals("")){
        displayDataInTable(search);       
             }
        else{
            clearRowData(); //when input id has no value then no list is to be displayed
            jLabel_errorStudentId.setForeground(Color.red);
            jLabel_errorStudentId.setText("Only Numbers are allowed");
        }
    }//GEN-LAST:event_jTextField_studentIdKeyReleased

    private void jTextField_studentIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_studentIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_studentIdKeyPressed

    private void jTable_displayAllBorrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_displayAllBorrowMouseClicked
        int row = jTable_displayAllBorrow.getSelectedRow();
        //now we fetch the data for each required cell and display in the needed field
        jTextField_bookCode.setText(jTable_displayAllBorrow.getValueAt(row,1).toString());
        jTextField_borrowDate.setText(jTable_displayAllBorrow.getValueAt(row,2).toString());
        jTextField_returnDateGiven.setText(""+jTable_displayAllBorrow.getValueAt(row,3).toString());
        borrowQty =Integer.parseInt(jTable_displayAllBorrow.getValueAt(row,4).toString());
        calculateFine(""+jTable_displayAllBorrow.getValueAt(row,3).toString());
        currentRowBorrowID =(int)jTable_displayAllBorrow.getValueAt(row, 5);
    }//GEN-LAST:event_jTable_displayAllBorrowMouseClicked
//HINT: column order : {"Student Name", "Book code", "Borrow Date","Return Date","Qty"};
//Hint : field list in form : bookCode , borrowDate , Return Date, delay, fine
    
     
    private void jButton_confirmReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmReturnActionPerformed
        //now when the return is confirmed by the user then 
        //task required is updateing the book stock in the book tabble
        if(!jTextField_bookCode.getText().equals("")){
        int  bookCode =Integer.parseInt(jTextField_bookCode.getText());
        int studenId = Integer.parseInt(jTextField_studentId.getText());
        Return makeReturn  = new Return();
        makeReturn.setBookCode(bookCode);
        makeReturn.setStudentId(studenId);
        makeReturn.setBorrowQuantity(borrowQty);
        makeReturn.setBorrowId(currentRowBorrowID);
        //now the system must record the current date as the returned date automatically
         try {
             String getDate = DateManager.getCurrentDate();
            DateFormat df = new SimpleDateFormat("yy-MM-dd",Locale.ENGLISH);
            java.util.Date date; 
            
                date = df.parse(getDate); //may throw the 
                java.sql.Date retDate = new java.sql.Date(date.getTime()); //util.date to sql.date conversion
        makeReturn.setReturnedDate(retDate);
         } catch (ParseException ex) {
                Logger.getLogger(ReturnBookUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        ReturnDAO confirmReturn = new ReturnDAO();
        boolean success = confirmReturn.studentReturnBookConfirmed(makeReturn);
        if(success){
            JOptionPane.showMessageDialog(null,"Book Return Confirmed");
            clearRowData();
            displayDataInTable(String.valueOf(id));
            clearTextField();
              }
       
        }else{
            JOptionPane.showMessageDialog(null,"There is nothing selected to return.\n"
                    + "Search the student By providing the valid Id");
            jTextField_studentId.requestFocusInWindow(); //this will direct the focus of
            //the cursor to the student id input field automatically 
            //without requiring the user to click on it
            
        }     
    }//GEN-LAST:event_jButton_confirmReturnActionPerformed

    public void clearTextField(){
        jTextField_bookCode.setText("");
        jTextField_delsy.setText("");
        jTextField_fine.setText("");
        jTextField_returnDateGiven.setText("");
        jTextField_borrowDate.setText("");
    }
    public void calculateFine(String  d1){
        int fine=0;
        if(d1.equals("")){
            jTextField_delsy.setText("no delay");
            jTextField_fine.setText("Rs: "+fine);
            return;
        }
            
        try{
            DateFormat df = new SimpleDateFormat("yy-MM-dd",Locale.ENGLISH);
            Date first = df.parse(d1); //this will return util.date
            Date now = new Date();
            
            if(first.compareTo(now)>0){ //specified date is greater than current Date
                jTextField_delsy.setText("no delay");
                jTextField_fine.setText("Rs: "+fine);
             }
            else if(first.compareTo(now)==0){ //specified date is equals to the current date
                 jTextField_delsy.setText("no delay");
                jTextField_fine.setText("Rs: "+fine);
            }
            else{
               
                long timestampFirst = first.getTime(); //time stamp formatted  from the databaserecord 
                long timestampNow = now.getTime(); //current timestamp 
                
                long difference = timestampNow-timestampFirst;
                long days = Math.round((0.001*difference)/(24*60*60));
                
                fine =(int)--days*2;
                jTextField_delsy.setText("Submission Delayed ["+days+"]day(s)");
                jTextField_fine.setText("Rs: "+fine);
                
            }
        }
        catch(ParseException ex){}
         
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_confirmReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_errorStudentId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_displayAllBorrow;
    private javax.swing.JTextField jTextField_bookCode;
    private javax.swing.JTextField jTextField_borrowDate;
    private javax.swing.JTextField jTextField_delsy;
    private javax.swing.JTextField jTextField_fine;
    private javax.swing.JTextField jTextField_returnDateGiven;
    private javax.swing.JTextField jTextField_studentId;
    // End of variables declaration//GEN-END:variables
}
