
package School;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Search_Entry_Fees extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Search_Entry_Fees() {
        initComponents();
        setTitle(" Search Student Fees ");
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
        jLabel1TotalF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11SID = new javax.swing.JLabel();
        jLabel12Sname = new javax.swing.JLabel();
        jLabel13ExamF = new javax.swing.JLabel();
        jLabel14BusF = new javax.swing.JLabel();
        jLabel15LibaryF = new javax.swing.JLabel();
        jLabel16HostelF = new javax.swing.JLabel();
        jLabel17AcademicF = new javax.swing.JLabel();
        jLabel18OtherF = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12Sclass = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1TotalF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel1TotalF);
        jLabel1TotalF.setBounds(430, 660, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 50, 210, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Student Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 120, 210, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Exam Fees");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 240, 210, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Bus Fees");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 310, 210, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Libary Fees");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 380, 210, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Hostel Fees");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 450, 210, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Academic Fees");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 520, 210, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Other's Fees");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 590, 210, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Total Fees");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 660, 210, 40);

        jLabel11SID.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel11SID);
        jLabel11SID.setBounds(430, 50, 300, 40);

        jLabel12Sname.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel12Sname);
        jLabel12Sname.setBounds(430, 120, 300, 40);

        jLabel13ExamF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel13ExamF);
        jLabel13ExamF.setBounds(430, 240, 300, 40);

        jLabel14BusF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel14BusF);
        jLabel14BusF.setBounds(430, 310, 300, 40);

        jLabel15LibaryF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel15LibaryF);
        jLabel15LibaryF.setBounds(430, 380, 300, 40);

        jLabel16HostelF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel16HostelF);
        jLabel16HostelF.setBounds(430, 450, 300, 40);

        jLabel17AcademicF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel17AcademicF);
        jLabel17AcademicF.setBounds(430, 520, 300, 40);

        jLabel18OtherF.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel18OtherF);
        jLabel18OtherF.setBounds(430, 590, 300, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Student Class");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 180, 210, 40);

        jLabel12Sclass.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(jLabel12Sclass);
        jLabel12Sclass.setBounds(430, 180, 300, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 1080, 780);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search by Id");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(900, 20, 160, 31);

        jTextField1.setBackground(new java.awt.Color(255, 0, 102));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(740, 20, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search By Student Id");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(740, 0, 190, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1080, 70);

        setSize(new java.awt.Dimension(1097, 900));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Search Button
    if(jTextField1.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, " Your Search ID Is Empty Set ID");
    jTextField1.requestFocus();
    }else{
    connection();
    String sec=null;
    sec="SELECT *FROM `studentfeesdetails` WHERE `StudentID` = ?";
    try {
        ps=jcon.prepareStatement(sec);
        ps.setString(1,jTextField1.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        jLabel11SID.setText(rs.getString("StudentID"));
        jLabel12Sname.setText(rs.getString("Name"));
        jLabel12Sclass.setText(rs.getString("Class"));
        jLabel13ExamF.setText(rs.getString("ExamFees"));
        jLabel14BusF.setText(rs.getString("BusFees"));
        jLabel15LibaryF.setText(rs.getString("LibaryFees"));
        jLabel16HostelF.setText(rs.getString("HostelFees"));
        jLabel17AcademicF.setText(rs.getString("AcademicFees"));
        jLabel18OtherF.setText(rs.getString("OthersFees"));
        jLabel1TotalF.setText(rs.getString("TotalFees"));
        }else{
        JOptionPane.showMessageDialog(this," Your Id Is Rong");
        jTextField1.setText("");
        jTextField1.requestFocus();
        }
       
    } catch (SQLException ex) {
        Logger.getLogger(Account_Details.class.getName()).log(Level.SEVERE, null, ex);
    }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    
    
    
    
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
            java.util.logging.Logger.getLogger(Search_Entry_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Entry_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Entry_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Entry_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Entry_Fees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel11SID;
    private javax.swing.JLabel jLabel12Sclass;
    private javax.swing.JLabel jLabel12Sname;
    private javax.swing.JLabel jLabel13ExamF;
    private javax.swing.JLabel jLabel14BusF;
    private javax.swing.JLabel jLabel15LibaryF;
    private javax.swing.JLabel jLabel16HostelF;
    private javax.swing.JLabel jLabel17AcademicF;
    private javax.swing.JLabel jLabel18OtherF;
    private javax.swing.JLabel jLabel1TotalF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
