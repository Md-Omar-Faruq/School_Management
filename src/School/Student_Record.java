
package School;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
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

public class Student_Record extends javax.swing.JFrame {
Connection jcon=null;
Statement st=null;
PreparedStatement ps=null;
ResultSet rs=null;
    public Student_Record() {
        initComponents();
        students();
        gurdian();
        setTitle("Studet Record");
        ts();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Student = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2Gurdian = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1ReADD = new javax.swing.JButton();
        jButton2GurdianPrint = new javax.swing.JButton();
        jButton3StudentPrint = new javax.swing.JButton();
        jButton4Clear = new javax.swing.JButton();
        jLabelTs = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTable1Student.setBackground(new java.awt.Color(0, 255, 255));
        jTable1Student.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1Student.setForeground(new java.awt.Color(0, 0, 255));
        jTable1Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Contract", "Email", "Gender", "Address", "Session", "Roll", "Class", "Group", "Section", "Nationality", "Relision", "Birth Date", "Add Date", "Image"
            }
        ));
        jTable1Student.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1Student);

        jTabbedPane1.addTab("Student Record", jScrollPane1);

        jPanel2.setLayout(null);

        jTable2Gurdian.setBackground(new java.awt.Color(0, 255, 255));
        jTable2Gurdian.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2Gurdian.setForeground(new java.awt.Color(0, 51, 255));
        jTable2Gurdian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Father Name", "Father Occupation", "Father Contract", "Father Address", "Mother Name", "Mother Occupation", "Mother Contract", "Mother Address"
            }
        ));
        jTable2Gurdian.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2Gurdian);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 1910, 910);

        jTabbedPane1.addTab("Gurdian Record", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 60, 1920, 920);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(null);

        jButton1ReADD.setBackground(new java.awt.Color(204, 0, 0));
        jButton1ReADD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1ReADD.setForeground(new java.awt.Color(255, 255, 255));
        jButton1ReADD.setText("Rifresh");
        jButton1ReADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ReADDActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1ReADD);
        jButton1ReADD.setBounds(1750, 10, 110, 30);

        jButton2GurdianPrint.setBackground(new java.awt.Color(204, 0, 0));
        jButton2GurdianPrint.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2GurdianPrint.setForeground(new java.awt.Color(255, 255, 255));
        jButton2GurdianPrint.setText("Print Gurdian Record");
        jButton2GurdianPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GurdianPrintActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2GurdianPrint);
        jButton2GurdianPrint.setBounds(1410, 10, 210, 30);

        jButton3StudentPrint.setBackground(new java.awt.Color(204, 0, 0));
        jButton3StudentPrint.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3StudentPrint.setForeground(new java.awt.Color(255, 255, 255));
        jButton3StudentPrint.setText("Print Student Record");
        jPanel3.add(jButton3StudentPrint);
        jButton3StudentPrint.setBounds(1190, 10, 210, 30);

        jButton4Clear.setBackground(new java.awt.Color(204, 0, 0));
        jButton4Clear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4Clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton4Clear.setText("Clear");
        jButton4Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ClearActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4Clear);
        jButton4Clear.setBounds(1630, 10, 110, 30);

        jLabelTs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelTs);
        jLabelTs.setBounds(900, 10, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total Student");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(710, 10, 180, 30);

        jComboBoxSClass.setBackground(new java.awt.Color(255, 0, 255));
        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseMoved(evt);
            }
        });
        jComboBoxSClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSClassActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxSClass);
        jComboBoxSClass.setBounds(30, 10, 210, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(270, 10, 200, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1920, 60);

        setSize(new java.awt.Dimension(1939, 1041));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void ts(){
        connection();
        String total=null;
        total="SELECT COUNT(`Id`) FROM `student_admission`";
    try {
        ps=jcon.prepareStatement(total);
        rs=ps.executeQuery();
        while(rs.next()){
        jLabelTs.setText(""+rs.getInt(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Record.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
    private void jButton2GurdianPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GurdianPrintActionPerformed
    try {
        // Print Button
        boolean b=jTable2Gurdian.print();
        if(b)
            JOptionPane.showMessageDialog(this,"Print Success...");
        else
            JOptionPane.showMessageDialog(this,"Printing Proccess..");
    } catch (PrinterException ex) {
        Logger.getLogger(Student_Record.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton2GurdianPrintActionPerformed

    private void jButton4ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ClearActionPerformed
     clear();
    }//GEN-LAST:event_jButton4ClearActionPerformed
public void clear(){
        DefaultTableModel dtms=(DefaultTableModel)jTable1Student.getModel();
        DefaultTableModel dtmg=(DefaultTableModel)jTable2Gurdian.getModel();
        dtms.setRowCount(0);
        dtmg.setRowCount(0);
        jLabelTs.setText("");
}
    private void jButton1ReADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ReADDActionPerformed
         clear();
        students();
        gurdian();
    }//GEN-LAST:event_jButton1ReADDActionPerformed

    private void jComboBoxSClassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassMouseMoved

    private void jComboBoxSClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSClassActionPerformed
        // TODO add your handling code here:
        connection();
        String ts=null;
        ts="SELECT COUNT(`Id`) FROM `student_admission` WHERE `Class` = ?";
    try {
        ps=jcon.prepareStatement(ts);
        ps.setString(1, jComboBoxSClass.getSelectedItem().toString());
        rs=ps.executeQuery();
        while(rs.next()){
        jLabel1.setText(""+rs.getInt(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Record.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jComboBoxSClassActionPerformed

public void students(){
connection();
String selectdes=null;
DefaultTableModel dtm=(DefaultTableModel)jTable1Student.getModel();
selectdes="SELECT `Id`,`Name`,`ContractNo`,`Email`,`Gender`,`Address`,`Session`,`Roll_NO`,`Class`,`Group`,`Section`,`Nationality`,`Religion`,`BirthDate`,`AddmissionDate`,`Picture` FROM `student_admission`";
    try {
        ps=jcon.prepareStatement(selectdes);
        rs=ps.executeQuery();
        while(rs.next()){
        dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getDate(14),rs.getDate(15),rs.getBlob(16)});
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Record.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void gurdian(){
connection();
String selected=null;
DefaultTableModel dtm=(DefaultTableModel)jTable2Gurdian.getModel();
selected="SELECT `Id`,`FatherName`,`Father_Occupation`,`Father_MobileNo`,`Father_Address`,`Mother_Name`,`Mother_Occupation`,`Mother_MobileNo`,`Mother_Address` FROM `student_admission`";
    try {
        ps=jcon.prepareStatement(selected);
        rs=ps.executeQuery();
        while(rs.next()){
        dtm.addRow(new Object[]{rs.getInt("Id"),rs.getString("FatherName"),rs.getString("Father_Occupation"),rs.getInt("Father_MobileNo"),rs.getString("Father_Address"),rs.getString("Mother_Name"),rs.getString("Mother_Occupation"),rs.getInt("Mother_MobileNo"),rs.getString("Mother_Address")});
        
        }
    } catch (SQLException ex) {
        Logger.getLogger(Student_Record.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ReADD;
    private javax.swing.JButton jButton2GurdianPrint;
    private javax.swing.JButton jButton3StudentPrint;
    private javax.swing.JButton jButton4Clear;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTs;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1Student;
    private javax.swing.JTable jTable2Gurdian;
    // End of variables declaration//GEN-END:variables
}
