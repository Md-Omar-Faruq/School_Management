
package School;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Student_Attendence extends javax.swing.JFrame {
Connection jcon=null;
PreparedStatement ps=null;
Statement st=null;
ResultSet rs=null;
int Attende,Total;
String ID,Name,Class,Date;
String Vid,Tclass,Tabsant,Tpresent;

    public Student_Attendence() {
        initComponents();
        setTitle("Student Attendence");
        sid();
        Aid();
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
    
    public void Aid(){
        connection();
        String se=null;
        se="SELECT `ID` FROM `attendence_by_student`";
    try {
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        while(rs.next()){
        jComboBoxVa.addItem(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
public void connection(){
 try {
    jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
    }}

public void sid(){
connection();
String se=null;
se="SELECT `Id` FROM `student_admission`";
    try {
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        while(rs.next()){
        jComboBoxSID.addItem(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2Name = new javax.swing.JTextField();
        jDateChooser1AttenDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAttendence = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldd3Class = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Save = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jComboBoxSID = new javax.swing.JComboBox<>();
        ViewTable = new javax.swing.JButton();
        Close1 = new javax.swing.JButton();
        jPanelStudentID = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2ViewAttend = new javax.swing.JTable();
        jLabelTotalAbsent = new javax.swing.JLabel();
        jLabelTotalClass = new javax.swing.JLabel();
        jLabelTotalPresent = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBoxSClassSview = new javax.swing.JComboBox<>();
        jLabelStudentClass = new javax.swing.JLabel();
        jLabelStudentName = new javax.swing.JLabel();
        jLabelStudentID = new javax.swing.JLabel();
        jComboBoxVa = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 153, 255), new java.awt.Color(255, 51, 102), new java.awt.Color(153, 255, 153), new java.awt.Color(255, 255, 153)), "Student Attendence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Student ID ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 60, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Name ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 110, 110, 30);

        jTextField2Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextField2Name);
        jTextField2Name.setBounds(140, 110, 180, 30);

        jDateChooser1AttenDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jDateChooser1AttenDate);
        jDateChooser1AttenDate.setBounds(490, 110, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Class ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 160, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Attendance Date ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(340, 110, 140, 30);

        jComboBoxAttendence.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxAttendence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Attendance", "Absent", "Present" }));
        jPanel2.add(jComboBoxAttendence);
        jComboBoxAttendence.setBounds(490, 60, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Attendance");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(340, 60, 140, 30);

        jTextFieldd3Class.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextFieldd3Class);
        jTextFieldd3Class.setBounds(140, 160, 180, 30);

        jTable1.setBackground(new java.awt.Color(0, 204, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID ", "Name", "Class", "Attendence", "Attendence Date"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 410, 1240, 240);

        Save.setBackground(new java.awt.Color(153, 0, 51));
        Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save);
        Save.setBounds(770, 70, 110, 30);

        Close.setBackground(new java.awt.Color(153, 0, 51));
        Close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("Exit");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel2.add(Close);
        Close.setBounds(1120, 70, 100, 30);

        jComboBoxSID.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxSID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        jComboBoxSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSIDActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxSID);
        jComboBoxSID.setBounds(140, 60, 180, 30);

        ViewTable.setBackground(new java.awt.Color(153, 0, 51));
        ViewTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ViewTable.setForeground(new java.awt.Color(255, 255, 255));
        ViewTable.setText("Refrash");
        ViewTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTableActionPerformed(evt);
            }
        });
        jPanel2.add(ViewTable);
        ViewTable.setBounds(1000, 70, 110, 30);

        Close1.setBackground(new java.awt.Color(153, 0, 51));
        Close1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Close1.setForeground(new java.awt.Color(255, 255, 255));
        Close1.setText("Clear");
        Close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close1ActionPerformed(evt);
            }
        });
        jPanel2.add(Close1);
        Close1.setBounds(890, 70, 100, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 0, 1260, 730);

        jTabbedPane1.addTab("Student Attendence", jPanel3);

        jPanelStudentID.setBackground(new java.awt.Color(153, 255, 204));
        jPanelStudentID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, new java.awt.Color(255, 51, 102), java.awt.Color.red, java.awt.Color.red), "Attendence View ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 51, 255))); // NOI18N
        jPanelStudentID.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Class");
        jPanelStudentID.add(jLabel4);
        jLabel4.setBounds(30, 160, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Student ID");
        jPanelStudentID.add(jLabel9);
        jLabel9.setBounds(30, 80, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Name");
        jPanelStudentID.add(jLabel10);
        jLabel10.setBounds(30, 120, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Total Calss");
        jPanelStudentID.add(jLabel11);
        jLabel11.setBounds(370, 80, 120, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Total Absent");
        jPanelStudentID.add(jLabel12);
        jLabel12.setBounds(370, 160, 120, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("Total Present");
        jPanelStudentID.add(jLabel13);
        jLabel13.setBounds(370, 120, 120, 30);

        jTable2ViewAttend.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable2ViewAttend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Class", "Total Class", "Total Present", "Total Absent"
            }
        ));
        jTable2ViewAttend.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2ViewAttend);

        jPanelStudentID.add(jScrollPane2);
        jScrollPane2.setBounds(10, 340, 1240, 380);

        jLabelTotalAbsent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTotalAbsent.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTotalAbsent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalAbsent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jPanelStudentID.add(jLabelTotalAbsent);
        jLabelTotalAbsent.setBounds(500, 160, 160, 30);

        jLabelTotalClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTotalClass.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTotalClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jPanelStudentID.add(jLabelTotalClass);
        jLabelTotalClass.setBounds(500, 80, 160, 30);

        jLabelTotalPresent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTotalPresent.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTotalPresent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotalPresent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jPanelStudentID.add(jLabelTotalPresent);
        jLabelTotalPresent.setBounds(500, 120, 160, 30);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Serach By Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelStudentID.add(jButton2);
        jButton2.setBounds(710, 80, 170, 30);

        jComboBoxSClassSview.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxSClassSview.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSClassSview.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClassSview.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassSviewMouseMoved(evt);
            }
        });
        jComboBoxSClassSview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSClassSviewActionPerformed(evt);
            }
        });
        jPanelStudentID.add(jComboBoxSClassSview);
        jComboBoxSClassSview.setBounds(1060, 80, 180, 30);

        jLabelStudentClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelStudentClass.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStudentClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jPanelStudentID.add(jLabelStudentClass);
        jLabelStudentClass.setBounds(130, 160, 210, 30);

        jLabelStudentName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelStudentName.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jPanelStudentID.add(jLabelStudentName);
        jLabelStudentName.setBounds(130, 120, 210, 30);

        jLabelStudentID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelStudentID.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStudentID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jPanelStudentID.add(jLabelStudentID);
        jLabelStudentID.setBounds(130, 80, 210, 30);

        jComboBoxVa.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxVa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxVa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        jComboBoxVa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVaActionPerformed(evt);
            }
        });
        jPanelStudentID.add(jComboBoxVa);
        jComboBoxVa.setBounds(890, 80, 160, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search By Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelStudentID.add(jButton1);
        jButton1.setBounds(1059, 30, 180, 31);

        jTabbedPane1.addTab("View Attendence", jPanelStudentID);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 760));

        setSize(new java.awt.Dimension(1282, 806));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

public void Initialize(){
    ID=jComboBoxSID.getSelectedItem().toString();
    Name=jTextField2Name.getText();
    Class=jTextFieldd3Class.getText();
if(jComboBoxAttendence.getSelectedItem().equals("Absen")){
Attende=0;
}else if(jComboBoxAttendence.getSelectedItem().equals("Present")){
Attende=1;
}   
}
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // Insert Button
     Initialize();
     DefaultTableModel stm=(DefaultTableModel)jTable1.getModel();
     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
     Date=sdf.format(jDateChooser1AttenDate.getDate()).toString();
     connection();
     String serial=null;
     serial="SELECT `ID`,`Class`,`AttendenctDate` FROM `studentattendencr` WHERE `ID` = ? && `Class` = ? && `AttendenctDate` = ?";
    try {
        ps=jcon.prepareStatement(serial);
        ps.setString(1,jComboBoxSID.getSelectedItem().toString());
        ps.setString(2, jTextFieldd3Class.getText());
        ps.setString(3, jDateChooser1AttenDate.getDate().toString());
        rs=ps.executeQuery();
        if(rs.next()){
        JOptionPane.showMessageDialog(this," This Id Aleardly Insert In This Date");
        jComboBoxSID.requestFocus();
        }else{
        String insert=null;
     insert="INSERT INTO `studentattendencr`(`ID`,`Name`,`Class`,`Attendenct`,`AttendenctDate`) VALUES(?,?,?,?,?)";
    try {
        ps=jcon.prepareStatement(insert);
        ps.setString(1,ID);
        ps.setString(2,Name);
        ps.setString(3,Class);
        ps.setInt(4,Attende);
        ps.setString(5,Date);
        //stm.addRow(new Object[]{rs.});
       boolean b= ps.execute();
       if(!b)
           JOptionPane.showMessageDialog(this, "data add ok");
       else
           JOptionPane.showMessageDialog(this, "data add Fail");
    } catch (SQLException ex) {
        Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_SaveActionPerformed

    private void jComboBoxSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSIDActionPerformed
        connection();
        String se="SELECT `Name`,`Class` FROM `student_admission` WHERE `ID`=?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jComboBoxSID.getSelectedItem().toString());
        rs=ps.executeQuery();
        if(rs.next()){
            jTextField2Name.setText(rs.getString("Name"));
            jTextFieldd3Class.setText(rs.getString("Class"));
        boolean b=ps.execute();
        if(b){
        
        }else{
        JOptionPane.showMessageDialog(this,"Operation Filed..");
        }
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jComboBoxSIDActionPerformed

    private void ViewTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTableActionPerformed
        // View Button
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        connection();
        String se=null;
        se="SELECT * FROM `studentattendencr`";
    try {
        //`ID`,`Name`,`Class`,`Attendenct`,`AttendenctDate`
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        while(rs.next()){
        dtm.addRow(new Object[]{rs.getInt("ID"),rs.getString("Name"),rs.getString("Class"),rs.getInt("Attendenct"),rs.getDate("AttendenctDate")});
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_ViewTableActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // Exit Button
        dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void Close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close1ActionPerformed
        // Clear Button
        clear();
    }//GEN-LAST:event_Close1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Search Student Attendence
        DefaultTableModel dtm=(DefaultTableModel)jTable2ViewAttend.getModel();
        if(jComboBoxVa.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Select Student Id");
        jComboBoxVa.requestFocus();
        }else if(jComboBoxSClassSview.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this," Select Class");
        jComboBoxSClassSview.requestFocus();
        }else{
            connection();
            String se=null;
            se="SELECT * FROM `attendence_by_student` WHERE `ID` = ? && `Class` = ? ";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1, jComboBoxVa.getSelectedItem().toString());
                ps.setString(2, jComboBoxSClassSview.getSelectedItem().toString());
                rs=ps.executeQuery();
                if(rs.next()){
                jLabelStudentID.setText(rs.getString("ID"));
                jLabelStudentName.setText(rs.getString("Name"));
                jLabelStudentClass.setText(rs.getString("Class"));
                jLabelTotalClass.setText(rs.getString("Total_Clalss"));
                jLabelTotalPresent.setText(rs.getString("Total_Present"));
                jLabelTotalAbsent.setText(rs.getString("Total_Absent"));
                dtm.addRow(new Object[]{rs.getString("ID"),rs.getString("Name"),rs.getString("Class"),rs.getString("Total_Clalss"),rs.getString("Total_Present"),rs.getString("Total_Absent")});
                }else{
                JOptionPane.showMessageDialog(this," Your Infromation Is Rong");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxSClassSviewMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassSviewMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassSviewMouseMoved

    private void jComboBoxSClassSviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSClassSviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassSviewActionPerformed

    private void jComboBoxVaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Search Student Attendentc By Date
        Search_By_Date sd=new Search_By_Date();
        sd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void clear(){
    jComboBoxSID.setSelectedIndex(0);
    jTextField2Name.setText("");
    jTextFieldd3Class.setText("");
    jComboBoxAttendence.setSelectedIndex(0);
    jDateChooser1AttenDate.setDate(null);
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
            java.util.logging.Logger.getLogger(Student_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Attendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Close1;
    private javax.swing.JButton Save;
    private javax.swing.JButton ViewTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxAttendence;
    private javax.swing.JComboBox<String> jComboBoxSClassSview;
    private javax.swing.JComboBox<String> jComboBoxSID;
    private javax.swing.JComboBox<String> jComboBoxVa;
    private com.toedter.calendar.JDateChooser jDateChooser1AttenDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelStudentClass;
    private javax.swing.JLabel jLabelStudentID;
    private javax.swing.JLabel jLabelStudentName;
    private javax.swing.JLabel jLabelTotalAbsent;
    private javax.swing.JLabel jLabelTotalClass;
    private javax.swing.JLabel jLabelTotalPresent;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelStudentID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2ViewAttend;
    private javax.swing.JTextField jTextField2Name;
    private javax.swing.JTextField jTextFieldd3Class;
    // End of variables declaration//GEN-END:variables
}
