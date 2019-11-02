
package School;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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


public class View_Registation_card extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public View_Registation_card() {
        initComponents();
        setTitle("Student Registation Card");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelserial = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabelInstitute = new javax.swing.JLabel();
        jLabelDis = new javax.swing.JLabel();
        jLabelThana = new javax.swing.JLabel();
        jLabelPO = new javax.swing.JLabel();
        jLabeRegno = new javax.swing.JLabel();
        jLabelSession = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelClass = new javax.swing.JLabel();
        jLabelMname = new javax.swing.JLabel();
        jLabelFname = new javax.swing.JLabel();
        jLabelSname = new javax.swing.JLabel();
        jLabelStudentID = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Student Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 230, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registation Card");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(360, 50, 520, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Class");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 380, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Father's Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 280, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Post Office");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 580, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Registation No");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 530, 190, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Signature of Register");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(840, 860, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("District");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 680, 190, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Thana");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 630, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Gender");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 430, 190, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Session");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(60, 480, 190, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Mother's Name");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(60, 330, 190, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jPanel2.add(jLabel14);
        jLabel14.setBounds(830, 140, 210, 240);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Bangladesh Technicall Educatio Bord");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(360, 0, 520, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Institute Name & Code");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(60, 730, 190, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("Signature of Student");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(30, 860, 190, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("Signature of Principal");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(430, 860, 190, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Student ID");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(60, 180, 190, 30);

        jLabelserial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelserial);
        jLabelserial.setBounds(140, 60, 150, 30);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(130, 20, 180, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Serial No.");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(40, 60, 90, 30);

        jLabelInstitute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelInstitute);
        jLabelInstitute.setBounds(290, 730, 690, 30);

        jLabelDis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelDis);
        jLabelDis.setBounds(290, 680, 320, 30);

        jLabelThana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelThana);
        jLabelThana.setBounds(290, 630, 320, 30);

        jLabelPO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelPO);
        jLabelPO.setBounds(290, 580, 320, 30);

        jLabeRegno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabeRegno);
        jLabeRegno.setBounds(290, 530, 320, 30);

        jLabelSession.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelSession);
        jLabelSession.setBounds(290, 480, 320, 30);

        jLabelGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelGender);
        jLabelGender.setBounds(290, 430, 320, 30);

        jLabelClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelClass);
        jLabelClass.setBounds(290, 380, 320, 30);

        jLabelMname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelMname);
        jLabelMname.setBounds(290, 330, 320, 30);

        jLabelFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelFname);
        jLabelFname.setBounds(290, 280, 320, 30);

        jLabelSname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelSname);
        jLabelSname.setBounds(290, 230, 320, 30);

        jLabelStudentID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelStudentID);
        jLabelStudentID.setBounds(290, 180, 190, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Print Date");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(40, 20, 90, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1060, 900);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entry Registation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(840, 10, 210, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Suarch By Student ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 10, 180, 30);

        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 10, 210, 30);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(580, 10, 110, 30);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(700, 10, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 60);

        setSize(new java.awt.Dimension(1078, 1008));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // Search Info
        connection();
        String se=null;
        se="SELECT * FROM `registation_card` WHERE `Student_ID`=?";
    try {
        //`Serial_ID`,`Student_ID`,`Name`,`F_Name`,`M_Name`,`Class`,`Gender`,`Session`,`Reg_No`,`Post_Office`,`Thana`,`Distric`,`Institute`
        ps=jcon.prepareStatement(se);
        ps.setString(1,jTextField1.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        jLabelserial.setText(rs.getString("Serial_ID"));
        jLabelStudentID.setText(rs.getString("Student_ID"));
        jLabelSname.setText(rs.getString("Name"));
        jLabelFname.setText(rs.getString("F_Name"));
        jLabelMname.setText(rs.getString("M_Name"));
        jLabelClass.setText(rs.getString("Class"));
        jLabelGender.setText(rs.getString("Gender"));
        jLabelSession.setText(rs.getString("Session"));
        jLabeRegno.setText(rs.getString("Reg_No"));
        jLabelPO.setText(rs.getString("Post_Office"));
        jLabelThana.setText(rs.getString("Thana"));
        jLabelDis.setText(rs.getString("Distric"));
        jLabelInstitute.setText(rs.getString("Institute"));
        byte pic[]=rs.getBytes("Picture");
        ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel14.getWidth(),jLabel14.getHeight(),Image.SCALE_SMOOTH));
        jLabel14.setIcon(im);
        boolean b=ps.execute();
        if(b){
                JOptionPane.showMessageDialog(this," Data View Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data View Filed..");
                }
               }else{
               JOptionPane.showMessageDialog(this," Your Id Is Rong");
               jTextField1.setText("");
               jTextField1.requestFocus();  
        }
    } catch (SQLException ex) {
        Logger.getLogger(View_Registation_card.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Registration_Card rc=new Registration_Card();
        rc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Clear Button
       clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Panal Print 
        if(jLabelserial.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"View Record");
        jTextField1.requestFocus();
        }else if(jLabelSname.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"View Record");
        jTextField1.requestFocus();
        }else if(jLabelStudentID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"View Record");
        jTextField1.requestFocus();
        }else if(jLabelClass.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"View Record");
        jTextField1.requestFocus();
        }else if(jLabeRegno.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"View Record");
        jTextField1.requestFocus();
        }else{
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
           public int print(Graphics pg, PageFormat pf,int pageNum){
               if(pageNum>0){
               return Printable.NO_SUCH_PAGE;
               }
               Graphics2D g2 = (Graphics2D) pg;
               g2.translate(pf.getImageableX(),pf.getImageableY());
               g2.scale(0.24, 0.24);
               jPanel2.paint(g2);
               return Printable.PAGE_EXISTS;
           }
        });
        boolean b=job.printDialog();
        if(b){
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(View_Registation_card.class.getName()).log(Level.SEVERE, null, ex);
            } }}
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void PanalPrint(){
    PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
           public int print(Graphics pg, PageFormat pf,int pageNum){
               if(pageNum>0){
               return Printable.NO_SUCH_PAGE;
               }
               Graphics2D g2 = (Graphics2D) pg;
               g2.translate(pf.getImageableX(),pf.getImageableY());
               g2.scale(0.24, 0.24);
               jPanel2.paint(g2);
               return Printable.PAGE_EXISTS;
           }
        });
        boolean b=job.printDialog();
        if(b){
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(View_Registation_card.class.getName()).log(Level.SEVERE, null, ex);
            } }
    }
    
    public void clear(){
        jDateChooser1.setDate(null);
        jLabelserial.setText("");
        jLabelStudentID.setText("");
        jLabelSname.setText("");
        jLabelFname.setText("");
        jLabelMname.setText("");
        jLabelClass.setText("");
        jLabelGender.setText("");
        jLabelSession.setText("");
        jLabeRegno.setText("");
        jLabelPO.setText("");
        jLabelThana.setText("");
        jLabelDis.setText("");
        jLabelInstitute.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(View_Registation_card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Registation_card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Registation_card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Registation_card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Registation_card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabeRegno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClass;
    private javax.swing.JLabel jLabelDis;
    private javax.swing.JLabel jLabelFname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelInstitute;
    private javax.swing.JLabel jLabelMname;
    private javax.swing.JLabel jLabelPO;
    private javax.swing.JLabel jLabelSession;
    private javax.swing.JLabel jLabelSname;
    private javax.swing.JLabel jLabelStudentID;
    private javax.swing.JLabel jLabelThana;
    private javax.swing.JLabel jLabelserial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
