
package School;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Update_Password extends javax.swing.JFrame {
Connection jcon=null;
Statement st=null;
PreparedStatement ps=null;
ResultSet rs=null;

    public Update_Password() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(80, 90, 240, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Old MobileNo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 70, 150, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 300, 130, 40);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(80, 230, 240, 40);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(80, 160, 240, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" New Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 210, 130, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Old Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 140, 130, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 370);

        setSize(new java.awt.Dimension(555, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Set Old Email OR Phone Number");
            jTextField1.requestFocus();
        }else if(jTextField3.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Set Old Password");
            jTextField3.requestFocus();
        }else{
        connection();
        String se="SELECT * FROM `student_loging_table` WHERE `Email`= ? OR `MobileNo`=? && `Password`=?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jTextField1.getText());
        ps.setString(2,jTextField1.getText());
        ps.setString(3,jTextField3.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        if(jTextField2.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, " Set New Password");
        jTextField2.requestFocus();
        }else{
        password();
        }
        }else{
         JOptionPane.showMessageDialog(this," Email And Password Is Rong");
         jTextField1.setText("");
         jTextField3.setText("");
         jTextField1.requestFocus();
        }
    } catch (SQLException ex) {
        Logger.getLogger(Loging_Form.class.getName()).log(Level.SEVERE, null, ex);
    }}
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void password(){
        connection();
        String up=null;
    up="UPDATE `student_loging_table` SET `Password`= ? WHERE `MobileNo`="+jTextField1.getText();
    try {
        ps=jcon.prepareStatement(up);
        ps.setString(1,jTextField2.getText());
        int b=ps.executeUpdate();
                if(b>0){
                JOptionPane.showMessageDialog(this,"Password Change Successfull...");
                }else{
                JOptionPane.showMessageDialog(this,"Password Change Filed...");
                }
    } catch (SQLException ex) {
        Logger.getLogger(Loging_Form.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    

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
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
