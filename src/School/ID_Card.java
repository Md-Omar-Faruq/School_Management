
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ID_Card extends javax.swing.JFrame {
   Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    byte picture[]=null;
    public ID_Card() {
        initComponents();
        setResizable(false);
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
        jLabel1p = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Class = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2Fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4Mname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5Height = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6Weight = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7Bgroup = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Address = new javax.swing.JTextArea();
        Save = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jTextField2Name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1SearchID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField7Mobile = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jLabel1p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));
        jPanel1.add(jLabel1p);
        jLabel1p.setBounds(370, 60, 140, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Class");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 210, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search ID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 10, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Unuversal Tred Center");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 110, 300, 30);

        jTextField1Class.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField1Class);
        jTextField1Class.setBounds(160, 210, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Father's Name");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 290, 150, 30);

        jTextField2Fname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField2Fname);
        jTextField2Fname.setBounds(160, 290, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("ID No");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 170, 150, 30);

        jTextField3ID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3IDActionPerformed(evt);
            }
        });
        jTextField3ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3IDKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3ID);
        jTextField3ID.setBounds(160, 170, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mither's Name");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 330, 150, 30);

        jTextField4Mname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField4Mname);
        jTextField4Mname.setBounds(160, 330, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Height");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 370, 150, 30);

        jTextField5Height.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField5Height);
        jTextField5Height.setBounds(160, 370, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Weight");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 410, 150, 30);

        jTextField6Weight.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField6Weight);
        jTextField6Weight.setBounds(160, 410, 170, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Blad Group");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 450, 150, 30);

        jTextField7Bgroup.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField7Bgroup);
        jTextField7Bgroup.setBounds(160, 450, 170, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Address");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 550, 150, 30);

        jTextArea1Address.setColumns(20);
        jTextArea1Address.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 530, 170, 80);

        Save.setBackground(new java.awt.Color(0, 0, 204));
        Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(0, 204, 153));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save);
        Save.setBounds(380, 240, 110, 31);

        View.setBackground(new java.awt.Color(0, 0, 204));
        View.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        View.setForeground(new java.awt.Color(0, 204, 153));
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View);
        View.setBounds(380, 290, 110, 31);

        Delete.setBackground(new java.awt.Color(0, 0, 204));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 204, 153));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(380, 340, 110, 31);

        Close.setBackground(new java.awt.Color(0, 0, 204));
        Close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(0, 204, 153));
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close);
        Close.setBounds(380, 440, 110, 31);

        Clear.setBackground(new java.awt.Color(0, 0, 204));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 204, 153));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(380, 390, 110, 31);

        jTextField2Name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField2Name);
        jTextField2Name.setBounds(160, 250, 170, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Name");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 250, 150, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Student Id Card");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 70, 300, 30);

        jTextField1SearchID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1SearchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SearchIDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1SearchID);
        jTextField1SearchID.setBounds(360, 10, 150, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Mobile");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 490, 150, 30);

        jTextField7Mobile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(jTextField7Mobile);
        jTextField7Mobile.setBounds(160, 490, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 650);

        setSize(new java.awt.Dimension(568, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     void imgUp(byte pic[] ){
    picture=pic;
}
    
    private void jTextField3IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3IDKeyReleased
        // TODO add your handling code here:
        connection();
        String se=null;
        se="SELECT `Class`,`Name`,`FatherName`,`Mother_Name`,`ContractNo`,`Address`,`Picture` FROM `student_admission` WHERE `Id`=?";
       
       try {
           ps=jcon.prepareStatement(se);
           ps.setString(1,jTextField3ID.getText());
           rs=ps.executeQuery();
           if(rs.next()){
           jTextField1Class.setText(rs.getString("Class"));
           jTextField2Name.setText(rs.getString("Name"));
           jTextField2Fname.setText(rs.getString("FatherName"));
           jTextField4Mname.setText(rs.getString("Mother_Name"));
           jTextField7Mobile.setText(rs.getString("ContractNo"));
           jTextArea1Address.setText(rs.getString("Address"));
           byte pic[]=rs.getBytes("Picture");
           imgUp( pic );
           ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel1p.getWidth(),jLabel1p.getHeight(),java.awt.Image.SCALE_SMOOTH));
           jLabel1p.setIcon(im);
           }else{JOptionPane.showMessageDialog(this,"Id Is Rong");}
       } catch (SQLException ex) {
           Logger.getLogger(ID_Card.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jTextField3IDKeyReleased

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        if(jTextField3ID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At Frist you Set Student Id Ther Set Some Information");
        jTextField3ID.requestFocus();
        }else{
        connection();
        String in=null;
        in="INSERT INTO `id_card`(`S_ID`,`Class`,`Name`,`F_Name`,`M_Name`,`Height`,`Weight`,`Blad_Group`,`Mobile`,`Address`,`Picture`) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps=jcon.prepareStatement(in);
                ps.setString(1,jTextField3ID.getText());
                ps.setString(2,jTextField1Class.getText());
                ps.setString(3,jTextField2Name.getText());
                ps.setString(4,jTextField2Fname.getText());
                ps.setString(5,jTextField4Mname.getText());
                ps.setString(6,jTextField5Height.getText());
                ps.setString(7,jTextField6Weight.getText());
                ps.setString(8,jTextField7Bgroup.getText());
                ps.setString(9,jTextField7Mobile.getText());
                ps.setString(10,jTextArea1Address.getText());
                ps.setBytes(11,picture);
                boolean b=ps.execute();
                  if(!b){
                     JOptionPane.showMessageDialog(this,"Data Insert Success...");
                  }else{
                     JOptionPane.showMessageDialog(this,"Data Insert Filed...");
                  }
            } catch (SQLException ex) {
                Logger.getLogger(ID_Card.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
       if(jTextField1SearchID.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "At First you Set Student Id In Search Id");
       jTextField1SearchID.requestFocus();
       }else{
       connection();
       String se=null;
       se="SELECT * FROM `id_card` WHERE `S_ID`=?";
           try {
               ps=jcon.prepareStatement(se);
               ps.setString(1,jTextField1SearchID.getText());
               rs=ps.executeQuery();
               if(rs.next()){
               jTextField3ID.setText(rs.getString("S_ID"));
               jTextField1Class.setText(rs.getString("Class"));
               jTextField2Name.setText(rs.getString("Name"));
               jTextField2Fname.setText(rs.getString("F_Name"));
               jTextField4Mname.setText(rs.getString("M_Name"));
               jTextField5Height.setText(rs.getString("Height"));
               jTextField6Weight.setText(rs.getString("Weight"));
               jTextField7Bgroup.setText(rs.getString("Blad_Group"));
               jTextField7Mobile.setText(rs.getString("Mobile"));
               jTextArea1Address.setText(rs.getString("Address"));
               byte pic[]=rs.getBytes("Picture");
               ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel1p.getWidth(),jLabel1p.getHeight(),java.awt.Image.SCALE_SMOOTH));
               jLabel1p.setIcon(im);
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
    }//GEN-LAST:event_ViewActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // Clear Button
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // Delete Button
        if(jTextField1SearchID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First you View Record");
        jTextField1SearchID.requestFocus();
        }else if(jTextField3ID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," At First you View Record");
        jTextField1SearchID.requestFocus();
        }else{
        int d=JOptionPane.showConfirmDialog(this," Are you Sure you want to Delete This Record");
        if(d==0){
        connection();
        String de=null;
        de="DELETE FROM `id_card` WHERE `S_ID`="+jTextField1SearchID.getText();
            try {
                ps=jcon.prepareStatement(de);
                int b=ps.executeUpdate();
                if(b==1){
                clear();
                JOptionPane.showMessageDialog(this," Data Delete Success..");
                }else{
                JOptionPane.showMessageDialog(this," Data Delete Filed..");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ID_Card.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
    }//GEN-LAST:event_DeleteActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // Close
        dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void jTextField3IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3IDActionPerformed

    private void jTextField1SearchIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SearchIDKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SearchIDKeyTyped
    
    public void clear(){
    jTextField1SearchID.setText("");
    jTextField3ID.setText("");
    jTextField1Class.setText("");
    jTextField2Name.setText("");
    jTextField2Fname.setText("");
    jTextField4Mname.setText("");
    jTextField5Height.setText("");
    jTextField6Weight.setText("");
    jTextField7Bgroup.setText("");
    jTextField7Mobile.setText("");
    jTextArea1Address.setText("");
    jLabel1p.setIcon(null);
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
            java.util.logging.Logger.getLogger(ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ID_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ID_Card().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Close;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Save;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel1p;
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
    private javax.swing.JTextArea jTextArea1Address;
    private javax.swing.JTextField jTextField1Class;
    private javax.swing.JTextField jTextField1SearchID;
    private javax.swing.JTextField jTextField2Fname;
    private javax.swing.JTextField jTextField2Name;
    private javax.swing.JTextField jTextField3ID;
    private javax.swing.JTextField jTextField4Mname;
    private javax.swing.JTextField jTextField5Height;
    private javax.swing.JTextField jTextField6Weight;
    private javax.swing.JTextField jTextField7Bgroup;
    private javax.swing.JTextField jTextField7Mobile;
    // End of variables declaration//GEN-END:variables
}
