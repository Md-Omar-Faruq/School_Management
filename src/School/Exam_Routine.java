
package School;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
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


public class Exam_Routine extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Exam_Routine() {
        initComponents();
        setResizable(false);
        tview(); 
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Graduation_Cap_96px.png")));
    
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
        jLabel333 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ViewB = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDateChooser15 = new com.toedter.calendar.JDateChooser();
        jTextField1Time = new javax.swing.JTextField();
        jLabel358 = new javax.swing.JLabel();
        jTextField1Serial = new javax.swing.JTextField();
        jComboBoxSubject = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxExam = new javax.swing.JComboBox<>();
        jLabel332 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel333.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel333.setForeground(new java.awt.Color(153, 0, 102));
        jLabel333.setText("Time");
        jPanel1.add(jLabel333);
        jLabel333.setBounds(610, 110, 180, 30);

        jLabel354.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel354.setForeground(new java.awt.Color(153, 0, 102));
        jLabel354.setText("Serial No");
        jPanel1.add(jLabel354);
        jLabel354.setBounds(80, 40, 190, 30);

        jLabel357.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel357.setForeground(new java.awt.Color(153, 0, 102));
        jLabel357.setText("Date");
        jPanel1.add(jLabel357);
        jLabel357.setBounds(330, 110, 220, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1060, 60, 120, 31);

        ViewB.setBackground(new java.awt.Color(255, 0, 0));
        ViewB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ViewB.setForeground(new java.awt.Color(255, 255, 255));
        ViewB.setText("View");
        ViewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBActionPerformed(evt);
            }
        });
        jPanel1.add(ViewB);
        ViewB.setBounds(1310, 120, 110, 30);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1190, 60, 110, 29);

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1310, 60, 110, 29);

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Refrash");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1060, 120, 120, 29);

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
        jButton6.setBounds(1190, 120, 110, 29);

        jDateChooser15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser15);
        jDateChooser15.setBounds(330, 160, 220, 40);

        jTextField1Time.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField1Time);
        jTextField1Time.setBounds(610, 160, 180, 40);

        jLabel358.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel358.setForeground(new java.awt.Color(153, 0, 102));
        jLabel358.setText("Subject Name");
        jPanel1.add(jLabel358);
        jLabel358.setBounds(80, 110, 210, 30);

        jTextField1Serial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1Serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SerialKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1Serial);
        jTextField1Serial.setBounds(330, 40, 220, 40);

        jComboBoxSubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSubject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Subject" }));
        jPanel1.add(jComboBoxSubject);
        jComboBoxSubject.setBounds(80, 156, 210, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 1460, 230);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(null);

        jComboBoxExam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Exam", "Fast Term Exam", "Second Term Exam", "Mid Term Exam", "Test Exam", "Annual Exam" }));
        jComboBoxExam.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxExamMouseMoved(evt);
            }
        });
        jPanel2.add(jComboBoxExam);
        jComboBoxExam.setBounds(510, 20, 230, 30);

        jLabel332.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel332.setForeground(new java.awt.Color(153, 0, 102));
        jLabel332.setText("Academic Year");
        jPanel2.add(jLabel332);
        jLabel332.setBounds(750, 20, 160, 30);

        jLabel355.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel355.setForeground(new java.awt.Color(153, 0, 102));
        jLabel355.setText("Class");
        jPanel2.add(jLabel355);
        jLabel355.setBounds(130, 20, 70, 30);

        jLabel356.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel356.setForeground(new java.awt.Color(153, 0, 102));
        jLabel356.setText("Exam Type");
        jPanel2.add(jLabel356);
        jLabel356.setBounds(390, 20, 110, 30);

        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseMoved(evt);
            }
        });
        jComboBoxSClass.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxSClassPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
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
        jComboBoxSClass.setBounds(200, 20, 170, 30);

        jTable1.setBackground(new java.awt.Color(51, 204, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Subject", "Exam Date", "Time", "Class", "Exam Type", "Year"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 300, 1450, 560);

        jYearChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jYearChooser1);
        jYearChooser1.setBounds(920, 22, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1460, 70);

        jTable2.setBackground(new java.awt.Color(102, 204, 255));
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial ", "Subject ", "Exma Date", "Time", "Class", "Exam Type", "Year"
            }
        ));
        jTable2.setRowHeight(25);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 300, 1460, 560);

        setSize(new java.awt.Dimension(1474, 918));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxExamMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxExamMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxExamMouseMoved

    private void jComboBoxSClassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassMouseMoved

    private void jComboBoxSClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSClassKeyReleased

    }//GEN-LAST:event_jComboBoxSClassKeyReleased

    private void jComboBoxSClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseClicked

    }//GEN-LAST:event_jComboBoxSClassMouseClicked

    private void jComboBoxSClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSClassActionPerformed
        // TODO add your handling code here:
        connection();
        jComboBoxSubject.removeAllItems();
        int i=jComboBoxSClass.getSelectedIndex();
        String se=null;
        se="SELECT `Subject` FROM `class_subject` WHERE `Class_ID`="+i;
    try {
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        while(rs.next()){
        jComboBoxSubject.addItem(rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_jComboBoxSClassActionPerformed

    private void ViewBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBActionPerformed
        // TODO add your handling code here:
        if(jTextField1Serial.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Serial Id Is Empty");
        jTextField1Serial.requestFocus();
        }else{
        connection();
        String se=null;
        se="SELECT *FROM `exam_routine` WHERE `Serial`="+jTextField1Serial.getText();
    try {
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        if(rs.next()){
        jTextField1Serial.setText(rs.getString("Serial"));
        jComboBoxSubject.setSelectedItem(rs.getString("Subject"));
        jDateChooser15.setDate(rs.getDate("Exam_Date"));
        jTextField1Time.setText(rs.getString("Time"));
        jComboBoxSClass.setSelectedItem(rs.getString("Class"));
        jComboBoxExam.setSelectedItem(rs.getString("Exam_Type"));
        jYearChooser1.setYear(rs.getInt("Year"));
        boolean b=ps.execute();
        if(b){
        JOptionPane.showMessageDialog(this, " Date Showed Successfully...");
        }else{
        JOptionPane.showMessageDialog(this, " Date Showed Filed...");
        }
        }else{
        JOptionPane.showMessageDialog(this," Your Id Is Rong");
        jTextField1Serial.setText("");
        jTextField1Serial.requestFocus();
        }
    } catch (SQLException ex) {
        Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
    }}   
    }//GEN-LAST:event_ViewBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Save Button
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        if(jTextField1Serial.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Serial No Is Empty");
        jTextField1Serial.requestFocus();
        }else if(jComboBoxSClass.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "Please Select Class");
        jComboBoxSClass.requestFocus();
        }else if(jComboBoxExam.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "Please Select Exam");
        jComboBoxExam.requestFocus();
        }else if(jYearChooser1.getYear()==0){
        JOptionPane.showMessageDialog(this, "Year is empty");
        jYearChooser1.requestFocus();
        }else if(jComboBoxSubject.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "Subject is empty");
        jComboBoxSubject.requestFocus();
        }else if(jDateChooser15.getDate()==null){
        JOptionPane.showMessageDialog(this, "Date is empty");
        jDateChooser15.requestFocus();
        }else if(jTextField1Time.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Time is empty");
        jTextField1Time.requestFocus();
        }else{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String Examdate=sdf.format(jDateChooser15.getDate()).toString();
        connection();
        String se=null;
        se="SELECT `Serial`,`Class`,`Year` FROM `exam_routine` WHERE `Serial` = ? && `Class` = ? && `Year` = ?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,jTextField1Serial.getText());
                ps.setString(2,jComboBoxSClass.getSelectedItem().toString());
                 ps.setInt(3,jYearChooser1.getYear());
                 rs=ps.executeQuery();
                 if(rs.next()){
                 JOptionPane.showMessageDialog(this," This Serial Id , Class , Exam Type , Year Aleardly Insert Please Change Your Information");
                 jTextField1Serial.requestFocus();
                 }else{
                     
                 String in=null;
                 in="INSERT INTO `exam_routine`(`Serial`,`Subject`,`Exam_Date`,`Time`,`Class`,`Exam_Type`,`Year`) VALUES(?,?,?,?,?,?,?)";
                  try {
                       ps=jcon.prepareStatement(in);
                       ps.setString(1,jTextField1Serial.getText());
                       ps.setString(2,jComboBoxSubject.getSelectedItem().toString());
                       ps.setString(3,Examdate);
                       ps.setString(4,jTextField1Time.getText());
                       ps.setString(5,jComboBoxSClass.getSelectedItem().toString());
                       ps.setString(6,jComboBoxExam.getSelectedItem().toString());
                       ps.setInt(7,jYearChooser1.getYear());
                       boolean b=ps.execute();
                       if(!b){
                          JOptionPane.showMessageDialog(this, " Data Insert Successfully..");
                       }else{
                          JOptionPane.showMessageDialog(this, " Data Insert File...");
                       }
                    } catch (SQLException ex) {
                       Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dtm.setRowCount(0);
                    tview();}
            } catch (SQLException ex) {
                Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Clear Button
        Clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Update Button
        DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
        
         if(jTextField1Serial.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "At First you view Record");
        jTextField1Serial.requestFocus();
        }else if(jComboBoxSClass.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "Please Select Class");
        jComboBoxSClass.requestFocus();
        }else if(jComboBoxExam.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "Please Select Exam");
        jComboBoxExam.requestFocus();
        }else if(jYearChooser1.getYear()==0){
        JOptionPane.showMessageDialog(this, "Year is empty");
        jYearChooser1.requestFocus();
        }else if(jComboBoxSubject.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "Subject is empty");
        jComboBoxSubject.requestFocus();
        }else if(jDateChooser15.getDate()==null){
        JOptionPane.showMessageDialog(this, "Date is empty");
        jDateChooser15.requestFocus();
        }else if(jTextField1Time.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Time is empty");
        jTextField1Time.requestFocus();
        }else{
         
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String Examdate=sdf.format(jDateChooser15.getDate()).toString();
        connection();
        String f=null;
        f="UPDATE `exam_routine` SET `Subject`=?,`Exam_Date`=?,`Time`=?,`Class`=?,`Exam_Type`=?,`Year`=? WHERE `Serial`="+jTextField1Serial.getText();
    try {
        ps=jcon.prepareStatement(f);
        ps.setString(1,jComboBoxSubject.getSelectedItem().toString());
        ps.setString(2,Examdate);
        ps.setString(3,jTextField1Time.getText());
        ps.setString(4,jComboBoxSClass.getSelectedItem().toString());
        ps.setString(5,jComboBoxExam.getSelectedItem().toString());
        ps.setInt(6,jYearChooser1.getYear());
        int i=ps.executeUpdate();
         if(i==1){
               JOptionPane.showMessageDialog(this," Data Update Successfully...");
               }else{
               JOptionPane.showMessageDialog(this," Data Update Filed...");
               }
    } catch (SQLException ex) {
        Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
    }}
        dtm.setRowCount(0);
         tview();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Refrash Taable Record
        tview();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Delete Button
        if(jTextField1Serial.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First you view Record");
        }else{
            int d=JOptionPane.showConfirmDialog(this," Are you sure you want to Delete This Recors");
            if(d==0){
            connection();
        String de=null;
        de="DELETE FROM `exam_routine` WHERE `Serial` = ?";
        try {
         ps=jcon.prepareStatement(de);
         ps.setString(1,jTextField1Serial.getText());
         int i=ps.executeUpdate();
         if(i==1){
         JOptionPane.showMessageDialog(this,"Record Delete Successfully...");
         Clear();
         tview();
         }else{
         JOptionPane.showMessageDialog(this,"Record Delete Filed...");
         }
         } catch (SQLException ex) {
            Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
        }
            } } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxSClassPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxSClassPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxSClassPopupMenuWillBecomeInvisible

    private void jTextField1SerialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SerialKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SerialKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

    }//GEN-LAST:event_jTable2MouseClicked
    
    public void Clear(){
    DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
    jTextField1Serial.setText("");
    jComboBoxSClass.setSelectedIndex(0);
    jComboBoxExam.setSelectedIndex(0);
    jComboBoxSubject.setSelectedItem(0);
    jTextField1Time.setText("");
    jYearChooser1.setYear(0);
    jDateChooser15.setDate(null);
    dtm.setRowCount(0);
    }
    
    public void tview(){
    connection();
    DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
    dtm.setRowCount(0);
    String se=null;
    se="SELECT *FROM `exam_routine`";
    try {
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        while(rs.next()){
       //`Serial`,`Subject`,`Exam_Date`,`Time`,`Class`,`Exam_Type`,`Year`
        dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
        }
    } catch (SQLException ex) {
        Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
    }
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
            java.util.logging.Logger.getLogger(Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam_Routine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam_Routine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxExam;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private javax.swing.JComboBox jComboBoxSubject;
    private com.toedter.calendar.JDateChooser jDateChooser15;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1Serial;
    private javax.swing.JTextField jTextField1Time;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
