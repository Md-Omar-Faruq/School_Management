
package School;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class View_ID_Card extends javax.swing.JFrame {
    
    Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public View_ID_Card() {
        initComponents();
        setTitle("View ID Card");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Address = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1SearchID = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Close1 = new javax.swing.JButton();
        Close2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 60, 140, 150);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Class");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 150, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Universal Tred Center");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 60, 300, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Father's Name");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 230, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("ID");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 110, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Mither's Name");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 270, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Height");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 310, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Weight");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 350, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Blad Group");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 390, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Head Master Signeture");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(360, 660, 190, 30);

        jTextArea1Address.setBackground(new java.awt.Color(102, 204, 255));
        jTextArea1Address.setColumns(20);
        jTextArea1Address.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1Address.setRows(5);
        jTextArea1Address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        jTextArea1Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1AddressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1Address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 470, 250, 140);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Name");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 190, 120, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Student Id Card");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 30, 300, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(140, 390, 150, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(140, 350, 150, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(140, 310, 150, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(140, 270, 150, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(140, 230, 150, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel19);
        jLabel19.setBounds(140, 190, 150, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(140, 150, 150, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel21);
        jLabel21.setBounds(140, 110, 150, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Address");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel22);
        jLabel22.setBounds(10, 520, 120, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 153));
        jLabel23.setText("Student Signeture");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel23);
        jLabel23.setBounds(10, 660, 150, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("Mobile");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel24);
        jLabel24.setBounds(10, 430, 120, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel25);
        jLabel25.setBounds(140, 430, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 30, 570, 700);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search ID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 90, 30);

        jTextField1SearchID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1SearchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SearchIDKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1SearchID);
        jTextField1SearchID.setBounds(90, 0, 140, 30);

        Clear.setBackground(new java.awt.Color(0, 204, 255));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 0, 102));
        Clear.setText("View");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear);
        Clear.setBounds(230, 0, 80, 30);

        Close.setBackground(new java.awt.Color(0, 204, 255));
        Close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 0, 102));
        Close.setText("Clear");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel2.add(Close);
        Close.setBounds(380, 0, 80, 30);

        Close1.setBackground(new java.awt.Color(0, 204, 255));
        Close1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Close1.setForeground(new java.awt.Color(255, 0, 102));
        Close1.setText("Print");
        Close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close1ActionPerformed(evt);
            }
        });
        jPanel2.add(Close1);
        Close1.setBounds(310, 0, 70, 30);

        Close2.setBackground(new java.awt.Color(0, 204, 255));
        Close2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Close2.setForeground(new java.awt.Color(255, 0, 102));
        Close2.setText("Add New");
        Close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close2ActionPerformed(evt);
            }
        });
        jPanel2.add(Close2);
        Close2.setBounds(460, 0, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 570, 30);

        setSize(new java.awt.Dimension(588, 771));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        
        if(jTextField1SearchID.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "At First you Set Student Id In Search Id");
       jTextField1SearchID.requestFocus();
       }else{
         try {
       connection();
       String se=null;
       se="SELECT * FROM `id_card` WHERE `S_ID`=?";
           
               ps=jcon.prepareStatement(se);
               ps.setString(1,jTextField1SearchID.getText());
               rs=ps.executeQuery();
               if(rs.next()){
               jLabel21.setText(rs.getString("S_ID"));
               jLabel20.setText(rs.getString("Class"));
               jLabel19.setText(rs.getString("Name"));
               jLabel18.setText(rs.getString("F_Name"));
               jLabel17.setText(rs.getString("M_Name"));
               jLabel16.setText(rs.getString("Height"));
               jLabel15.setText(rs.getString("Weight"));
               jLabel14.setText(rs.getString("Blad_Group"));
               jLabel25.setText(rs.getString("Mobile"));
               jTextArea1Address.setText(rs.getString("Address"));
               byte pic[]=rs.getBytes("Picture");
               ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),java.awt.Image.SCALE_SMOOTH));
               jLabel1.setIcon(im);
               boolean b=ps.execute();
                if(b){
                JOptionPane.showMessageDialog(this," Data View Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data View Filed..");
                }
               }else{
               JOptionPane.showMessageDialog(this," Your Id Is Rong");
               jTextField1SearchID.setText("");
               jTextField1SearchID.requestFocus();
               }
           } catch (SQLException ex) {
               Logger.getLogger(ID_Card.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_ClearActionPerformed

    private void Close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close2ActionPerformed
        // TODO add your handling code here:
       ID_Card id=new ID_Card();
       id.setVisible(true);
    }//GEN-LAST:event_Close2ActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // Clear Button
        clear();
    }//GEN-LAST:event_CloseActionPerformed

    private void Close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close1ActionPerformed
        // TODO add your handling code here:
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
           public int print(Graphics pg, PageFormat pf,int pageNum){
               if(pageNum>0){
               return Printable.NO_SUCH_PAGE;
               }
               Graphics2D g2 = (Graphics2D) pg;
               g2.translate(pf.getImageableX(),pf.getImageableY());
               g2.scale(0.24, 0.24);
               jPanel1.paint(g2);
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
    }//GEN-LAST:event_Close1ActionPerformed

    private void jTextField1SearchIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SearchIDKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SearchIDKeyTyped

    private void jTextArea1AddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1AddressKeyTyped
      
        evt.consume();
    }//GEN-LAST:event_jTextArea1AddressKeyTyped
    
    public void clear(){
    jTextField1SearchID.setText("");
    jTextArea1Address.setText("");
    jLabel21.setText("");
    jLabel20.setText("");
    jLabel19.setText("");
    jLabel18.setText("");
    jLabel17.setText("");
    jLabel16.setText("");
    jLabel15.setText("");
    jLabel14.setText("");
    jLabel1.setIcon(null);
    }
    
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
            java.util.logging.Logger.getLogger(View_ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_ID_Card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Close;
    private javax.swing.JButton Close1;
    private javax.swing.JButton Close2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JTextArea jTextArea1Address;
    private javax.swing.JTextField jTextField1SearchID;
    // End of variables declaration//GEN-END:variables
}
