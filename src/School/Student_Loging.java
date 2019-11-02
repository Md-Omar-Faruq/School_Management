
package School;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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


public class Student_Loging extends javax.swing.JFrame {
Connection jcon=null;
PreparedStatement ps=null;
Statement st=null;
ResultSet rs=null;

String Fname,Mname,Lname,Email,Number,Password,Rpassword,Age,DOB,Gender;
    public Student_Loging() {
        initComponents();
        setResizable(false);
        this.setTitle("Registation From ");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
    public void connection(){
 try {
    jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    //st=jcon.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
    }}
public void Initialize(){
Fname=jTextField1.getText();
Mname=jTextField2.getText();
Lname=jTextField3.getText();
Email=jTextField4.getText();
Number=jTextField6.getText();
Password=jPasswordField1.getText();
Rpassword=jPasswordField2.getText();
Age=jTextField5.getText();
if(jRadioButton1.isSelected()){
Gender="Male";
}else if(jRadioButton2.isSelected()){
Gender="Female";
}else{
Gender="";
}
}
public void AddData(){
 connection();
 Initialize();
if(jTextField1.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Your First Name Is Empty ");
jTextField1.requestFocus();
}else if(jTextField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this," Your Mid Name Is Empty ");
jTextField2.requestFocus();
}else if(jTextField3.getText().isEmpty()){
JOptionPane.showMessageDialog(this," Your Last Name Is Empty ");
jTextField3.requestFocus();
}else if(jTextField4.getText().isEmpty()){
JOptionPane.showMessageDialog(this," Your Email Is Empty ");
jTextField4.requestFocus();
}else if(jTextField6.getText().isEmpty()){
JOptionPane.showMessageDialog(this," Your Mobile Number Is Empty ");
jTextField6.requestFocus();
}else if(jPasswordField1.getText().isEmpty()){
JOptionPane.showMessageDialog(this," Your Password Is Empty ");
jPasswordField1.requestFocus();
}else if(jPasswordField2.getText().isEmpty()){
JOptionPane.showMessageDialog(this," Please ReType Your Password Is Empty ");
jPasswordField2.requestFocus();
}else if(jTextField5.getText().isEmpty()){
JOptionPane.showMessageDialog(this," Please Set Your Age ");
jTextField5.requestFocus();
}else if(jDateChooser1.getDate()==null){
JOptionPane.showMessageDialog(this," Please Set Your Date OF Birth ");
jDateChooser1.requestFocus();
}else if(Gender.isEmpty()){
JOptionPane.showMessageDialog(this," Please Select Your Gender ");
jRadioButton1.requestFocus();
}else{
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
DOB=sdf.format(jDateChooser1.getDate()).toString();
String in=null;
        in="INSERT INTO `student_loging_table`(`Fname`,`Mname`,`Lname`,`Email`,`MobileNo`,`Password`,`Rpassword`,`Age`,`BirthDate`,`Gender`) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            ps=jcon.prepareStatement(in);
            ps.setString(1,Fname);
            ps.setString(2,Mname);
            ps.setString(3,Lname);
            ps.setString(4,Email);
            ps.setString(5,Number);
            ps.setString(6,Password);
            ps.setString(7,Rpassword);
            ps.setString(8,Age);
            ps.setString(9,DOB);
            ps.setString(10,Gender);
            boolean b = ps.execute();
            if(!b)
                JOptionPane.showMessageDialog(this," Registation Success....");
            else
                JOptionPane.showMessageDialog(this," Registation Filed....");
        } catch (SQLException ex) {
            Logger.getLogger(Student_Loging.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Registation = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Back");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 90, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("User Email ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 160, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("User Name ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 160, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 70, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("First Name *");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 50, 80, 20);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(340, 70, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Mid Name *");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(340, 50, 80, 20);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(500, 70, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Last Name *");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(500, 50, 80, 20);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(180, 120, 290, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 220, 160, 30);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(180, 220, 120, 30);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(500, 220, 160, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Confirm Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 220, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 310, 160, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(153, 0, 0));
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(260, 320, 70, 25);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(153, 0, 0));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(180, 320, 70, 25);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(180, 270, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Mobile Number");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 170, 160, 30);

        Exit.setBackground(new java.awt.Color(0, 153, 255));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(470, 420, 130, 31);

        Registation.setBackground(new java.awt.Color(0, 153, 255));
        Registation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Registation.setForeground(new java.awt.Color(255, 255, 255));
        Registation.setText("Registation");
        Registation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistationActionPerformed(evt);
            }
        });
        getContentPane().add(Registation);
        Registation.setBounds(180, 420, 140, 31);

        Clear.setBackground(new java.awt.Color(0, 153, 255));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(340, 420, 110, 31);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Age");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 270, 160, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(180, 170, 290, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Date OF Birth");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 270, 170, 30);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(500, 270, 160, 30);

        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/School/This.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 560));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 550);

        setSize(new java.awt.Dimension(785, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void RegistationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistationActionPerformed
        // Registation Button : 
        AddData();
    }//GEN-LAST:event_RegistationActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // Clear Button :
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jDateChooser1.setDate(null);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_ClearActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Exit Button
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Loging_Form lo=new Loging_Form();
        lo.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked


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
            java.util.logging.Logger.getLogger(Student_Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Loging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Loging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Registation;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
