
package School;

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
import javax.swing.JOptionPane;

public class Search_Payment_Fees extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Search_Payment_Fees() {
        initComponents();
        setTitle("Show Payment Record");
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jLabel1TotalF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1TotalF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel1TotalF);
        jLabel1TotalF.setBounds(330, 670, 330, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Payment ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 40, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Payment Date");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Student Name");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 250, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Student Class");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 320, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total Ammount");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 390, 210, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Discount Ammount");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 460, 210, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("After Total");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 530, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Paid Ammount");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 600, 210, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Due Ammount");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 670, 210, 30);

        jLabel11SID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11SID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel11SID);
        jLabel11SID.setBounds(330, 40, 330, 30);

        jLabel12Sname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12Sname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel12Sname);
        jLabel12Sname.setBounds(330, 110, 330, 30);

        jLabel13ExamF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13ExamF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel13ExamF);
        jLabel13ExamF.setBounds(330, 250, 330, 30);

        jLabel14BusF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14BusF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel14BusF);
        jLabel14BusF.setBounds(330, 320, 330, 30);

        jLabel15LibaryF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15LibaryF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel15LibaryF);
        jLabel15LibaryF.setBounds(330, 390, 330, 30);

        jLabel16HostelF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16HostelF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel16HostelF);
        jLabel16HostelF.setBounds(330, 460, 330, 30);

        jLabel17AcademicF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17AcademicF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel17AcademicF);
        jLabel17AcademicF.setBounds(330, 530, 330, 30);

        jLabel18OtherF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18OtherF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel18OtherF);
        jLabel18OtherF.setBounds(330, 600, 330, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Student ID");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 180, 210, 30);

        jLabel12Sclass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12Sclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(jLabel12Sclass);
        jLabel12Sclass.setBounds(330, 180, 330, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 870, 770);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
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
        jButton1.setBounds(640, 30, 160, 31);

        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(450, 30, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search By Student Id");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(450, 10, 170, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 870, 70);

        setSize(new java.awt.Dimension(878, 884));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Search Button
        if(jTextField1.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Search ID Is Empty Set Student Id");
        jTextField1.requestFocus();
        }else{
        connection();
        String sec=null;
        sec="SELECT *FROM `student_fees_payment` WHERE `S_ID` = ?";
        try {
            ps=jcon.prepareStatement(sec);
            ps.setString(1,jTextField1.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                jLabel11SID.setText(rs.getString("PID"));
                jLabel12Sname.setText(rs.getString("P_Date"));
                jLabel12Sclass.setText(rs.getString("S_ID"));
                jLabel13ExamF.setText(rs.getString("S_Name"));
                jLabel14BusF.setText(rs.getString("S_Class"));
                jLabel15LibaryF.setText(rs.getString("Total_A"));
                jLabel16HostelF.setText(rs.getString("Discount_A"));
                jLabel17AcademicF.setText(rs.getString("After_T"));
                jLabel18OtherF.setText(rs.getString("Paid_A"));
                jLabel1TotalF.setText(rs.getString("Due_A"));
            }else{
                JOptionPane.showMessageDialog(this," Your Id Is Rong");
                jTextField1.setText("");
                jTextField1.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Account_Details.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
        
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
            java.util.logging.Logger.getLogger(Search_Payment_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Payment_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Payment_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Payment_Fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Payment_Fees().setVisible(true);
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
