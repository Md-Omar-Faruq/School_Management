
package School;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Student_Addmission_From extends javax.swing.JFrame {
Connection jcon=null;
Statement st=null;
PreparedStatement ps=null;
ResultSet rs=null;
int id=0;
String filename=null;
 
String Id,Sname,contractNo,email,gender,address,Session,Roll,SClass,Group,Section,Nationality,Religion,BirthDate,AddDate,Fname,Foccupation,FmobileNo,Fadderss,Mname,Moccupation,MmobileNo,Madderss,Condition;
byte[] picture=null;
    public Student_Addmission_From() {
        initComponents();
        setResizable(true);
        setTitle(" Student Addmission Form ");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
        lid();
    }
   public void connection(){
        
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
       st=jcon.createStatement();
       // jcon.close();
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFeaild1ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFeaild2Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFeaild5ContractNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFeaildEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Address = new javax.swing.JTextArea();
        jCheckCondition = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        AddData = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2session = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFeaild6Religion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFeaild7Nationality = new javax.swing.JTextField();
        jLabel15Picture = new javax.swing.JLabel();
        Picture = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        jComboBoxSection = new javax.swing.JComboBox<>();
        jComboBoxGroup = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jTextFeaild1Roll = new javax.swing.JTextField();
        View = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jDateChooser1JO = new com.toedter.calendar.JDateChooser();
        jDateChooser2BD = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField4Fname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField5Foccupation = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField6Fnumber = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1Faddress = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2Maddress = new javax.swing.JTextArea();
        jTextField7MmobileNo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField8MOccupation = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField9Mname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 40, 250, 20);

        jTextFeaild1ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFeaild1ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFeaild1IDActionPerformed(evt);
            }
        });
        jTextFeaild1ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFeaild1IDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFeaild1ID);
        jTextFeaild1ID.setBounds(160, 70, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 130, 130, 30);

        jTextFeaild2Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFeaild2Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFeaild2NameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFeaild2Name);
        jTextFeaild2Name.setBounds(160, 130, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Religion");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 370, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 310, 130, 30);

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Male.setText("Male");
        jPanel1.add(Male);
        Male.setBounds(160, 310, 80, 31);

        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Female.setText("Female");
        jPanel1.add(Female);
        Female.setBounds(240, 310, 110, 31);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Contract No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 190, 130, 30);

        jTextFeaild5ContractNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFeaild5ContractNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFeaild5ContractNoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFeaild5ContractNo);
        jTextFeaild5ContractNo.setBounds(160, 190, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 250, 130, 30);

        jTextFeaildEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFeaildEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFeaildEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFeaildEmail);
        jTextFeaildEmail.setBounds(160, 250, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 390, 130, 30);

        jTextArea1Address.setColumns(20);
        jTextArea1Address.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 370, 190, 70);

        jCheckCondition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckCondition.setText("I Accept All This Condinion");
        jPanel1.add(jCheckCondition);
        jCheckCondition.setBounds(150, 560, 310, 31);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Class");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(370, 130, 170, 30);

        jComboBoxSClass.setBackground(new java.awt.Color(0, 153, 255));
        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseMoved(evt);
            }
        });
        jPanel1.add(jComboBoxSClass);
        jComboBoxSClass.setBounds(550, 130, 210, 30);

        AddData.setBackground(new java.awt.Color(0, 153, 255));
        AddData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddData.setText("Save");
        AddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDataActionPerformed(evt);
            }
        });
        jPanel1.add(AddData);
        AddData.setBounds(60, 650, 110, 30);

        Clear.setBackground(new java.awt.Color(0, 153, 255));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(600, 650, 110, 30);

        Exit.setBackground(new java.awt.Color(0, 153, 255));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(730, 650, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Addmission Date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 480, 170, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Session");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 480, 130, 30);

        jTextField2session.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField2session);
        jTextField2session.setBounds(160, 480, 190, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Date OF Birth");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(370, 420, 170, 30);

        jTextFeaild6Religion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextFeaild6Religion);
        jTextFeaild6Religion.setBounds(550, 370, 210, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Nationality");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(370, 310, 170, 30);

        jTextFeaild7Nationality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextFeaild7Nationality);
        jTextFeaild7Nationality.setBounds(550, 310, 210, 30);

        jLabel15Picture.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15Picture.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15Picture.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel15Picture);
        jLabel15Picture.setBounds(780, 60, 240, 230);

        Picture.setBackground(new java.awt.Color(0, 153, 255));
        Picture.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Picture.setText("Upload Picture");
        Picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PictureActionPerformed(evt);
            }
        });
        jPanel1.add(Picture);
        Picture.setBounds(780, 310, 240, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Section");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(370, 250, 170, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Group");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(370, 190, 170, 30);

        Exit1.setBackground(new java.awt.Color(0, 153, 255));
        Exit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit1.setText("Update");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        jPanel1.add(Exit1);
        Exit1.setBounds(190, 650, 110, 30);

        jComboBoxSection.setBackground(new java.awt.Color(0, 153, 255));
        jComboBoxSection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Section", "A", "B", "C", "D", "E" }));
        jPanel1.add(jComboBoxSection);
        jComboBoxSection.setBounds(550, 250, 210, 30);

        jComboBoxGroup.setBackground(new java.awt.Color(0, 153, 255));
        jComboBoxGroup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Group", "Science", "Commerce", "Arche" }));
        jPanel1.add(jComboBoxGroup);
        jComboBoxGroup.setBounds(550, 190, 210, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Roll No");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(370, 70, 170, 30);

        jTextFeaild1Roll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFeaild1Roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFeaild1RollActionPerformed(evt);
            }
        });
        jTextFeaild1Roll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFeaild1RollKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFeaild1Roll);
        jTextFeaild1Roll.setBounds(550, 70, 130, 30);

        View.setBackground(new java.awt.Color(0, 153, 255));
        View.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View);
        View.setBounds(460, 650, 120, 30);

        Delete.setBackground(new java.awt.Color(0, 153, 255));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(320, 650, 120, 30);

        jDateChooser1JO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser1JO);
        jDateChooser1JO.setBounds(550, 480, 210, 30);

        jDateChooser2BD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser2BD);
        jDateChooser2BD.setBounds(550, 420, 210, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Student ID");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 70, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 770);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Guardian Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Father Name");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(20, 60, 160, 30);

        jTextField4Fname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(jTextField4Fname);
        jTextField4Fname.setBounds(210, 60, 230, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Occupation");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(20, 120, 160, 30);

        jTextField5Foccupation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(jTextField5Foccupation);
        jTextField5Foccupation.setBounds(210, 120, 230, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Mobile Number");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(20, 180, 160, 30);

        jTextField6Fnumber.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField6Fnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6FnumberKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField6Fnumber);
        jTextField6Fnumber.setBounds(210, 180, 230, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Address");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(20, 240, 160, 60);

        jTextArea1Faddress.setColumns(20);
        jTextArea1Faddress.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1Faddress.setRows(5);
        jScrollPane2.setViewportView(jTextArea1Faddress);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(210, 240, 230, 60);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Address");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(20, 530, 160, 60);

        jTextArea2Maddress.setColumns(20);
        jTextArea2Maddress.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea2Maddress.setRows(5);
        jScrollPane3.setViewportView(jTextArea2Maddress);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(210, 530, 230, 60);

        jTextField7MmobileNo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField7MmobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7MmobileNoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField7MmobileNo);
        jTextField7MmobileNo.setBounds(210, 470, 230, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Mobile Number");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(20, 470, 160, 30);

        jTextField8MOccupation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(jTextField8MOccupation);
        jTextField8MOccupation.setBounds(210, 410, 230, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Occupation");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(20, 410, 160, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Mother Name");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(20, 350, 160, 30);

        jTextField9Mname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel3.add(jTextField9Mname);
        jTextField9Mname.setBounds(210, 350, 230, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1040, 0, 480, 770);

        setSize(new java.awt.Dimension(1527, 805));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFeaild2NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFeaild2NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFeaild2NameActionPerformed

    private void jTextFeaildEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFeaildEmailActionPerformed
        //
    }//GEN-LAST:event_jTextFeaildEmailActionPerformed
public void clear(){
jTextFeaild1ID.setText("");
        jTextFeaild2Name.setText("");
        jTextFeaild5ContractNo.setText("");
        jTextFeaildEmail.setText("");
        buttonGroup1.clearSelection();
        jTextArea1Address.setText("");
        jTextField2session.setText("");
        jTextFeaild1Roll.setText("");
        jComboBoxSClass.setSelectedIndex(0);
        jComboBoxGroup.setSelectedIndex(0);
        jComboBoxSection.setSelectedIndex(0);
        jTextFeaild7Nationality.setText("");
        jTextFeaild6Religion.setText("");
        jDateChooser2BD.setDate(null);
        jDateChooser1JO.setDate(null);
        jLabel15Picture.setIcon(null);
        jTextField4Fname.setText("");
        jTextField5Foccupation.setText("");
        jTextField6Fnumber.setText("");
        jTextArea1Faddress.setText("");
        jTextField9Mname.setText("");
        jTextField8MOccupation.setText("");
        jTextField7MmobileNo.setText("");
        jTextArea2Maddress.setText("");
}

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // Clear Button
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    
    public void ShowData(){ 
    Id=jTextFeaild1ID.getText();
    Sname=jTextFeaild2Name.getText();
    contractNo=jTextFeaild5ContractNo.getText();
    email=jTextFeaildEmail.getText();
    if(Male.isSelected()){
    gender="Male";
    }else if(Female.isSelected()){
    gender="Female";
    }else{gender="";}
    address=jTextArea1Address.getText();
    Session=jTextField2session.getText();
    Roll=jTextFeaild1Roll.getText();
    SClass=jComboBoxSClass.getSelectedItem().toString();
    Group=jComboBoxGroup.getSelectedItem().toString();
    Section=jComboBoxSection.getSelectedItem().toString();
    Nationality=jTextFeaild7Nationality.getText();
    Religion=jTextFeaild6Religion.getText();
    Fname=jTextField4Fname.getText();
    Foccupation=jTextField5Foccupation.getText();
    FmobileNo=jTextField6Fnumber.getText();
    Fadderss=jTextArea1Faddress.getText();
    Mname=jTextField9Mname.getText();
    Moccupation=jTextField8MOccupation.getText();
    MmobileNo=jTextField7MmobileNo.getText();
    Madderss=jTextArea1Faddress.getText();
    
   }
    private void AddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDataActionPerformed
        // Add Data
        ShowData();
        ps=null;
        if(jTextFeaild1ID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "ID Is Empty");
        jTextFeaild1ID.requestFocus();
        }else if(Sname.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Name Is Empty");
            jTextFeaild2Name.requestFocus();
        }else if(contractNo.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Contract Number Is Empty");
            jTextFeaild5ContractNo.requestFocus();
        }else if(email.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Email Is Empty");
            jTextFeaildEmail.requestFocus();
        }else if(gender.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Select  Gender");
            Male.requestFocus();
        }else if(address.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Address Is Empty");
            jTextArea1Address.requestFocus();
        }else if(Session.isEmpty()){
            JOptionPane.showMessageDialog(this,"Session IS Empty");
            jTextField2session.requestFocus();
        }else if(Roll.isEmpty()){
        JOptionPane.showMessageDialog(this," Roll Number Is Empty ");
        jTextFeaild1Roll.requestFocus();
        }else if(jComboBoxSClass.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Select Student Class ");
        jComboBoxSClass.requestFocus();
        }else if(jComboBoxSection.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Select Student Section ");
        jComboBoxSection.requestFocus();
        }else if(jComboBoxGroup.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Select Student Group ");
        jComboBoxGroup.requestFocus();
        }else if(Nationality.isEmpty()){
        JOptionPane.showMessageDialog(this," Student Nationality Is Empty ");
        jTextFeaild7Nationality.requestFocus();
        }else if(Religion.isEmpty()){
        JOptionPane.showMessageDialog(this," Student Religion Is Empty ");
        jTextFeaild6Religion.requestFocus();
        }else if(jDateChooser2BD==null){
        JOptionPane.showMessageDialog(this," Student Birth Date Is Empty");
        jDateChooser2BD.requestFocus();
        }else if(jDateChooser1JO==null){
        JOptionPane.showMessageDialog(this," Student Addmission Date Is Empty");
        jDateChooser1JO.requestFocus();
        }else if(Fname.isEmpty()){
        JOptionPane.showMessageDialog(this,"Student Father Name  Empty ");
        jTextField4Fname.requestFocus();
        }else if(Foccupation.isEmpty()){
        JOptionPane.showMessageDialog(this,"Father Occupation is  Empty ");
        jTextField5Foccupation.requestFocus();
        }else if(FmobileNo.isEmpty()){
        JOptionPane.showMessageDialog(this,"Father Mobile Number is Empty ");
        jTextField7MmobileNo.requestFocus();
        }else if(Fadderss.isEmpty()){
        JOptionPane.showMessageDialog(this,"Father Address is  Empty ");
        jTextArea1Faddress.requestFocus();
        }else if(Mname.isEmpty()){
        JOptionPane.showMessageDialog(this,"Student Mother Name  Empty ");
        jTextField9Mname.requestFocus();
        }else if(Moccupation.isEmpty()){
        JOptionPane.showMessageDialog(this,"Mother Occupation is  Empty ");
        jTextField8MOccupation.requestFocus();
        }else if(contractNo.isEmpty()){
        JOptionPane.showMessageDialog(this,"Mother Mobile Number is Empty ");
        jTextField7MmobileNo.requestFocus();
        }else if(Madderss.isEmpty()){
        JOptionPane.showMessageDialog(this,"Mother Address is  Empty ");
        jTextArea2Maddress.requestFocus();
        }else if(jLabel15Picture==null){
        JOptionPane.showMessageDialog(this,"Picture is  Empty ");
        Picture.requestFocus();
        }else if(!jCheckCondition.isSelected()){
        JOptionPane.showMessageDialog(this,"Please You Confirm On All Terms And Condition ");
        jCheckCondition.requestFocus();
        }else{            try {
        connection(); // Database Connection Methode.
        
        String se=null;
        se="select `Id` from `student_admission` WHERE `Id`=?";
        ps=jcon.prepareStatement(se);
        ps.setString(1,jTextFeaild1ID.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        JOptionPane.showMessageDialog(this, " This Id Is Aleardly Insert Please Change This Id");
        jTextFeaild1ID.requestFocus();
        }else{
        String inQueary=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        BirthDate=sdf.format(jDateChooser2BD.getDate()).toString();
        AddDate=sdf.format(jDateChooser1JO.getDate()).toString();
        inQueary = "INSERT INTO `student_admission`(`Id`,`Name`,`ContractNo`,`Email`,`Gender`,`Address`,`Session`,`Roll_NO`,`Class`,`Group`,`Section`,`Nationality`,`Religion`,`BirthDate`,`AddmissionDate`,`Picture`,`FatherName`,`Father_Occupation`,`Father_MobileNo`,`Father_Address`,`Mother_Name`,`Mother_Occupation`,`Mother_MobileNo`,`Mother_Address`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps=jcon.prepareStatement(inQueary);
            ps.setString(1,Id);
            ps.setString(2,Sname);
            ps.setString(3,contractNo);
            ps.setString(4,email);
            ps.setString(5,gender);
            ps.setString(6,address);
            ps.setString(7,Session);
            ps.setString(8,Roll);
            ps.setString(9,SClass);
            ps.setString(10,Group);
            ps.setString(11,Section);
            ps.setString(12,Nationality);
            ps.setString(13,Religion);
            ps.setString(14,BirthDate);
            ps.setString(15,AddDate);
            ps.setBytes(16,picture);
            ps.setString(17,Fname);
            ps.setString(18,Foccupation);
            ps.setString(19,FmobileNo);
            ps.setString(20,Fadderss);
            ps.setString(21,Mname);
            ps.setString(22,Moccupation);
            ps.setString(23,MmobileNo);
            ps.setString(24,Madderss);
            boolean b=ps.execute();
            if(!b){
                JOptionPane.showMessageDialog(this," Operation Successfully...");
            }else{
                JOptionPane.showMessageDialog(this," Operation Filed...");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
        }}
        } catch (SQLException ex) {
                Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
            }}lid();
    }//GEN-LAST:event_AddDataActionPerformed
    
    public void lid(){
    connection();
    String l=null;
    l="select `Id` from `student_admission`";
    try {
        ps=jcon.prepareStatement(l);
        rs=ps.executeQuery();
        rs.last();
        jLabel7.setText("Last Entered Id = "+rs.getString("Id"));
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    private void jTextFeaild1IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFeaild1IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFeaild1IDActionPerformed

    private void PictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PictureActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon( new ImageIcon(filename).getImage().getScaledInstance(jLabel15Picture.getWidth(),jLabel15Picture.getHeight(),Image.SCALE_SMOOTH));
        jLabel15Picture.setIcon(icon);
        try{
        File image = new File(filename);
        FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            byte[] by = new byte[2048];
            for(int readNum;(readNum=fis.read(by))!=-1;){
            bao.write(by, 0, readNum);
            }
            picture=bao.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);}
    }//GEN-LAST:event_PictureActionPerformed

    private void jTextFeaild1RollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFeaild1RollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFeaild1RollActionPerformed

    private void jComboBoxSClassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassMouseMoved
void imgUp(byte pic[] ){
 picture=pic;
}
    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        if(jTextFeaild1ID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," No Recond Found"
                + "Please At First You View Student Information Befor Update ");
        }else{
        ShowData();
        ps=null;
        if(jTextFeaild1ID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "ID Is Empty");
        jTextFeaild1ID.requestFocus();
        }else if(Sname.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Name Is Empty");
            jTextFeaild2Name.requestFocus();
        }else if(contractNo.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Contract Number Is Empty");
            jTextFeaild5ContractNo.requestFocus();
        }else if(email.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Email Is Empty");
            jTextFeaildEmail.requestFocus();
        }else if(gender.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Select  Gender");
            Male.requestFocus();
        }else if(address.isEmpty()){
            JOptionPane.showMessageDialog(this,"Student Address Is Empty");
            jTextArea1Address.requestFocus();
        }else if(Session.isEmpty()){
            JOptionPane.showMessageDialog(this,"Session IS Empty");
            jTextField2session.requestFocus();
        }else if(Roll.isEmpty()){
        JOptionPane.showMessageDialog(this," Roll Number Is Empty ");
        jTextFeaild1Roll.requestFocus();
        }else if(SClass.isEmpty()){
        JOptionPane.showMessageDialog(this," Select Student Class ");
        jComboBoxSClass.requestFocus();
        }else if(Section.isEmpty()){
        JOptionPane.showMessageDialog(this," Select Student Section ");
        jComboBoxSection.requestFocus();
        }else if(Group.isEmpty()){
        JOptionPane.showMessageDialog(this," Select Student Group ");
        jComboBoxGroup.requestFocus();
        }else if(Nationality.isEmpty()){
        JOptionPane.showMessageDialog(this," Student Nationality Is Empty ");
        jTextFeaild7Nationality.requestFocus();
        }else if(Religion.isEmpty()){
        JOptionPane.showMessageDialog(this," Student Religion Is Empty ");
        jTextFeaild6Religion.requestFocus();
        }else if(Fname.isEmpty()){
        JOptionPane.showMessageDialog(this,"Student Father Name  Empty ");
        jTextField4Fname.requestFocus();
        }else if(Foccupation.isEmpty()){
        JOptionPane.showMessageDialog(this,"Father Occupation is  Empty ");
        jTextField5Foccupation.requestFocus();
        }else if(FmobileNo.isEmpty()){
        JOptionPane.showMessageDialog(this,"Father Mobile Number is Empty ");
        jTextField7MmobileNo.requestFocus();
        }else if(Fadderss.isEmpty()){
        JOptionPane.showMessageDialog(this,"Father Address is  Empty ");
        jTextArea1Faddress.requestFocus();
        }else if(Mname.isEmpty()){
        JOptionPane.showMessageDialog(this,"Student Mother Name  Empty ");
        jTextField9Mname.requestFocus();
        }else if(Moccupation.isEmpty()){
        JOptionPane.showMessageDialog(this,"Mother Occupation is  Empty ");
        jTextField8MOccupation.requestFocus();
        }else if(contractNo.isEmpty()){
        JOptionPane.showMessageDialog(this,"Mother Mobile Number is Empty ");
        jTextField7MmobileNo.requestFocus();
        }else if(Madderss.isEmpty()){
        JOptionPane.showMessageDialog(this,"Mother Address is  Empty ");
        jTextArea2Maddress.requestFocus();
        }else if(jLabel15Picture==null){
        JOptionPane.showMessageDialog(this,"Picture is  Empty ");
        Picture.requestFocus();
        }else{
        connection();
         SimpleDateFormat sfd=new SimpleDateFormat("yyyy-MM-dd");
         //JoinDate=sfd.format(jDateChooser1JoinDate.getDate()).toString();
         BirthDate=sfd.format(jDateChooser2BD.getDate()).toString();
         AddDate=sfd.format(jDateChooser1JO.getDate()).toString();
        String up=null;
        up="UPDATE `student_admission` SET `Name` = ?,`ContractNo` = ?,`Email` = ?,`Gender` = ?,`Address` = ?,`Session` = ?,`Roll_NO` = ?,`Class` = ?,`Group` = ?,`Section` = ?,`Nationality` = ?,`Religion` = ?,`BirthDate` = ?,`AddmissionDate` = ?,`Picture` = ?,`FatherName` = ?,`Father_Occupation` = ?,`Father_MobileNo` = ?,`Father_Address` = ?,`Mother_Name` = ?,`Mother_Occupation` = ?,`Mother_MobileNo` = ?,`Mother_Address` = ? WHERE `Id` = "+jTextFeaild1ID.getText();
     try {
        ps=jcon.prepareStatement(up);
        ps.setString(1,Sname);
        ps.setString(2,contractNo);
        ps.setString(3,email);
        ps.setString(4,gender);
        ps.setString(5,address);
        ps.setString(6,Session);
        ps.setString(7,Roll);
        ps.setString(8,SClass);
        ps.setString(9,Group);
        ps.setString(10,Section);
        ps.setString(11,Nationality);
        ps.setString(12,Religion);
        ps.setString(13,BirthDate);
        ps.setString(14,AddDate);
        ps.setBytes(15,picture);
        ps.setString(16,Fname);
        ps.setString(17,Foccupation);
        ps.setString(18,FmobileNo);
        ps.setString(19,Fadderss);
        ps.setString(20,Mname);
        ps.setString(21,Moccupation);
        ps.setString(22,MmobileNo);
        ps.setString(23,Madderss);
        int b=ps.executeUpdate();
        if(b==1){
        JOptionPane.showMessageDialog(this,"Update Successfull...");
        }else{
        JOptionPane.showMessageDialog(this,"Update Filed...");
        }
    } catch (SQLException ex) {
        //Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this,ex);
    }}}
    }//GEN-LAST:event_Exit1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
    if(jTextFeaild1ID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Please At First You Enter Id");
        }else{
        try {
        ShowData();
        connection();
        String se=null;
        se="select *from `student_admission` WHERE `Id`=?";
        ps=jcon.prepareStatement(se);
        ps.setString(1,Id);
        rs=ps.executeQuery();
        if(rs.next()){
        jTextFeaild1ID.setText(rs.getString("Id"));
        jTextFeaild2Name.setText(rs.getString("Name"));
        jTextFeaild5ContractNo.setText(rs.getString("ContractNo"));
        jTextFeaildEmail.setText(rs.getString("Email"));
        if(rs.getString("Gender").equals("Male")){
        Male.setSelected(true);
        }else if(rs.getString("Gender").equals("Female")){
        Female.setSelected(true);
        }
        jTextArea1Address.setText(rs.getString("Address"));
        jTextField2session.setText(rs.getString("Session"));
        jTextFeaild1Roll.setText(rs.getString("Roll_NO"));
        jComboBoxSClass.setSelectedItem(rs.getString("Class"));
        jComboBoxGroup.setSelectedItem(rs.getString("Group"));
        jComboBoxSection.setSelectedItem(rs.getString("Section"));
        jTextFeaild7Nationality.setText(rs.getString("Nationality"));
        jTextFeaild6Religion.setText(rs.getString("Religion"));
        jDateChooser2BD.setDate(rs.getDate("BirthDate"));
        jDateChooser1JO.setDate(rs.getDate("AddmissionDate"));
        byte pic[]=rs.getBytes("Picture");
        imgUp(pic );
        ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel15Picture.getWidth(),jLabel15Picture.getHeight(),Image.SCALE_SMOOTH));
        jLabel15Picture.setIcon(im);
        jTextField4Fname.setText(rs.getString("FatherName"));
        jTextField5Foccupation.setText(rs.getString("Father_Occupation"));
        jTextField6Fnumber.setText(rs.getString("Father_MobileNo"));
        jTextArea1Faddress.setText(rs.getString("Father_Address"));
        jTextField9Mname.setText(rs.getString("Mother_Name"));
        jTextField8MOccupation.setText(rs.getString("Mother_Occupation"));
        jTextField7MmobileNo.setText(rs.getString("Mother_MobileNo"));
        jTextArea2Maddress.setText(rs.getString("Mother_Address"));
        boolean b=ps.execute();
        if(b){
        JOptionPane.showMessageDialog(this," Data View Successfully..");
        }else{
        JOptionPane.showMessageDialog(this," Data View Filed..");
        }
        }else{
        JOptionPane.showMessageDialog(this," Your ID Is Rong");
        jTextFeaild1ID.requestFocus();
        jTextFeaild1ID.setText("");
        }
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,ex);
    }}  
    }//GEN-LAST:event_ViewActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        if(jTextFeaild1ID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," No Record Found");
        }else{
        int i=JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Record");
        if(i==0){
        connection();
        String deletes=null;
        deletes ="DELETE FROM `student_admission` WHERE `Id`=?";
    try {
        ps=jcon.prepareStatement(deletes);
        ps.setString(1,jTextFeaild1ID.getText());
        int b=ps.executeUpdate();
        if(b==1){
           clear(); 
        JOptionPane.showMessageDialog(this," Data Delete Stccessfully...");
        }else{
        JOptionPane.showMessageDialog(this," Data Delete Filed...");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }}}    
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTextFeaild1IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFeaild1IDKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFeaild1IDKeyTyped

    private void jTextFeaild5ContractNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFeaild5ContractNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFeaild5ContractNoKeyTyped

    private void jTextFeaild1RollKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFeaild1RollKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFeaild1RollKeyTyped

    private void jTextField6FnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6FnumberKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6FnumberKeyTyped

    private void jTextField7MmobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7MmobileNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7MmobileNoKeyTyped


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
            java.util.logging.Logger.getLogger(Student_Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Addmission_From().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddData;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit1;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton Picture;
    private javax.swing.JButton View;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckCondition;
    private javax.swing.JComboBox<String> jComboBoxGroup;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private javax.swing.JComboBox<String> jComboBoxSection;
    private com.toedter.calendar.JDateChooser jDateChooser1JO;
    private com.toedter.calendar.JDateChooser jDateChooser2BD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15Picture;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1Address;
    private javax.swing.JTextArea jTextArea1Faddress;
    private javax.swing.JTextArea jTextArea2Maddress;
    private javax.swing.JTextField jTextFeaild1ID;
    private javax.swing.JTextField jTextFeaild1Roll;
    private javax.swing.JTextField jTextFeaild2Name;
    private javax.swing.JTextField jTextFeaild5ContractNo;
    private javax.swing.JTextField jTextFeaild6Religion;
    private javax.swing.JTextField jTextFeaild7Nationality;
    private javax.swing.JTextField jTextFeaildEmail;
    private javax.swing.JTextField jTextField2session;
    private javax.swing.JTextField jTextField4Fname;
    private javax.swing.JTextField jTextField5Foccupation;
    private javax.swing.JTextField jTextField6Fnumber;
    private javax.swing.JTextField jTextField7MmobileNo;
    private javax.swing.JTextField jTextField8MOccupation;
    private javax.swing.JTextField jTextField9Mname;
    // End of variables declaration//GEN-END:variables


}
