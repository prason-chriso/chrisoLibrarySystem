/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.view;

/**
 *
 * @author Amit
 */
public class StudentPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminPanel
     */
    public StudentPanel() {
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

        jButton_viewProfile = new javax.swing.JButton();
        jButton_searchBook = new javax.swing.JButton();
        jButton_bookList = new javax.swing.JButton();
        jButton_bookBorrowed = new javax.swing.JButton();
        jButton_editProfile = new javax.swing.JButton();
        jLabel_title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_viewProfile.setBackground(new java.awt.Color(0, 102, 102));
        jButton_viewProfile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_viewProfile.setForeground(new java.awt.Color(255, 255, 255));
        jButton_viewProfile.setText("Profile");
        jButton_viewProfile.setEnabled(false);
        jButton_viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewProfileActionPerformed(evt);
            }
        });
        add(jButton_viewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 178, 125));

        jButton_searchBook.setBackground(new java.awt.Color(0, 102, 102));
        jButton_searchBook.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_searchBook.setForeground(new java.awt.Color(255, 255, 255));
        jButton_searchBook.setText("Search Book");
        jButton_searchBook.setEnabled(false);
        jButton_searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchBookActionPerformed(evt);
            }
        });
        add(jButton_searchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 178, 125));

        jButton_bookList.setBackground(new java.awt.Color(0, 102, 102));
        jButton_bookList.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_bookList.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bookList.setText("Book List");
        jButton_bookList.setEnabled(false);
        jButton_bookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bookListActionPerformed(evt);
            }
        });
        add(jButton_bookList, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 178, 125));

        jButton_bookBorrowed.setBackground(new java.awt.Color(0, 102, 102));
        jButton_bookBorrowed.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_bookBorrowed.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bookBorrowed.setText("Book Borrowed");
        jButton_bookBorrowed.setEnabled(false);
        jButton_bookBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bookBorrowedActionPerformed(evt);
            }
        });
        add(jButton_bookBorrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 178, 125));

        jButton_editProfile.setBackground(new java.awt.Color(0, 102, 102));
        jButton_editProfile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_editProfile.setForeground(new java.awt.Color(255, 255, 255));
        jButton_editProfile.setText("Edit Profile");
        jButton_editProfile.setEnabled(false);
        jButton_editProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editProfileActionPerformed(evt);
            }
        });
        add(jButton_editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 178, 125));

        jLabel_title.setBackground(new java.awt.Color(153, 0, 0));
        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(153, 0, 0));
        jLabel_title.setText("Student  Panel");
        add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 310, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchBookActionPerformed
        // TODO add your handling code here:
           displayStudentControlTabbedFrame();  
           StudentAccountControl.jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton_searchBookActionPerformed

    private void jButton_viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewProfileActionPerformed
        // TODO add your handling code here:
     displayStudentControlTabbedFrame();
     StudentAccountControl.jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton_viewProfileActionPerformed

    private void jButton_bookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bookListActionPerformed
        // TODO add your handling code here:
           displayStudentControlTabbedFrame();
           StudentAccountControl.jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton_bookListActionPerformed

    private void jButton_bookBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bookBorrowedActionPerformed
        // TODO add your handling code here:
           displayStudentControlTabbedFrame();
           StudentAccountControl.jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton_bookBorrowedActionPerformed

    private void jButton_editProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editProfileActionPerformed
        // TODO add your handling code here:
           displayStudentControlTabbedFrame();
           StudentAccountControl.jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton_editProfileActionPerformed

    public void displayStudentControlTabbedFrame(){
       StudentAccountControl studentAccountControl = new StudentAccountControl();
       Mainframe.jDesktopPane_mainframe.add(studentAccountControl);
       studentAccountControl.setVisible(true);
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton_bookBorrowed;
    public static javax.swing.JButton jButton_bookList;
    public static javax.swing.JButton jButton_editProfile;
    public static javax.swing.JButton jButton_searchBook;
    public static javax.swing.JButton jButton_viewProfile;
    private javax.swing.JLabel jLabel_title;
    // End of variables declaration//GEN-END:variables
}
