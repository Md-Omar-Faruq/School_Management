
package School;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Add_notish_bord extends javax.swing.JFrame {
    Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Add_notish_bord() {
        initComponents();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1130, 20, 110, 31);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(740, 20, 110, 31);

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1000, 20, 110, 31);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(220, 40, 240, 30);

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(870, 20, 110, 31);

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1260, 20, 110, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Notice Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 10, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1400, 80);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(0, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(-4, 0, 1400, 740);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 1400, 740);

        setSize(new java.awt.Dimension(1408, 854));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Save Button
        if(jDateChooser1.getDate()==null){
            JOptionPane.showMessageDialog(this, " Notice Date Is Empty");
            jDateChooser1.requestFocus();
        }else if(jTextArea1.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Please Set Your Notice");
        jTextArea1.requestFocus();
        }else{
        connection();
        String se=null;
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String Date=sdf.format(jDateChooser1.getDate()).toString();
            se="INSERT INTO `notish_bord`(`Notish`,`Date`) VALUES(?,?)";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,jTextArea1.getText());
                ps.setString(2,Date);
                boolean b=ps.execute();
                if(!b){
                JOptionPane.showMessageDialog(this," Operation Successfully..");
                }else{
                JOptionPane.showMessageDialog(this," Operation Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Add_notish_bord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Clear Button
       clear();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void clear(){
     jDateChooser1.setDate(null);
     jTextArea1.setText("");
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // View Record
        if(jDateChooser1.getDate()==null){
        JOptionPane.showMessageDialog(this," You view Record By Date");
        jDateChooser1.requestFocus();
        }else{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String Date=sdf.format(jDateChooser1.getDate()).toString();
            connection();
            String se=null;
            se="SELECT `Notish` FROM `notish_bord` WHERE `Date` = ?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1, Date);
                rs=ps.executeQuery();
                if(rs.next()){
                jTextArea1.setText(rs.getString("Notish"));
                boolean b=ps.execute();
                 if(b){
                    JOptionPane.showMessageDialog(this," Data View Successfully..");
                 }else{
                    JOptionPane.showMessageDialog(this," Data View Filed..");
                 }
                }else{
                JOptionPane.showMessageDialog(this," No Informatiom In This Date ");
                jDateChooser1.setDate(null);
                jDateChooser1.requestFocus();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Add_notish_bord.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Delete Button 
        
        if(jDateChooser1.getDate()==null){
        JOptionPane.showMessageDialog(this," You view Record By Date");
        jDateChooser1.requestFocus();
        }else{
        int DD=JOptionPane.showConfirmDialog(this," Are you sure You want to Delete this Record");
        if(DD==0){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String Date=sdf.format(jDateChooser1.getDate()).toString();
            connection();
            String se=null;
            se="DELETE FROM `notish_bord` WHERE `Date` = ?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1, Date);
                int b=ps.executeUpdate();
        if(b==1){
        clear(); 
        JOptionPane.showMessageDialog(this," Data Delete Stccessfully...");
        }else{
        JOptionPane.showMessageDialog(this," Data Delete Filed...");
        }
            } catch (SQLException ex) {
                Logger.getLogger(Add_notish_bord.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_notish_bord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
