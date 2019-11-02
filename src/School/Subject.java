
package School;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Subject extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Subject() {
        initComponents();
        setTitle(" Entry Subject");
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
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(null);

        jComboBoxSClass.setBackground(new java.awt.Color(255, 0, 153));
        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass.setForeground(new java.awt.Color(51, 204, 255));
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
        jComboBoxSClass.setBounds(190, 10, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("Class");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 10, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 50);

        jTable1.setBackground(new java.awt.Color(51, 204, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject ", "Subject Code"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Subject ");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Subject Code");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 50, 1010, 450);

        setSize(new java.awt.Dimension(1030, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseClicked

    }//GEN-LAST:event_jComboBoxSClassMouseClicked

    private void jComboBoxSClassPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxSClassPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        connection();
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        int i=jComboBoxSClass.getSelectedIndex();
        String se=null;
        se="SELECT `Subject`,`Subject_Code` FROM `class_subject` WHERE `Class_ID`="+i;
        try {
            ps=jcon.prepareStatement(se);
            rs=ps.executeQuery();
            while(rs.next()){
            dtm.addRow(new Object[]{rs.getString("Subject"),rs.getInt("Subject_Code")});
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
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
