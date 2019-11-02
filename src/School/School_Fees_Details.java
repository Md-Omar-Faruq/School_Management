
package School;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class School_Fees_Details extends javax.swing.JFrame {
Connection jcon=null;
PreparedStatement ps=null;
Statement st=null;
ResultSet rs=null;
String Sid,Sname,Sclass;
int ExamF,BusF,LibaryF,AcademicF,HostelF,OthersF,TotalF;
    public School_Fees_Details() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
        showDate();
        selectID();
    }
    public void showDate(){
    connection();
    clear();
    DefaultTableModel Tmodel=(DefaultTableModel)jTable1.getModel();
    String s="SELECT *FROM `studentfeesdetails`";
    try {
        ps=jcon.prepareStatement(s);
        rs=ps.executeQuery();
        while(rs.next()){
        Tmodel.addRow(new Object[]{rs.getInt("StudentID"),rs.getString("Name"),rs.getString("Class"),rs.getInt("ExamFees"),rs.getInt("BusFees"),rs.getInt("LibaryFees"),rs.getInt("HostelFees"),rs.getInt("AcademicFees"),rs.getInt("OthersFees"),rs.getInt("TotalFees")});
        }
    } catch (SQLException ex) {
        Logger.getLogger(School_Fees_Details.class.getName()).log(Level.SEVERE, null, ex);
    }}
    public void clear(){
    jComboBox1StudentID.setSelectedIndex(0);
    jTextField1SName.setText("");
    jTextField2Sclass.setText("");
    jTextField3ExamFees.setText("");
    jTextField4BusFees.setText("");
    jTextField5LiberyFees.setText("");
    jTextFeild6AcademicFees.setText("");
    jTextField7HostelFees.setText("");
    jTextField8OtherFees.setText("");
    jTextField9TotalFees.setText("");
    DefaultTableModel Tmodel=(DefaultTableModel)jTable1.getModel();
    Tmodel.setRowCount(0);
    }
public void connection(){
 try {
  
    jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    //st=jcon.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void selectID(){
String selectde="SELECT `Id` FROM `student_admission`";
    try {
        st=jcon.createStatement();
        rs=st.executeQuery(selectde);
        while(rs.next()){
        jComboBox1StudentID.addItem(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(School_Fees_Details.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void Initilize(){
Sid=jComboBox1StudentID.getSelectedItem().toString();
Sname=jTextField1SName.getText();
Sclass=jTextField2Sclass.getText();
ExamF=Integer.parseInt(jTextField3ExamFees.getText());
BusF=Integer.parseInt(jTextField4BusFees.getText());
LibaryF=Integer.parseInt(jTextField5LiberyFees.getText());
AcademicF=Integer.parseInt(jTextFeild6AcademicFees.getText());
HostelF=Integer.parseInt(jTextField7HostelFees.getText());
OthersF=Integer.parseInt(jTextField8OtherFees.getText());
TotalF=ExamF+BusF+LibaryF+AcademicF+HostelF+OthersF;
}
public void Add(){
//  
if(jComboBox1StudentID.getSelectedIndex()==0){
JOptionPane.showMessageDialog(this,"Please At First You Selected ID ");
jComboBox1StudentID.requestFocus();
}else if(jTextField3ExamFees.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Exam Fees Is Empty ");
jTextField3ExamFees.requestFocus();
}else if(jTextField4BusFees.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Bus Fees Is Empty");
jTextField4BusFees.requestFocus();
}else if(jTextField5LiberyFees.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Libary Fees Is Empty");
jTextField5LiberyFees.requestFocus();
}else if(jTextFeild6AcademicFees.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Academic Fees Is Empty");
jTextFeild6AcademicFees.requestFocus();
}else if(jTextField7HostelFees.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Hostel Fees Is Empty");
jTextField7HostelFees.requestFocus();
}else if(jTextField8OtherFees.getText().isEmpty()){
JOptionPane.showMessageDialog(this,"Others Fees Is Empty");
jTextField8OtherFees.requestFocus();
}else{
//jTextField9TotalFees.setText(""+TotalF);
Initilize();
connection();
String se=null;
se="SELECT `StudentID`,`Class` FROM `studentfeesdetails` WHERE `StudentID` = ? && `Class` = ?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,Sid);
        ps.setString(2,Sclass);
        rs=ps.executeQuery();
        if(rs.next()){
        JOptionPane.showMessageDialog(this," This Student ID is Aleardly Insert Please Change Your Student ID ");
        jComboBox1StudentID.requestFocus();
        }else{
        String ADD=null;
        ADD="INSERT INTO `studentfeesdetails`(`StudentID`,`Name`,`Class`,`ExamFees`,`BusFees`,`LibaryFees`,`AcademicFees`,`HostelFees`,`OthersFees`,`TotalFees`) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {  
           ps=jcon.prepareStatement(ADD);
           ps.setString(1,Sid);
           ps.setString(2,Sname);
           ps.setString(3,Sclass);
           ps.setInt(4,ExamF);
           ps.setInt(5,BusF);
           ps.setInt(6,LibaryF);
           ps.setInt(7,AcademicF);
           ps.setInt(8,HostelF);
           ps.setInt(9,OthersF);
           ps.setInt(10,Integer.parseInt(""+jTextField9TotalFees.getText()));
           boolean b=ps.execute();
           if(!b){
           JOptionPane.showMessageDialog(this,"Data Save Successfully..");
           DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
           dtm.setRowCount(0);
           showDate();
           }else{
           JOptionPane.showMessageDialog(this,"Data Save Filed..");
           }
        } catch (SQLException ex) {
            Logger.getLogger(School_Fees_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    } catch (SQLException ex) {
        Logger.getLogger(School_Fees_Details.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2Sclass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1SName = new javax.swing.JTextField();
        jComboBox1StudentID = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField3ExamFees = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4BusFees = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5LiberyFees = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFeild6AcademicFees = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8OtherFees = new javax.swing.JTextField();
        jTextField9TotalFees = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField7HostelFees = new javax.swing.JTextField();
        ClearData = new javax.swing.JButton();
        ShowData = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        UpdateData = new javax.swing.JButton();
        DeleteData = new javax.swing.JButton();
        PrintData = new javax.swing.JButton();
        PrintData1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1970, 40);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Student Fees Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        jTextField2Sclass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2Sclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2SclassActionPerformed(evt);
            }
        });
        jTextField2Sclass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2SclassKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2Sclass);
        jTextField2Sclass.setBounds(210, 170, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Student ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 70, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Student Class");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 170, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Student Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 120, 120, 30);

        jTextField1SName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1SName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1SNameActionPerformed(evt);
            }
        });
        jTextField1SName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SNameKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1SName);
        jTextField1SName.setBounds(210, 120, 240, 30);

        jComboBox1StudentID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1StudentID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        jComboBox1StudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1StudentIDActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1StudentID);
        jComboBox1StudentID.setBounds(210, 70, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Exam Fees");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 220, 120, 30);

        jTextField3ExamFees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3ExamFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3ExamFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ExamFeesActionPerformed(evt);
            }
        });
        jTextField3ExamFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3ExamFeesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3ExamFeesKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField3ExamFees);
        jTextField3ExamFees.setBounds(210, 220, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Bus Fees");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 270, 120, 30);

        jTextField4BusFees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4BusFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4BusFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4BusFeesActionPerformed(evt);
            }
        });
        jTextField4BusFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4BusFeesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4BusFeesKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4BusFees);
        jTextField4BusFees.setBounds(210, 270, 240, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Libery Fees");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 320, 120, 30);

        jTextField5LiberyFees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5LiberyFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5LiberyFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5LiberyFeesActionPerformed(evt);
            }
        });
        jTextField5LiberyFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5LiberyFeesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5LiberyFeesKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5LiberyFees);
        jTextField5LiberyFees.setBounds(210, 320, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Academic Fees");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 370, 120, 30);

        jTextFeild6AcademicFees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFeild6AcademicFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFeild6AcademicFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFeild6AcademicFeesActionPerformed(evt);
            }
        });
        jTextFeild6AcademicFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFeild6AcademicFeesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFeild6AcademicFeesKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFeild6AcademicFees);
        jTextFeild6AcademicFees.setBounds(210, 370, 240, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Others Fees");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 470, 120, 30);

        jTextField8OtherFees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8OtherFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8OtherFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8OtherFeesActionPerformed(evt);
            }
        });
        jTextField8OtherFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8OtherFeesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8OtherFeesKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField8OtherFees);
        jTextField8OtherFees.setBounds(210, 470, 240, 30);

        jTextField9TotalFees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9TotalFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9TotalFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9TotalFeesActionPerformed(evt);
            }
        });
        jTextField9TotalFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9TotalFeesKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField9TotalFees);
        jTextField9TotalFees.setBounds(210, 520, 240, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Total Fees");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 520, 120, 30);

        jTable1.setBackground(new java.awt.Color(0, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Class", "Exam Fees", "Bus Fees", "Libery Fees", "Academic Fees", "Hostel Fees", "Others Fees", "Total Fees"
            }
        ));
        jTable1.setAlignmentX(10);
        jTable1.setAlignmentY(10);
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setAutoscrolls(false);
        jTable1.setInheritsPopupMenu(true);
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(10);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(500, 30, 1400, 810);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Hostel Fees");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 420, 120, 30);

        jTextField7HostelFees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7HostelFees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7HostelFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7HostelFeesActionPerformed(evt);
            }
        });
        jTextField7HostelFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7HostelFeesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7HostelFeesKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField7HostelFees);
        jTextField7HostelFees.setBounds(210, 420, 240, 30);

        ClearData.setBackground(new java.awt.Color(255, 0, 0));
        ClearData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearData.setForeground(new java.awt.Color(255, 255, 255));
        ClearData.setText("Clear");
        ClearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearDataActionPerformed(evt);
            }
        });
        jPanel2.add(ClearData);
        ClearData.setBounds(320, 700, 120, 30);

        ShowData.setBackground(new java.awt.Color(255, 0, 0));
        ShowData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShowData.setForeground(new java.awt.Color(255, 255, 255));
        ShowData.setText("View");
        ShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataActionPerformed(evt);
            }
        });
        jPanel2.add(ShowData);
        ShowData.setBounds(50, 700, 120, 30);

        ADD.setBackground(new java.awt.Color(255, 0, 0));
        ADD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setText("Save");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel2.add(ADD);
        ADD.setBounds(50, 630, 120, 30);

        UpdateData.setBackground(new java.awt.Color(255, 0, 0));
        UpdateData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateData.setForeground(new java.awt.Color(255, 255, 255));
        UpdateData.setText("Update");
        UpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDataActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateData);
        UpdateData.setBounds(190, 630, 110, 30);

        DeleteData.setBackground(new java.awt.Color(255, 0, 0));
        DeleteData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteData.setForeground(new java.awt.Color(255, 255, 255));
        DeleteData.setText("Delete");
        DeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDataActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteData);
        DeleteData.setBounds(320, 630, 110, 30);

        PrintData.setBackground(new java.awt.Color(255, 0, 0));
        PrintData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PrintData.setForeground(new java.awt.Color(255, 255, 255));
        PrintData.setText("Exit");
        PrintData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintDataActionPerformed(evt);
            }
        });
        jPanel2.add(PrintData);
        PrintData.setBounds(190, 770, 110, 30);

        PrintData1.setBackground(new java.awt.Color(255, 0, 0));
        PrintData1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PrintData1.setForeground(new java.awt.Color(255, 255, 255));
        PrintData1.setText("Print");
        PrintData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintData1ActionPerformed(evt);
            }
        });
        jPanel2.add(PrintData1);
        PrintData1.setBounds(190, 700, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 1970, 860);

        setSize(new java.awt.Dimension(1993, 954));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2SclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2SclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2SclassActionPerformed

    private void jTextField1SNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1SNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SNameActionPerformed

    private void jTextField3ExamFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ExamFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ExamFeesActionPerformed

    private void jTextField4BusFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4BusFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4BusFeesActionPerformed

    private void jTextField5LiberyFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5LiberyFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5LiberyFeesActionPerformed

    private void jTextFeild6AcademicFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFeild6AcademicFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFeild6AcademicFeesActionPerformed

    private void jTextField8OtherFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8OtherFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8OtherFeesActionPerformed

    private void jTextField9TotalFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9TotalFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9TotalFeesActionPerformed

    private void jComboBox1StudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1StudentIDActionPerformed
        // TODO add your handling code here:
        connection();
        String selected="SELECT `Name`,`Class` FROM `student_admission` WHERE `Id`=?";
    try {
        ps=jcon.prepareStatement(selected);
        ps.setString(1,jComboBox1StudentID.getSelectedItem().toString());
        rs=ps.executeQuery();
        if(rs.next()){
        jTextField1SName.setText(rs.getString(1));
        jTextField2Sclass.setText(rs.getString(2));
        }
    } catch (SQLException ex) {
        Logger.getLogger(School_Fees_Details.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jComboBox1StudentIDActionPerformed

    private void ClearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearDataActionPerformed
        // Button OF Clear 
        clear();
       
        
    }//GEN-LAST:event_ClearDataActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // Save Data
        Add();
    }//GEN-LAST:event_ADDActionPerformed

    private void PrintDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintDataActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_PrintDataActionPerformed

    private void DeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDataActionPerformed
      if(jTable1.getSelectedRow()==-1){
        JOptionPane.showMessageDialog(this,"Please At First You Select Table Coloum When You Wanted To Delete Wich Coloum ");
        
        }else{
        int d=JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Record");
        if(d==0){
        connection();
        String de=null;
        de="DELETE FROM `studentfeesdetails` WHERE `StudentID`=?";
            try {
                ps=jcon.prepareStatement(de);
                ps.setString(1,jComboBox1StudentID.getSelectedItem().toString());
                int b=ps.executeUpdate();
                if(b==0){
                DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
                dt.setRowCount(0);
                showDate();
                JOptionPane.showMessageDialog(this," Data Delete Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data Delete Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
            }}}
        
        DefaultTableModel Tmodel=(DefaultTableModel)jTable1.getModel();
      Tmodel.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_DeleteDataActionPerformed

    private void ShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataActionPerformed
        // TODO add your handling code here:
         showDate();
    }//GEN-LAST:event_ShowDataActionPerformed

    private void UpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDataActionPerformed
        // Button OF Update
        
        if(jTable1.getSelectedRow()==-1){
        JOptionPane.showMessageDialog(this," No Record Found "
        + " Please At First You Select Record ");
        }else{  
    connection();
    String up="UPDATE `studentfeesdetails` SET `StudentID`=?,`Name`=?,`Class`=?,`ExamFees`=?,`BusFees`=?,`LibaryFees`=?,`HostelFees`=?,`AcademicFees`=?,`OthersFees`=?,`TotalFees`=? WHERE `StudentID`="+jComboBox1StudentID.getSelectedIndex();
              try {
           ps=jcon.prepareStatement(up);
           ps.setString(1,Sid);
           ps.setString(2,Sname);
           ps.setString(3,Sclass);
           ps.setInt(4,ExamF);
           ps.setInt(5,BusF);
           ps.setInt(6,LibaryF);
           ps.setInt(7,AcademicF);
           ps.setInt(8,HostelF);
           ps.setInt(9,OthersF);
           ps.setInt(10,Integer.parseInt(""+jTextField9TotalFees.getText()));
           int i=ps.executeUpdate();
            if(i==1){
                DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
                dt.setRowCount(0);
                showDate();
            JOptionPane.showMessageDialog(this," Data Update Successfully...");
            }else{
            JOptionPane.showMessageDialog(this," Data Update Filed...");
            }
              } catch (SQLException ex) {
                  Logger.getLogger(School_Fees_Details.class.getName()).log(Level.SEVERE, null, ex);
              }}
    }//GEN-LAST:event_UpdateDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Table Mouse Click
   DefaultTableModel Tmodel=(DefaultTableModel)jTable1.getModel();
   /*int m;
   int p=Integer.parseInt( Tmodel.getValueAt(jTable1.getSelectedRow(),0).toString());
        for (int i = 1; i < jComboBox1StudentID.getItemCount(); i++) {
           if(p==(Integer.parseInt(jComboBox1StudentID.getItemAt(i).toString()))){
           jComboBox1StudentID.setSelectedIndex(i);
           }}
        jComboBox1StudentID.setSelectedIndex(p);*/
        jComboBox1StudentID.setSelectedItem(Tmodel.getValueAt(jTable1.getSelectedRow(),0).toString());
        jTextField1SName.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),1).toString());
        jTextField2Sclass.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),2).toString());
        jTextField3ExamFees.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),3).toString());
        jTextField4BusFees.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),4).toString());
        jTextField5LiberyFees.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),5).toString());
        jTextFeild6AcademicFees.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),6).toString());
        jTextField7HostelFees.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),7).toString());
        jTextField8OtherFees.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),8).toString());
        jTextField9TotalFees.setText(Tmodel.getValueAt(jTable1.getSelectedRow(),9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField7HostelFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7HostelFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7HostelFeesActionPerformed

    private void PrintData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintData1ActionPerformed
        // TODO add your handling code here:
            try {
        boolean b=jTable1.print();
        if(b){
            JOptionPane.showMessageDialog(this," Print Success...");
        }else{
            JOptionPane.showMessageDialog(this," Printing Proccess...");
        }
    } catch (PrinterException ex) {
        Logger.getLogger(Teacher_Record.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_PrintData1ActionPerformed

    private void jTextField8OtherFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8OtherFeesKeyReleased
        // Mouse Releas By Total 
        
        int Total = 0;
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }else{
        if(!jTextField8OtherFees.getText().isEmpty()){
        Initilize();
        }
        Total=ExamF+BusF+LibaryF+AcademicF+HostelF+OthersF;
        jTextField9TotalFees.setText(""+Total);
        }
    }//GEN-LAST:event_jTextField8OtherFeesKeyReleased

    private void jTextField3ExamFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3ExamFeesKeyReleased
        
    }//GEN-LAST:event_jTextField3ExamFeesKeyReleased

    private void jTextField4BusFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4BusFeesKeyReleased
         
    }//GEN-LAST:event_jTextField4BusFeesKeyReleased

    private void jTextField5LiberyFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5LiberyFeesKeyReleased
           
    }//GEN-LAST:event_jTextField5LiberyFeesKeyReleased

    private void jTextFeild6AcademicFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFeild6AcademicFeesKeyReleased
             
    }//GEN-LAST:event_jTextFeild6AcademicFeesKeyReleased

    private void jTextField7HostelFeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7HostelFeesKeyReleased
      
    }//GEN-LAST:event_jTextField7HostelFeesKeyReleased

    private void jTextField3ExamFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3ExamFeesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3ExamFeesKeyTyped

    private void jTextField4BusFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4BusFeesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4BusFeesKeyTyped

    private void jTextField5LiberyFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5LiberyFeesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5LiberyFeesKeyTyped

    private void jTextFeild6AcademicFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFeild6AcademicFeesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFeild6AcademicFeesKeyTyped

    private void jTextField7HostelFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7HostelFeesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7HostelFeesKeyTyped

    private void jTextField8OtherFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8OtherFeesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8OtherFeesKeyTyped

    private void jTextField9TotalFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9TotalFeesKeyTyped
        // TODO add your handling code here:
            evt.consume();
    }//GEN-LAST:event_jTextField9TotalFeesKeyTyped

    private void jTextField1SNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SNameKeyTyped
        // TODO add your handling code here:
            evt.consume();
    }//GEN-LAST:event_jTextField1SNameKeyTyped

    private void jTextField2SclassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2SclassKeyTyped
        // T
            evt.consume();
    }//GEN-LAST:event_jTextField2SclassKeyTyped


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
            java.util.logging.Logger.getLogger(School_Fees_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School_Fees_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School_Fees_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School_Fees_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new School_Fees_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton ClearData;
    private javax.swing.JButton DeleteData;
    private javax.swing.JButton PrintData;
    private javax.swing.JButton PrintData1;
    private javax.swing.JButton ShowData;
    private javax.swing.JButton UpdateData;
    private javax.swing.JComboBox<String> jComboBox1StudentID;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFeild6AcademicFees;
    private javax.swing.JTextField jTextField1SName;
    private javax.swing.JTextField jTextField2Sclass;
    private javax.swing.JTextField jTextField3ExamFees;
    private javax.swing.JTextField jTextField4BusFees;
    private javax.swing.JTextField jTextField5LiberyFees;
    private javax.swing.JTextField jTextField7HostelFees;
    private javax.swing.JTextField jTextField8OtherFees;
    private javax.swing.JTextField jTextField9TotalFees;
    // End of variables declaration//GEN-END:variables
}
