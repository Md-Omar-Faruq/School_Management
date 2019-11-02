
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
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class Account_Details extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Account_Details() {
        initComponents();
        snowed();
        setResizable(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
    public void connection(){
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }}
    
    public void snowed(){
    connection();
    DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
    String sec=null;
    sec="SELECT `SL_ID`,`Date`,`Details`,`Type`,`Debit`,`Credit` FROM `account_details`";
    try {
        ps=jcon.prepareStatement(sec);
        rs=ps.executeQuery();
        int d=0,c=0,t=0;
        while(rs.next()){
        d=d+rs.getInt(5);
        c=c+rs.getInt(6);
        d=d+rs.getInt(5);
        dtm.addRow(new Object[]{rs.getInt("SL_ID"),rs.getDate("Date"),rs.getString("Details"),rs.getString("Type"),rs.getInt("Debit"),rs.getInt("Credit")});
        }
       TD.setText(""+d);
       TC.setText(""+c);
       t=c-d;
       TA.setText(""+t);
    } catch (SQLException ex) {
        Logger.getLogger(Account_Details.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        TD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TA = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1580, 60);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL ID", "Date", "Details", "Type", "Dabit", "Credit"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 1580, 530);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.setLayout(null);

        TD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(TD);
        TD.setBounds(690, 20, 210, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total Debit");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(570, 20, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total Credit");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(910, 20, 110, 30);

        TA.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(TA);
        TA.setBounds(1380, 20, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Total Ammount");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1220, 20, 160, 30);

        TC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(TC);
        TC.setBounds(1030, 20, 180, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 590, 1580, 80);

        setSize(new java.awt.Dimension(1585, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(Account_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create aTDlay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TA;
    private javax.swing.JLabel TC;
    private javax.swing.JLabel TD;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private JLabel setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
