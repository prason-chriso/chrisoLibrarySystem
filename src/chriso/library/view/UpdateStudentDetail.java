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
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Amit
 */
public class UpdateStudentDetail extends javax.swing.JPanel {

    public static int STUDENT_ID = -1;
    public static String IMG_LOCATION = "";
    private boolean ALL_INPUT_GIVEN = false;

    public UpdateStudentDetail() {
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
        jTextField_department = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jButton_updateRecord = new javax.swing.JButton();
        jPanel_titleHolder = new javax.swing.JPanel();
        jLabel_titleText = new javax.swing.JLabel();
        jTextField_searchIdInput = new javax.swing.JTextField();
        jLabel_search = new javax.swing.JLabel();
        jButton_changeImage = new javax.swing.JButton();
        jLabel_userName = new javax.swing.JLabel();
        jLabel_newPass = new javax.swing.JLabel();
        jLabel_retypePass = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_userName = new javax.swing.JTextField();
        jPasswordField_newPass = new javax.swing.JPasswordField();
        jPasswordField_retypePass = new javax.swing.JPasswordField();
        jTextField_imageURL = new javax.swing.JTextField();
        jComboBox_year = new javax.swing.JComboBox();
        jComboBox_month = new javax.swing.JComboBox();
        jComboBox_day = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jLabel_gender = new javax.swing.JLabel();
        jLabel_errorIdInput = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        buttonGroup_gender.add(jRadioButton_male);
        buttonGroup_gender.add(jRadioButton_female);

        setBackground(new java.awt.Color(204, 204, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_name.setText("Name");
        add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 162, -1, -1));

        jLabel_contact.setText("Contact");
        add(jLabel_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel_batch.setText("Batch");
        add(jLabel_batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel_dateOfBirth.setText("DOB");
        add(jLabel_dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 162, -1, -1));

        jLabel_department.setText("Department");
        add(jLabel_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 354, -1, 20));

        jLabel_email.setText("Email");
        add(jLabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });
        add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 159, 218, 28));

        jTextField_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_contactActionPerformed(evt);
            }
        });
        add(jTextField_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 218, 29));

        jTextField_batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_batchActionPerformed(evt);
            }
        });
        add(jTextField_batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 218, 32));

        jTextField_department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_departmentActionPerformed(evt);
            }
        });
        add(jTextField_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 218, 27));
        add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 218, 31));

        jButton_updateRecord.setBackground(new java.awt.Color(0, 102, 102));
        jButton_updateRecord.setText(" Update Record");
        jButton_updateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateRecordActionPerformed(evt);
            }
        });
        add(jButton_updateRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 199, 50));

        jPanel_titleHolder.setBackground(new java.awt.Color(153, 153, 153));

        jLabel_titleText.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_titleText.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel_titleText.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_titleText.setText("Search And Update Student Detail");

        javax.swing.GroupLayout jPanel_titleHolderLayout = new javax.swing.GroupLayout(jPanel_titleHolder);
        jPanel_titleHolder.setLayout(jPanel_titleHolderLayout);
        jPanel_titleHolderLayout.setHorizontalGroup(
            jPanel_titleHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleHolderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_titleText, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_titleHolderLayout.setVerticalGroup(
            jPanel_titleHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleHolderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_titleText)
                .addGap(27, 27, 27))
        );

        add(jPanel_titleHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 80));

        jTextField_searchIdInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_searchIdInputKeyTyped(evt);
            }
        });
        add(jTextField_searchIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 185, 31));

        jLabel_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_search.setText("Search By  ID: ");
        add(jLabel_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jButton_changeImage.setBackground(new java.awt.Color(0, 102, 102));
        jButton_changeImage.setText("ChangeImage");
        jButton_changeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_changeImageActionPerformed(evt);
            }
        });
        add(jButton_changeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 120, 30));

        jLabel_userName.setText("User Name");
        add(jLabel_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 214, -1, -1));

        jLabel_newPass.setText("Password");
        add(jLabel_newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 254, -1, -1));

        jLabel_retypePass.setText("Retype password");
        add(jLabel_retypePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 293, -1, -1));

        jLabel4.setText("Image");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));
        add(jTextField_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 205, 215, 32));
        add(jPasswordField_newPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 248, 215, 26));

        jPasswordField_retypePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_retypePassActionPerformed(evt);
            }
        });
        jPasswordField_retypePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_retypePassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_retypePassKeyTyped(evt);
            }
        });
        add(jPasswordField_retypePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 290, 214, 31));

        jTextField_imageURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_imageURLActionPerformed(evt);
            }
        });
        jTextField_imageURL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_imageURLKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_imageURLKeyTyped(evt);
            }
        });
        add(jTextField_imageURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 130, 29));

        jComboBox_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Year-" }));
        add(jComboBox_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 70, 30));
        for(int i=1950; i<=2020; i++){
            jComboBox_year.addItem(i);
        }

        jComboBox_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Month-"}));
        add(jComboBox_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 60, 30));
        for(int j=1; j<=12; j++){
            jComboBox_month.addItem(j);
        }

        jComboBox_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Day-" }));
        add(jComboBox_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 60, 30));
        for(int k=1; k<=32; k++){
            jComboBox_day.addItem(k);
        }
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 690, -1));

        jRadioButton_male.setText("Male");
        add(jRadioButton_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jRadioButton_female.setText("Female");
        add(jRadioButton_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel_gender.setText("Gender");
        add(jLabel_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 20));

        jLabel_errorIdInput.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabel_errorIdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 104, 190, 20));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 210, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jTextField_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_contactActionPerformed

    private void jTextField_batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_batchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_batchActionPerformed

    private void jTextField_departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_departmentActionPerformed

    private void jPasswordField_retypePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_retypePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_retypePassActionPerformed

    private void jTextField_imageURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_imageURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_imageURLActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        if (STUDENT_ID != -1) {
            fetchTaskAuto(STUDENT_ID);
        }//end of the if block 
        else if (STUDENT_ID == -1) {
            if (DisplayStudentDetail.REDIRECTED_FROM_SEARCHSTUDENT) {
                fetchTaskAuto(Integer.parseInt(jTextField_searchIdInput.getText()));
            }
        }
    }//GEN-LAST:event_formComponentShown

    private void jTextField_searchIdInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchIdInputKeyTyped
        String id = "";
        char c = (char) evt.getKeyChar();
        id += c;
        if (!id.equals("")) { //no need to search id the id field is empty
            if (InputController.allowOnlyNumber(evt, c)) {
                fetchTaskAuto(Integer.parseInt(id));
            }
        } else {
            System.out.println("Dear Admin, you can only search By Student Id");
        }
    }//GEN-LAST:event_jTextField_searchIdInputKeyTyped

    private void jButton_updateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateRecordActionPerformed
        // TODO add your handling code here:
        //extracting the value availabble in hte form 
        String newPass = new String(jPasswordField_newPass.getPassword());
        String rePass = new String(jPasswordField_retypePass.getPassword());
        String fullName = jTextField_name.getText();
        String email = jTextField_email.getText();
        String userName = jTextField_userName.getText();
        String dept = jTextField_department.getText();
        String batch = jTextField_batch.getText();
        String contact = jTextField_contact.getText();
        //check if any of thhe required valud is left blank 
        if (newPass.equals("") || rePass.equals("") || fullName.equals("")
                || userName.equals("") || dept.equals("") || contact.equals("")) {
            JOptionPane.showMessageDialog(null, "you are not supposed to left the"
                    + " input field empty for Password, user");
            return; //not necessary to execute further code snippet

        }
        if (jTextField_imageURL.equals("")) {
            jLabel2.setForeground(Color.red);
            jLabel2.setText("Choose the image");
            return;
        } else {
            jLabel2.setForeground(new Color(30, 180, 40));
            System.out.println("this is from here ");
            jLabel2.setText("Image Selectted");
        }
        try {
            //now we will set the value of every field of the form in the student object
            Student student = new Student();
            student.setStudentIdNew(Integer.parseInt(jTextField_searchIdInput.getText()));
            String[] name = fullName.split(" ");
            student.setFirstName(name[0]);
            student.setLastName(name[1]);
            student.setEmail(email);
            student.setUserName(userName);
            student.setPassword(newPass);
            student.setDateOfBirth(getDOB()); //function is created below;
            student.setDepartment(dept);
            student.setContact(Long.parseLong(contact));
            student.setGender(getGender());//function is created below;
            student.setBatch(Integer.parseInt(batch));

            //also sending the image url 
            student.setUrl(jTextField_imageURL.getText());

        //now we will send the information about the student in the DAO for the 
            //executioon of the update task
            StudentDAO stdao = new StudentDAO();
            boolean success;
            success = stdao.adminUpdateStudentRecord(student);
            if (success) {
                JOptionPane.showMessageDialog(null, jTextField_name.getText() + ", record is updated ");
                fetchTaskAuto(Integer.parseInt(jTextField_searchIdInput.getText()));
            } else {
                System.out.println("error in the update process");
            }
        } catch (ParseException ex) {
            System.out.println("while the task of update student is being done" + ex);
        }

    }//GEN-LAST:event_jButton_updateRecordActionPerformed

    private void jButton_changeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_changeImageActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            jTextField_imageURL.setText(file.toString());
        }
    }//GEN-LAST:event_jButton_changeImageActionPerformed

    private void jTextField_imageURLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_imageURLKeyTyped
        // TODO add your handling code here:
        evt.consume();
    }//GEN-LAST:event_jTextField_imageURLKeyTyped

    private void jTextField_imageURLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_imageURLKeyReleased
        // TODO add your handling code here:
        evt.consume();
    }//GEN-LAST:event_jTextField_imageURLKeyReleased

    private void jPasswordField_retypePassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_retypePassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_retypePassKeyTyped

    private void jPasswordField_retypePassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_retypePassKeyReleased
        // TODO add your handling code here:
        String first = new String(jPasswordField_newPass.getPassword());
        String second = new String(jPasswordField_retypePass.getPassword());
        if (second.equals(first)) {
            jLabel1.setForeground(new Color(30, 180, 40));
            jLabel1.setText("Matched");
            ALL_INPUT_GIVEN = true;
        } else {
            jLabel1.setForeground(Color.red);
            jLabel1.setText("Not Matched");
        }
    }//GEN-LAST:event_jPasswordField_retypePassKeyReleased
    public java.sql.Date getDOB() throws ParseException {
        //to create the Date object from the spinner
        String dobString = jComboBox_year.getSelectedItem().toString() + "-" + jComboBox_month.getSelectedItem().toString() + "-" + jComboBox_day.getSelectedItem().toString();
        DateFormat dFormat = new SimpleDateFormat("yy-MM-dd", Locale.ENGLISH);
        Date dob = dFormat.parse(dobString); //can generate ParserException
        java.sql.Date sqldob = new java.sql.Date(dob.getTime());
        return sqldob;
    }

    //this method will return the gender as per selected in the form 

    public String getGender() {
        if (jRadioButton_male.isSelected()) {
            return "male";
        } else if (jRadioButton_female.isSelected()) {
            return "female";
        } else {
            return null;
        }
    }

    public void fetchTaskAuto(int ID) {
        Student student = new Student();
        student.setStudentId(ID);
        StudentDAO stddao = new StudentDAO();
        student = stddao.getAllStudentRecord(student);
        //after this statement the student object will consist of the all informatioon 
        //about the current student ID 
        if (student != null) {
            jLabel_errorIdInput.setText(""); //when student is found then error message are to be erased

            jTextField_searchIdInput.setText(String.valueOf(ID));
            jTextField_name.setText(student.getFirstName() + " " + student.getLastName());
            jTextField_userName.setText(student.getUserName());
            jTextField_email.setText(student.getEmail());
            jTextField_department.setText(student.getDepartment());
            jTextField_contact.setText("" + student.getContact());
            jTextField_batch.setText("" + student.getBatch());
            if (!IMG_LOCATION.equals("")) {
                jTextField_imageURL.setText(IMG_LOCATION);
            } else {
                    jLabel2.setForeground(Color.red);
                    jLabel2.setText("Choose the image");
                   }

            //now auto adjusting the date of birth;
            String dob[] = String.valueOf(student.getDateOfBirth()).split("-");
            jComboBox_year.setSelectedIndex(Integer.parseInt(dob[0]) - 1949);
            jComboBox_month.setSelectedItem(Integer.parseInt(dob[1]));
            jComboBox_day.setSelectedItem(Integer.parseInt(dob[2]));

            System.out.println("the date is properly selected as" + dob[0] + "," + dob[1] + "," + dob[2]);
            //now  auto selection of the gender is controlled here
            if (student.getGender().equalsIgnoreCase("male")) {
                buttonGroup_gender.clearSelection();
                jRadioButton_male.setSelected(true);
            } else if (student.getGender().equalsIgnoreCase("female")) {
                buttonGroup_gender.clearSelection();
                jRadioButton_female.setSelected(true);
            }
        }//end of if student object returned by the DAO is  not equals to null 
        else {
            jLabel_errorIdInput.setText("Enter valid Student Id");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_gender;
    private javax.swing.JButton jButton_changeImage;
    private javax.swing.JButton jButton_updateRecord;
    private javax.swing.JComboBox jComboBox_day;
    private javax.swing.JComboBox jComboBox_month;
    private javax.swing.JComboBox jComboBox_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_batch;
    private javax.swing.JLabel jLabel_contact;
    private javax.swing.JLabel jLabel_dateOfBirth;
    private javax.swing.JLabel jLabel_department;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_errorIdInput;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_newPass;
    private javax.swing.JLabel jLabel_retypePass;
    private javax.swing.JLabel jLabel_search;
    private javax.swing.JLabel jLabel_titleText;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JPanel jPanel_titleHolder;
    private javax.swing.JPasswordField jPasswordField_newPass;
    private javax.swing.JPasswordField jPasswordField_retypePass;
    private javax.swing.JRadioButton jRadioButton_female;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_batch;
    private javax.swing.JTextField jTextField_contact;
    private javax.swing.JTextField jTextField_department;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_imageURL;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_searchIdInput;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}