
package School;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AdmitCard_view extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
 
    public AdmitCard_view() {
        initComponents();
        setResizable(false);
        setTitle("Student Admit Card");
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
        jLabeExamType = new javax.swing.JLabel();
        jLabel3year = new javax.swing.JLabel();
        jLabel4fdg = new javax.swing.JLabel();
        jLabel6ggg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabelf = new javax.swing.JLabel();
        jLabelmm = new javax.swing.JLabel();
        jLabel11rr = new javax.swing.JLabel();
        jLabel12ttt = new javax.swing.JLabel();
        jLabel13rrr = new javax.swing.JLabel();
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
        jLabel1StudentId = new javax.swing.JLabel();
        jLabel1slno2 = new javax.swing.JLabel();
        jDateChooser1Pdate = new com.toedter.calendar.JDateChooser();
        jLabel1slno5 = new javax.swing.JLabel();
        jLabel1Sname = new javax.swing.JLabel();
        jLabelf1Fname = new javax.swing.JLabel();
        jLabelmm1Mname = new javax.swing.JLabel();
        jLabelcc1Class = new javax.swing.JLabel();
        jLabel12ttt1Etype = new javax.swing.JLabel();
        jLabel14bbBd = new javax.swing.JLabel();
        jLabel13rrr1Session = new javax.swing.JLabel();
        jLabel11rrRoll = new javax.swing.JLabel();
        jLabel1picture = new javax.swing.JLabel();
        jLabel3year12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3year11 = new javax.swing.JLabel();
        jLabel1SerialNo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField1Admit = new javax.swing.JTextField();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jLabel3year13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        clears = new javax.swing.JButton();
        clears1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jLabeExamType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabeExamType.setForeground(new java.awt.Color(51, 153, 255));
        jLabeExamType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabeExamType);
        jLabeExamType.setBounds(320, 120, 660, 30);

        jLabel3year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel3year);
        jLabel3year.setBounds(1010, 20, 150, 30);

        jLabel4fdg.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4fdg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4fdg.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4fdg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4fdg.setText("Admit Card");
        jPanel1.add(jLabel4fdg);
        jLabel4fdg.setBounds(320, 150, 660, 50);

        jLabel6ggg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6ggg.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6ggg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6ggg.setText("Bangladesh School Education Bord");
        jPanel1.add(jLabel6ggg);
        jLabel6ggg.setBounds(320, 80, 660, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(690, 700, 180, 30);

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 0, 204));
        jLabel.setText("Neme of Examinee  :");
        jPanel1.add(jLabel);
        jLabel.setBounds(160, 310, 170, 40);

        jLabelf.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelf.setForeground(new java.awt.Color(0, 0, 204));
        jLabelf.setText("Father's Name         :");
        jPanel1.add(jLabelf);
        jLabelf.setBounds(160, 370, 170, 40);

        jLabelmm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelmm.setForeground(new java.awt.Color(0, 0, 204));
        jLabelmm.setText("Mother's Name        :");
        jPanel1.add(jLabelmm);
        jLabelmm.setBounds(160, 430, 170, 40);

        jLabel11rr.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11rr.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11rr.setText("Roll No                    :");
        jPanel1.add(jLabel11rr);
        jLabel11rr.setBounds(750, 310, 170, 40);

        jLabel12ttt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12ttt.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12ttt.setText("Type Of Examinee   :");
        jPanel1.add(jLabel12ttt);
        jLabel12ttt.setBounds(750, 490, 170, 40);

        jLabel13rrr.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13rrr.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13rrr.setText("Session                    :");
        jPanel1.add(jLabel13rrr);
        jLabel13rrr.setBounds(750, 370, 170, 40);

        jLabel14bb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14bb.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14bb.setText("Date Of Birth           :");
        jPanel1.add(jLabel14bb);
        jLabel14bb.setBounds(750, 430, 170, 40);

        jLabelcc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelcc.setForeground(new java.awt.Color(0, 0, 204));
        jLabelcc.setText("Class                        :");
        jPanel1.add(jLabelcc);
        jLabelcc.setBounds(160, 490, 170, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Subject Name");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(120, 580, 180, 30);

        jLabel1st.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1st.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel1st);
        jLabel1st.setBounds(120, 620, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 660, 180, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(690, 660, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 700, 180, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(120, 740, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 620, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 660, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 660, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 700, 180, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(310, 740, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 620, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(690, 620, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(500, 700, 180, 30);

        jLabel1StudentId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel1StudentId);
        jLabel1StudentId.setBounds(170, 80, 170, 30);

        jLabel1slno2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1slno2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1slno2.setText("Print Date");
        jPanel1.add(jLabel1slno2);
        jLabel1slno2.setBounds(20, 20, 120, 30);

        jDateChooser1Pdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser1Pdate);
        jDateChooser1Pdate.setBounds(170, 20, 180, 30);

        jLabel1slno5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1slno5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1slno5.setText("Serial No");
        jPanel1.add(jLabel1slno5);
        jLabel1slno5.setBounds(420, 20, 110, 30);

        jLabel1Sname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1Sname.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel1Sname);
        jLabel1Sname.setBounds(370, 310, 210, 40);

        jLabelf1Fname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelf1Fname.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabelf1Fname);
        jLabelf1Fname.setBounds(370, 370, 210, 40);

        jLabelmm1Mname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelmm1Mname.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabelmm1Mname);
        jLabelmm1Mname.setBounds(370, 430, 210, 40);

        jLabelcc1Class.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelcc1Class.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabelcc1Class);
        jLabelcc1Class.setBounds(370, 490, 210, 40);

        jLabel12ttt1Etype.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12ttt1Etype.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel12ttt1Etype);
        jLabel12ttt1Etype.setBounds(970, 490, 240, 40);

        jLabel14bbBd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14bbBd.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel14bbBd);
        jLabel14bbBd.setBounds(970, 430, 240, 40);

        jLabel13rrr1Session.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13rrr1Session.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel13rrr1Session);
        jLabel13rrr1Session.setBounds(970, 370, 240, 40);

        jLabel11rrRoll.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11rrRoll.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jLabel11rrRoll);
        jLabel11rrRoll.setBounds(970, 310, 240, 40);

        jLabel1picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1picture);
        jLabel1picture.setBounds(1050, 90, 150, 150);

        jLabel3year12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3year12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3year12.setText("Year");
        jPanel1.add(jLabel3year12);
        jLabel3year12.setBounds(870, 20, 100, 30);

        jLabel15.setText("Controller Of Examinations");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1130, 730, 210, 20);

        jLabel3year11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3year11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3year11.setText("Student Id");
        jPanel1.add(jLabel3year11);
        jLabel3year11.setBounds(20, 80, 100, 30);

        jLabel1SerialNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel1SerialNo);
        jLabel1SerialNo.setBounds(550, 20, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 1390, 790);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(620, 10, 120, 30);

        jTextField1Admit.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1Admit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1Admit.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1Admit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1AdmitKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1Admit);
        jTextField1Admit.setBounds(480, 10, 150, 30);

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
        jPanel2.add(jComboBoxSClass);
        jComboBoxSClass.setBounds(130, 10, 210, 30);

        jLabel3year13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3year13.setText("Student Id");
        jPanel2.add(jLabel3year13);
        jLabel3year13.setBounds(380, 10, 100, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(990, 10, 100, 29);

        clears.setBackground(new java.awt.Color(255, 0, 0));
        clears.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clears.setForeground(new java.awt.Color(255, 255, 255));
        clears.setText("Clear");
        clears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearsActionPerformed(evt);
            }
        });
        jPanel2.add(clears);
        clears.setBounds(1110, 10, 100, 29);

        clears1.setBackground(new java.awt.Color(255, 0, 0));
        clears1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clears1.setForeground(new java.awt.Color(255, 255, 255));
        clears1.setText("Add New");
        clears1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clears1ActionPerformed(evt);
            }
        });
        jPanel2.add(clears1);
        clears1.setBounds(1230, 10, 140, 29);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1390, 60);

        setSize(new java.awt.Dimension(1402, 898));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            }else{
            //JOptionPane.showMessageDialog(this," Your Id Is Rong");
            jTextField1Admit.setText("");
            jTextField1Admit.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxSClassActionPerformed

    private void jComboBoxSClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSClassKeyReleased

    }//GEN-LAST:event_jComboBoxSClassKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Search Admitcard
        
        setinfo();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void setinfo(){
       if(jTextField1Admit.getText().isEmpty()){
       JOptionPane.showMessageDialog(this," Student Id Is Empty");
       jTextField1Admit.requestFocus();
       }else{
        connection();
       ps=null;
       String se=null;
       se="SELECT * FROM `admit_card` WHERE `SID` = ?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jTextField1Admit.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        jLabel1SerialNo.setText(rs.getString("Serial_ID"));
        jLabel3year.setText(rs.getString("Year"));
        jLabeExamType.setText(rs.getString("Exam_Type"));
        jLabel1StudentId.setText(rs.getString("SID"));
        jLabel1Sname.setText(rs.getString("Student_name"));
        jLabelf1Fname.setText(rs.getString("Father_name"));
        jLabelmm1Mname.setText(rs.getString("Mother_name"));
        jLabelcc1Class.setText(rs.getString("Class"));
        jLabel11rrRoll.setText(rs.getString("Roll"));
        jLabel13rrr1Session.setText(rs.getString("Session"));
        jLabel14bbBd.setText(rs.getString("BD"));
        jLabel12ttt1Etype.setText(rs.getString("S_Type"));
        byte pic[]=rs.getBytes("Picture");
        ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel1picture.getWidth(),jLabel1picture.getHeight(),java.awt.Image.SCALE_SMOOTH));
        jLabel1picture.setIcon(im);
        boolean b=ps.execute();
        if(b){
        JOptionPane.showMessageDialog(this, " Date Verw Successfully...");
        }else{
        JOptionPane.showMessageDialog(this, " Date Verw Filed...");
        }
        }else{
        JOptionPane.showMessageDialog(this," No Record In This ID Number Please At First Entry Record This Id Number");
        jTextField1Admit.setText("");
        jTextField1Admit.requestFocus();
        }
    } catch (SQLException ex) {
        Logger.getLogger(AdmitCard_view.class.getName()).log(Level.SEVERE, null, ex);
    }}
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1Admit.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," You Enter Student Id And Prees Search Button Then Set All Information");
            jTextField1Admit.requestFocus();
        }else if(jComboBoxSClass.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," You Select Student Class Then Set Subject ");
        }else if(jDateChooser1Pdate.getDate()==null){
        JOptionPane.showMessageDialog(this," Print Date Is Empty ");
        jDateChooser1Pdate.requestFocus();
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
            } }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearsActionPerformed
        // Clear Button
        Clears();
    }//GEN-LAST:event_clearsActionPerformed

    private void clears1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clears1ActionPerformed
        // Entry Admit Card
        AdmitCard ad=new AdmitCard();
        ad.setVisible(true);
    }//GEN-LAST:event_clears1ActionPerformed

    private void jTextField1AdmitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1AdmitKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1AdmitKeyTyped

    public void Clears(){
    jComboBoxSClass.setSelectedIndex(0);
    jTextField1Admit.setText("");
    jDateChooser1Pdate.setDate(null);
    jLabel1StudentId.setText("");
    jLabel1SerialNo.setText("");
    jLabel3year.setText("");
    jLabeExamType.setText("");
    jLabel1Sname.setText("");
    jLabelf1Fname.setText("");
    jLabelmm1Mname.setText("");
    jLabelcc1Class.setText("");
    jLabel11rrRoll.setText("");
    jLabel13rrr1Session.setText("");
    jLabel14bbBd.setText("");
    jLabel12ttt1Etype.setText("");
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
    jLabel1picture.setIcon(null);
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
            java.util.logging.Logger.getLogger(AdmitCard_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmitCard_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmitCard_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmitCard_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmitCard_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clears;
    private javax.swing.JButton clears1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private com.toedter.calendar.JDateChooser jDateChooser1Pdate;
    private javax.swing.JLabel jLabeExamType;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel11rr;
    private javax.swing.JLabel jLabel11rrRoll;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel12ttt;
    private javax.swing.JLabel jLabel12ttt1Etype;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel13rrr;
    private javax.swing.JLabel jLabel13rrr1Session;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel14bb;
    private javax.swing.JLabel jLabel14bbBd;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1SerialNo;
    private javax.swing.JLabel jLabel1Sname;
    private javax.swing.JLabel jLabel1StudentId;
    private javax.swing.JLabel jLabel1picture;
    private javax.swing.JLabel jLabel1slno2;
    private javax.swing.JLabel jLabel1slno5;
    private javax.swing.JLabel jLabel1st;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3year;
    private javax.swing.JLabel jLabel3year11;
    private javax.swing.JLabel jLabel3year12;
    private javax.swing.JLabel jLabel3year13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4fdg;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6ggg;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelcc;
    private javax.swing.JLabel jLabelcc1Class;
    private javax.swing.JLabel jLabelf;
    private javax.swing.JLabel jLabelf1Fname;
    private javax.swing.JLabel jLabelmm;
    private javax.swing.JLabel jLabelmm1Mname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1Admit;
    // End of variables declaration//GEN-END:variables
}
