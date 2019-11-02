
package School;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.eclipse.persistence.logging.SessionLog;

public class AdmitCard extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    byte[] Img=null;
    String filename=null;
    public AdmitCard() {
        initComponents();
        setResizable(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    LastID();
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
        jLabel1LID = new javax.swing.JLabel();
        jLabel3year = new javax.swing.JLabel();
        jTextField2Wex = new javax.swing.JTextField();
        jLabel4fdg = new javax.swing.JLabel();
        jLabelpicture = new javax.swing.JLabel();
        jLabel6ggg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabelf = new javax.swing.JLabel();
        jLabelmm = new javax.swing.JLabel();
        jTextField2Serialid = new javax.swing.JTextField();
        jTextField4Sname = new javax.swing.JTextField();
        jTextField5Fname = new javax.swing.JTextField();
        jTextField6Class = new javax.swing.JTextField();
        jLabel11rr = new javax.swing.JLabel();
        jTextField7Rollno = new javax.swing.JTextField();
        jLabel12ttt = new javax.swing.JLabel();
        jTextField8session = new javax.swing.JTextField();
        jLabel13rrr = new javax.swing.JLabel();
        jTextField9Bdate = new javax.swing.JTextField();
        jLabel14bb = new javax.swing.JLabel();
        jLabelcc = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1st = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jLabel30stid = new javax.swing.JLabel();
        jTextField1Sid = new javax.swing.JTextField();
        jTextField6Mname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1Stypr = new javax.swing.JComboBox();
        uploadPic = new javax.swing.JButton();
        jLabelcc1 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel1slno1 = new javax.swing.JLabel();
        jLabel1slno2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1LID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel1LID);
        jLabel1LID.setBounds(470, 20, 130, 30);

        jLabel3year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3year.setText("Year");
        jPanel1.add(jLabel3year);
        jLabel3year.setBounds(640, 20, 100, 30);

        jTextField2Wex.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField2Wex.setForeground(new java.awt.Color(255, 0, 0));
        jTextField2Wex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2Wex.setText("Write Exam Type");
        jTextField2Wex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2WexMouseClicked(evt);
            }
        });
        jTextField2Wex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2WexActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2Wex);
        jTextField2Wex.setBounds(350, 120, 590, 30);

        jLabel4fdg.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4fdg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4fdg.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4fdg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4fdg.setText("Admit Card");
        jPanel1.add(jLabel4fdg);
        jLabel4fdg.setBounds(540, 150, 190, 50);

        jLabelpicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabelpicture);
        jLabelpicture.setBounds(1140, 40, 180, 150);

        jLabel6ggg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6ggg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6ggg.setText("Bangladesh  Education Bord Dhaka");
        jPanel1.add(jLabel6ggg);
        jLabel6ggg.setBounds(330, 60, 660, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(690, 700, 180, 30);

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 0, 204));
        jLabel.setText("Neme of Examinee");
        jPanel1.add(jLabel);
        jLabel.setBounds(160, 310, 170, 40);

        jLabelf.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelf.setForeground(new java.awt.Color(0, 0, 204));
        jLabelf.setText("Father's Name");
        jPanel1.add(jLabelf);
        jLabelf.setBounds(160, 370, 170, 40);

        jLabelmm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelmm.setForeground(new java.awt.Color(0, 0, 204));
        jLabelmm.setText("Mother's Name");
        jPanel1.add(jLabelmm);
        jLabelmm.setBounds(160, 430, 170, 40);

        jTextField2Serialid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField2Serialid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2SerialidKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2Serialid);
        jTextField2Serialid.setBounds(140, 20, 150, 30);

        jTextField4Sname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTextField4Sname);
        jTextField4Sname.setBounds(370, 310, 200, 40);

        jTextField5Fname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTextField5Fname);
        jTextField5Fname.setBounds(370, 370, 200, 40);

        jTextField6Class.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTextField6Class);
        jTextField6Class.setBounds(370, 490, 200, 40);

        jLabel11rr.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11rr.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11rr.setText("Roll No");
        jPanel1.add(jLabel11rr);
        jLabel11rr.setBounds(750, 300, 170, 40);

        jTextField7Rollno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTextField7Rollno);
        jTextField7Rollno.setBounds(960, 300, 200, 40);

        jLabel12ttt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12ttt.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12ttt.setText("Type Of Examinee");
        jPanel1.add(jLabel12ttt);
        jLabel12ttt.setBounds(750, 480, 170, 40);

        jTextField8session.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTextField8session);
        jTextField8session.setBounds(960, 360, 200, 40);

        jLabel13rrr.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13rrr.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13rrr.setText("Session");
        jPanel1.add(jLabel13rrr);
        jLabel13rrr.setBounds(750, 360, 170, 40);

        jTextField9Bdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTextField9Bdate);
        jTextField9Bdate.setBounds(960, 420, 200, 40);

        jLabel14bb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14bb.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14bb.setText("Date Of Birth");
        jPanel1.add(jLabel14bb);
        jLabel14bb.setBounds(750, 420, 170, 40);

        jLabelcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelcc.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcc.setText("Write Your  Exam Type");
        jPanel1.add(jLabelcc);
        jLabelcc.setBounds(350, 100, 270, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Subject Name");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(120, 580, 180, 30);

        jLabel1st.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1st.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1st.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1st);
        jLabel1st.setBounds(120, 620, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 660, 180, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(690, 660, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 700, 180, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(120, 740, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 620, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 660, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 660, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 700, 180, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(310, 740, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 620, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(690, 620, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 700, 180, 30);

        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseMoved(evt);
            }
        });
        jComboBoxSClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseClicked(evt);
            }
        });
        jComboBoxSClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSClassActionPerformed(evt);
            }
        });
        jComboBoxSClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxSClassKeyReleased(evt);
            }
        });
        jPanel1.add(jComboBoxSClass);
        jComboBoxSClass.setBounds(370, 580, 200, 30);

        jLabel30stid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30stid.setText("Student ID");
        jPanel1.add(jLabel30stid);
        jLabel30stid.setBounds(20, 120, 110, 30);

        jTextField1Sid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1Sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1SidActionPerformed(evt);
            }
        });
        jTextField1Sid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1SidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SidKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1Sid);
        jTextField1Sid.setBounds(140, 120, 150, 30);

        jTextField6Mname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(jTextField6Mname);
        jTextField6Mname.setBounds(370, 430, 200, 40);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1230, 670, 110, 29);

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
        jButton2.setBounds(950, 670, 110, 29);

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1090, 670, 110, 29);

        jComboBox1Stypr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1Stypr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Regular", "Un Regular" }));
        jPanel1.add(jComboBox1Stypr);
        jComboBox1Stypr.setBounds(960, 486, 200, 30);

        uploadPic.setBackground(new java.awt.Color(255, 0, 0));
        uploadPic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uploadPic.setForeground(new java.awt.Color(255, 255, 255));
        uploadPic.setText("Upload Image");
        uploadPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPicActionPerformed(evt);
            }
        });
        jPanel1.add(uploadPic);
        uploadPic.setBounds(1140, 210, 180, 31);

        jLabelcc1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelcc1.setForeground(new java.awt.Color(0, 0, 204));
        jLabelcc1.setText("Class");
        jPanel1.add(jLabelcc1);
        jLabelcc1.setBounds(160, 490, 170, 40);

        jYearChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jYearChooser1.setHorizontalAlignment(10);
        jPanel1.add(jYearChooser1);
        jYearChooser1.setBounds(760, 20, 130, 30);

        jLabel1slno1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1slno1.setText("Serial No");
        jPanel1.add(jLabel1slno1);
        jLabel1slno1.setBounds(20, 20, 100, 30);

        jLabel1slno2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1slno2.setText("Last Entered ID");
        jPanel1.add(jLabel1slno2);
        jLabel1slno2.setBounds(300, 20, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1390, 820);

        setSize(new java.awt.Dimension(1402, 856));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void LastID(){
        connection();
        String l=null;
        l="SELECT `Serial_ID` FROM `admit_card`";
    try {
        ps=jcon.prepareStatement(l);
        rs=ps.executeQuery();
        rs.last();
        jLabel1LID.setText(rs.getString("Serial_ID"));
        
    } catch (SQLException ex) {
        Logger.getLogger(AdmitCard.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
    private void jTextField2WexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2WexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2WexActionPerformed

    private void jTextField2WexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2WexMouseClicked
        // TODO add your handling code here:
        jTextField2Wex.setText("");
    }//GEN-LAST:event_jTextField2WexMouseClicked

    private void jComboBoxSClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseClicked

    }//GEN-LAST:event_jComboBoxSClassMouseClicked

    private void jComboBoxSClassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassMouseMoved

    private void jComboBoxSClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSClassActionPerformed
        // TODO add your handling code here:
        connection();
        String se=null;
        se="SELECT `Subject_1`,`Subject_2`,`Subject_3`,`Subject_4`,`Subject_5`,`Subject_6`,`Subject_7`,`Subject_8`,`Subject_9`,`Subject_10`,`Subject_11`,`Subject_12`,`Subject_13`,`Subject_14` FROM `subject` WHERE `Class`=?";
        try {
            ps=jcon.prepareStatement(se);
            ps.setString(1, jComboBoxSClass.getSelectedItem().toString());
            rs=ps.executeQuery();
            if(rs.next()){
                jLabel1st.setText(rs.getString("Subject_1"));
                jLabel2.setText(rs.getString("Subject_2"));
                jLabel3.setText(rs.getString("Subject_3"));
                jLabel4.setText(rs.getString("Subject_4"));
                jLabel5.setText(rs.getString("Subject_5"));
                jLabel6.setText(rs.getString("Subject_6"));
                jLabel7.setText(rs.getString("Subject_7"));
                jLabel8.setText(rs.getString("Subject_8"));
                jLabel9.setText(rs.getString("Subject_9"));
                jLabel10.setText(rs.getString("Subject_10"));
                jLabel11.setText(rs.getString("Subject_11"));
                jLabel12.setText(rs.getString("Subject_12"));
                jLabel13.setText(rs.getString("Subject_13"));
                jLabel14.setText(rs.getString("Subject_14"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxSClassActionPerformed

    private void jComboBoxSClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSClassKeyReleased

    }//GEN-LAST:event_jComboBoxSClassKeyReleased

    private void jTextField1SidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SidKeyReleased
        // TODO add your handling code here:
        connection();
        String se=null;
        se="SELECT `Name`,`FatherName`,`Mother_Name`,`Roll_NO`,`Class`,`Session`,`BirthDate` FROM `student_admission` WHERE `Id` = ?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jTextField1Sid.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        jTextField4Sname.setText(rs.getString("Name"));
        jTextField5Fname.setText(rs.getString("FatherName"));
        jTextField6Mname.setText(rs.getString("Mother_Name"));
        jTextField6Class.setText(rs.getString("Class"));
        jTextField7Rollno.setText(rs.getString("Roll_NO"));
        jTextField8session.setText(rs.getString("Session"));
        jTextField9Bdate.setText(rs.getString("BirthDate"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdmitCard.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jTextField1SidKeyReleased

    private void jTextField1SidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1SidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Save Button
        String st=jComboBox1Stypr.getSelectedItem().toString();
        String sc=jComboBoxSClass.getSelectedItem().toString();
        if(jTextField2Serialid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," Serial Id Is Empty");
            jTextField2Serialid.requestFocus();
        }else if(jYearChooser1.getYear()==0){
        JOptionPane.showMessageDialog(this," Year Is Empty");
            jYearChooser1.requestFocus();
        }else if(jTextField2Wex.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Write Exam Type");
            jTextField2Wex.requestFocus();
        }else if(jTextField1Sid.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Student Id Is Empty You Enter Student Id Then Automatic Set Student Information");
            jTextField1Sid.requestFocus();
        }else if(jTextField4Sname.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," You Set Student Id");
            jTextField1Sid.requestFocus();
        }else if(jTextField5Fname.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," You Set Student Id");
            jTextField1Sid.requestFocus();
        }else if(jTextField6Mname.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," You Set Student Id");
            jTextField1Sid.requestFocus();
        }else if(jTextField7Rollno.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," You Set Student Id");
            jTextField1Sid.requestFocus();
        }else if(jTextField8session.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," You Set Student Id");
            jTextField1Sid.requestFocus();
        }else if(jTextField9Bdate.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," You Set Student Id");
            jTextField1Sid.requestFocus();
        }else if(jComboBox1Stypr.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Select Student Type");
            jComboBox1Stypr.requestFocus();
        }else if(jComboBoxSClass.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Select Student Class When You Select Class Then Automatic Set Subject");
            jComboBoxSClass.requestFocus();
        }else if(jLabelpicture==null){
        JOptionPane.showMessageDialog(this," Upload Picture");
            uploadPic.requestFocus();
        }else{
            connection();
            String serinl=null;
            serinl="SELECT `Serial_ID`,`SID` FROM `admit_card` WHERE `Serial_ID` = ? || `SID` = ?";
            try {
                ps=jcon.prepareStatement(serinl);
                ps.setString(1,jTextField1Sid.getText());
                ps.setString(2, jTextField1Sid.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                JOptionPane.showMessageDialog(this, " This Serial No And Student ID is Aleardly Insert Please Change Your Serial No And Studetn ID");
                jTextField1Sid.requestFocus();
                }else{
                String se=null;
            se="INSERT INTO `admit_card`(`Serial_ID`,`Year`,`Exam_Type`,`SID`,`Student_name`,`Father_name`,`Mother_name`,`Class`,`Roll`,`Session`,`BD`,`S_Type`,Picture) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,jTextField2Serialid.getText());
                ps.setInt(2,jYearChooser1.getYear());
                ps.setString(3,jTextField2Wex.getText());
                ps.setString(4,jTextField1Sid.getText());
                ps.setString(5,jTextField4Sname.getText());
                ps.setString(6,jTextField5Fname.getText());
                ps.setString(7,jTextField6Mname.getText());
                ps.setString(8,jTextField6Class.getText());
                ps.setString(9,jTextField7Rollno.getText());
                ps.setString(10,jTextField8session.getText());
                ps.setString(11,jTextField9Bdate.getText());
                ps.setString(12,jComboBox1Stypr.getSelectedItem().toString());
                ps.setBytes(13,Img);
                boolean b=ps.execute();
                if(!b){
                JOptionPane.showMessageDialog(this," Data Insert Successfully..");
                }else{
                 JOptionPane.showMessageDialog(this," Data Insert Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdmitCard.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdmitCard.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void uploadPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPicActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon( new ImageIcon(filename).getImage().getScaledInstance(jLabelpicture.getWidth(),jLabelpicture.getHeight(),java.awt.Image.SCALE_SMOOTH));
        jLabelpicture.setIcon(icon);
        try{
        File image = new File(filename);
        FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            byte[] by = new byte[80048];
            for(int readNum;(readNum=fis.read(by))!=-1;){
            bao.write(by, 0, readNum);
            }
            Img=bao.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_uploadPicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2SerialidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2SerialidKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2SerialidKeyTyped

    private void jTextField1SidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SidKeyTyped
 // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SidKeyTyped
    
    public void clear(){
    jTextField2Serialid.setText("");
    jTextField1Sid.setText("");
    jYearChooser1.setYear(0);
    jTextField2Wex.setText("");
    jTextField4Sname.setText("");
    jTextField5Fname.setText("");
    jTextField6Mname.setText("");
    jTextField6Class.setText("");
    jTextField7Rollno.setText("");
    jTextField8session.setText("");
    jTextField9Bdate.setText("");
    jComboBox1Stypr.setSelectedIndex(0);
    jComboBoxSClass.setSelectedIndex(0);
    jLabelpicture.setIcon(null);
    jLabel1st.setText("");
    jLabel2.setText("");
    jLabel3.setText("");
    jLabel4.setText("");
    jLabel5.setText("");
    jLabel6.setText("");
    jLabel7.setText("");
    jLabel8.setText("");
    jLabel9.setText("");
    jLabel10.setText("");
    jLabel11.setText("");
    jLabel12.setText("");
    jLabel13.setText("");
    jLabel14.setText("");
    
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
            java.util.logging.Logger.getLogger(AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmitCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmitCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1Stypr;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel11rr;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel12ttt;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel13rrr;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel14bb;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1LID;
    private javax.swing.JLabel jLabel1slno1;
    private javax.swing.JLabel jLabel1slno2;
    private javax.swing.JLabel jLabel1st;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30stid;
    private javax.swing.JLabel jLabel3year;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4fdg;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6ggg;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelcc;
    private javax.swing.JLabel jLabelcc1;
    private javax.swing.JLabel jLabelf;
    private javax.swing.JLabel jLabelmm;
    private javax.swing.JLabel jLabelpicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1Sid;
    private javax.swing.JTextField jTextField2Serialid;
    private javax.swing.JTextField jTextField2Wex;
    private javax.swing.JTextField jTextField4Sname;
    private javax.swing.JTextField jTextField5Fname;
    private javax.swing.JTextField jTextField6Class;
    private javax.swing.JTextField jTextField6Mname;
    private javax.swing.JTextField jTextField7Rollno;
    private javax.swing.JTextField jTextField8session;
    private javax.swing.JTextField jTextField9Bdate;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JButton uploadPic;
    // End of variables declaration//GEN-END:variables
}
