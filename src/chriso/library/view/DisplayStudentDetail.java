/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.view;

import chriso.library.controller.StudentDAO;
import chriso.library.miscelleneous.InputController;
import chriso.library.model.Student;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class DisplayStudentDetail extends javax.swing.JPanel {
    
    public static boolean REDIRECTED_FROM_SEARCHSTUDENT = false;
    
 
    public DisplayStudentDetail() {
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

        buttonGroup_gender = new javax.swing.ButtonGroup();
        jLabel_name = new javax.swing.JLabel();
        jLabel_contact = new javax.swing.JLabel();
        jLabel_batch = new javax.swing.JLabel();
        jLabel_dateOfBirth = new javax.swing.JLabel();
        jLabel_department = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextField_contact = new javax.swing.JTextField();
        jTextField_batch = new javax.swing.JTextField();
        jTextField_dateOfBirth = new javax.swing.JTextField();
        jTextField_department = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jButton_updateRecord = new javax.swing.JButton();
        jPanel_titleHolder = new javax.swing.JPanel();
        jLabel_titleText = new javax.swing.JLabel();
        jTextField_searchIdInput = new javax.swing.JTextField();
        jLabel_search = new javax.swing.JLabel();
        jButton_changeImage = new javax.swing.JButton();
        jPanel_imageHolder = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_image = new javax.swing.JLabel();
        jLabel_frame = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();
        jTextField_userName = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jLabel_gender = new javax.swing.JLabel();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField_imageUrl = new javax.swing.JTextField();

        buttonGroup_gender.add(jRadioButton_male);
        buttonGroup_gender.add(jRadioButton_female);

        setBackground(new java.awt.Color(204, 204, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_name.setText("Name");
        add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel_contact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_contact.setText("Contact");
        add(jLabel_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel_batch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_batch.setText("Batch");
        add(jLabel_batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 198, -1, -1));

        jLabel_dateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_dateOfBirth.setText("DOB");
        add(jLabel_dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel_department.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_department.setText("Department");
        add(jLabel_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_email.setText("Email");
        add(jLabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });
        add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 151, 222, 32));

        jTextField_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_contactActionPerformed(evt);
            }
        });
        add(jTextField_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 218, 32));

        jTextField_batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_batchActionPerformed(evt);
            }
        });
        add(jTextField_batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 189, 222, 32));

        jTextField_dateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dateOfBirthActionPerformed(evt);
            }
        });
        add(jTextField_dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 218, 32));

        jTextField_department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_departmentActionPerformed(evt);
            }
        });
        add(jTextField_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 222, 32));
        add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 218, 32));

        jButton_updateRecord.setBackground(new java.awt.Color(0, 102, 102));
        jButton_updateRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_updateRecord.setForeground(new java.awt.Color(51, 51, 51));
        jButton_updateRecord.setText(" Update Record");
        jButton_updateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateRecordActionPerformed(evt);
            }
        });
        add(jButton_updateRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 160, 40));

        jPanel_titleHolder.setBackground(new java.awt.Color(153, 153, 153));

        jLabel_titleText.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_titleText.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel_titleText.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_titleText.setText("Search Student's Profile Detail");

        javax.swing.GroupLayout jPanel_titleHolderLayout = new javax.swing.GroupLayout(jPanel_titleHolder);
        jPanel_titleHolder.setLayout(jPanel_titleHolderLayout);
        jPanel_titleHolderLayout.setHorizontalGroup(
            jPanel_titleHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleHolderLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel_titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel_titleHolderLayout.setVerticalGroup(
            jPanel_titleHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titleText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel_titleHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 70));

        jTextField_searchIdInput.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_searchIdInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_searchIdInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_searchIdInputKeyTyped(evt);
            }
        });
        add(jTextField_searchIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 102, 205, 31));

        jLabel_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_search.setText("Search By  ID: ");
        add(jLabel_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, -1));

        jButton_changeImage.setBackground(new java.awt.Color(0, 102, 102));
        jButton_changeImage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_changeImage.setText("ChangeImage");
        jButton_changeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_changeImageActionPerformed(evt);
            }
        });
        add(jButton_changeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 110, 31));

        jPanel_imageHolder.setBackground(new java.awt.Color(0, 102, 102));
        jPanel_imageHolder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel_imageHolder.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 102, 0)));

        jLabel_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        jPanel_imageHolder.add(jPanel1);
        jPanel1.setBounds(40, 40, 220, 270);

        jLabel_frame.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_frame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel_imageHolder.add(jLabel_frame);
        jLabel_frame.setBounds(10, 6, 290, 380);
        jLabel_frame.setMaximumSize(new Dimension(320,390));
        jLabel_frame.setIcon(new ImageIcon(getClass().getResource("/Drawable/frame.png")));

        add(jPanel_imageHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 310, 396));

        jLabel_userName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_userName.setText("user name");
        jLabel_userName.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        add(jLabel_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        add(jTextField_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 227, 222, 32));

        jLabel_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_password.setText("password");
        add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(jPasswordField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 220, 30));

        jLabel_gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_gender.setText("Gender");
        add(jLabel_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jRadioButton_male.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton_male.setText("Male");
        add(jRadioButton_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jRadioButton_female.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton_female.setText("Female");
        add(jRadioButton_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 740, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 134, 210, -1));

        jTextField_imageUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_imageUrlActionPerformed(evt);
            }
        });
        jTextField_imageUrl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_imageUrlKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_imageUrlKeyTyped(evt);
            }
        });
        add(jTextField_imageUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_dateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dateOfBirthActionPerformed

    private void jTextField_departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_departmentActionPerformed

    private void jTextField_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_contactActionPerformed

    private void jTextField_batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_batchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_batchActionPerformed

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jButton_updateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateRecordActionPerformed
        // TODO add your handling code here:
        REDIRECTED_FROM_SEARCHSTUDENT = true; //to track if the user has redirected to 
        //the update student pane from this container 
        if(jTextField_searchIdInput.getText().equals("")){
            JOptionPane.showMessageDialog(null,"You have to Search the student using "
                    + "their ID first ");
            jTextField_searchIdInput.requestFocusInWindow();
            return;
        }
        UpdateStudentDetail.STUDENT_ID = Integer.parseInt(jTextField_searchIdInput.getText());
        ManageStudent.jTabbedPane_manageStudent.setSelectedIndex(1);
    }//GEN-LAST:event_jButton_updateRecordActionPerformed

    private void jTextField_searchIdInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchIdInputKeyTyped
        // TODO add your handling code here:
        String id = "";
        char c = (char)evt.getKeyChar();
        id +=c;
        
        if(!id.equals("") && InputController.allowOnlyNumber(evt, c)){ //no need to search id the id field is empty
           int val=Integer.parseInt(id);
           Student student = new Student();
           student.setStudentId(val);
           StudentDAO stddao = new StudentDAO();
           student =  stddao.getAllStudentRecord(student);
           //after this statement the student object will consist of the all informatioon 
           //about the current student ID 
           
           jTextField_name.setText(student.getFirstName()+" "+student.getLastName());
           jTextField_userName.setText(student.getUserName());
           jPasswordField_password.setText(student.getPassword());
           jTextField_email.setText(student.getEmail());
           jTextField_department.setText(student.getDepartment());
           jTextField_contact.setText(""+student.getContact());
           jTextField_batch.setText(""+student.getBatch());
           jTextField_dateOfBirth.setText(""+student.getDateOfBirth().toString());
           
                            if(student.getGender().equalsIgnoreCase("male")){
                               buttonGroup_gender.clearSelection();
                               jRadioButton_male.setSelected(true);
                              }
                            else if(student.getGender().equalsIgnoreCase("female")){
                               buttonGroup_gender.clearSelection();
                               jRadioButton_female.setSelected(true); 
                            }
          
            //for dispalying the image in the jLabel 
                            
            if(student.getStudentPhoto()==null){
               jLabel_image.setIcon(new ImageIcon(getClass().getResource("/Drawable/defaultProfileImage.png")));
           }
           else{
               //it means the image is availablee in the database 
               //so we need to fetch teh data from teh database
               //rther than dispalaying the default images
               try{
               Blob blob = student.getStudentPhoto();
               int blobLength = (int) blob.length();  
               byte[] bytes = blob.getBytes(1, blobLength);
               blob.free();
               BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
               ImageIcon icon = new ImageIcon(img);
               Image newimg=icon.getImage().getScaledInstance(248, 314, BufferedImage.SCALE_DEFAULT);
               
               jLabel_image.setIcon(new ImageIcon(newimg));
              }
               catch(SQLException| IOException ex){
                  System.out.println("while displaying the image ");
               }              
           }           
        }//end of the if block ...when
     else{ //when the user press the other 
            System.out.println("Dear Admin, you can only search By Student Id");
        }
      
       
    }//GEN-LAST:event_jTextField_searchIdInputKeyTyped

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      REDIRECTED_FROM_SEARCHSTUDENT  = false;
    }//GEN-LAST:event_formComponentShown

    private void jTextField_searchIdInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchIdInputKeyReleased
        // TODO add your handling code here:
        char c = (char)evt.getKeyChar();
        
        if(InputController.allowOnlyNumber(evt, c))
        {
            jLabel1.setText("");
        }
        else{
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Number are allowed");
        }
        
    }//GEN-LAST:event_jTextField_searchIdInputKeyReleased

    private void jButton_changeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_changeImageActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            jTextField_imageUrl.setText(file.toString());
            UpdateStudentDetail.IMG_LOCATION = file.toString();
        } else {
            jTextField_imageUrl.setText("choose the image to change");
            UpdateStudentDetail.IMG_LOCATION = "";
        }
        
    }//GEN-LAST:event_jButton_changeImageActionPerformed

    private void jTextField_imageUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_imageUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_imageUrlActionPerformed

    private void jTextField_imageUrlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_imageUrlKeyTyped
        // TODO add your handling code here:
        evt.consume();
    }//GEN-LAST:event_jTextField_imageUrlKeyTyped

    private void jTextField_imageUrlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_imageUrlKeyReleased
        // TODO add your handling code here:
        evt.consume();              
    }//GEN-LAST:event_jTextField_imageUrlKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_gender;
    private javax.swing.JButton jButton_changeImage;
    private javax.swing.JButton jButton_updateRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_batch;
    private javax.swing.JLabel jLabel_contact;
    private javax.swing.JLabel jLabel_dateOfBirth;
    private javax.swing.JLabel jLabel_department;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_frame;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_search;
    private javax.swing.JLabel jLabel_titleText;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_imageHolder;
    private javax.swing.JPanel jPanel_titleHolder;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_batch;
    private javax.swing.JTextField jTextField_contact;
    private javax.swing.JTextField jTextField_dateOfBirth;
    private javax.swing.JTextField jTextField_department;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_imageUrl;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_searchIdInput;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}
