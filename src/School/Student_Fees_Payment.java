
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


public class Student_Fees_Payment extends javax.swing.JFrame {
Connection jcon=null;
PreparedStatement ps=null;
Statement st=null;
ResultSet rs=null;
String Pid,PDate,Sid,Sname,Sclass;
int TotalA,discount,AfterT,paid,due;
    public Student_Fees_Payment() {
        initComponents();
        setTitle("Payment Fees");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
        //school();
    }
public void connection(){
 try {
    jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    //st=jcon.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
    }}

    public void Initialize(){
    Pid=jTextField1PID.getText();
    Sid=jTextField2SID.getText();
    Sname=jTextField3Sname.getText();
    Sclass=jTextField4Sclass.getText();
    TotalA = Integer.parseInt(jTextField5Tammount.getText());
    discount = Integer.parseInt(jTextField8discDiscountA.getText());
    //due = Integer.parseInt(jTextField7DueA.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1PID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2SID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3Sname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4Sclass = new javax.swing.JTextField();
        jTextField5Tammount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6PaidA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7DueA = new javax.swing.JTextField();
        jTextField8discDiscountA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1Pdate = new com.toedter.calendar.JDateChooser();
        view = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8AfterT = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Payment Date ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 90, 180, 30);

        jTextField1PID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1PID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1PIDKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1PID);
        jTextField1PID.setBounds(290, 30, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Student ID ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 170, 180, 30);

        jTextField2SID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2SID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2SIDMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField2SIDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2SIDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField2SIDMouseReleased(evt);
            }
        });
        jTextField2SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2SIDActionPerformed(evt);
            }
        });
        jTextField2SID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2SIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2SIDKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2SID);
        jTextField2SID.setBounds(290, 170, 250, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText(" Student Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 230, 180, 30);

        jTextField3Sname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3Sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3SnameKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField3Sname);
        jTextField3Sname.setBounds(290, 230, 250, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText(" Student Class");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 290, 180, 30);

        jTextField4Sclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4Sclass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4SclassKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4Sclass);
        jTextField4Sclass.setBounds(290, 290, 250, 30);

        jTextField5Tammount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5Tammount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5TammountKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5Tammount);
        jTextField5Tammount.setBounds(290, 350, 250, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total Amount");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 350, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Paid Amount");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 530, 180, 30);

        jTextField6PaidA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6PaidA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6PaidAActionPerformed(evt);
            }
        });
        jTextField6PaidA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6PaidAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6PaidAKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField6PaidA);
        jTextField6PaidA.setBounds(290, 530, 250, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Due Amount");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(80, 590, 180, 30);

        jTextField7DueA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7DueA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7DueAActionPerformed(evt);
            }
        });
        jTextField7DueA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7DueAKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField7DueA);
        jTextField7DueA.setBounds(290, 590, 250, 30);

        jTextField8discDiscountA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8discDiscountA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8discDiscountAActionPerformed(evt);
            }
        });
        jTextField8discDiscountA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8discDiscountAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8discDiscountAKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField8discDiscountA);
        jTextField8discDiscountA.setBounds(290, 410, 250, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Discount Amount");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(80, 410, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Payment ID ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(80, 30, 180, 30);

        jDateChooser1Pdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jDateChooser1Pdate);
        jDateChooser1Pdate.setBounds(290, 90, 250, 30);

        view.setBackground(new java.awt.Color(255, 0, 51));
        view.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel2.add(view);
        view.setBounds(240, 670, 100, 30);

        jLabel1.setText("Set Student ID ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(290, 140, 120, 16);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("After Total");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(80, 470, 180, 30);

        jTextField8AfterT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8AfterT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8AfterTActionPerformed(evt);
            }
        });
        jTextField8AfterT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8AfterTKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField8AfterT);
        jTextField8AfterT.setBounds(290, 470, 250, 30);

        Save.setBackground(new java.awt.Color(255, 0, 51));
        Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save);
        Save.setBounds(120, 670, 100, 30);

        Delete.setBackground(new java.awt.Color(255, 0, 51));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);
        Delete.setBounds(360, 670, 100, 30);

        Clear.setBackground(new java.awt.Color(255, 0, 51));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear);
        Clear.setBounds(480, 670, 100, 30);

        Exit.setBackground(new java.awt.Color(255, 0, 51));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit);
        Exit.setBounds(600, 670, 100, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 950, 750);

        setSize(new java.awt.Dimension(963, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2SIDActionPerformed
        // Select Total Fees
          
    }//GEN-LAST:event_jTextField2SIDActionPerformed

    private void jTextField2SIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2SIDMouseClicked
      
    }//GEN-LAST:event_jTextField2SIDMouseClicked

    private void jTextField2SIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2SIDMouseReleased
     
    }//GEN-LAST:event_jTextField2SIDMouseReleased

    private void jTextField2SIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2SIDMouseExited
          
         
    }//GEN-LAST:event_jTextField2SIDMouseExited

    private void jTextField2SIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2SIDMousePressed
        
    }//GEN-LAST:event_jTextField2SIDMousePressed

    private void jTextField7DueAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7DueAActionPerformed
        // Due Button
        
    }//GEN-LAST:event_jTextField7DueAActionPerformed

    private void jTextField8discDiscountAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8discDiscountAActionPerformed
        // Discount Amount 
    }//GEN-LAST:event_jTextField8discDiscountAActionPerformed

    private void jTextField6PaidAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6PaidAActionPerformed
       
    }//GEN-LAST:event_jTextField6PaidAActionPerformed

    private void jTextField2SIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2SIDKeyReleased
        // TODO add your handling code here:
         connection();
        String se="SELECT `Name`,`Class`,`TotalFees` FROM `studentfeesdetails` WHERE `StudentID`=?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jTextField2SID.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        jTextField3Sname.setText(rs.getString(1));
        jTextField4Sclass.setText(rs.getString(2));
        jTextField5Tammount.setText(rs.getString(3));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Fees_Payment.class.getName()).log(Level.SEVERE, null, ex);
    } 
    }//GEN-LAST:event_jTextField2SIDKeyReleased

    private void jTextField8discDiscountAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8discDiscountAKeyReleased
        // TODO add your handling code here:
        Initialize();
        int AfterTotal;
        AfterTotal=TotalA-discount;
        jTextField8AfterT.setText(""+AfterTotal);
        //Initilize();
        //int Total;
        //Total=ExamF+BusF+LibaryF+AcademicF+HostelF+OthersF;
        //jTextField9TotalFees.setText(""+Total);
    }//GEN-LAST:event_jTextField8discDiscountAKeyReleased

    private void jTextField8AfterTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8AfterTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8AfterTActionPerformed

    private void jTextField6PaidAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6PaidAKeyReleased
        AfterT=Integer.parseInt(jTextField8AfterT.getText());
        paid=Integer.parseInt(jTextField6PaidA.getText());
        int DUE;
        DUE=AfterT-paid;
        jTextField7DueA.setText(""+DUE);
    }//GEN-LAST:event_jTextField6PaidAKeyReleased

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // Insert Button
        Initialize();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        PDate=sdf.format(jDateChooser1Pdate.getDate()).toString();
        ps=null;
        if(Pid.isEmpty()){
            JOptionPane.showMessageDialog(this, " Payment ID Is Empty");
        }else if(jDateChooser1Pdate.getDate()==null){
        JOptionPane.showMessageDialog(this, " Payment Date Is Empty");
        }else {
        connection();
        String se=null;
        se="INSERT INTO `student_fees_payment`(`PID`,`P_Date`,`S_ID`,`S_Name`,`S_Class`,`Total_A`,`Discount_A`,`After_T`,`Paid_A`,`Due_A`) VALUES(?,?,?,?,?,?,?,?,?,?)";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1,Pid);
                ps.setString(2,PDate);
                ps.setString(3,Sid);
                ps.setString(4,Sname);
                ps.setString(5,Sclass);
                ps.setInt(6, TotalA);
                ps.setInt(7, discount);
                ps.setInt(8, AfterT);
                ps.setInt(9, paid);
                ps.setInt(10, Integer.parseInt(jTextField7DueA.getText()));
                boolean b=ps.execute();
                if(!b){
                JOptionPane.showMessageDialog(this," Data Insert Successfully...");
                clear();
                }else{
                JOptionPane.showMessageDialog(this," Data Insert Filsd...");
                }  
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,ex);
            }
        
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // View Payment
        if(jTextField1PID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First You Enter Payment ID ");
        jTextField1PID.requestFocus();
        }else{
        connection();
        String se=null;
        se="SELECT *FROM `student_fees_payment` WHERE `PID` =?";
            try {
           //PID`,`P_Date`,`S_ID`,`S_Name`,`S_Class`,`Total_A`,`Discount_A`,`After_T`,`Paid_A`,`Due_A`
                ps=jcon.prepareStatement(se);
                ps.setString(1, jTextField1PID.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                jTextField1PID.setText(rs.getString("PID"));
                jDateChooser1Pdate.setDate(rs.getDate("P_Date"));
                jTextField2SID.setText(rs.getString("S_ID"));
                jTextField3Sname.setText(rs.getString("S_Name"));
                jTextField4Sclass.setText(rs.getString("S_Class"));
                jTextField5Tammount.setText(rs.getString("Total_A"));
                jTextField8discDiscountA.setText(rs.getString("Discount_A"));
                jTextField8AfterT.setText(rs.getString("After_T"));
                jTextField6PaidA.setText(rs.getString("Paid_A"));
                jTextField7DueA.setText(rs.getString("Due_A"));
                 }else{
                JOptionPane.showMessageDialog(this," Your ID Is Rong ");
                jTextField1PID.setText("");
                jTextField1PID.requestFocus();
                }
            }   catch (Exception ex) {
                JOptionPane.showMessageDialog(this,ex);
            }}
    }//GEN-LAST:event_viewActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // Delete Button
        if(jTextField1PID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First You View Record");
        view.requestFocus();
        }else if(jTextField2SID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First You View Record");
        }else if(jTextField3Sname.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First You View Record");
        }else{
         int D=JOptionPane.showConfirmDialog(this," Do you want to Delete this Record");
         if(D==0){
        connection();
        String de=null;
        de="DELETE FROM `student_fees_payment` WHERE `PID`=?";
            try {
                ps=jcon.prepareStatement(de);
                ps.setString(1, jTextField1PID.getText());
                int i=ps.executeUpdate();
                if(i==1){
                JOptionPane.showMessageDialog(this," Delete Record Success..");
                clear();
                }else{
                JOptionPane.showMessageDialog(this," Delete Record Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student_Fees_Payment.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         }}
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // Clear Button
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Close Button
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void jTextField1PIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1PIDKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1PIDKeyTyped

    private void jTextField2SIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2SIDKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2SIDKeyTyped

    private void jTextField5TammountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5TammountKeyTyped
        // TODO add your handling code here:
        evt.consume();
    }//GEN-LAST:event_jTextField5TammountKeyTyped

    private void jTextField8discDiscountAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8discDiscountAKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8discDiscountAKeyTyped

    private void jTextField8AfterTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8AfterTKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8AfterTKeyTyped

    private void jTextField6PaidAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6PaidAKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6PaidAKeyTyped

    private void jTextField7DueAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7DueAKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7DueAKeyTyped

    private void jTextField3SnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3SnameKeyTyped
        // TODO add your handling code here:
        //char c=evt.getKeyChar();
            evt.consume();
        
        
    }//GEN-LAST:event_jTextField3SnameKeyTyped

    private void jTextField4SclassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4SclassKeyTyped
        // TODO add your handling code here:
        evt.consume();
    }//GEN-LAST:event_jTextField4SclassKeyTyped
    
    public void clear(){
    jTextField1PID.setText("");
    jDateChooser1Pdate.setDate(null);
    jTextField2SID.setText("");
    jTextField3Sname.setText("");
    jTextField4Sclass.setText("");
    jTextField5Tammount.setText("");
    jTextField6PaidA.setText("");
    jTextField8discDiscountA.setText("");
    jTextField8AfterT.setText("");
    jTextField7DueA.setText("");
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
            java.util.logging.Logger.getLogger(Student_Fees_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Fees_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Fees_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Fees_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Fees_Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Save;
    private com.toedter.calendar.JDateChooser jDateChooser1Pdate;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1PID;
    private javax.swing.JTextField jTextField2SID;
    private javax.swing.JTextField jTextField3Sname;
    private javax.swing.JTextField jTextField4Sclass;
    private javax.swing.JTextField jTextField5Tammount;
    private javax.swing.JTextField jTextField6PaidA;
    private javax.swing.JTextField jTextField7DueA;
    private javax.swing.JTextField jTextField8AfterT;
    private javax.swing.JTextField jTextField8discDiscountA;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
