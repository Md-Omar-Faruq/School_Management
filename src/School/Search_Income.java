
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


public class Search_Income extends javax.swing.JFrame {

Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Search_Income() {
        initComponents();
        setTitle("Income Search");
        showMathode();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11id = new javax.swing.JLabel();
        jLabel12ICD = new javax.swing.JLabel();
        jLabel13ICT = new javax.swing.JLabel();
        jLabel14Autho = new javax.swing.JLabel();
        jLabel15En = new javax.swing.JLabel();
        jLabel16EB = new javax.swing.JLabel();
        jLabel17VNO = new javax.swing.JLabel();
        jLabel18Ammo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Exit = new javax.swing.JButton();
        jTextField1Search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        First = new javax.swing.JButton();
        Previous = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Last = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel11id1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Income", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SL ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 110, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Income Date");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 180, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Income Type");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 250, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Authorization");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 320, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Entry Date");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 390, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Entry By");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 460, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Voucher No");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 530, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Ammount");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 600, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Discription");
        jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 670, 130, 80);

        jLabel11id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel11id);
        jLabel11id.setBounds(260, 110, 410, 30);

        jLabel12ICD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12ICD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel12ICD);
        jLabel12ICD.setBounds(260, 180, 410, 30);

        jLabel13ICT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13ICT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel13ICT);
        jLabel13ICT.setBounds(260, 250, 410, 30);

        jLabel14Autho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14Autho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel14Autho);
        jLabel14Autho.setBounds(260, 320, 410, 30);

        jLabel15En.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15En.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel15En);
        jLabel15En.setBounds(260, 390, 410, 30);

        jLabel16EB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16EB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel16EB);
        jLabel16EB.setBounds(260, 460, 410, 30);

        jLabel17VNO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17VNO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel17VNO);
        jLabel17VNO.setBounds(260, 530, 410, 30);

        jLabel18Ammo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18Ammo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        jPanel1.add(jLabel18Ammo);
        jLabel18Ammo.setBounds(260, 600, 410, 30);

        jTextArea1.setBackground(new java.awt.Color(51, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 670, 410, 80);

        Exit.setBackground(new java.awt.Color(204, 0, 0));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(750, 800, 110, 40);

        jTextField1Search.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1Search.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SearchKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1Search);
        jTextField1Search.setBounds(780, 60, 170, 30);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(940, 60, 120, 30);

        First.setBackground(new java.awt.Color(204, 0, 0));
        First.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        First.setForeground(new java.awt.Color(255, 255, 255));
        First.setText("Fast");
        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });
        jPanel1.add(First);
        First.setBounds(130, 800, 110, 40);

        Previous.setBackground(new java.awt.Color(204, 0, 0));
        Previous.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Previous.setForeground(new java.awt.Color(255, 255, 255));
        Previous.setText("Previous");
        Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousActionPerformed(evt);
            }
        });
        jPanel1.add(Previous);
        Previous.setBounds(260, 800, 110, 40);

        Next.setBackground(new java.awt.Color(204, 0, 0));
        Next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel1.add(Next);
        Next.setBounds(390, 800, 110, 40);

        Last.setBackground(new java.awt.Color(204, 0, 0));
        Last.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Last.setForeground(new java.awt.Color(255, 255, 255));
        Last.setText("Last");
        Last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastActionPerformed(evt);
            }
        });
        jPanel1.add(Last);
        Last.setBounds(510, 800, 110, 40);

        Clear.setBackground(new java.awt.Color(204, 0, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(630, 800, 110, 40);

        jLabel11id1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11id1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11id1.setText("Search By Voucner no");
        jPanel1.add(jLabel11id1);
        jLabel11id1.setBounds(780, 40, 160, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 870);

        setSize(new java.awt.Dimension(1117, 914));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed
    
    public void showMathode(){
    connection();
    String se=null;
    se="SELECT *FROM `income`";
    try {
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        if(rs.next()){
        
        }
    } catch (SQLException ex) {
        Logger.getLogger(Search_Income.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        jLabel11id.setText(null);
        jLabel12ICD.setText(null);
        jLabel13ICT.setText(null);
        jLabel14Autho.setText(null);
        jLabel15En.setText(null);
        jLabel16EB.setText(null);
        jLabel17VNO.setText(null);
        jLabel18Ammo.setText(null);
        jTextArea1.setText("");
        
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Find Button
        if(jTextField1Search.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Voucher No Is Empty Set Voucher No");
        jTextField1Search.requestFocus();
        }else{
        connection();
        String se=null;
        se="SELECT * FROM `income` WHERE `Voucher_No` = ?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1,jTextField1Search.getText());
        rs=ps.executeQuery();
        if(rs.next()){
        jLabel11id.setText(rs.getString("SL_ID"));
        jLabel12ICD.setText(rs.getString("Income_Date"));
        jLabel13ICT.setText(rs.getString("Income_Type"));
        jLabel14Autho.setText(rs.getString("Authorization_By"));
        jLabel15En.setText(rs.getString("Entry_Date"));
        jLabel16EB.setText(rs.getString("Entry_By"));
        jLabel17VNO.setText(rs.getString("Voucher_No"));
        jLabel18Ammo.setText(rs.getString("Ammount"));
        jTextArea1.setText(rs.getString("Discroption"));
        }else{
            JOptionPane.showMessageDialog(this," Your ID Is Rong");
            jTextField1Search.setText("");
            jTextField1Search.requestFocus();
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Search_Income.class.getName()).log(Level.SEVERE, null, ex);
    }}   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstActionPerformed
    try {
        // First Date
        rs.first();
        jLabel11id.setText(rs.getString("SL_ID"));
        jLabel12ICD.setText(rs.getString("Income_Date"));
        jLabel13ICT.setText(rs.getString("Income_Type"));
        jLabel14Autho.setText(rs.getString("Authorization_By"));
        jLabel15En.setText(rs.getString("Entry_Date"));
        jLabel16EB.setText(rs.getString("Entry_By"));
        jLabel17VNO.setText(rs.getString("Voucher_No"));
        jLabel18Ammo.setText(rs.getString("Ammount"));
        jTextArea1.setText(rs.getString("Discroption"));
    } catch (SQLException ex) {
        Logger.getLogger(Search_Income.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_FirstActionPerformed

    private void LastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastActionPerformed
    try {
        // Last Data
        rs.last();
        jLabel11id.setText(rs.getString("SL_ID"));
        jLabel12ICD.setText(rs.getString("Income_Date"));
        jLabel13ICT.setText(rs.getString("Income_Type"));
        jLabel14Autho.setText(rs.getString("Authorization_By"));
        jLabel15En.setText(rs.getString("Entry_Date"));
        jLabel16EB.setText(rs.getString("Entry_By"));
        jLabel17VNO.setText(rs.getString("Voucher_No"));
        jLabel18Ammo.setText(rs.getString("Ammount"));
        jTextArea1.setText(rs.getString("Discroption"));
    } catch (SQLException ex) {
        Logger.getLogger(Search_Income.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_LastActionPerformed

    private void PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousActionPerformed
    try {
        // TODO add your handling code here:
        if(!rs.first()){
        rs.previous();
        jLabel11id.setText(rs.getString("SL_ID"));
        jLabel12ICD.setText(rs.getString("Income_Date"));
        jLabel13ICT.setText(rs.getString("Income_Type"));
        jLabel14Autho.setText(rs.getString("Authorization_By"));
        jLabel15En.setText(rs.getString("Entry_Date"));
        jLabel16EB.setText(rs.getString("Entry_By"));
        jLabel17VNO.setText(rs.getString("Voucher_No"));
        jLabel18Ammo.setText(rs.getString("Ammount"));
        jTextArea1.setText(rs.getString("Discroption"));
        }else{
        JOptionPane.showMessageDialog(this," This Is First Id ");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Search_Income.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_PreviousActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
    try {
        // TODO add your handling code here:
        if(rs.last()){
        JOptionPane.showMessageDialog(this," This Is Last ID");
        }else{
        rs.next();
        jLabel11id.setText(rs.getString("SL_ID"));
        jLabel12ICD.setText(rs.getString("Income_Date"));
        jLabel13ICT.setText(rs.getString("Income_Type"));
        jLabel14Autho.setText(rs.getString("Authorization_By"));
        jLabel15En.setText(rs.getString("Entry_Date"));
        jLabel16EB.setText(rs.getString("Entry_By"));
        jLabel17VNO.setText(rs.getString("Voucher_No"));
        jLabel18Ammo.setText(rs.getString("Ammount"));
        jTextArea1.setText(rs.getString("Discroption"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Search_Income.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_NextActionPerformed

    private void jTextField1SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SearchKeyTyped
        // TODO add your handling code here:
       char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SearchKeyTyped

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
            java.util.logging.Logger.getLogger(Search_Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Income().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JButton First;
    private javax.swing.JButton Last;
    private javax.swing.JButton Next;
    private javax.swing.JButton Previous;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11id;
    private javax.swing.JLabel jLabel11id1;
    private javax.swing.JLabel jLabel12ICD;
    private javax.swing.JLabel jLabel13ICT;
    private javax.swing.JLabel jLabel14Autho;
    private javax.swing.JLabel jLabel15En;
    private javax.swing.JLabel jLabel16EB;
    private javax.swing.JLabel jLabel17VNO;
    private javax.swing.JLabel jLabel18Ammo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1Search;
    // End of variables declaration//GEN-END:variables
}
