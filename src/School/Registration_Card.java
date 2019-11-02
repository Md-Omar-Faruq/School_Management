
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Registration_Card extends javax.swing.JFrame {
    Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    byte picture[]=null;
    public Registration_Card() {
        initComponents();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11P = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1SerialID = new javax.swing.JTextField();
        jTextField1SetudenID = new javax.swing.JTextField();
        jTextField1RegistationNo = new javax.swing.JTextField();
        jTextField1InstituteName = new javax.swing.JTextField();
        jTextField1Distric = new javax.swing.JTextField();
        jTextField1Thana = new javax.swing.JTextField();
        jTextField1PostOffice = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelSName = new javax.swing.JLabel();
        jLabelFname = new javax.swing.JLabel();
        jLabelMname = new javax.swing.JLabel();
        jLabelClass = new javax.swing.JLabel();
        jLabelSession = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jTextField1Search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Student Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 230, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registation Card");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(350, 50, 490, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Class");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 380, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Father's Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 280, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Post Office");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 580, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Registation No");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 530, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("District");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 680, 190, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Thana");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 630, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Gender");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 430, 190, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Session");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(50, 480, 190, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Mother's Name");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(50, 330, 190, 30);

        jLabel11P.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.add(jLabel11P);
        jLabel11P.setBounds(790, 120, 230, 220);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Bangladesh Technical Education Bord");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(350, 0, 490, 40);

        jTextField1SerialID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1SerialID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1SerialIDActionPerformed(evt);
            }
        });
        jTextField1SerialID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SerialIDKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1SerialID);
        jTextField1SerialID.setBounds(180, 60, 160, 30);

        jTextField1SetudenID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1SetudenID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1SetudenIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SetudenIDKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1SetudenID);
        jTextField1SetudenID.setBounds(260, 180, 170, 30);

        jTextField1RegistationNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1RegistationNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1RegistationNoKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1RegistationNo);
        jTextField1RegistationNo.setBounds(260, 530, 340, 30);

        jTextField1InstituteName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField1InstituteName);
        jTextField1InstituteName.setBounds(260, 730, 490, 30);

        jTextField1Distric.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField1Distric);
        jTextField1Distric.setBounds(260, 680, 340, 30);

        jTextField1Thana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField1Thana);
        jTextField1Thana.setBounds(260, 630, 340, 30);

        jTextField1PostOffice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField1PostOffice);
        jTextField1PostOffice.setBounds(260, 580, 340, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Institute Name & Code");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(50, 730, 190, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Student ID");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(50, 180, 190, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Serial No.");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 60, 90, 30);

        jLabelSName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.add(jLabelSName);
        jLabelSName.setBounds(260, 230, 340, 30);

        jLabelFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.add(jLabelFname);
        jLabelFname.setBounds(260, 280, 340, 30);

        jLabelMname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.add(jLabelMname);
        jLabelMname.setBounds(260, 330, 340, 30);

        jLabelClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.add(jLabelClass);
        jLabelClass.setBounds(260, 380, 340, 30);

        jLabelSession.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSession.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.add(jLabelSession);
        jLabelSession.setBounds(260, 480, 340, 30);

        jLabelGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.add(jLabelGender);
        jLabelGender.setBounds(260, 430, 340, 30);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(770, 850, 90, 30);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(220, 850, 90, 30);

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(330, 850, 90, 30);

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(440, 850, 90, 30);

        ViewButton.setBackground(new java.awt.Color(153, 153, 255));
        ViewButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewButton.setForeground(new java.awt.Color(0, 0, 204));
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ViewButton);
        ViewButton.setBounds(550, 850, 90, 30);

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(660, 850, 90, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Search By Student  ID");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(0, 10, 180, 30);

        jTextField1Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1SearchActionPerformed(evt);
            }
        });
        jTextField1Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SearchKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1Search);
        jTextField1Search.setBounds(180, 10, 160, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1120, 940);

        setSize(new java.awt.Dimension(1138, 984));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1SerialIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1SerialIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SerialIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Updater Button
        if(jTextField1Search.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First you view Record");
        ViewButton.requestFocus();
        }else{
        connection();
        String up=null;
        up="UPDATE `registation_card` SET `Reg_No`=?,`Post_Office`=?,`Thana`=?,`Distric`=?,`Institute`=? WHERE `Student_ID` ="+jTextField1SetudenID.getText();
            try {
                ps=jcon.prepareStatement(up);
                ps.setString(1,jTextField1RegistationNo.getText());
                ps.setString(2,jTextField1PostOffice.getText());
                ps.setString(3,jTextField1Thana.getText());
                ps.setString(4,jTextField1Distric.getText());
                ps.setString(5,jTextField1InstituteName.getText());
                int b=ps.executeUpdate();
                if(b==1){
                JOptionPane.showMessageDialog(this,"Update Successfull...");
                }else{
                JOptionPane.showMessageDialog(this,"Update Filed...");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registration_Card.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Exit Button
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
     void imgUp(byte pic[] ){
    picture=pic;
    }
    private void jTextField1SetudenIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SetudenIDKeyReleased
        //Select Information
        connection();
        String se=null;
        se="SELECT `Id`,`Name`,`Father_Address`,`Mother_Name`,`Class`,`Gender`,`Session`,`Picture` FROM `student_admission` WHERE `Id` =?";
        try {
            ps=jcon.prepareStatement(se);
            ps.setString(1, jTextField1SetudenID.getText());
            rs=ps.executeQuery();
            if(rs.next()){
            jLabelSName.setText(rs.getString("Name"));
            jLabelFname.setText(rs.getString("Father_Address"));
            jLabelMname.setText(rs.getString("Mother_Name"));
            jLabelClass.setText(rs.getString("Class"));
            jLabelGender.setText(rs.getString("Gender"));
            jLabelSession.setText(rs.getString("Session"));
            byte pic[]=rs.getBytes("Picture");
            imgUp( pic );
            ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel11P.getWidth(),jLabel11P.getHeight(),java.awt.Image.SCALE_SMOOTH));
            jLabel11P.setIcon(im);
            boolean b=ps.execute();
            if(b){
                JOptionPane.showMessageDialog(this," Data View Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data View Filed..");
                }
               }else{
               JOptionPane.showMessageDialog(this," Your Id Is Rong");
               jTextField1SetudenID.setText("");
               jTextField1SetudenID.requestFocus();
               }
        } catch (SQLException ex) {
            Logger.getLogger(Registration_Card.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTextField1SetudenIDKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTextField1SerialID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Serial Id Is Empty");
        jTextField1SerialID.requestFocus();
        }else if(jTextField1RegistationNo.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Registation No Is Empty");
        jTextField1RegistationNo.requestFocus();
        }else if(jTextField1PostOffice.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Set your Post Office");
        jTextField1PostOffice.requestFocus();
        }else if(jTextField1Thana.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Set your Thana");
        jTextField1Thana.requestFocus();
        }else if(jTextField1Distric.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Set your Distric");
        jTextField1Distric.requestFocus();
        }else if(jTextField1InstituteName.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Set your Institute Name & Code");
        jTextField1InstituteName.requestFocus();
        }else{
        connection();
        String se=null;
        se="SELECT `Serial_ID`,`Student_ID` FROM `registation_card` WHERE `Serial_ID` = ? || `Student_ID` = ?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,jTextField1SerialID.getText());
                ps.setString(2, jTextField1SetudenID.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                JOptionPane.showMessageDialog(this," This Serial Id And Student Id Is Aleardly Insert Please Change Your Information ");
                jTextField1SerialID.setText("");
                jTextField1SetudenID.setText("");
                jTextField1SerialID.requestFocus();
                }else{
                String in=null;
        in="INSERT INTO `registation_card` (`Serial_ID`,`Student_ID`,`Name`,`F_Name`,`M_Name`,`Class`,`Gender`,`Session`,`Reg_No`,`Post_Office`,`Thana`,`Distric`,`Institute`,`Picture`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps=jcon.prepareStatement(in);
                ps.setString(1, jTextField1SerialID.getText());
                ps.setString(2, jTextField1SetudenID.getText());
                ps.setString(3, jLabelSName.getText());
                ps.setString(4, jLabelFname.getText());
                ps.setString(5, jLabelMname.getText());
                ps.setString(6, jLabelClass.getText());
                ps.setString(7, jLabelGender.getText());
                ps.setString(8, jLabelSession.getText());
                ps.setString(9, jTextField1RegistationNo.getText());
                ps.setString(10, jTextField1PostOffice.getText());
                ps.setString(11, jTextField1Thana.getText());
                ps.setString(12, jTextField1Distric.getText());
                ps.setString(13, jTextField1InstituteName.getText());
                ps.setBytes(14, picture);
                boolean b=ps.execute();
                  if(!b){
                     JOptionPane.showMessageDialog(this,"Data Insert Success...");
                  }else{
                     JOptionPane.showMessageDialog(this,"Data Insert Filed...");
                  }
            } catch (SQLException ex) {
                Logger.getLogger(Registration_Card.class.getName()).log(Level.SEVERE, null, ex);
            }
        
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registration_Card.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // View Button
        if(jTextField1Search.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Search Id Is Empty");
        jTextField1Search.requestFocus();
        }else{
        connection();
        String se=null;
        se="SELECT * FROM `registation_card` WHERE `Student_ID`=?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,jTextField1Search.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                jTextField1SerialID.setText(rs.getString("Serial_ID"));
                jTextField1SetudenID.setText(rs.getString("Student_ID"));
                jLabelSName.setText(rs.getString("Name"));
                jLabelFname.setText(rs.getString("F_Name"));
                jLabelMname.setText(rs.getString("M_Name"));
                jLabelClass.setText(rs.getString("Class"));
                jLabelGender.setText(rs.getString("Gender"));
                jLabelSession.setText(rs.getString("Session"));
                jTextField1RegistationNo.setText(rs.getString("Reg_No"));
                jTextField1PostOffice.setText(rs.getString("Post_Office"));
                jTextField1Thana.setText(rs.getString("Thana"));
                jTextField1Distric.setText(rs.getString("Distric"));
                jTextField1InstituteName.setText(rs.getString("Institute"));
                byte pic[]=rs.getBytes("Picture");
                ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel11P.getWidth(),jLabel11P.getHeight(),java.awt.Image.SCALE_SMOOTH));
                jLabel11P.setIcon(im);
                boolean b=ps.execute();
                if(b){
                //JOptionPane.showMessageDialog(this," Date View Successfully..");
                }else{
                JOptionPane.showMessageDialog(this," Date View Filed..");
                }
                }else{
                JOptionPane.showMessageDialog(this," Your Id Is Rong");
                jTextField1Search.setText("");
                jTextField1Search.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registration_Card.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void jTextField1SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Delete Button
         if(jTextField1Search.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Ar First You View Record");
        ViewButton.requestFocus();
        }else{
        int d=JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Record");
        if(d==0){
            connection();
            String de=null;
            de="DELETE FROM `registation_card` WHERE `Student_ID`="+jTextField1SetudenID.getText();
            try {
                ps=jcon.prepareStatement(de);
                int b=ps.executeUpdate();
                if(b==1){
                clear();
                JOptionPane.showMessageDialog(this," Data Delete Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data Delete Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registration_Card.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //  Clear Button 
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SearchKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SearchKeyTyped

    private void jTextField1SerialIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SerialIDKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SerialIDKeyTyped

    private void jTextField1SetudenIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SetudenIDKeyTyped
     // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SetudenIDKeyTyped

    private void jTextField1RegistationNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1RegistationNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1RegistationNoKeyTyped
    
    public void clear(){
    jTextField1Search.setText("");
    jTextField1SerialID.setText("");
    jTextField1SetudenID.setText("");
    jLabelSName.setText("");
    jLabelFname.setText("");
    jLabelMname.setText("");
    jLabelClass.setText("");
    jLabelGender.setText("");
    jLabelSession.setText("");
    jTextField1RegistationNo.setText("");
    jTextField1PostOffice.setText("");
    jTextField1Thana.setText("");
    jTextField1Distric.setText("");
    jTextField1InstituteName.setText("");
    jLabel11P.setIcon(null);
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
            java.util.logging.Logger.getLogger(Registration_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_Card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel11P;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClass;
    private javax.swing.JLabel jLabelFname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelMname;
    private javax.swing.JLabel jLabelSName;
    private javax.swing.JLabel jLabelSession;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1Distric;
    private javax.swing.JTextField jTextField1InstituteName;
    private javax.swing.JTextField jTextField1PostOffice;
    private javax.swing.JTextField jTextField1RegistationNo;
    private javax.swing.JTextField jTextField1Search;
    private javax.swing.JTextField jTextField1SerialID;
    private javax.swing.JTextField jTextField1SetudenID;
    private javax.swing.JTextField jTextField1Thana;
    // End of variables declaration//GEN-END:variables
}
