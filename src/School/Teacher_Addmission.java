
package School;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.relation.Relation;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Teacher_Addmission extends javax.swing.JFrame {
    
Connection jcon=null;
PreparedStatement ps=null;
Statement st=null;
ResultSet rs=null;
String ID,Name,Email,Divition,Salary,Gender,JoinDate,Address,Subject,Ttype,Fname,MobileNO,Distric,Qualification,Ayear,Relision;
byte pic[]=null;
String filename=null;
SimpleDateFormat sd=new SimpleDateFormat("yyyy-DD-mm");
    public Teacher_Addmission() {
        initComponents();
        school();
        setTitle("Teachdr Admission");
        Toolkit tk=Toolkit.getDefaultToolkit();
        getContentPane().setBackground(Color.cyan);
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
  
public void DataInitial(){
ID=jTextField1id.getText();
Name=jTextField2Name.getText();
Email=jTextField4Email.getText();
Divition=jTextField5MobileNo.getText();
Salary=jTextField8Salary.getText();
if(jRadioButton2Male.isSelected()){
Gender="Male";
}else if(jRadioButton1Femail.isSelected()){
Gender="Female";
}else{
Gender="";
}
Address=jTextArea2Address.getText();
Subject=jTextArea1Subject.getText();
Ttype=jComboBox2Ttype.getSelectedItem().toString();
Fname=jTextField3Fname.getText();
MobileNO=jTextField5MobileNo.getText();
Distric=jTextField7Distric.getText();
Qualification=jComboBox1Tqualification.getSelectedItem().toString();
Ayear=jTextField11Ayear.getText();
Relision=jTextField12Relision.getText();

}
public void add(){
DataInitial();
if(ID.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher ID Is Empty");
jTextField1id.requestFocus();
}else if(Name.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Name Is Empty");
jTextField2Name.requestFocus();
}else if(Email.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Email Is Empty");
jTextField4Email.requestFocus();
}else if(jTextField6Divition.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Divition Is Empty");
jTextField6Divition.requestFocus();
}else if(Salary.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Salary Is Empty");
jTextField8Salary.requestFocus();
}else if(Gender.isEmpty()){
JOptionPane.showMessageDialog(this,"Please Choose Gender");
jRadioButton2Male.requestFocus();
}else if(jDateChooser1jDate.getDate()==null){
jDateChooser1jDate.getDateEditor().getUiComponent().requestFocus();
jDateChooser1jDate.requestFocus();
JOptionPane.showMessageDialog(this,"Teacher Join Date Is Empty");
}else if(Address.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Address Is Empty");
jTextArea2Address.requestFocus();
}else if(Subject.isEmpty()){
JOptionPane.showMessageDialog(this,"Please Entry Subject Which Subject Can You Teach");
jTextArea1Subject.requestFocus();
}else if(jComboBox2Ttype.getSelectedIndex()==0){
JOptionPane.showMessageDialog(this,"Select Teacher Type");
jComboBox2Ttype.requestFocus();
}else if(Fname.isEmpty()){
JOptionPane.showMessageDialog(this,"Father Name Is Empty");
jTextField3Fname.requestFocus();
}else if(MobileNO.isEmpty()){
JOptionPane.showMessageDialog(this,"Mobile Number Is Empty");
jTextField5MobileNo.requestFocus();
}else if(Distric.isEmpty()){
JOptionPane.showMessageDialog(this,"Distric Is Empty");
jTextField7Distric.requestFocus();
}else if(jComboBox1Tqualification.getSelectedIndex()==0){
JOptionPane.showMessageDialog(this,"Plase Select Qualification");
jComboBox1Tqualification.requestFocus();
}else if(Ayear.isEmpty()){
JOptionPane.showMessageDialog(this,"Academic Year Is Empty");
jTextField11Ayear.requestFocus();
}else if(Relision.isEmpty()){
JOptionPane.showMessageDialog(this,"Relision Is Empty");
jTextField12Relision.requestFocus();
}else if(jLabel19Picture.getIcon()==null){
JOptionPane.showMessageDialog(this,"Upload Your Picture");
jTextField12Relision.requestFocus();
}else{
    try {
connection();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
  JoinDate=sdf.format(jDateChooser1jDate.getDate()).toString();
String insert=null;
   insert="INSERT INTO `teacher_admission`(`TeacherID`,`Name`,`Email`,`Divition`,`Salary`,`Gender`,`JoinDate`,`Address`,`Subject`,`Ttype`,`Fname`,`MobileNo`,`Distric`,`Qualification`,`AcademicYear`,`Religion`,`Picture`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//inquery="INSERT INTO `employees_salary`(`Empoloyee_ID`,`Empoloyee_Name`,`Empoloyee_Type`,`Empoloyee_Salary`) VALUES(?,?,?,?)";
ps=jcon.prepareStatement(insert);
ps.setString(1,ID);
ps.setString(2,Name);
ps.setString(3,Email);
ps.setString(4,Divition);
ps.setString(5,Salary);
ps.setString(6,Gender);
ps.setString(7,JoinDate);
ps.setString(8,Address);
ps.setString(9,Subject);
ps.setString(10,Ttype);
ps.setString(11,Fname);
ps.setString(12,MobileNO);
ps.setString(13,Distric);
ps.setString(14,Qualification);
ps.setString(15,Ayear);
ps.setString(16,Relision);
ps.setBytes(17,pic);
boolean b=ps.execute();
if(!b){
JOptionPane.showMessageDialog(this,"Data Insert Success...");
}else{
JOptionPane.showMessageDialog(this,"Data Insert Filed...");
}
jcon.close();
} catch (SQLException ex) {
 Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);  }}
}

public void connection(){
    try {
    jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void school(){
connection();
String selected="SELECT `SchoolName` FROM `schoolprofile`";
    try {
        ps=jcon.prepareStatement(selected);
        rs=ps.executeQuery();
        while(rs.next()){
        jLabel1.setText(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1pic = new javax.swing.JButton();
        jLabel19Picture = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Subject = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField12Relision = new javax.swing.JTextField();
        jTextField11Ayear = new javax.swing.JTextField();
        jComboBox1Tqualification = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7Distric = new javax.swing.JTextField();
        jTextField5MobileNo = new javax.swing.JTextField();
        jTextField3Fname = new javax.swing.JTextField();
        jComboBox2Ttype = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField8Salary = new javax.swing.JTextField();
        jRadioButton1Femail = new javax.swing.JRadioButton();
        jRadioButton2Male = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6Divition = new javax.swing.JTextField();
        jTextField4Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2Name = new javax.swing.JTextField();
        jTextField1id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jDateChooser1jDate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2Address = new javax.swing.JTextArea();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 10, 520, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1320, 50);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(null);

        jButton1pic.setBackground(new java.awt.Color(0, 0, 204));
        jButton1pic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1pic.setForeground(new java.awt.Color(255, 255, 255));
        jButton1pic.setText("Upload Picture");
        jButton1pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1picActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1pic);
        jButton1pic.setBounds(930, 310, 230, 30);

        jLabel19Picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel2.add(jLabel19Picture);
        jLabel19Picture.setBounds(930, 90, 230, 200);

        jTextArea1Subject.setColumns(20);
        jTextArea1Subject.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1Subject.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Subject);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(170, 560, 670, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Please Wright   Which  Subject Can You Teach");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(170, 530, 500, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Address");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 460, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Join Date");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 390, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Religion");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(470, 390, 150, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Academic Year");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(470, 340, 150, 30);

        jTextField12Relision.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField12Relision);
        jTextField12Relision.setBounds(640, 390, 200, 30);

        jTextField11Ayear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField11Ayear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11AyearKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField11Ayear);
        jTextField11Ayear.setBounds(640, 340, 200, 30);

        jComboBox1Tqualification.setBackground(new java.awt.Color(0, 0, 204));
        jComboBox1Tqualification.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBox1Tqualification.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1Tqualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Qualification", "Marriage", "UnMarriage" }));
        jPanel2.add(jComboBox1Tqualification);
        jComboBox1Tqualification.setBounds(640, 290, 200, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Qualification");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(470, 290, 150, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Distric");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(470, 240, 150, 30);

        jTextField7Distric.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField7Distric);
        jTextField7Distric.setBounds(640, 240, 200, 30);

        jTextField5MobileNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5MobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5MobileNoKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5MobileNo);
        jTextField5MobileNo.setBounds(640, 190, 200, 30);

        jTextField3Fname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField3Fname);
        jTextField3Fname.setBounds(640, 140, 200, 30);

        jComboBox2Ttype.setBackground(new java.awt.Color(0, 0, 204));
        jComboBox2Ttype.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBox2Ttype.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2Ttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Head Master", "Vice Head Master", "Senior Teacher", "Junior Teacher", "Gest Teacher" }));
        jPanel2.add(jComboBox2Ttype);
        jComboBox2Ttype.setBounds(640, 90, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Teacher Type");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(470, 90, 150, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Father Name");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(470, 140, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Mobile No");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(470, 190, 150, 30);

        jTextField8Salary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField8Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8SalaryActionPerformed(evt);
            }
        });
        jTextField8Salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8SalaryKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField8Salary);
        jTextField8Salary.setBounds(170, 280, 220, 30);

        buttonGroup1.add(jRadioButton1Femail);
        jRadioButton1Femail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1Femail.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton1Femail.setText("Femal");
        jPanel2.add(jRadioButton1Femail);
        jRadioButton1Femail.setBounds(250, 330, 80, 30);

        buttonGroup1.add(jRadioButton2Male);
        jRadioButton2Male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2Male.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton2Male.setText("Male");
        jPanel2.add(jRadioButton2Male);
        jRadioButton2Male.setBounds(170, 330, 70, 31);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Gender");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 330, 120, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Salary");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 280, 120, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Divition");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 230, 120, 30);

        jTextField6Divition.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField6Divition);
        jTextField6Divition.setBounds(170, 230, 220, 30);

        jTextField4Email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField4Email);
        jTextField4Email.setBounds(170, 180, 220, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Email");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 180, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 130, 120, 30);

        jTextField2Name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField2Name);
        jTextField2Name.setBounds(170, 130, 220, 30);

        jTextField1id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1idKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1id);
        jTextField1id.setBounds(170, 80, 100, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Teacher ID");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 80, 120, 30);

        Exit.setBackground(new java.awt.Color(0, 0, 204));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit);
        Exit.setBounds(820, 660, 110, 30);

        Update.setBackground(new java.awt.Color(0, 0, 204));
        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update);
        Update.setBounds(307, 660, 100, 30);

        Save.setBackground(new java.awt.Color(0, 0, 204));
        Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save);
        Save.setBounds(170, 660, 110, 30);

        View.setBackground(new java.awt.Color(0, 0, 204));
        View.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel2.add(View);
        View.setBounds(430, 660, 110, 30);

        Clear.setBackground(new java.awt.Color(0, 0, 204));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear);
        Clear.setBounds(690, 660, 110, 30);

        jDateChooser1jDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jDateChooser1jDate);
        jDateChooser1jDate.setBounds(170, 390, 210, 30);

        jTextArea2Address.setColumns(20);
        jTextArea2Address.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea2Address.setRows(5);
        jScrollPane2.setViewportView(jTextArea2Address);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(170, 450, 670, 60);

        Delete.setBackground(new java.awt.Color(0, 0, 204));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);
        Delete.setBounds(560, 660, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 1320, 720);

        setSize(new java.awt.Dimension(1337, 813));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8SalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8SalaryActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       add();
    }//GEN-LAST:event_SaveActionPerformed

    private void jButton1picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1picActionPerformed
        // Button FO The Picture Upload
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon( new ImageIcon(filename).getImage().getScaledInstance(jLabel19Picture.getWidth(),jLabel19Picture.getHeight(),Image.SCALE_SMOOTH));
        jLabel19Picture.setIcon(icon);
        try{
        File image = new File(filename);
        FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            byte[] by = new byte[2048];
            for(int readNum;(readNum=fis.read(by))!=-1;){
            bao.write(by, 0, readNum);
            }
            pic=bao.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);}
        
    }//GEN-LAST:event_jButton1picActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        String M="Male";
        String F="Female";
        if(jTextField1id.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Please At Frist You Enter Teacher ID");
        jTextField1id.requestFocus();
        }else{
            try {
                connection();
                DataInitial();
                String v=null;
                v="SELECT *FROM `teacher_admission` WHERE `TeacherID`=?";
                ps=jcon.prepareStatement(v);
                ps.setString(1,ID);
                rs=ps.executeQuery();
                if(rs.next()){
                jTextField1id.setText(rs.getString("TeacherID"));
                jTextField2Name.setText(rs.getString("Name"));
                jTextField4Email.setText(rs.getString("Email"));
                jTextField6Divition.setText(rs.getString("Divition"));
                jTextField8Salary.setText(rs.getString("Salary"));
                if(rs.getString("Gender").equals(M)){
                jRadioButton2Male.setSelected(true);
                }else if(rs.getString("Gender").equals(F)){
                jRadioButton1Femail.setSelected(true);
                }
                jDateChooser1jDate.setDate(rs.getDate("JoinDate"));
                jTextArea2Address.setText(rs.getString("Address"));
                jTextArea1Subject.setText(rs.getString("Subject"));
                jComboBox2Ttype.setSelectedItem(rs.getString("Ttype"));
                jTextField3Fname.setText(rs.getString("Fname"));
                jTextField5MobileNo.setText(rs.getString("MobileNO"));
                jTextField7Distric.setText(rs.getString("Distric"));
                jComboBox1Tqualification.setSelectedItem(rs.getString("Qualification"));
                jTextField11Ayear.setText(rs.getString("AcademicYear"));
                byte pic[]=rs.getBytes("Picture");
                ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel19Picture.getWidth(),jLabel19Picture.getHeight(),Image.SCALE_SMOOTH));
                jLabel19Picture.setIcon(im);
                jTextField12Relision.setText(rs.getString("Religion"));
                }else{
                jTextField1id.requestFocus(); 
                jTextField1id.setText("");
                JOptionPane.showMessageDialog(this," ID Is Rong");
                }
                boolean b=ps.execute();
                if(b){
                JOptionPane.showMessageDialog(this," Data View Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data View Filed..");
                }
            } catch (Exception a) {
                JOptionPane.showMessageDialog(null ,a);
            }
        
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
 clear();
    }//GEN-LAST:event_ClearActionPerformed
    public void clear(){
           jTextField1id.setText("");
        jTextField2Name.setText("");
        jTextField4Email.setText("");
        jTextField6Divition.setText("");
        jTextField8Salary.setText("");
        buttonGroup1.clearSelection();
        jDateChooser1jDate.setDate(null);
        jTextArea2Address.setText("");
        jTextArea1Subject.setText("");
        jComboBox2Ttype.setSelectedIndex(0);
        jTextField3Fname.setText("");
        jTextField5MobileNo.setText("");
        jTextField7Distric.setText("");
        jComboBox1Tqualification.setSelectedIndex(0);
        jTextField11Ayear.setText("");
        jTextField12Relision.setText("");
        jLabel19Picture.setIcon(null);
    }
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // Update Button
if(jTextField1id.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"No Record Found"
        + " Please At First You View  Recor");
}else{
DataInitial();
if(jTextField1id.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher ID Is Empty");
jTextField1id.requestFocus();
}else if(Name.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Name Is Empty");
jTextField2Name.requestFocus();
}else if(Email.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Email Is Empty");
jTextField4Email.requestFocus();
}else if(jTextField6Divition.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Divition Is Empty");
jTextField6Divition.requestFocus();
}else if(Salary.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Salary Is Empty");
jTextField8Salary.requestFocus();
}else if(Gender.isEmpty()){
JOptionPane.showMessageDialog(this,"Please Choose Gender");
jRadioButton2Male.requestFocus();
}else if(jDateChooser1jDate.getDate()==null) {
jDateChooser1jDate.getDateEditor().getUiComponent().requestFocus();
JOptionPane.showMessageDialog(this,"Join Date is Empty ");
}else if(Address.isEmpty()){
JOptionPane.showMessageDialog(this,"Teacher Address Is Empty");
jTextArea2Address.requestFocus();
}else if(Subject.isEmpty()){
JOptionPane.showMessageDialog(this,"Please Entry Subject Which Subject Can You Teach");
jTextArea1Subject.requestFocus();
}else if(jComboBox2Ttype.getSelectedIndex()==0){
JOptionPane.showMessageDialog(this,"Select Teacher Type");
jComboBox2Ttype.requestFocus();
}else if(Fname.isEmpty()){
JOptionPane.showMessageDialog(this,"Father Name Is Empty");
jTextField3Fname.requestFocus();
}else if(MobileNO.isEmpty()){
JOptionPane.showMessageDialog(this,"Mobile Number Is Empty");
jTextField5MobileNo.requestFocus();
}else if(Distric.isEmpty()){
JOptionPane.showMessageDialog(this,"Distric Is Empty");
jTextField7Distric.requestFocus();
}else if(jComboBox1Tqualification.getSelectedIndex()==0){
JOptionPane.showMessageDialog(this,"Plase Select Qualification");
jComboBox1Tqualification.requestFocus();
}else if(Ayear.isEmpty()){
JOptionPane.showMessageDialog(this,"Academic Year Is Empty");
jTextField11Ayear.requestFocus();
}else if(Relision.isEmpty()){
JOptionPane.showMessageDialog(this,"Relision Is Empty");
jTextField12Relision.requestFocus();
}else if(pic==null){
JOptionPane.showMessageDialog(this,"Upload Your Picture");
jButton1pic.requestFocus();
}else{
        connection();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        JoinDate=sdf.format(jDateChooser1jDate.getDate());
        String up=null;
        up="UPDATE `teacher_admission` SET `Name` = ?,`Email` = ?,`Divition` = ?,`Salary` = ?,`Gender` = ?,`JoinDate` = ?,`Address` = ?,`Subject` = ?,`Ttype` = ?,`Fname` = ?,`MobileNo` = ?,`Distric` = ?,`Qualification` = ?,`AcademicYear` = ?,`Religion` = ?,`Picture` = ? WHERE `TeacherID`="+jTextField1id.getText();
    try {
        ps=jcon.prepareStatement(up);
        ps.setString(1, Name);
        ps.setString(2, Email);
        ps.setString(3, Divition);
        ps.setString(4, Salary);
        ps.setString(5, Gender);
        ps.setString(6, JoinDate);
        ps.setString(7, Address);
        ps.setString(8, Subject);
        ps.setString(9, Ttype);
        ps.setString(10, Fname);
        ps.setString(11, MobileNO);
        ps.setString(12, Distric);
        ps.setString(13, Qualification);
        ps.setString(14, Ayear);
        ps.setString(15, Relision);
        ps.setBytes(16, pic);
        int b=ps.executeUpdate();
        if(b==1){
        JOptionPane.showMessageDialog(this," Data Update Successfull...");
        }else{
        JOptionPane.showMessageDialog(this," Date Update Filed..");
        }
    } catch (SQLException ex) {
        //Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this,ex);
    }}}   
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
         if(jTextField1id.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Please At First You View Record");
        View.requestFocus();
        }else if(jTextField2Name.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Please At First You View Record");
        View.requestFocus();
        }else{
        int d=JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Record");
        if(d==0){
        connection();
        String de=null;
        de="DELETE FROM `teacher_admission` WHERE `TeacherID`=?";
            try {
                ps=jcon.prepareStatement(de);
                ps.setString(1,jTextField1id.getText());
                int b=ps.executeUpdate();
                if(b==1){
                clear();
                JOptionPane.showMessageDialog(this," Data Delete Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data Delete Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
            }}
        
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTextField1idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1idKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1idKeyTyped

    private void jTextField8SalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8SalaryKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8SalaryKeyTyped

    private void jTextField5MobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5MobileNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5MobileNoKeyTyped

    private void jTextField11AyearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11AyearKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField11AyearKeyTyped


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
            java.util.logging.Logger.getLogger(Teacher_Addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_Addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_Addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_Addmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_Addmission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Save;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1pic;
    private javax.swing.JComboBox<String> jComboBox1Tqualification;
    private javax.swing.JComboBox<String> jComboBox2Ttype;
    private com.toedter.calendar.JDateChooser jDateChooser1jDate;
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
    private javax.swing.JLabel jLabel19Picture;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1Femail;
    private javax.swing.JRadioButton jRadioButton2Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1Subject;
    private javax.swing.JTextArea jTextArea2Address;
    private javax.swing.JTextField jTextField11Ayear;
    private javax.swing.JTextField jTextField12Relision;
    private javax.swing.JTextField jTextField1id;
    private javax.swing.JTextField jTextField2Name;
    private javax.swing.JTextField jTextField3Fname;
    private javax.swing.JTextField jTextField4Email;
    private javax.swing.JTextField jTextField5MobileNo;
    private javax.swing.JTextField jTextField6Divition;
    private javax.swing.JTextField jTextField7Distric;
    private javax.swing.JTextField jTextField8Salary;
    // End of variables declaration//GEN-END:variables
}
