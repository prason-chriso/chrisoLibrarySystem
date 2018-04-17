/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Amit
 */
public class Mainframe extends javax.swing.JFrame {

    /**
     * Creates new form Mainframe
     */
 
    
    //setting the layout for the different to display
    public static CardLayout card ;
    //setting the variable for the button to be hidden
    int count = 1;
    public Mainframe() {
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

        jDesktopPane_mainframe = new javax.swing.JDesktopPane();
        headingDisplay = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_container = new javax.swing.JPanel();
        jButton_next = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jButton_home = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wecome to Chriso Library");
        setBackground(new java.awt.Color(255, 204, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1200, 745));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane_mainframe.setForeground(new java.awt.Color(0, 153, 153));

        headingDisplay.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Welcome to Chriso-Library");

        javax.swing.GroupLayout headingDisplayLayout = new javax.swing.GroupLayout(headingDisplay);
        headingDisplay.setLayout(headingDisplayLayout);
        headingDisplayLayout.setHorizontalGroup(
            headingDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingDisplayLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headingDisplayLayout.setVerticalGroup(
            headingDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingDisplayLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel_container.setSize(500,400);
        jPanel_container.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_container.setLayout(new java.awt.CardLayout());
        card = new CardLayout(10,10);
        jPanel_container.setLayout(card);

        jPanel_container.add(new LogInOptionPanel(),"card0");
        jPanel_container.add(new AdminPanel(),"card1");
        jPanel_container.add(new StudentPanel(),"card2");

        jButton_next.setBackground(new java.awt.Color(0, 102, 102));
        jButton_next.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_next.setForeground(new java.awt.Color(51, 51, 51));
        jButton_next.setText("Next");
        jButton_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nextActionPerformed(evt);
            }
        });

        jButton_back.setBackground(new java.awt.Color(0, 102, 102));
        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_back.setForeground(new java.awt.Color(204, 204, 204));
        jButton_back.setText("Back");
        jButton_back.setToolTipText("");
        jButton_back.setEnabled(false);
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton_home.setBackground(new java.awt.Color(0, 102, 102));
        jButton_home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_home.setForeground(new java.awt.Color(51, 51, 51));
        jButton_home.setText("Home");
        jButton_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_homeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("© 2017, Prason Ghimire , ALL RIGHTS RESERVED");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane_mainframeLayout = new javax.swing.GroupLayout(jDesktopPane_mainframe);
        jDesktopPane_mainframe.setLayout(jDesktopPane_mainframeLayout);
        jDesktopPane_mainframeLayout.setHorizontalGroup(
            jDesktopPane_mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane_mainframeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_back)
                .addGap(384, 384, 384)
                .addComponent(jButton_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(jButton_next)
                .addGap(26, 26, 26))
            .addComponent(headingDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane_mainframeLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDesktopPane_mainframeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_back, jButton_home, jButton_next});

        jDesktopPane_mainframeLayout.setVerticalGroup(
            jDesktopPane_mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane_mainframeLayout.createSequentialGroup()
                .addComponent(headingDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane_mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_home, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane_mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane_mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane_mainframeLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jDesktopPane_mainframeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_back, jButton_home, jButton_next});

        jDesktopPane_mainframe.setLayer(headingDisplay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_mainframe.setLayer(jPanel_container, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_mainframe.setLayer(jButton_next, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_mainframe.setLayer(jButton_back, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_mainframe.setLayer(jButton_home, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_mainframe.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane_mainframe.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("File");

        jMenuItem3.setText("Add Record");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText(" Log in");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Log  in");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Log out");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_mainframe)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane_mainframe)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here
       First_log_in_window flw = new First_log_in_window();
       jDesktopPane_mainframe.add(flw);
       flw.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nextActionPerformed
        // TODO add your handling code here:
        card.next(jPanel_container);
        count++;
        jButton_back.setEnabled(true);
       
        if(count==3){
            jButton_next.setEnabled(false);
            jButton_next.setToolTipText("Next Button  is currently Disabled");
            jButton_next.setForeground(new Color(240,240,240));
            
        }
        else{
            jButton_next.setToolTipText("Next Button");
            jButton_back.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_jButton_nextActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
        card.previous(jPanel_container);
        count--;
        jButton_next.setEnabled(true);
        if(count==1){
            jButton_back.setEnabled(false);
            jButton_back.setToolTipText("Back Button  is currently Disabled");
                        jButton_back.setForeground(new Color(240,240,240));          
          
        }else{
             jButton_back.setToolTipText("Back Button");
                         jButton_next.setForeground(Color.BLACK);

        }
        
    }//GEN-LAST:event_jButton_backActionPerformed
    
    private void jButton_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_homeActionPerformed
        // TODO add your handling code here:
        card.show(jPanel_container,"card0");
        jButton_next.setEnabled(true);
        jButton_back.setEnabled(false);
        count=1; //re initialize the coutn value so that the next button will be disabled again when
        // the next button is clicked 3 times to prevent showing furtheer unnecessary carrds
        
        
    }//GEN-LAST:event_jButton_homeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton_next.setEnabled(true);
        jButton_back.setEnabled(false);
        card.show(jPanel_container, "card0");
        count=1;
        enableLogInOption();
        disableAllAdminPanel();
        disableAllStudentPanel();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void enableLogInOption(){
        LogInOptionPanel.jButton_adminLogInBtn.setEnabled(true);
        LogInOptionPanel.jButton_adminLogInBtn.setForeground(Color.BLACK);
        LogInOptionPanel.jButton_studentLogInBtn.setEnabled(true);
        LogInOptionPanel.jButton_studentLogInBtn.setForeground(Color.BLACK);
    }
    public  void disableAllAdminPanel(){
      AdminPanel.jButton_addBook.setEnabled(false);
      AdminPanel.jButton_addStudent.setEnabled(false);
      AdminPanel.jButton_editProfile.setEnabled(false);
      AdminPanel.jButton_manageBook.setEnabled(false);
      AdminPanel.jButton_manageBorrowing.setEnabled(false);
      AdminPanel.jButton_manageReturn.setEnabled(false);
      AdminPanel.jButton_manageStudent.setEnabled(false);
      AdminPanel.jButton_recordBorrow.setEnabled(false);
      
    }
    public void disableAllStudentPanel(){
        StudentPanel.jButton_bookBorrowed.setEnabled(false);
        StudentPanel.jButton_bookList.setEnabled(false);
        StudentPanel.jButton_editProfile.setEnabled(false);
        StudentPanel.jButton_searchBook.setEnabled(false);
        StudentPanel.jButton_viewProfile.setEnabled(false);
        
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Are you sure, You want to close");
       if(response==JOptionPane.YES_OPTION){
           dispose();
       }
       else{
           this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headingDisplay;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton_back;
    public static javax.swing.JButton jButton_home;
    public static javax.swing.JButton jButton_next;
    public static javax.swing.JDesktopPane jDesktopPane_mainframe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel_container;
    // End of variables declaration//GEN-END:variables
}