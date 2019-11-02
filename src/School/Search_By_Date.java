
package School;

import java.awt.Toolkit;
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


public class Search_By_Date extends javax.swing.JFrame {
Connection jcon=null;
Statement st=null;
PreparedStatement ps=null;
ResultSet rs=null;
    public Search_By_Date() {
        initComponents();
        setTitle("Search Attendence by Date");
        tss();
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }

    
    public void connection(){
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }}
    
    public void tss(){
        connection();
        String se=null;
        se="SELECT COUNT(`Id`) FROM `student_admission` WHERE `Class` = ?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1, jComboBoxSClass.getSelectedItem().toString());
        rs=ps.executeQuery();
        while(rs.next()){
        jLabel1Ts.setText(""+rs.getString(1));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Search_By_Date.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1DateSearch = new com.toedter.calendar.JDateChooser();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1Ts = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(null);

        jDateChooser1DateSearch.setBackground(new java.awt.Color(255, 0, 0));
        jDateChooser1DateSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jDateChooser1DateSearch);
        jDateChooser1DateSearch.setBounds(800, 20, 160, 30);

        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxSClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseMoved(evt);
            }
        });
        jPanel1.add(jComboBoxSClass);
        jComboBoxSClass.setBounds(970, 20, 210, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 20, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1190, 70);

        jTable1.setBackground(new java.awt.Color(0, 255, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id ", "Name", "Class", "Attendence ", "Date"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 1190, 590);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(null);

        jLabel1Ts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1Ts.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel1Ts);
        jLabel1Ts.setBounds(160, 20, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Student ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 130, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 660, 1190, 70);

        setSize(new java.awt.Dimension(1208, 774));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSClassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Search Button
        DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        if(jDateChooser1DateSearch.getDate()==null){
            JOptionPane.showMessageDialog(this," Search Date Is Empty");
            jDateChooser1DateSearch.requestFocus();
        }else if(jComboBoxSClass.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this," Select Your Class");
            jComboBoxSClass.requestFocus();
        }else{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String Date=sdf.format(jDateChooser1DateSearch.getDate()).toString();
            connection();
            String se=null;
            dtm.setRowCount(0);
            se="SELECT * FROM `studentattendencr` WHERE `AttendenctDate` = ? && `Class` = ?";
            try {
               
                ps=jcon.prepareStatement(se);
                ps.setString(1,Date);
                ps.setString(2,jComboBoxSClass.getSelectedItem().toString());
                rs=ps.executeQuery();
                while(rs.next()){
                    dtm.addRow(new Object[]{rs.getInt("ID"),rs.getString("Name"),rs.getString("Class"),rs.getInt("Attendenct"),rs.getDate("AttendenctDate")});
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Search_By_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_By_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_By_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_By_Date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_By_Date().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private com.toedter.calendar.JDateChooser jDateChooser1DateSearch;
    private javax.swing.JLabel jLabel1Ts;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
