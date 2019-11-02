
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Salary extends javax.swing.JFrame {
Connection jcon=null;
Statement st=null;
PreparedStatement ps=null;
ResultSet rs=null;
String Tid,TName,Ttype,Tsalary,Eid,EName,Etype,Esalary;

    public Salary() {
        initComponents();
        tid();
        eid();
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
    public void tid(){
    connection();
    
    String tse=null;
    tse="SELECT `TeacherID` FROM `teacher_admission`";
    try {
        ps=jcon.prepareStatement(tse);
        rs=ps.executeQuery();
        while(rs.next()){
        jComboBox1Tid.addItem(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(School_Fees_Details.class.getName()).log(Level.SEVERE, null, ex);
    }}
    public void eid(){
        connection();
        String ese=null;
        ese="SELECT `ID` FROM `employee_addmission`";
    try {
        ps=jcon.prepareStatement(ese);
        rs=ps.executeQuery();
        while(rs.next()){
        jComboBox1Eid.addItem(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
public void connection(){
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void Teacherinitial(){
Tid=jComboBox1Tid.getSelectedItem().toString();
TName=jTextField2Tname.getText();
Ttype=jTextField4Ttype.getText();
Tsalary=jTextField4Tsalary.getText();
}
public void Employeeinitial(){
Eid=jComboBox1Eid.getSelectedItem().toString();
EName=jTextField6Ename.getText();
Etype=jTextField4Etype.getText();
Esalary=jTextField7Esalary.getText();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2Tname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4Tsalary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1TeacherTable = new javax.swing.JTable();
        Texit = new javax.swing.JButton();
        Tview = new javax.swing.JButton();
        TSave = new javax.swing.JButton();
        Tclear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1Tid = new javax.swing.JComboBox<>();
        jTextField4Ttype = new javax.swing.JTextField();
        TDelect = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6Ename = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7Esalary = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2EmployeeTable = new javax.swing.JTable();
        SaveESalary = new javax.swing.JButton();
        Eview = new javax.swing.JButton();
        jButton9DeleteESalary = new javax.swing.JButton();
        jButton13ExitESalary = new javax.swing.JButton();
        jButton11ClearESalary = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField4Etype = new javax.swing.JTextField();
        jComboBox1Eid = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton2EmployeeS = new javax.swing.JButton();
        jButton1TeacherS = new javax.swing.JButton();
        jTextField2EmployeeS = new javax.swing.JTextField();
        jTextField1TeacherS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(51, 0, 153));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(0, 204, 255), new java.awt.Color(51, 204, 255)));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Teacher ID");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(20, 50, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(20, 100, 130, 30);

        jTextField2Tname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jTextField2Tname);
        jTextField2Tname.setBounds(180, 100, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Teacher Type");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(20, 150, 130, 30);

        jTextField4Tsalary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jTextField4Tsalary);
        jTextField4Tsalary.setBounds(180, 200, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Salary");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(20, 200, 130, 30);

        jTable1TeacherTable.setBackground(new java.awt.Color(0, 51, 204));
        jTable1TeacherTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1TeacherTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable1TeacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Name", "Teacher Type", "Salary"
            }
        ));
        jTable1TeacherTable.setRowHeight(25);
        jTable1TeacherTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1TeacherTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1TeacherTable);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(430, 10, 910, 670);

        Texit.setBackground(new java.awt.Color(204, 0, 0));
        Texit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Texit.setForeground(new java.awt.Color(255, 255, 255));
        Texit.setText("Exit");
        Texit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexitActionPerformed(evt);
            }
        });
        jPanel5.add(Texit);
        Texit.setBounds(180, 560, 200, 40);

        Tview.setBackground(new java.awt.Color(204, 0, 0));
        Tview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Tview.setForeground(new java.awt.Color(255, 255, 255));
        Tview.setText("View");
        Tview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TviewActionPerformed(evt);
            }
        });
        jPanel5.add(Tview);
        Tview.setBounds(180, 380, 200, 40);

        TSave.setBackground(new java.awt.Color(204, 0, 0));
        TSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TSave.setForeground(new java.awt.Color(255, 255, 255));
        TSave.setText("Save");
        TSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSaveActionPerformed(evt);
            }
        });
        jPanel5.add(TSave);
        TSave.setBounds(180, 320, 200, 40);

        Tclear.setBackground(new java.awt.Color(204, 0, 0));
        Tclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Tclear.setForeground(new java.awt.Color(255, 255, 255));
        Tclear.setText("Clear");
        Tclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TclearActionPerformed(evt);
            }
        });
        jPanel5.add(Tclear);
        Tclear.setBounds(180, 440, 200, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Set ID and Press Enter");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(180, 30, 210, 20);

        jComboBox1Tid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1Tid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        jComboBox1Tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1TidActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1Tid);
        jComboBox1Tid.setBounds(180, 50, 210, 30);

        jTextField4Ttype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jTextField4Ttype);
        jTextField4Ttype.setBounds(180, 150, 210, 30);

        TDelect.setBackground(new java.awt.Color(204, 0, 0));
        TDelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TDelect.setForeground(new java.awt.Color(255, 255, 255));
        TDelect.setText("Delete");
        TDelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDelectActionPerformed(evt);
            }
        });
        jPanel5.add(TDelect);
        TDelect.setBounds(180, 500, 200, 40);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 1360, 690);

        jTabbedPane1.addTab("Teacher Salary", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Employee ID");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 60, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 120, 140, 30);

        jTextField6Ename.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextField6Ename);
        jTextField6Ename.setBounds(180, 120, 210, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Employee Type");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 180, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Salary");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 240, 140, 30);

        jTextField7Esalary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextField7Esalary);
        jTextField7Esalary.setBounds(180, 240, 210, 30);

        jTable2EmployeeTable.setBackground(new java.awt.Color(0, 51, 204));
        jTable2EmployeeTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2EmployeeTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable2EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Name", "Teacher Type", "Salary"
            }
        ));
        jTable2EmployeeTable.setRowHeight(25);
        jTable2EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2EmployeeTable);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(430, 10, 910, 670);

        SaveESalary.setBackground(new java.awt.Color(204, 0, 0));
        SaveESalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveESalary.setForeground(new java.awt.Color(255, 255, 255));
        SaveESalary.setText("Save");
        SaveESalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveESalaryActionPerformed(evt);
            }
        });
        jPanel2.add(SaveESalary);
        SaveESalary.setBounds(180, 320, 200, 40);

        Eview.setBackground(new java.awt.Color(204, 0, 0));
        Eview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Eview.setForeground(new java.awt.Color(255, 255, 255));
        Eview.setText("View");
        Eview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EviewActionPerformed(evt);
            }
        });
        jPanel2.add(Eview);
        Eview.setBounds(180, 380, 200, 40);

        jButton9DeleteESalary.setBackground(new java.awt.Color(204, 0, 0));
        jButton9DeleteESalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9DeleteESalary.setForeground(new java.awt.Color(255, 255, 255));
        jButton9DeleteESalary.setText("Delete");
        jButton9DeleteESalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9DeleteESalaryActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9DeleteESalary);
        jButton9DeleteESalary.setBounds(180, 500, 200, 40);

        jButton13ExitESalary.setBackground(new java.awt.Color(204, 0, 0));
        jButton13ExitESalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13ExitESalary.setForeground(new java.awt.Color(255, 255, 255));
        jButton13ExitESalary.setText("Exit");
        jButton13ExitESalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ExitESalaryActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13ExitESalary);
        jButton13ExitESalary.setBounds(180, 560, 200, 40);

        jButton11ClearESalary.setBackground(new java.awt.Color(204, 0, 0));
        jButton11ClearESalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11ClearESalary.setForeground(new java.awt.Color(255, 255, 255));
        jButton11ClearESalary.setText("Clear");
        jButton11ClearESalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ClearESalaryActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11ClearESalary);
        jButton11ClearESalary.setBounds(180, 440, 200, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Set ID and Press Enter");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(180, 40, 170, 20);

        jTextField4Etype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextField4Etype);
        jTextField4Etype.setBounds(180, 180, 210, 30);

        jComboBox1Eid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1Eid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        jComboBox1Eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1EidActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1Eid);
        jComboBox1Eid.setBounds(180, 60, 210, 30);

        jTabbedPane1.addTab("Employes Salary", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 40, 1360, 720);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Teacher Salary");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(0, 4, 140, 30);

        jButton2EmployeeS.setBackground(new java.awt.Color(204, 0, 0));
        jButton2EmployeeS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2EmployeeS.setForeground(new java.awt.Color(255, 255, 255));
        jButton2EmployeeS.setText("Surch Employee");
        jButton2EmployeeS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2EmployeeSActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2EmployeeS);
        jButton2EmployeeS.setBounds(950, 0, 140, 30);

        jButton1TeacherS.setBackground(new java.awt.Color(204, 0, 0));
        jButton1TeacherS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1TeacherS.setForeground(new java.awt.Color(255, 255, 255));
        jButton1TeacherS.setText("Surch Teacher");
        jButton1TeacherS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1TeacherSActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1TeacherS);
        jButton1TeacherS.setBounds(650, 0, 130, 30);

        jTextField2EmployeeS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2EmployeeSKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField2EmployeeS);
        jTextField2EmployeeS.setBounds(820, 0, 140, 30);

        jTextField1TeacherS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1TeacherSKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1TeacherS);
        jTextField1TeacherS.setBounds(520, 0, 140, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1360, 40);

        setSize(new java.awt.Dimension(1380, 816));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveESalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveESalaryActionPerformed
        Employeeinitial();
        ps=null;
        if(jComboBox1Tid.getSelectedItem()==null){
        JOptionPane.showMessageDialog(this,"Please At First You Select Employee ID ");
        jComboBox1Eid.requestFocus();
        }else if(EName.isEmpty()){
        JOptionPane.showMessageDialog(this,"Employee Name Is Empty");
        jTextField6Ename.requestFocus();
        }else if(jTextField4Etype.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Employee Type Is Empty");
        jTextField4Etype.requestFocus();
        }else if(Esalary.isEmpty()){
        JOptionPane.showMessageDialog(this,"Employee Salary Is Empty");
        jTextField7Esalary.requestFocus();
        }else{
            String inquery=null;
            connection();
            inquery="INSERT INTO `employees_salary`(`Empoloyee_ID`,`Empoloyee_Name`,`Empoloyee_Type`,`Empoloyee_Salary`) VALUES(?,?,?,?)";
           try {
               ps=jcon.prepareStatement(inquery);
               ps.setString(1,Eid);
               ps.setString(2,EName);
               ps.setString(3,Etype);
               ps.setString(4,Esalary);
               boolean b=ps.execute();
               ev();
               if(!b){
               JOptionPane.showMessageDialog(this," Data Insert Success....");
               }else{
               JOptionPane.showMessageDialog(this," Data Insert Filed...");
               }
           } catch (SQLException ex) {
               Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
           }
            
        }
    }//GEN-LAST:event_SaveESalaryActionPerformed

    private void jButton13ExitESalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ExitESalaryActionPerformed
        dispose();
    }//GEN-LAST:event_jButton13ExitESalaryActionPerformed

    private void TexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexitActionPerformed
        dispose();
    }//GEN-LAST:event_TexitActionPerformed

    private void TSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSaveActionPerformed
        // TODO add your handling code here:
       Teacherinitial();
       ps=null;
        if(Tid.isEmpty()){
        JOptionPane.showMessageDialog(this,"At First You Select Teacher ID");
        jComboBox1Tid.requestFocus();
        }else if(TName.isEmpty()){
        JOptionPane.showMessageDialog(this,"Teacher Name Is Empty");
        jTextField2Tname.requestFocus();
        }else if(jTextField4Ttype.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Plese Select Teacher Type");
        jTextField4Ttype.requestFocus();
        }else if(Tsalary.isEmpty()){
        JOptionPane.showMessageDialog(this,"Teacher Salary Is Empty");
        jTextField4Tsalary.requestFocus();
        }else{
        String inquery=null;
        connection();
        inquery="INSERT INTO `teachers_salary`(`Teacher_ID`,`Teacher_Name`,`Teacher_Type`,`Teacher_Salary`) VALUES(?,?,?,?)";
           try {
               ps=jcon.prepareStatement(inquery);
               ps.setString(1,Tid);
               ps.setString(2,TName);
               ps.setString(3,Ttype);
               ps.setString(4,Tsalary);
               boolean b=ps.execute();
               tv();
               if(!b){
               JOptionPane.showMessageDialog(this," Data Insert Success....");
               }else{
               JOptionPane.showMessageDialog(this," Data Insert Filed....");
               }
           } catch (SQLException ex) {
               Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
           }}
    }//GEN-LAST:event_TSaveActionPerformed

    private void TclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TclearActionPerformed
        // TODO add your handling code here:
        jComboBox1Tid.setSelectedIndex(0);
        jTextField2Tname.setText("");
        jTextField4Ttype.setText("");
        jTextField4Tsalary.setText("");
        DefaultTableModel dt=(DefaultTableModel)jTable1TeacherTable.getModel();
        dt.setRowCount(0);
    }//GEN-LAST:event_TclearActionPerformed

    private void jComboBox1TidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1TidActionPerformed
        connection();
        String se=null;
        se="SELECT `Name`,`Ttype`,`Salary` FROM `teacher_admission` WHERE `TeacherID` = ?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jComboBox1Tid.getSelectedItem().toString());
        rs=ps.executeQuery();
        if(rs.next()){
        jTextField2Tname.setText(rs.getString("Name"));
        jTextField4Ttype.setText(rs.getString("Ttype"));
        jTextField4Tsalary.setText(rs.getString("Salary"));
        boolean b=ps.execute();
        if(b){
        JOptionPane.showMessageDialog(this,"Data Select Successfully..");
        }else{
        JOptionPane.showMessageDialog(this,"Data Select Filed..");
        }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }//GEN-LAST:event_jComboBox1TidActionPerformed

    private void jComboBox1EidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1EidActionPerformed
      if(jComboBox1Eid.getSelectedItem()==null){
          JOptionPane.showMessageDialog(this," Please At First You Select Employee ID ");
      }else{
        connection();
      String se=null;
      se="SELECT `Name`,`Employee_Type`,`Salary` FROM `employee_addmission` WHERE `ID` =?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jComboBox1Eid.getSelectedItem().toString());
        rs=ps.executeQuery();
        if(rs.next()){
        jTextField6Ename.setText(rs.getString("Name"));
        jTextField4Etype.setText(rs.getString("Employee_Type"));
        jTextField7Esalary.setText(rs.getString("Salary"));
        boolean b=ps.execute();
        if(b){
        JOptionPane.showMessageDialog(this,"Data Select Successfully..");
        }else {
        JOptionPane.showMessageDialog(this,"Data Select Filed..");
        }
        }else{
        JOptionPane.showMessageDialog(this," Your Id Is Rong");
        jComboBox1Eid.requestFocus();
        }
    } catch (SQLException ex) {
        Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
    }}  
    }//GEN-LAST:event_jComboBox1EidActionPerformed

    private void TviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TviewActionPerformed
       tv(); 
    }//GEN-LAST:event_TviewActionPerformed

    private void TDelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDelectActionPerformed
        if(jTable1TeacherTable.getSelectedRow()==-1){
        JOptionPane.showMessageDialog(this,"Please At First You Select Table Coloum When You Wanted To Delete Wich Coloum ");
        }else{
        int d=JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Data");
        if(d==0){
        connection();
        String de=null;
        de="DELETE FROM `teachers_salary` WHERE `Teacher_ID`=?";
            try {
                ps=jcon.prepareStatement(de);
                ps.setString(1,jComboBox1Tid.getSelectedItem().toString());
                int b=ps.executeUpdate();
                if(b==1){
                DefaultTableModel dt=(DefaultTableModel)jTable1TeacherTable.getModel();
                dt.setRowCount(0);
                tv();
                }else{
                JOptionPane.showMessageDialog(this," Data Delete Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
            }}}
    }//GEN-LAST:event_TDelectActionPerformed

    private void jTable1TeacherTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1TeacherTableMouseClicked
        DefaultTableModel dt=(DefaultTableModel)jTable1TeacherTable.getModel();
        jComboBox1Tid.setSelectedItem(dt.getValueAt(jTable1TeacherTable.getSelectedRow(),0).toString());
        jTextField2Tname.setText(dt.getValueAt(jTable1TeacherTable.getSelectedRow(),1).toString());
        jTextField4Ttype.setText(dt.getValueAt(jTable1TeacherTable.getSelectedRow(),2).toString());
        jTextField4Tsalary.setText(dt.getValueAt(jTable1TeacherTable.getSelectedRow(),3).toString());
    }//GEN-LAST:event_jTable1TeacherTableMouseClicked

    private void EviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EviewActionPerformed
      ev();
    }//GEN-LAST:event_EviewActionPerformed

    private void jButton11ClearESalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ClearESalaryActionPerformed
       jComboBox1Eid.setSelectedIndex(0);
       jTextField6Ename.setText("");
       jTextField4Etype.setText("");
       jTextField7Esalary.setText("");
        DefaultTableModel dt=(DefaultTableModel)jTable2EmployeeTable.getModel();
        dt.setRowCount(0);
    }//GEN-LAST:event_jButton11ClearESalaryActionPerformed

    private void jButton9DeleteESalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9DeleteESalaryActionPerformed
        if(jTable2EmployeeTable.getSelectedRow()==-1){
        JOptionPane.showMessageDialog(this,"Please At First You Select Table Coloum When You Wanted To Delete Wich Coloum ");
        }else{
        int d=JOptionPane.showConfirmDialog(this,"Do You Want To Delete This ");
        if(d==0){
        connection();
        String de=null;
        de="DELETE FROM `employees_salary` WHERE `Empoloyee_ID`=?";
            try {
                ps=jcon.prepareStatement(de);
                ps.setString(1,jComboBox1Eid.getSelectedItem().toString());
                int b=ps.executeUpdate();
                if(b==1){
                DefaultTableModel dt=(DefaultTableModel)jTable2EmployeeTable.getModel();
                dt.setRowCount(0);
                ev();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
            }}}
    }//GEN-LAST:event_jButton9DeleteESalaryActionPerformed

    private void jTable2EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2EmployeeTableMouseClicked
        DefaultTableModel dt=(DefaultTableModel)jTable2EmployeeTable.getModel();
        jComboBox1Eid.setSelectedItem(dt.getValueAt(jTable2EmployeeTable.getSelectedRow(),0).toString());
        jTextField6Ename.setText(dt.getValueAt(jTable2EmployeeTable.getSelectedRow(),1).toString());
        jTextField4Etype.setText(dt.getValueAt(jTable2EmployeeTable.getSelectedRow(),2).toString());
        jTextField7Esalary.setText(dt.getValueAt(jTable2EmployeeTable.getSelectedRow(),3).toString());
    }//GEN-LAST:event_jTable2EmployeeTableMouseClicked

    private void jButton1TeacherSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1TeacherSActionPerformed
        // Surct Teacher
       if(jTextField1TeacherS.getText().isEmpty()){
       JOptionPane.showMessageDialog(this," Search ID Is Empty");
       jTextField1TeacherS.requestFocus();
       }else{ 
        connection();
        String Tsearch=null;
        DefaultTableModel dtm=(DefaultTableModel)jTable1TeacherTable.getModel();
        dtm.setRowCount(0);
        Tsearch = "SELECT `Teacher_ID`,`Teacher_Name`,`Teacher_Type`,`Teacher_Salary` FROM `teachers_salary` WHERE `Teacher_ID`=?";
           try {
               ps=jcon.prepareStatement(Tsearch);
               ps.setString(1,jTextField1TeacherS.getText());
               rs=ps.executeQuery();
               if(rs.next()){
               dtm.addRow(new Object[]{rs.getInt("Teacher_ID"),rs.getString("Teacher_Name"),rs.getString("Teacher_Type"),rs.getInt("Teacher_Salary")});
               }else{
               JOptionPane.showMessageDialog(this," Your ID Is Rong");
               jTextField1TeacherS.setText("");
               jTextField1TeacherS.requestFocus();
               } 
           } catch (SQLException ex) {
               Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
           }} 
    }//GEN-LAST:event_jButton1TeacherSActionPerformed

    private void jButton2EmployeeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2EmployeeSActionPerformed
        // Search Employee
         if(jTextField2EmployeeS.getText().isEmpty()){
       JOptionPane.showMessageDialog(this," Search ID Is Empty");
       jTextField2EmployeeS.requestFocus();
       }else{ 
        connection();
        String Esearch=null;
        DefaultTableModel dtm=(DefaultTableModel)jTable2EmployeeTable.getModel();
        dtm.setRowCount(0);
        Esearch = "SELECT `Empoloyee_ID`,`Empoloyee_Name`,`Empoloyee_Type`,`Empoloyee_Salary` FROM `employees_salary` WHERE `Empoloyee_ID`=?";
           try {
               ps=jcon.prepareStatement(Esearch);
               ps.setString(1,jTextField2EmployeeS.getText());
               rs=ps.executeQuery();
               if(rs.next()){
               dtm.addRow(new Object[]{rs.getInt("Empoloyee_ID"),rs.getString("Empoloyee_Name"),rs.getString("Empoloyee_Type"),rs.getInt("Empoloyee_Salary")});
               }else{
               JOptionPane.showMessageDialog(this," Your ID Is Rong");
               jTextField2EmployeeS.setText("");
               jTextField2EmployeeS.requestFocus();
               } 
           } catch (SQLException ex) {
               Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
           }} 
    }//GEN-LAST:event_jButton2EmployeeSActionPerformed

    private void jTextField1TeacherSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1TeacherSKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1TeacherSKeyTyped

    private void jTextField2EmployeeSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2EmployeeSKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2EmployeeSKeyTyped
    public void ev(){
        connection();
        String selects=null;
        DefaultTableModel dt=(DefaultTableModel)jTable2EmployeeTable.getModel();
        dt.setRowCount(0);
        selects="SELECT *FROM `employees_salary`";
    try {
        ps=jcon.prepareStatement(selects);
        rs=ps.executeQuery();
        while(rs.next()){
        dt.addRow(new Object[]{rs.getString("Empoloyee_ID"),rs.getString("Empoloyee_Name"),rs.getString("Empoloyee_Type"),rs.getString("Empoloyee_Salary")});
        }
    } catch (SQLException ex) {
        Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public void tv(){
        connection();
        String selects=null;
        DefaultTableModel dt=(DefaultTableModel)jTable1TeacherTable.getModel();
        dt.setRowCount(0);
        selects="SELECT `Teacher_ID`,`Teacher_Name`,`Teacher_Type`,`Teacher_Salary` FROM `teachers_salary`";
    try {
        ps=jcon.prepareStatement(selects);
        rs=ps.executeQuery();
        while(rs.next()){
        dt.addRow(new Object[]{rs.getString("Teacher_ID"),rs.getString("Teacher_Name"),rs.getString("Teacher_Type"),rs.getString("Teacher_Salary")});
        }
    } catch (SQLException ex) {
        Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);}
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
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eview;
    private javax.swing.JButton SaveESalary;
    private javax.swing.JButton TDelect;
    private javax.swing.JButton TSave;
    private javax.swing.JButton Tclear;
    private javax.swing.JButton Texit;
    private javax.swing.JButton Tview;
    private javax.swing.JButton jButton11ClearESalary;
    private javax.swing.JButton jButton13ExitESalary;
    private javax.swing.JButton jButton1TeacherS;
    private javax.swing.JButton jButton2EmployeeS;
    private javax.swing.JButton jButton9DeleteESalary;
    private javax.swing.JComboBox<String> jComboBox1Eid;
    private javax.swing.JComboBox<String> jComboBox1Tid;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1TeacherTable;
    private javax.swing.JTable jTable2EmployeeTable;
    private javax.swing.JTextField jTextField1TeacherS;
    private javax.swing.JTextField jTextField2EmployeeS;
    private javax.swing.JTextField jTextField2Tname;
    private javax.swing.JTextField jTextField4Etype;
    private javax.swing.JTextField jTextField4Tsalary;
    private javax.swing.JTextField jTextField4Ttype;
    private javax.swing.JTextField jTextField6Ename;
    private javax.swing.JTextField jTextField7Esalary;
    // End of variables declaration//GEN-END:variables
}
