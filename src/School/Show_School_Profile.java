
package School;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Show_School_Profile extends javax.swing.JFrame {
Connection jcon=null;
    PreparedStatement ps=null;
    Statement st=null;
    ResultSet rs=null;
    

    public Show_School_Profile() {
       initComponents();
        setTitle("Show School Profile");
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add();
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
public void add(){
  connection();
 String selected;
 
    try {
        selected = " SELECT *FROM `schoolprofile` WHERE `SL`=?";
        ps=jcon.prepareStatement(selected);
        ps.setString(1,jTextField1.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        jLabel11SL.setText(rs.getString("SL"));
        jLabel14Name.setText(rs.getString("SchoolName"));
        jLabel11SSname.setText(rs.getString("SchoolName"));
        jLabel15piccode.setText(rs.getString("PinCode"));
        jLabel16Estd.setText(rs.getString("Estd"));
        jLabel17Email.setText(rs.getString("Email"));
        jLabel18MobileNo.setText(rs.getString("MobileNo"));
        jLabel19PhoneNo.setText(rs.getString("PhoneNo"));
        jTextArea1.setText(rs.getString("Address"));
        jLabel21Divition.setText(rs.getString("Division"));
        jLabel22Dristic.setText(rs.getString("Distric"));
        jLabel11Web.setText(rs.getString("Web"));
        byte pic[]=rs.getBytes("Image");
        ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel10pic.getWidth(),jLabel10pic.getHeight(),Image.SCALE_SMOOTH));
        jLabel10pic.setIcon(im);
        jLabel11SL.setText(rs.getString("SL"));
        }
        //JOptionPane.showMessageDialog(this,"Data Show Success...");
    } catch (SQLException ex) {
        Logger.getLogger(Show_School_Profile.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}
public void connection(){
        
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
       //st=jcon.createStatement();
       // jcon.close();
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        Print = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11Web = new javax.swing.JLabel();
        jLabel10pic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14Name = new javax.swing.JLabel();
        jLabel15piccode = new javax.swing.JLabel();
        jLabel16Estd = new javax.swing.JLabel();
        jLabel17Email = new javax.swing.JLabel();
        jLabel18MobileNo = new javax.swing.JLabel();
        jLabel19PhoneNo = new javax.swing.JLabel();
        jLabel21Divition = new javax.swing.JLabel();
        jLabel22Dristic = new javax.swing.JLabel();
        jLabel11SL = new javax.swing.JLabel();
        jLabel11SSname = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(102, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(51, 102, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 160, 30));

        Print.setBackground(new java.awt.Color(204, 0, 204));
        Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 100, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Search by Serial Id");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 200, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 1, 890, 60);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("School Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 140, 130, 30);

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Pin Code");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 200, 130, 28);

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Email");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 320, 130, 28);

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Mobile No");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 380, 130, 28);

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Phone No");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 440, 130, 28);

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Address");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 510, 130, 30);

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Division");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 620, 130, 30);

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Web");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 740, 130, 30);

        jLabel13.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("Dristic");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(60, 680, 130, 30);

        jLabel11Web.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11Web.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11Web.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel11Web);
        jLabel11Web.setBounds(210, 740, 380, 30);

        jLabel10pic.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10pic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel10pic);
        jLabel10pic.setBounds(610, 70, 250, 220);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setText("ESTD");
        jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(60, 260, 130, 30);

        jLabel14Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14Name.setForeground(new java.awt.Color(204, 204, 255));
        jLabel14Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel14Name);
        jLabel14Name.setBounds(210, 140, 380, 30);

        jLabel15piccode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15piccode.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15piccode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel15piccode);
        jLabel15piccode.setBounds(210, 200, 380, 30);

        jLabel16Estd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16Estd.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16Estd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel16Estd);
        jLabel16Estd.setBounds(210, 260, 380, 30);

        jLabel17Email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17Email.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel17Email);
        jLabel17Email.setBounds(210, 320, 380, 30);

        jLabel18MobileNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18MobileNo.setForeground(new java.awt.Color(204, 204, 255));
        jLabel18MobileNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel18MobileNo);
        jLabel18MobileNo.setBounds(210, 380, 380, 30);

        jLabel19PhoneNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19PhoneNo.setForeground(new java.awt.Color(204, 204, 255));
        jLabel19PhoneNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel19PhoneNo);
        jLabel19PhoneNo.setBounds(210, 440, 380, 30);

        jLabel21Divition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21Divition.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21Divition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel21Divition);
        jLabel21Divition.setBounds(210, 620, 380, 30);

        jLabel22Dristic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22Dristic.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22Dristic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel22Dristic);
        jLabel22Dristic.setBounds(210, 680, 380, 30);

        jLabel11SL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11SL.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11SL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel11SL);
        jLabel11SL.setBounds(210, 80, 140, 30);

        jLabel11SSname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11SSname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel11SSname);
        jLabel11SSname.setBounds(210, 20, 430, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setText("SL ID");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(60, 80, 130, 30);

        jTextArea1.setBackground(new java.awt.Color(0, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(210, 486, 380, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 890, 810);

        setSize(new java.awt.Dimension(900, 909));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        
        if(jLabel14Name.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"View Record");
        jTextField1.requestFocus();
        }else if(jLabel17Email.getText().isEmpty()){
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
    }//GEN-LAST:event_PrintActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       add();
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(Show_School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_School_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JLabel jLabel10pic;
    private javax.swing.JLabel jLabel11SL;
    private javax.swing.JLabel jLabel11SSname;
    private javax.swing.JLabel jLabel11Web;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel14Name;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel15piccode;
    private javax.swing.JLabel jLabel16Estd;
    private javax.swing.JLabel jLabel17Email;
    private javax.swing.JLabel jLabel18MobileNo;
    private javax.swing.JLabel jLabel19PhoneNo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21Divition;
    private javax.swing.JLabel jLabel22Dristic;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
