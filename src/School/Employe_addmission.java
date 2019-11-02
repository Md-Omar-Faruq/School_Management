
package School;

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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.scene.control.RadioButton;
//import javafx.scene.image.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Employe_addmission extends javax.swing.JFrame {
    Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String id,Name,Email,Salary,Gender,JoinDate,Address,Type,Fname,MobileNo,Qualification,AAyear,Religion;
    byte[] Img=null;
    String filename=null;
    public Employe_addmission() {
        initComponents();
        setResizable(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
        lastId();
    }
    
     public void connection(){
        try {
            jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Employe_addmission.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
    public void lastId(){
    String inquary=null;
            connection();
            String serial=null;
            try {
            serial="SELECT `ID` FROM `employee_addmission`";
            ps=jcon.prepareStatement(serial);
            rs=ps.executeQuery();
            rs.last();
            jLabel1.setText(rs.getString("ID"));
            
        } catch (SQLException ex) {
            Logger.getLogger(Employe_addmission.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
public void initial(){
    id=jTextField1id.getText();
    Name=jTextField2Name.getText();
    Email=jTextField3Email.getText();
    Salary=jTextField4Salary.getText();
    Gender=jTextField5Gender.getText();
    Address=jTextArea1Address.getText();
    Type=jTextField1Etype.getText();
    Fname=jTextField6Fname.getText();
    MobileNo=jTextField7Mobile.getText();
    Qualification=jComboBox2Qualification.getSelectedItem().toString();
   int Ayear=jYearChooser1.getYear();
    Religion=jTextField9Religion.getText();
    //Img=jLabel15Picture.getIcon();
}
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1id = new javax.swing.JTextField();
        jTextField2Name = new javax.swing.JTextField();
        jTextField3Email = new javax.swing.JTextField();
        jTextField4Salary = new javax.swing.JTextField();
        jTextField5Gender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6Fname = new javax.swing.JTextField();
        jTextField7Mobile = new javax.swing.JTextField();
        jTextField9Religion = new javax.swing.JTextField();
        jComboBox2Qualification = new javax.swing.JComboBox<>();
        jLabel15Picture = new javax.swing.JLabel();
        jButton1picture = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jButton7Update = new javax.swing.JButton();
        jButton11Clear = new javax.swing.JButton();
        jButton12View = new javax.swing.JButton();
        jButton13Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Address = new javax.swing.JTextArea();
        jTextField1Etype = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jDateChooser1JoinDate = new com.toedter.calendar.JDateChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Employee Registation", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(380, 30, 160, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Employee Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 150, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 210, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Salary");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 270, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 330, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 460, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Join Date");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 390, 160, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Employee Type");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(500, 90, 150, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Academic Year");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(500, 320, 150, 40);

        jTextField1id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1idKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1id);
        jTextField1id.setBounds(210, 90, 120, 30);

        jTextField2Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField2Name);
        jTextField2Name.setBounds(210, 150, 220, 30);

        jTextField3Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField3Email);
        jTextField3Email.setBounds(210, 210, 220, 30);

        jTextField4Salary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4Salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4SalaryKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4Salary);
        jTextField4Salary.setBounds(210, 270, 220, 30);

        jTextField5Gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField5Gender);
        jTextField5Gender.setBounds(210, 330, 220, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Father Name");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(500, 150, 150, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Mobile Number");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(500, 210, 150, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Qualification");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(500, 270, 150, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Religion");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(500, 380, 150, 40);

        jTextField6Fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField6Fname);
        jTextField6Fname.setBounds(660, 150, 200, 30);

        jTextField7Mobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7Mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7MobileKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField7Mobile);
        jTextField7Mobile.setBounds(660, 210, 200, 30);

        jTextField9Religion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField9Religion);
        jTextField9Religion.setBounds(660, 390, 200, 30);

        jComboBox2Qualification.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2Qualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Qualification", "Marriage", "UnMarriage" }));
        jPanel2.add(jComboBox2Qualification);
        jComboBox2Qualification.setBounds(660, 270, 200, 30);

        jLabel15Picture.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel15Picture);
        jLabel15Picture.setBounds(930, 90, 280, 300);

        jButton1picture.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1picture.setText("Upload Picture");
        jButton1picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1pictureActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1picture);
        jButton1picture.setBounds(930, 420, 280, 30);

        Save.setBackground(new java.awt.Color(153, 0, 0));
        Save.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save);
        Save.setBounds(110, 590, 120, 30);

        jButton7Update.setBackground(new java.awt.Color(153, 0, 0));
        jButton7Update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton7Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton7Update.setText("Update");
        jButton7Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7Update);
        jButton7Update.setBounds(250, 590, 120, 30);

        jButton11Clear.setBackground(new java.awt.Color(153, 0, 0));
        jButton11Clear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton11Clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton11Clear.setText("Clear");
        jButton11Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ClearActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11Clear);
        jButton11Clear.setBounds(670, 590, 120, 30);

        jButton12View.setBackground(new java.awt.Color(153, 0, 0));
        jButton12View.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton12View.setForeground(new java.awt.Color(255, 255, 255));
        jButton12View.setText("View");
        jButton12View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ViewActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12View);
        jButton12View.setBounds(390, 590, 120, 30);

        jButton13Exit.setBackground(new java.awt.Color(153, 0, 0));
        jButton13Exit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton13Exit.setForeground(new java.awt.Color(255, 255, 255));
        jButton13Exit.setText("Exit");
        jButton13Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ExitActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13Exit);
        jButton13Exit.setBounds(810, 590, 120, 30);

        jTextArea1Address.setColumns(20);
        jTextArea1Address.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Address);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(210, 450, 650, 50);

        jTextField1Etype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextField1Etype);
        jTextField1Etype.setBounds(660, 90, 200, 30);

        jButtonDelete.setBackground(new java.awt.Color(153, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete);
        jButtonDelete.setBounds(530, 590, 120, 30);

        jDateChooser1JoinDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jDateChooser1JoinDate);
        jDateChooser1JoinDate.setBounds(209, 390, 220, 30);

        jYearChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jYearChooser1.setHorizontalAlignment(10);
        jPanel2.add(jYearChooser1);
        jYearChooser1.setBounds(660, 330, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Employee ID ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 90, 160, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Last Entered Id");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(210, 30, 160, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1240, 670);

        setSize(new java.awt.Dimension(1248, 706));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // Data Insert Into Database
        initial();
        ps=null;
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this," Your ID Is Empty ");
            jTextField1id.requestFocus();
        }else if(Name.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Name Is Empty ");
            jTextField2Name.requestFocus();
        }else if(Email.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Email Is Empty ");
            jTextField3Email.requestFocus();
        }else if(Salary.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Salary Is Empty ");
            jTextField4Salary.requestFocus();
        }else if(Gender.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Gender Is Empty ");
            jTextField5Gender.requestFocus();
        }else if(Name.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Name Is Empty ");
            jTextField2Name.requestFocus();
        }else if(jDateChooser1JoinDate==null){
        jDateChooser1JoinDate.requestFocus();
        JOptionPane.showMessageDialog(this," Join Date Is Empty ");
        }else if(Address.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Address Is Empty ");
            jTextArea1Address.requestFocus();
        }else if(Type.isEmpty()){
        JOptionPane.showMessageDialog(this," Plese Select Your Employee Type  ");
           jTextField1Etype.requestFocus();
        }else if(Fname.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Father Name Is Empty ");
            jTextField6Fname.requestFocus();
        }else if(MobileNo.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Mobile Number Is Empty ");
            jTextField7Mobile.requestFocus();
        }else if(jComboBox2Qualification.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Plese Select Your Qualification ");
            jComboBox2Qualification.requestFocus();
        }else if(jYearChooser1.getYear()==0){
        JOptionPane.showMessageDialog(this," Your Academic Year Is Empty ");
            jYearChooser1.requestFocus();
        }else if(Religion.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Relision Is Empty ");
            jTextField9Religion.requestFocus();
        }else if(jLabel15Picture==null){
            JOptionPane.showMessageDialog(this,"Please Upload Employee Picture ");
            jButton1picture.requestFocus();
        }else{
            String inquary=null;
            connection();
            String serial=null;
            serial="SELECT `ID` FROM `employee_addmission` WHERE `ID` =?";
            try {
                ps=jcon.prepareStatement(serial);
                ps.setString(1, jTextField1id.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                JOptionPane.showMessageDialog(this, " This Employee ID is Aleardly Insert Please Change Your Employee ID");
                jTextField1id.requestFocus();
                }else{
                 SimpleDateFormat sfd=new SimpleDateFormat("yyyy-MM-dd");
            JoinDate=sfd.format(jDateChooser1JoinDate.getDate()).toString();
            inquary="INSERT INTO `employee_addmission`(`ID`,`Name`,`Email`,`Salary`,`Gender`,`Join_Date`,`Address`,`Employee_Type`,`Father_Name`,`Mobile_No`,`Qualification`,`Academic_Year`,`Religion`,`Picture`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps=jcon.prepareStatement(inquary);
                ps.setString(1,id);
                ps.setString(2,Name);
                ps.setString(3,Email);
                ps.setString(4,Salary);
                ps.setString(5,Gender);
                ps.setString(6,JoinDate);
                ps.setString(7,Address);
                ps.setString(8,Type);
                ps.setString(9,Fname);
                ps.setString(10,MobileNo);
                ps.setString(11,Qualification);
                ps.setInt(12,jYearChooser1.getYear());
                ps.setString(13,Religion);
                ps.setBytes(14,Img);
                boolean b=ps.execute();
                if(!b){
                    JOptionPane.showMessageDialog(this," Data Add Success...");
                }else{
                    JOptionPane.showMessageDialog(this," Data Add Filed...");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employe_addmission.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employe_addmission.class.getName()).log(Level.SEVERE, null, ex);
            } }lastId();
    }//GEN-LAST:event_SaveActionPerformed

    private void jButton11ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ClearActionPerformed
        // Clear Button
        clear();
    }//GEN-LAST:event_jButton11ClearActionPerformed
    public void clear(){
        jTextField1id.setText("");
        jTextField2Name.setText("");
        jTextField3Email.setText("");
        jTextField4Salary.setText("");
        jTextField5Gender.setText("");
        jDateChooser1JoinDate.setDate(null);
        jTextArea1Address.setText("");
        jTextField1Etype.setText("");
        jTextField6Fname.setText("");
        jTextField7Mobile.setText("");
        jComboBox2Qualification.setSelectedIndex(0);
        jYearChooser1.setYear(0);
        jTextField9Religion.setText("");
        jLabel15Picture.setIcon(null);
    }
    void imgUp(byte pic[] ){
    Img=pic;
}
    
    private void jButton7UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7UpdateActionPerformed
        // TODO add your handling code here:
        initial();
        if(jTextField1id.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," No Record Found "
                + " *Please At First You View Record* ");
        }else if(Name.isEmpty()){
        JOptionPane.showMessageDialog(this," No Record Found *Please At First You View Record* ");
            jTextField2Name.requestFocus();
        }else{
        initial();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this," Your ID Is Empty ");
            jTextField1id.requestFocus();
        }else if(Name.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Name Is Empty ");
            jTextField2Name.requestFocus();
        }else if(Email.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Email Is Empty ");
            jTextField3Email.requestFocus();
        }else if(Salary.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Salary Is Empty ");
            jTextField4Salary.requestFocus();
        }else if(Gender.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Gender Is Empty ");
            jTextField5Gender.requestFocus();
        }else if(jDateChooser1JoinDate.getDate()==null){
        jDateChooser1JoinDate.requestFocus();
        JOptionPane.showMessageDialog(this," Join Date Is Empty ");
        }else if(Address.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Address Is Empty ");
            jTextArea1Address.requestFocus();
        }else if(Type.isEmpty()){
        JOptionPane.showMessageDialog(this," Plese Select Your Employee Type  ");
           jTextField1Etype.requestFocus();
        }else if(Fname.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Father Name Is Empty ");
            jTextField6Fname.requestFocus();
        }else if(MobileNo.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Mobile Number Is Empty ");
            jTextField7Mobile.requestFocus();
        }else if(jComboBox2Qualification.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Plese Select Your Qualification ");
            jComboBox2Qualification.requestFocus();
        }else if(jYearChooser1.getYear()==0){
        JOptionPane.showMessageDialog(this," Your Academic Year Is Empty ");
            jYearChooser1.requestFocus();
        }else if(Religion.isEmpty()){
        JOptionPane.showMessageDialog(this," Your Relision Is Empty ");
            jTextField9Religion.requestFocus();
        }else if(jLabel15Picture==null){
        JOptionPane.showMessageDialog(this,"Please Upload Employee Picture ");
            jButton1picture.requestFocus();
        }else{
        SimpleDateFormat sdt=new SimpleDateFormat("yyyy-MM-dd");
        JoinDate=sdt.format(jDateChooser1JoinDate.getDate());
        connection();
        String up=null;
        up="UPDATE `employee_addmission` SET `Name` = ?,`Email` = ?,`Salary` = ?,`Gender` = ?,`Join_Date` = ?,`Address` = ?,`Employee_Type` = ?,`Father_Name` = ?,`Mobile_No` = ?,`Qualification` = ?,`Academic_Year` = ?,`Religion` = ?,`Picture` = ? WHERE `ID`="+jTextField1id.getText();
        try {
            ps=jcon.prepareStatement(up);
            ps.setString(1, Name);
            ps.setString(2, Email);
            ps.setString(3, Salary);
            ps.setString(4, Gender);
            ps.setString(5, JoinDate);
            ps.setString(6, Address);
            ps.setString(7, Type);
            ps.setString(8, Fname);
            ps.setString(9, MobileNo);
            ps.setString(10,Qualification);
            ps.setInt(11,   jYearChooser1.getYear());
            ps.setString(12,Religion);
            ps.setBytes(13, Img);
            int b=ps.executeUpdate();
            if(b==1){
            JOptionPane.showMessageDialog(this," Data Update Successfull...");
            }else{
            JOptionPane.showMessageDialog(this," Data Update Filed...");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employe_addmission.class.getName()).log(Level.SEVERE, null, ex);
        }}}
    }//GEN-LAST:event_jButton7UpdateActionPerformed

    private void jButton12ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ViewActionPerformed
        // TODO add your handling code here:
        String vid=jTextField1id.getText();
        if(vid.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please At First You Entered Employee ID");
        }else{
        connection();
        String se=null;
        se="SELECT *FROM `employee_addmission` WHERE `ID`=?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,vid);
                rs=ps.executeQuery();
                if(rs.next()){
                jTextField1id.setText(rs.getString("ID"));
                jTextField2Name.setText(rs.getString("Name"));
                jTextField3Email.setText(rs.getString("Email"));
                jTextField4Salary.setText(rs.getString("Salary"));
                jTextField5Gender.setText(rs.getString("Gender"));
                jDateChooser1JoinDate.setDate(rs.getDate("Join_Date"));
                 jTextArea1Address.setText(rs.getString("Address"));
                jTextField1Etype.setText(rs.getString("Employee_Type"));
                jTextField6Fname.setText(rs.getString("Father_Name"));
                jTextField7Mobile.setText(rs.getString("Mobile_No"));
                jComboBox2Qualification.setSelectedItem(rs.getString("Qualification"));
                jYearChooser1.setYear(rs.getInt("Academic_Year"));
                jTextField9Religion.setText(rs.getString("Religion"));
                byte pic[]=rs.getBytes("Picture");
                imgUp( pic );
                ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel15Picture.getWidth(),jLabel15Picture.getHeight(),java.awt.Image.SCALE_SMOOTH));
                jLabel15Picture.setIcon(im);
                boolean b=ps.execute();
                if(b){
                JOptionPane.showMessageDialog(this," Data View Successfully...");
                }else{
                JOptionPane.showMessageDialog(this,"Data View Filed..");
                }
                }else{
                JOptionPane.showMessageDialog(this,"Your ID Is Rong");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employe_addmission.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_jButton12ViewActionPerformed

    private void jButton13ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton13ExitActionPerformed

    private void jButton1pictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1pictureActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon( new ImageIcon(filename).getImage().getScaledInstance(jLabel15Picture.getWidth(),jLabel15Picture.getHeight(),java.awt.Image.SCALE_SMOOTH));
        jLabel15Picture.setIcon(icon);
        try{
        File image = new File(filename);
        FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            byte[] by = new byte[2048];
            for(int readNum;(readNum=fis.read(by))!=-1;){
            bao.write(by, 0, readNum);
            }
            Img=bao.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_jButton1pictureActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // Delete Button
        if(jTextField1id.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First You View Record");
            jButton12View.requestFocus();
        }else{
        int BBB=JOptionPane.showConfirmDialog(this," Are you sure you want to permanently Delete this Record");
        if(BBB==0){
        connection();
        String de=null;
        de="DELETE FROM `employee_addmission` WHERE `ID`=?";
        try {
            ps=jcon.prepareStatement(de);
            ps.setString(1,jTextField1id.getText());
            int i=ps.executeUpdate();
                if(i==1){
                JOptionPane.showMessageDialog(this,"Record Delete Successfully...");
                clear();
                }else{
                JOptionPane.showMessageDialog(this,"Record Delete Filed...");
                }
        } catch (SQLException ex) {
            Logger.getLogger(Employe_addmission.class.getName()).log(Level.SEVERE, null, ex);
        }}}
        
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextField1idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1idKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1idKeyTyped

    private void jTextField4SalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4SalaryKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4SalaryKeyTyped

    private void jTextField7MobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7MobileKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7MobileKeyTyped

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
            java.util.logging.Logger.getLogger(Employe_addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employe_addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employe_addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employe_addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employe_addmission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton jButton11Clear;
    private javax.swing.JButton jButton12View;
    private javax.swing.JButton jButton13Exit;
    private javax.swing.JButton jButton1picture;
    private javax.swing.JButton jButton7Update;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JComboBox<String> jComboBox2Qualification;
    private com.toedter.calendar.JDateChooser jDateChooser1JoinDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel15Picture;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1Address;
    private javax.swing.JTextField jTextField1Etype;
    private javax.swing.JTextField jTextField1id;
    private javax.swing.JTextField jTextField2Name;
    private javax.swing.JTextField jTextField3Email;
    private javax.swing.JTextField jTextField4Salary;
    private javax.swing.JTextField jTextField5Gender;
    private javax.swing.JTextField jTextField6Fname;
    private javax.swing.JTextField jTextField7Mobile;
    private javax.swing.JTextField jTextField9Religion;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
