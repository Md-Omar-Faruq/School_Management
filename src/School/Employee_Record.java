
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


public class Employee_Record extends javax.swing.JFrame {
Connection jcon=null;
Statement st=null;
PreparedStatement ps=null;
ResultSet rs=null;
    public Employee_Record() {
        initComponents();
        setTitle(" Employee Record");
        Erecord();
        setTitle("Employee Record");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3Print = new javax.swing.JButton();
        jButton4ViewRecord = new javax.swing.JButton();
        jButton5Clear = new javax.swing.JButton();
        jButton6Refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelTTeacher = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Employee Record");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 170, 40);

        jButton3Print.setBackground(new java.awt.Color(204, 0, 0));
        jButton3Print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3Print.setForeground(new java.awt.Color(255, 255, 255));
        jButton3Print.setText("Print");
        jButton3Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3PrintActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3Print);
        jButton3Print.setBounds(1650, 10, 120, 40);

        jButton4ViewRecord.setBackground(new java.awt.Color(204, 0, 0));
        jButton4ViewRecord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4ViewRecord.setForeground(new java.awt.Color(255, 255, 255));
        jButton4ViewRecord.setText("View Recoerd");
        jButton4ViewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ViewRecordActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4ViewRecord);
        jButton4ViewRecord.setBounds(1210, 10, 170, 40);

        jButton5Clear.setBackground(new java.awt.Color(204, 0, 0));
        jButton5Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5Clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton5Clear.setText("Clear");
        jButton5Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5Clear);
        jButton5Clear.setBounds(1390, 10, 120, 40);

        jButton6Refresh.setBackground(new java.awt.Color(204, 0, 0));
        jButton6Refresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6Refresh.setForeground(new java.awt.Color(255, 255, 255));
        jButton6Refresh.setText("Refresh");
        jButton6Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6Refresh);
        jButton6Refresh.setBounds(1520, 10, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total Employee");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, 10, 160, 40);

        jLabelTTeacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabelTTeacher);
        jLabelTTeacher.setBounds(990, 10, 160, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1780, 60);

        jTable1.setBackground(new java.awt.Color(204, 0, 51));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Salary", "Gender", "Join Date", "Address", "Type", "F Name", "Contract", "Qualification", "Academic Year", "Relision"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 1780, 860);

        setSize(new java.awt.Dimension(1806, 972));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void clear(){
DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
dtm.setRowCount(0);
jLabelTTeacher.setText("");
}
    private void jButton3PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3PrintActionPerformed
      DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
      
        try {
        boolean b=jTable1.print();
        if(b){
            JOptionPane.showMessageDialog(this," Print Success...");
        }else{
        JOptionPane.showMessageDialog(this," Printing Filed..");
        }
    } catch (PrinterException ex) {
        Logger.getLogger(Employee_Record.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_jButton3PrintActionPerformed

    private void jButton4ViewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ViewRecordActionPerformed
        // View Record Button
        clear();
        Erecord();
    }//GEN-LAST:event_jButton4ViewRecordActionPerformed

    private void jButton5ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ClearActionPerformed
        // Clear Button 
         clear();
    }//GEN-LAST:event_jButton5ClearActionPerformed

    private void jButton6RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6RefreshActionPerformed
        // Refresh Button
        clear();
        Erecord();
    }//GEN-LAST:event_jButton6RefreshActionPerformed

    public void connection(){
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }}
    
public void Erecord(){
connection();
String eselect=null;
    DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
    eselect="SELECT `ID`,`Name`,`Email`,`Salary`,`Gender`,`Join_Date`,`Address`,`Employee_Type`,`Father_Name`,`Mobile_No`,`Qualification`,`Academic_Year`,`Religion` FROM `employee_addmission`";
    try {
        ps=jcon.prepareStatement(eselect);
        rs=ps.executeQuery();
        while(rs.next()){
        dtm.addRow(new Object[]{rs.getInt("ID"),rs.getString("Name"),rs.getString("Email"),rs.getInt("Salary"),rs.getString("Gender"),rs.getDate("Join_Date"),rs.getString("Address"),rs.getString("Employee_Type"),rs.getString("Father_Name"),rs.getInt("Mobile_No"),rs.getString("Qualification"),rs.getString("Academic_Year"),rs.getString("Religion")});
        }
        int t=dtm.getRowCount();
        jLabelTTeacher.setText(""+t);
    } catch (SQLException ex) {
        Logger.getLogger(Employee_Record.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Employee_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3Print;
    private javax.swing.JButton jButton4ViewRecord;
    private javax.swing.JButton jButton5Clear;
    private javax.swing.JButton jButton6Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTTeacher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
