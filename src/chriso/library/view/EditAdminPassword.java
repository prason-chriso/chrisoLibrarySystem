/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.view;

import chriso.library.controller.AdminDAO;
import chriso.library.model.Admin;
import com.sun.prism.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EditAdminPassword extends javax.swing.JPanel {

   
    private boolean CONFIRMED_EDIT_PASSWORD =false;
    String newPass; //to hold current type new password
      String againPass; //to hold currently retype new password
    public EditAdminPassword() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField_currentPassword = new javax.swing.JPasswordField();
        jPasswordField_newPassword = new javax.swing.JPasswordField();
        jPasswordField_reTypeNewPassword = new javax.swing.JPasswordField();
        jLabel_currentPassword = new javax.swing.JLabel();
        jLabel_newPassword = new javax.swing.JLabel();
        jLabel_reTypeNewPassword = new javax.swing.JLabel();
        jButton_updatePassword = new javax.swing.JButton();
        jLabel_errorRetypePass = new javax.swing.JLabel();
        jLabel_errorCurrentPass = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Edit Admin Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        jPasswordField_currentPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_currentPasswordFocusLost(evt);
            }
        });

        jPasswordField_newPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_newPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_newPasswordKeyTyped(evt);
            }
        });

        jPasswordField_reTypeNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_reTypeNewPasswordActionPerformed(evt);
            }
        });
        jPasswordField_reTypeNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_reTypeNewPasswordKeyTyped(evt);
            }
        });

        jLabel_currentPassword.setText("Current Password");

        jLabel_newPassword.setText("New Password");

        jLabel_reTypeNewPassword.setText("Confirm new  Password");

        jButton_updatePassword.setBackground(new java.awt.Color(0, 102, 102));
        jButton_updatePassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_updatePassword.setForeground(new java.awt.Color(51, 51, 51));
        jButton_updatePassword.setText("Update Pasword");
        jButton_updatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updatePasswordActionPerformed(evt);
            }
        });

        jLabel_errorRetypePass.setForeground(new java.awt.Color(255, 0, 0));

        jLabel_errorCurrentPass.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel_currentPassword)
                        .addGap(53, 53, 53)
                        .addComponent(jPasswordField_currentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_errorCurrentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel_newPassword)
                        .addGap(69, 69, 69)
                        .addComponent(jPasswordField_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel_reTypeNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPasswordField_reTypeNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_errorRetypePass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton_updatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_currentPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPasswordField_currentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_errorCurrentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel_newPassword))
                    .addComponent(jPasswordField_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_reTypeNewPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPasswordField_reTypeNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_errorRetypePass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton_updatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_reTypeNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_reTypeNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_reTypeNewPasswordActionPerformed

    private void jPasswordField_currentPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_currentPasswordFocusLost
        // TODO add your handling code here:
        String password = new String(jPasswordField_currentPassword.getPassword());
        AdminDAO adminDAO = new AdminDAO();
        Admin admin = new Admin();
        admin.setPassword(password);
        boolean success = adminDAO.checkCurrentAdminPassword(admin);
        if(success){
            jLabel_errorCurrentPass.setText("");
            jLabel_errorCurrentPass.setIcon(new ImageIcon(getClass().getResource("/Drawable/ok.jpg")));
            
            }
        else{
           jLabel_errorCurrentPass.setIcon(null);
           jLabel_errorCurrentPass.setText("wrong password !!!");
        }
    }//GEN-LAST:event_jPasswordField_currentPasswordFocusLost

     
    private void jPasswordField_reTypeNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_reTypeNewPasswordKeyTyped
        // TODO add your handling code here:
       checkNewAndReType(); 
    }//GEN-LAST:event_jPasswordField_reTypeNewPasswordKeyTyped

    private void jButton_updatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updatePasswordActionPerformed
        // TODO add your handling code here:
        if(CONFIRMED_EDIT_PASSWORD){
            AdminDAO admindao = new AdminDAO();
            Admin admin = new Admin();
            admin.setPassword(newPass);
            boolean success = admindao.editAdminPassword(admin);
            if(success){
                JOptionPane.showMessageDialog(null,"Your Password is updated as "+newPass);
            }
            else{
                System.out.println("error in code for the password update of admin");
            }
        }
    }//GEN-LAST:event_jButton_updatePasswordActionPerformed

    private void jPasswordField_newPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_newPasswordKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField_newPasswordKeyTyped

    private void jPasswordField_newPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_newPasswordKeyReleased
        // TODO add your handling code here:
        checkNewAndReType();
    }//GEN-LAST:event_jPasswordField_newPasswordKeyReleased
    public void checkNewAndReType(){
       
        newPass = new String (jPasswordField_newPassword.getPassword());
       againPass = new String(jPasswordField_reTypeNewPassword.getPassword());
       if(newPass.equals("")){
           jLabel_errorRetypePass.setText("Give new Password...");
       }
       else{
           if(newPass.equals(againPass) ){
            jLabel_errorRetypePass.setText(""); //if user back space the correct password then previous
            //error message is erased completely so that only image is shown
            jLabel_errorRetypePass.setIcon(new ImageIcon(getClass().getResource("/Drawable/ok.jpg")));
            CONFIRMED_EDIT_PASSWORD= true;
        }   
        else{
            jLabel_errorRetypePass.setIcon(null);
            jLabel_errorRetypePass.setText("Not Matched...");
        }
       }//outer else
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_updatePassword;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_currentPassword;
    private javax.swing.JLabel jLabel_errorCurrentPass;
    private javax.swing.JLabel jLabel_errorRetypePass;
    private javax.swing.JLabel jLabel_newPassword;
    private javax.swing.JLabel jLabel_reTypeNewPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_currentPassword;
    private javax.swing.JPasswordField jPasswordField_newPassword;
    private javax.swing.JPasswordField jPasswordField_reTypeNewPassword;
    // End of variables declaration//GEN-END:variables
}
