/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.view;

import javax.swing.JTabbedPane;

/**
 *
 * @author Amit
 */
public class ManageStudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManageStudent1
     */
    public ManageStudent() {
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

        jTabbedPane_manageStudent = new javax.swing.JTabbedPane();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manage Student");

        jTabbedPane_manageStudent.setTabPlacement(JTabbedPane.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_manageStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_manageStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        jTabbedPane_manageStudent.addTab("Search Student", new DisplayStudentDetail());
        jTabbedPane_manageStudent.addTab("Update Record",new UpdateStudentDetail());

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane jTabbedPane_manageStudent;
    // End of variables declaration//GEN-END:variables
}