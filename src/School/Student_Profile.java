
package School;

import java.awt.Image;
import java.awt.Toolkit;
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


public class Student_Profile extends javax.swing.JFrame {
Connection jcon=null;
Statement st=null;
PreparedStatement ps=null;
ResultSet rs=null;

    public Student_Profile() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
        setResizable(false);
        search.setToolTipText("Search by Student Id");
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
        search = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelNation = new javax.swing.JLabel();
        jLabelGroup = new javax.swing.JLabel();
        jLabelReligion = new javax.swing.JLabel();
        jLabelContract = new javax.swing.JLabel();
        jLabelSession = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelSection = new javax.swing.JLabel();
        jLabelRoll = new javax.swing.JLabel();
        jLabelDOA = new javax.swing.JLabel();
        jLabelDOB = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelClass = new javax.swing.JLabel();
        jLabelPicture = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelFname = new javax.swing.JLabel();
        jLabelFmobile = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelMname = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelMmobile = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaM = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaS = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaF = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1090, 10, 130, 31);

        search.setBackground(new java.awt.Color(0, 0, 204));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(153, 153, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(790, 10, 130, 31);

        jTextField1.setBackground(new java.awt.Color(0, 102, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(630, 10, 170, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(950, 10, 130, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1250, 50);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Student ID");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 40, 140, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 100, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Contract No");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 160, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Email");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 220, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 280, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 360, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Session");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 450, 140, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Roll No");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(480, 50, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Class");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(480, 110, 170, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Group");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(480, 170, 170, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Section");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(480, 230, 170, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Nationality");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(480, 290, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Religion");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(480, 350, 170, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Date OF Birth");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(480, 400, 170, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Addmission Date");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(480, 460, 170, 30);

        jLabelNation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNation.setForeground(new java.awt.Color(0, 0, 255));
        jLabelNation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelNation);
        jLabelNation.setBounds(690, 290, 230, 30);

        jLabelGroup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGroup.setForeground(new java.awt.Color(0, 0, 255));
        jLabelGroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelGroup);
        jLabelGroup.setBounds(690, 170, 230, 30);

        jLabelReligion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelReligion.setForeground(new java.awt.Color(0, 0, 255));
        jLabelReligion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelReligion);
        jLabelReligion.setBounds(690, 350, 230, 30);

        jLabelContract.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelContract.setForeground(new java.awt.Color(0, 0, 255));
        jLabelContract.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelContract);
        jLabelContract.setBounds(180, 160, 230, 30);

        jLabelSession.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSession.setForeground(new java.awt.Color(0, 0, 255));
        jLabelSession.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelSession);
        jLabelSession.setBounds(180, 450, 230, 30);

        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(0, 0, 255));
        jLabelID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelID);
        jLabelID.setBounds(180, 40, 230, 30);

        jLabelGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(0, 0, 255));
        jLabelGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelGender);
        jLabelGender.setBounds(180, 280, 230, 30);

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 0, 255));
        jLabelName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelName);
        jLabelName.setBounds(180, 100, 230, 30);

        jLabelSection.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSection.setForeground(new java.awt.Color(0, 0, 255));
        jLabelSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelSection);
        jLabelSection.setBounds(690, 230, 230, 30);

        jLabelRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRoll.setForeground(new java.awt.Color(0, 0, 255));
        jLabelRoll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelRoll);
        jLabelRoll.setBounds(690, 50, 230, 30);

        jLabelDOA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDOA.setForeground(new java.awt.Color(0, 0, 255));
        jLabelDOA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelDOA);
        jLabelDOA.setBounds(690, 460, 230, 30);

        jLabelDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDOB.setForeground(new java.awt.Color(0, 0, 255));
        jLabelDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelDOB);
        jLabelDOB.setBounds(690, 400, 230, 30);

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 255));
        jLabelEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelEmail);
        jLabelEmail.setBounds(180, 220, 230, 30);

        jLabelClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClass.setForeground(new java.awt.Color(0, 0, 255));
        jLabelClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelClass);
        jLabelClass.setBounds(690, 110, 230, 30);

        jLabelPicture.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelPicture);
        jLabelPicture.setBounds(960, 50, 240, 220);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Address");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 670, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Mobile No");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 570, 140, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Father's Name");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 510, 140, 30);

        jLabelFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFname.setForeground(new java.awt.Color(0, 0, 255));
        jLabelFname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelFname);
        jLabelFname.setBounds(180, 510, 230, 30);

        jLabelFmobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFmobile.setForeground(new java.awt.Color(0, 0, 255));
        jLabelFmobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelFmobile);
        jLabelFmobile.setBounds(180, 570, 230, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Mother's Name");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(480, 520, 170, 30);

        jLabelMname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMname.setForeground(new java.awt.Color(0, 0, 255));
        jLabelMname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelMname);
        jLabelMname.setBounds(690, 520, 230, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Mobile No");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(480, 580, 170, 30);

        jLabelMmobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMmobile.setForeground(new java.awt.Color(0, 0, 255));
        jLabelMmobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabelMmobile);
        jLabelMmobile.setBounds(690, 580, 230, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Address");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(480, 680, 170, 30);

        jTextAreaM.setBackground(new java.awt.Color(153, 204, 255));
        jTextAreaM.setColumns(20);
        jTextAreaM.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextAreaM.setForeground(new java.awt.Color(0, 0, 255));
        jTextAreaM.setRows(5);
        jScrollPane1.setViewportView(jTextAreaM);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(690, 640, 230, 110);

        jTextAreaS.setBackground(new java.awt.Color(153, 204, 255));
        jTextAreaS.setColumns(20);
        jTextAreaS.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextAreaS.setForeground(new java.awt.Color(0, 0, 255));
        jTextAreaS.setRows(5);
        jScrollPane2.setViewportView(jTextAreaS);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(180, 330, 230, 110);

        jTextAreaF.setBackground(new java.awt.Color(153, 204, 255));
        jTextAreaF.setColumns(20);
        jTextAreaF.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextAreaF.setForeground(new java.awt.Color(0, 0, 255));
        jTextAreaF.setRows(5);
        jScrollPane3.setViewportView(jTextAreaF);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(180, 630, 230, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 1250, 780);

        setSize(new java.awt.Dimension(1256, 863));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // Search Button
        connection();
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, " Search Id Is Empty Please Set Student Id");
            jTextField1.requestFocus();
        }else{
        String se=null;
  //`Id``Name``ContractNo``Email``Gender``Address``Session``Roll_NO``Class``Group``Section``Nationality`
  //`Religion``BirthDate``AddmissionDate``Picture``FatherName``Father_MobileNo``Father_Address``Mother_Name``Mother_MobileNo``Mother_Address`
        se="SELECT * FROM `student_admission` WHERE `Id` = ?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,jTextField1.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                jLabelID.setText(rs.getString("Id"));
                jLabelName.setText(rs.getString("Name"));
                jLabelContract.setText(rs.getString("ContractNo"));
                jLabelEmail.setText(rs.getString("Email"));
                jLabelGender.setText(rs.getString("Gender"));
                jTextAreaS.setText(rs.getString("Address"));
                jLabelSession.setText(rs.getString("Session"));
                jLabelRoll.setText(rs.getString("Roll_NO"));
                jLabelClass.setText(rs.getString("Class"));
                jLabelGroup.setText(rs.getString("Group"));
                jLabelSection.setText(rs.getString("Section"));
                jLabelNation.setText(rs.getString("Nationality"));
                jLabelReligion.setText(rs.getString("Religion"));
                jLabelDOB.setText(rs.getString("BirthDate"));
                jLabelDOA.setText(rs.getString("AddmissionDate"));
                byte pic[]=rs.getBytes("Picture");
                ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabelPicture.getWidth(),jLabelPicture.getHeight(),Image.SCALE_SMOOTH));
                jLabelPicture.setIcon(im);
                jLabelFname.setText(rs.getString("FatherName"));
                jLabelFmobile.setText(rs.getString("Father_MobileNo"));
                jTextAreaF.setText(rs.getString("Father_Address"));
                jLabelMname.setText(rs.getString("Mother_Name"));
                jLabelMmobile.setText(rs.getString("Mother_MobileNo"));
                jTextAreaM.setText(rs.getString("Mother_Address"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student_Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                jLabelID.setText("");
                jLabelName.setText("");
                jLabelContract.setText("");
                jLabelEmail.setText("");
                jLabelGender.setText("");
                jTextAreaS.setText("");
                jLabelSession.setText("");
                jLabelRoll.setText("");
                jLabelClass.setText("");
                jLabelGroup.setText("");
                jLabelSection.setText("");
                jLabelNation.setText("");
                jLabelReligion.setText("");
                jLabelDOB.setText("");
                jLabelDOA.setText("");
                jLabelPicture.setIcon(null);
                jLabelFname.setText("");
                jLabelFmobile.setText("");
                jTextAreaF.setText("");
                jLabelMname.setText("");
                jLabelMmobile.setText("");
                jTextAreaM.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClass;
    private javax.swing.JLabel jLabelContract;
    private javax.swing.JLabel jLabelDOA;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFmobile;
    private javax.swing.JLabel jLabelFname;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelGroup;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMmobile;
    private javax.swing.JLabel jLabelMname;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNation;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelReligion;
    private javax.swing.JLabel jLabelRoll;
    private javax.swing.JLabel jLabelSection;
    private javax.swing.JLabel jLabelSession;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaF;
    private javax.swing.JTextArea jTextAreaM;
    private javax.swing.JTextArea jTextAreaS;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
