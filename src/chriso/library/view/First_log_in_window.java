/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.view;

import chriso.library.controller.AdminDAO;
import chriso.library.controller.StudentDAO;
import chriso.library.model.Admin;
import chriso.library.model.Student;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class First_log_in_window extends javax.swing.JInternalFrame {

    /**
     * Creates new form First_log_in_window
     */
    JLabel lock ;
    public First_log_in_window() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel_image_holder = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jButton_new_user = new javax.swing.JButton();
        jButton_login = new javax.swing.JButton();
        jButton_exit = new javax.swing.JButton();
        jTextField_userName = new javax.swing.JTextField();
        jLabel_error_pw = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setClosable(true);
        setTitle("User Log In");
        setToolTipText("");
        setAlignmentX(400);
        setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        ImageIcon img = new ImageIcon(getClass().getResource("default_image_log_in_frame.jpg"));
        JLabel default_image = new JLabel("", img, JLabel.CENTER);

        javax.swing.GroupLayout jPanel_image_holderLayout = new javax.swing.GroupLayout(jPanel_image_holder);
        jPanel_image_holder.setLayout(jPanel_image_holderLayout);
        jPanel_image_holderLayout.setHorizontalGroup(
            jPanel_image_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_image_holderLayout.setVerticalGroup(
            jPanel_image_holderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        jPanel_image_holder.setLayout(new BorderLayout());

        jLabel_username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_username.setText("UserName ");

        jLabel_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_password.setText("Password");

        jButton_new_user.setBackground(new java.awt.Color(0, 102, 102));
        jButton_new_user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_new_user.setForeground(new java.awt.Color(102, 102, 102));
        jButton_new_user.setText("New User");
        jButton_new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_new_userActionPerformed(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(0, 102, 102));
        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(102, 102, 102));
        jButton_login.setText("LOG IN");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jButton_exit.setBackground(new java.awt.Color(0, 102, 102));
        jButton_exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(102, 102, 102));
        jButton_exit.setText("EXIT");
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });

        jTextField_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_userNameActionPerformed(evt);
            }
        });

        jLabel_error_pw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        lock = new JLabel("",new ImageIcon(getClass().getResource("lock.png")),JLabel.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        jPanel1.setLayout(new BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jButton_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordField1)))
                            .addComponent(jLabel_error_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel_image_holder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_exit, jButton_login, jButton_new_user});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_image_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_error_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel_image_holder.add(default_image, BorderLayout.CENTER);
        jPanel1.add(lock,BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_new_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_new_userActionPerformed
        // TODO add your handling code here:
        if(LogInOptionPanel.whichUser.equals("adminUser")){
        NewAdminRegistration  newAdmin = new NewAdminRegistration();
        Mainframe.jDesktopPane_mainframe.add(newAdmin);
        newAdmin.setVisible(true);
        }
        else if(LogInOptionPanel.whichUser.equals("studentUser")){
            JOptionPane.showMessageDialog(null, "Please, contact your librarian.\n\tThank You !!!");
        }
    
    }//GEN-LAST:event_jButton_new_userActionPerformed

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
  
        //when the admin is trying to log in 
        if(LogInOptionPanel.whichUser.equals("adminUser")){
            String user = jTextField_userName.getText();
             String password = new String (jPasswordField1.getPassword());
            
            Admin adminLogIn = new Admin();
            adminLogIn.setUserName(user);
            adminLogIn.setPassword(password);
                  AdminDAO adminDao = new AdminDAO();
                 boolean authorizedUser = adminDao.checkValidAdmin(adminLogIn);
                 if(authorizedUser){
                     JOptionPane.showMessageDialog(null,"Welcome "+user);
                     dispose();
                     enableAllAdminButton();
                     disableLogInButton();
                     //automatic navigate the user to the admin panel
                     Mainframe.card.show(Mainframe.jPanel_container, "card1"); //card1 is the admin panel
                 }//end of if of the authorized user
                 else{//if unauthorize user tries to log in the system
                     jLabel_error_pw.setForeground(Color.RED);
                     jLabel_error_pw.setText("Please check your user-name and/or Password");
                     }
                 
        }//end of the if block of the check admin user
        else if(LogInOptionPanel.whichUser.equals("studentUser")){
            String user = jTextField_userName.getText();
             String password = new String (jPasswordField1.getPassword());
            
           Student studentLogIn = new Student();
            studentLogIn.setUserName(user);
            studentLogIn.setPassword(password);
                  StudentDAO studentDao = new StudentDAO();
                 boolean authorizedUser =studentDao.checkValidStudent(studentLogIn);
                 if(authorizedUser){
                     JOptionPane.showMessageDialog(null,"Welcome "+user);
                     dispose();
                     enableAllStudentButton();
                     disableLogInButton();
                     //automatic navigate the user to the admin panel
                     Mainframe.card.show(Mainframe.jPanel_container, "card2"); //card1 is the admin panel
                 }//end of if of the authorized user
                 else{//if unauthorize user tries to log in the system
                     jLabel_error_pw.setForeground(Color.RED);
                     jLabel_error_pw.setText("Please check your user-name and/or Password");
                     }
        }
        
    }//GEN-LAST:event_jButton_loginActionPerformed

    //function to enable all the button of the Admin panel 
    public void enableAllAdminButton(){
        AdminPanel.jButton_addBook.setEnabled(true);
        AdminPanel.jButton_addBook.setForeground(Color.BLACK);
         AdminPanel.jButton_manageBook.setEnabled(true);
        AdminPanel.jButton_manageBook.setForeground(Color.BLACK);
         AdminPanel.jButton_addStudent.setEnabled(true);
         AdminPanel.jButton_addStudent.setForeground(Color.BLACK);
         AdminPanel.jButton_manageStudent.setEnabled(true);
         AdminPanel.jButton_manageStudent.setForeground(Color.BLACK);
         AdminPanel.jButton_recordBorrow.setEnabled(true);
         AdminPanel.jButton_recordBorrow.setForeground(Color.BLACK);
         AdminPanel.jButton_manageBorrowing.setEnabled(true);
         AdminPanel.jButton_manageBorrowing.setForeground(Color.BLACK);
         AdminPanel.jButton_editProfile.setEnabled(true);
         AdminPanel.jButton_editProfile.setForeground(Color.BLACK);
         AdminPanel.jButton_manageReturn.setEnabled(true);
         AdminPanel.jButton_manageReturn.setForeground(Color.BLACK);
    }//end of enable all admin button
    public void enableAllStudentButton(){
        StudentPanel.jButton_viewProfile.setEnabled(true);
        StudentPanel.jButton_viewProfile.setForeground(Color.BLACK);
        StudentPanel.jButton_searchBook.setEnabled(true);
         StudentPanel.jButton_searchBook.setForeground(Color.BLACK);
         StudentPanel.jButton_bookList.setEnabled(true);
          StudentPanel.jButton_bookList.setForeground(Color.BLACK);
       
        StudentPanel.jButton_bookBorrowed.setEnabled(true);
         StudentPanel.jButton_bookBorrowed.setForeground(Color.BLACK);
       
        StudentPanel.jButton_editProfile.setEnabled(true);
         StudentPanel.jButton_editProfile.setForeground(Color.BLACK);
       
    }  
    //disable the first log in button to prevent further multiple logging in
    public void disableLogInButton(){
        LogInOptionPanel.jButton_studentLogInBtn.setEnabled(false);
        LogInOptionPanel.jButton_studentLogInBtn.setForeground(new Color(240,240,240));
        
        LogInOptionPanel.jButton_adminLogInBtn.setEnabled(false);
        LogInOptionPanel.jButton_adminLogInBtn.setForeground(new Color(240,240,240));
    }
    
    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void jTextField_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_userNameActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        lock.setIcon(new ImageIcon(getClass().getResource("/Drawable/lock_hover.png")));  
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        lock.setIcon(new ImageIcon(getClass().getResource("lock.png")));  
    }//GEN-LAST:event_jPanel1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_exit;
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_new_user;
    private javax.swing.JLabel jLabel_error_pw;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_image_holder;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}