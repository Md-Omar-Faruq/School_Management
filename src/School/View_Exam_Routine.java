
package School;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class View_Exam_Routine extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public View_Exam_Routine() {
        initComponents();
        setTitle("Exam Routine View");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
    
    public void connection(){
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }}
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel355 = new javax.swing.JLabel();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jLabel356 = new javax.swing.JLabel();
        jComboBoxExam = new javax.swing.JComboBox<>();
        jLabel332 = new javax.swing.JLabel();
        Print = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Print1 = new javax.swing.JButton();
        AddExam = new javax.swing.JButton();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        Time = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jLabel355.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel355.setForeground(new java.awt.Color(153, 0, 102));
        jLabel355.setText("Class");
        jPanel1.add(jLabel355);
        jLabel355.setBounds(10, 20, 70, 30);

        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseMoved(evt);
            }
        });
        jComboBoxSClass.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxSClassPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxSClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseClicked(evt);
            }
        });
        jComboBoxSClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSClassActionPerformed(evt);
            }
        });
        jComboBoxSClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxSClassKeyReleased(evt);
            }
        });
        jPanel1.add(jComboBoxSClass);
        jComboBoxSClass.setBounds(80, 20, 170, 30);

        jLabel356.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel356.setForeground(new java.awt.Color(153, 0, 102));
        jLabel356.setText("Exam Type");
        jPanel1.add(jLabel356);
        jLabel356.setBounds(270, 20, 110, 30);

        jComboBoxExam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Exam", "Fast Term Exam", "Second Term Exam", "Mid Term Exam", "Test Exam", "Annual Exam" }));
        jComboBoxExam.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxExamMouseMoved(evt);
            }
        });
        jPanel1.add(jComboBoxExam);
        jComboBoxExam.setBounds(390, 20, 230, 30);

        jLabel332.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel332.setForeground(new java.awt.Color(153, 0, 102));
        jLabel332.setText("Academic Year");
        jPanel1.add(jLabel332);
        jLabel332.setBounds(650, 20, 160, 30);

        Print.setBackground(new java.awt.Color(255, 0, 0));
        Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Clear");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel1.add(Print);
        Print.setBounds(1120, 20, 110, 30);

        View.setBackground(new java.awt.Color(255, 0, 0));
        View.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View);
        View.setBounds(1000, 20, 110, 30);

        Print1.setBackground(new java.awt.Color(255, 0, 0));
        Print1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Print1.setForeground(new java.awt.Color(255, 255, 255));
        Print1.setText("Print");
        Print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print1ActionPerformed(evt);
            }
        });
        jPanel1.add(Print1);
        Print1.setBounds(1240, 20, 110, 30);

        AddExam.setBackground(new java.awt.Color(255, 0, 0));
        AddExam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddExam.setForeground(new java.awt.Color(255, 255, 255));
        AddExam.setText("Add New");
        AddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddExamActionPerformed(evt);
            }
        });
        jPanel1.add(AddExam);
        AddExam.setBounds(1380, 20, 120, 30);
        jPanel1.add(jYearChooser1);
        jYearChooser1.setBounds(840, 20, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1530, 60);

        Time.setBackground(new java.awt.Color(51, 102, 255));
        Time.setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Exam Date", "Time"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        Time.add(jScrollPane1);
        jScrollPane1.setBounds(0, 50, 1520, 730);

        getContentPane().add(Time);
        Time.setBounds(0, 60, 1530, 780);

        setSize(new java.awt.Dimension(1541, 885));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseClicked

    }//GEN-LAST:event_jComboBoxSClassMouseClicked

    private void jComboBoxSClassPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxSClassPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        connection();
        //jComboBoxSubject.removeAllItems();
        int i=jComboBoxSClass.getSelectedIndex();
        String se=null;
        se="SELECT `Subject` FROM `class_subject` WHERE `Class_ID`="+i;
        try {
            ps=jcon.prepareStatement(se);
            rs=ps.executeQuery();
            while(rs.next()){
                //jComboBoxSubject.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxSClassPopupMenuWillBecomeInvisible

    private void jComboBoxSClassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassMouseMoved

    private void jComboBoxSClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSClassActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBoxSClassActionPerformed

    private void jComboBoxSClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSClassKeyReleased

    }//GEN-LAST:event_jComboBoxSClassKeyReleased

    private void jComboBoxExamMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxExamMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxExamMouseMoved

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // View Button
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        if(jComboBoxSClass.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this," Please Select Your Class");
            jComboBoxSClass.requestFocus();
        }else if(jComboBoxExam.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Please Select Your Exam Type");
            jComboBoxExam.requestFocus();
        }else if(jYearChooser1.getYear()==0){
        JOptionPane.showMessageDialog(this," Year Is Empty");
            jYearChooser1.requestFocus();
        }else{
            dtm.setRowCount(0);
            ps=null;
            connection();
            String se=null;
            se="SELECT `Subject`,`Exam_Date`,`Time` FROM `exam_routine` WHERE `Class` = ? AND `Exam_Type` = ? AND `Year` = ? ";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,jComboBoxSClass.getSelectedItem().toString());
                ps.setString(2,jComboBoxExam.getSelectedItem().toString());
                ps.setInt(3,jYearChooser1.getYear());
                rs=ps.executeQuery();
                while(rs.next()){
                dtm.addRow(new Object[]{rs.getString(1),rs.getDate(2),rs.getString(3)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(View_Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // Clear Button
        clear();
    }//GEN-LAST:event_PrintActionPerformed
    
    public void clear(){
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
    jComboBoxSClass.setSelectedIndex(0);
    jComboBoxExam.setSelectedIndex(0);
    jYearChooser1.setYear(0);
    dtm.setRowCount(0);
    }
    
    private void Print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print1ActionPerformed
    try {
        // Print Button
        boolean p=jTable1.print();
        if(p){
            JOptionPane.showMessageDialog(this," Print Success...");
        }else{
        JOptionPane.showMessageDialog(this," Printing Proccess...");
        }
    } catch (PrinterException ex) {
        Logger.getLogger(View_Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_Print1ActionPerformed

    private void AddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddExamActionPerformed
        // Add Exam Routine
        Exam_Routine er=new Exam_Routine();
        er.setVisible(true);
    }//GEN-LAST:event_AddExamActionPerformed

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
            java.util.logging.Logger.getLogger(View_Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Exam_Routine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddExam;
    private javax.swing.JButton Print;
    private javax.swing.JButton Print1;
    private javax.swing.JPanel Time;
    private javax.swing.JButton View;
    private javax.swing.JComboBox<String> jComboBoxExam;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
