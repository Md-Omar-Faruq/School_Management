
package School;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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


public class School_Notish_bord extends javax.swing.JFrame {
Connection jcon=null;
PreparedStatement ps=null;
Statement st=null;
ResultSet rs=null;

    public School_Notish_bord() {
        initComponents();
        setTitle("View Notice Bord");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("images (10).jpg")));
    }
public void connection(){
 try {
  
    jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    //st=jcon.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Teacher_Addmission.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Notish = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        search = new javax.swing.JButton();
        Clear1 = new javax.swing.JButton();
        jPanel2NotishP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        Notish.setBackground(new java.awt.Color(255, 0, 0));
        Notish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Notish.setForeground(new java.awt.Color(255, 255, 255));
        Notish.setText("Add Notish");
        Notish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotishActionPerformed(evt);
            }
        });
        jPanel1.add(Notish);
        Notish.setBounds(1220, 10, 150, 30);

        Clear.setBackground(new java.awt.Color(255, 0, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(1110, 10, 100, 31);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(100, 10, 210, 30);

        search.setBackground(new java.awt.Color(255, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(0, 10, 100, 31);

        Clear1.setBackground(new java.awt.Color(255, 0, 0));
        Clear1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear1.setForeground(new java.awt.Color(255, 255, 255));
        Clear1.setText("Print");
        Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear1ActionPerformed(evt);
            }
        });
        jPanel1.add(Clear1);
        Clear1.setBounds(1000, 10, 100, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1390, 60);

        jPanel2NotishP.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2NotishP.setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(51, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2NotishP.add(jScrollPane1);
        jScrollPane1.setBounds(4, 3, 1390, 740);

        getContentPane().add(jPanel2NotishP);
        jPanel2NotishP.setBounds(0, 60, 1380, 740);

        setSize(new java.awt.Dimension(1402, 848));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // Clear Button
        jTextArea1.setText("");
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_ClearActionPerformed

    private void Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear1ActionPerformed
        // Pnanle Print
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
           public int print(Graphics pg, PageFormat pf,int pageNum){
               if(pageNum>0){
               return Printable.NO_SUCH_PAGE;
               }
               Graphics2D g2 = (Graphics2D) pg;
               g2.translate(pf.getImageableX(),pf.getImageableY());
               g2.scale(0.24, 0.24);
               jPanel2NotishP.paint(g2);
               return Printable.PAGE_EXISTS;
           }
        });
        boolean b=job.printDialog();
        if(b){
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(View_Registation_card.class.getName()).log(Level.SEVERE, null, ex);
            } }
    }//GEN-LAST:event_Clear1ActionPerformed

    private void NotishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotishActionPerformed
        // Notish Bord Entry Button
        Add_notish_bord anb=new Add_notish_bord();
        anb.setVisible(true);
    }//GEN-LAST:event_NotishActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
         if(jDateChooser1.getDate()==null){
        JOptionPane.showMessageDialog(this," You view Record By Date");
        jDateChooser1.requestFocus();
        }else{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String Date=sdf.format(jDateChooser1.getDate()).toString();
            connection();
            String se=null;
            se="SELECT `Notish` FROM `notish_bord` WHERE `Date` = ?";
            try {
                ps=jcon.prepareStatement(se);
                ps.setString(1, Date);
                rs=ps.executeQuery();
                if(rs.next()){
                jTextArea1.setText(rs.getString("Notish"));
                boolean b=ps.execute();
                 if(b){
                    JOptionPane.showMessageDialog(this," Data View Successfully..");
                 }else{
                    JOptionPane.showMessageDialog(this," Data View Filed..");
                 }
                }else{
                JOptionPane.showMessageDialog(this," No Informatiom In This Date ");
                jDateChooser1.setDate(null);
                jDateChooser1.requestFocus();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Add_notish_bord.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(School_Notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School_Notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School_Notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School_Notish_bord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new School_Notish_bord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Clear1;
    private javax.swing.JButton Notish;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2NotishP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
