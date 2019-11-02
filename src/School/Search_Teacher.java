
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

public class Search_Teacher extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Search_Teacher() {
        initComponents();
        setTitle("Teacher Profile");
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
        jLabel1Type = new javax.swing.JLabel();
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
        jLabel13Dbition = new javax.swing.JLabel();
        jLabel14Salary = new javax.swing.JLabel();
        jLabel15Gender = new javax.swing.JLabel();
        jLabel16JoidDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12SEmail = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15Picture = new javax.swing.JLabel();
        jLabel14AcademicYear = new javax.swing.JLabel();
        jLabel13Qualification = new javax.swing.JLabel();
        jLabel12SDristic = new javax.swing.JLabel();
        jLabel12SMobileNo = new javax.swing.JLabel();
        jLabel11FatherName = new javax.swing.JLabel();
        jLabel15Relision = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreasubject = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jLabel1Type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1Type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1Type);
        jLabel1Type.setBounds(210, 470, 300, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Teacher Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Divition");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 230, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Salary");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 290, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 350, 140, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Join Date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 410, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(530, 600, 150, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Subject");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 600, 140, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Teacher Type");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 470, 140, 30);

        jLabel11SID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11SID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel11SID);
        jLabel11SID.setBounds(210, 50, 300, 30);

        jLabel12Sname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12Sname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel12Sname);
        jLabel12Sname.setBounds(210, 110, 300, 30);

        jLabel13Dbition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13Dbition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel13Dbition);
        jLabel13Dbition.setBounds(210, 230, 300, 30);

        jLabel14Salary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14Salary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel14Salary);
        jLabel14Salary.setBounds(210, 290, 300, 30);

        jLabel15Gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15Gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel15Gender);
        jLabel15Gender.setBounds(210, 350, 300, 30);

        jLabel16JoidDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16JoidDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel16JoidDate);
        jLabel16JoidDate.setBounds(210, 410, 300, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 170, 140, 30);

        jLabel12SEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12SEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel12SEmail);
        jLabel12SEmail.setBounds(210, 170, 300, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Relision");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(50, 530, 130, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Academic Year");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(530, 530, 150, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Qualification");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(530, 470, 150, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Distric");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(530, 410, 150, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Mobile Number");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(530, 350, 150, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Father Name");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(530, 290, 150, 30);

        jLabel15Picture.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15Picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jPanel1.add(jLabel15Picture);
        jLabel15Picture.setBounds(740, 30, 240, 210);

        jLabel14AcademicYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14AcademicYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel14AcademicYear);
        jLabel14AcademicYear.setBounds(710, 530, 300, 30);

        jLabel13Qualification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13Qualification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel13Qualification);
        jLabel13Qualification.setBounds(710, 470, 300, 30);

        jLabel12SDristic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12SDristic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel12SDristic);
        jLabel12SDristic.setBounds(710, 410, 300, 30);

        jLabel12SMobileNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12SMobileNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel12SMobileNo);
        jLabel12SMobileNo.setBounds(710, 350, 300, 30);

        jLabel11FatherName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11FatherName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel11FatherName);
        jLabel11FatherName.setBounds(710, 290, 300, 30);

        jLabel15Relision.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15Relision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel15Relision);
        jLabel15Relision.setBounds(210, 530, 300, 30);

        jTextAreasubject.setBackground(new java.awt.Color(0, 153, 255));
        jTextAreasubject.setColumns(20);
        jTextAreasubject.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextAreasubject.setRows(5);
        jTextAreasubject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(jTextAreasubject);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(210, 590, 300, 70);

        jTextAreaAddress.setBackground(new java.awt.Color(0, 153, 255));
        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextAreaAddress.setRows(5);
        jTextAreaAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(jTextAreaAddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(710, 590, 300, 70);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Teacher ID");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 50, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 1090, 740);

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
        jButton1.setBounds(710, 20, 160, 31);

        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(510, 20, 210, 30);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(910, 20, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by Teacher ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(510, 0, 210, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1090, 70);

        setSize(new java.awt.Dimension(1109, 859));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Search Button
        if(jTextField1.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Search Id Is Empty Set Id");
        jTextField1.requestFocus();
        }else{
        connection();
        String sec=null;
        sec="SELECT * FROM `teacher_admission` WHERE `TeacherID` = ?";
        try {
            ps=jcon.prepareStatement(sec);
            ps.setString(1,jTextField1.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                jLabel11SID.setText(rs.getString("TeacherID"));
                jLabel12Sname.setText(rs.getString("Name"));
                jLabel12SEmail.setText(rs.getString("Email"));
                jLabel13Dbition.setText(rs.getString("Divition"));
                jLabel14Salary.setText(rs.getString("Salary"));
                jLabel15Gender.setText(rs.getString("Gender"));
                jLabel16JoidDate.setText(rs.getString("JoinDate"));
                jTextAreaAddress.setText(rs.getString("Address"));
                jTextAreasubject.setText(rs.getString("Subject"));
                jLabel1Type.setText(rs.getString("Ttype"));
                jLabel11FatherName.setText(rs.getString("Fname"));
                jLabel12SMobileNo.setText(rs.getString("MobileNo"));
                jLabel12SDristic.setText(rs.getString("Distric"));
                jLabel13Qualification.setText(rs.getString("Qualification"));
                jLabel14AcademicYear.setText(rs.getString("AcademicYear"));
                jLabel15Relision.setText(rs.getString("Religion"));
                byte pic[]=rs.getBytes("Picture");
                ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel15Picture.getWidth(),jLabel15Picture.getHeight(),Image.SCALE_SMOOTH));
                jLabel15Picture.setIcon(im);
            }else{
                JOptionPane.showMessageDialog(this," Your ID Is Rong");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this," No Image Found"+ex);
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Clear Button
                jTextField1.setText("");
                jLabel11SID.setText("");
                jLabel12Sname.setText("");
                jLabel12SEmail.setText("");
                jLabel13Dbition.setText("");
                jLabel14Salary.setText("");
                jLabel15Gender.setText("");
                jLabel16JoidDate.setText("");
                jTextAreaAddress.setText("");
                jTextAreasubject.setText("");
                jLabel1Type.setText("");
                jLabel11FatherName.setText("");
                jLabel12SMobileNo.setText("");
                jLabel12SDristic.setText("");
                jLabel13Qualification.setText("");
                jLabel14AcademicYear.setText("");
                jLabel15Relision.setText("");
                jLabel15Picture.setIcon(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Search_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel11FatherName;
    private javax.swing.JLabel jLabel11SID;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel12SDristic;
    private javax.swing.JLabel jLabel12SEmail;
    private javax.swing.JLabel jLabel12SMobileNo;
    private javax.swing.JLabel jLabel12Sname;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel13Dbition;
    private javax.swing.JLabel jLabel13Qualification;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel14AcademicYear;
    private javax.swing.JLabel jLabel14Salary;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel15Gender;
    private javax.swing.JLabel jLabel15Picture;
    private javax.swing.JLabel jLabel15Relision;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel16JoidDate;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel1Type;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextArea jTextAreasubject;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
