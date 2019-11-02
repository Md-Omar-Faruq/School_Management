
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
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;

public class Income_Entry extends javax.swing.JFrame {
    Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String  id,ammount;
    String IncomeDate,IncomeType,Authorization,EntryDate,EntryBy,VoucherNo,Discription;
    public Income_Entry() {
        initComponents();
        setResizable(false);
        setTitle("Income Entry");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }
    public void connection(){
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }}
    public void Initialize(){
    id=jTextField2SLID.getText();
    ammount=jTextField1Ammount.getText();
    //IncomeDate=jDateChooser2IncomeDate.getDate().toString();
    IncomeType=jComboBox1IncomeType.getSelectedItem().toString();
    Authorization=jTextField3Authorization.getText();
    //EntryDate=jDateChooser1EntryDate.getDate().toString();
    EntryBy=jTextField4EntryBy.getText();
    VoucherNo=jTextField5VoucherjNo.getText();
    Discription=jTextArea1Discription.getText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1Ammount = new javax.swing.JTextField();
        jDateChooser1EntryDate = new com.toedter.calendar.JDateChooser();
        jComboBox1IncomeType = new javax.swing.JComboBox();
        jTextField2SLID = new javax.swing.JTextField();
        jDateChooser2IncomeDate = new com.toedter.calendar.JDateChooser();
        jTextField3Authorization = new javax.swing.JTextField();
        jTextField4EntryBy = new javax.swing.JTextField();
        jTextField5VoucherjNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Discription = new javax.swing.JTextArea();
        Save = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        view = new javax.swing.JButton();
        Exit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Income Entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Discription");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 360, 160, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SL ID ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 70, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Income Date");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 160, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Income Type");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 210, 160, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Authorization By");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 280, 160, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ammount");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(610, 280, 150, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Entry By");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(610, 140, 150, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Voucher No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(610, 210, 150, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Entry Date");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(610, 70, 150, 40);

        jTextField1Ammount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1Ammount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1AmmountKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1Ammount);
        jTextField1Ammount.setBounds(810, 280, 220, 40);

        jDateChooser1EntryDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser1EntryDate);
        jDateChooser1EntryDate.setBounds(810, 70, 220, 40);

        jComboBox1IncomeType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1IncomeType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Student Addmissiom", "Exam Fees", "Others" }));
        jPanel1.add(jComboBox1IncomeType);
        jComboBox1IncomeType.setBounds(270, 200, 220, 40);

        jTextField2SLID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2SLID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2SLIDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2SLID);
        jTextField2SLID.setBounds(270, 60, 220, 40);

        jDateChooser2IncomeDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jDateChooser2IncomeDate);
        jDateChooser2IncomeDate.setBounds(270, 130, 220, 40);

        jTextField3Authorization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField3Authorization);
        jTextField3Authorization.setBounds(270, 270, 220, 40);

        jTextField4EntryBy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField4EntryBy);
        jTextField4EntryBy.setBounds(810, 140, 220, 40);

        jTextField5VoucherjNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField5VoucherjNo);
        jTextField5VoucherjNo.setBounds(810, 210, 220, 40);

        jTextArea1Discription.setColumns(20);
        jTextArea1Discription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1Discription.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Discription);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 360, 760, 80);

        Save.setBackground(new java.awt.Color(204, 0, 0));
        Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save);
        Save.setBounds(270, 540, 120, 40);

        Update.setBackground(new java.awt.Color(204, 0, 0));
        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(400, 540, 130, 40);

        Clear.setBackground(new java.awt.Color(204, 0, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear);
        Clear.setBounds(540, 540, 120, 40);

        Exit.setBackground(new java.awt.Color(204, 0, 0));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(920, 540, 110, 40);

        view.setBackground(new java.awt.Color(204, 0, 0));
        view.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view);
        view.setBounds(670, 540, 120, 40);

        Exit2.setBackground(new java.awt.Color(204, 0, 0));
        Exit2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit2.setForeground(new java.awt.Color(255, 255, 255));
        Exit2.setText("Delete");
        Exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit2ActionPerformed(evt);
            }
        });
        jPanel1.add(Exit2);
        Exit2.setBounds(800, 540, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1180, 670);

        setSize(new java.awt.Dimension(1193, 711));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if(!setData()){
        credites();
        }
        
    }//GEN-LAST:event_SaveActionPerformed
    
    public boolean setData(){
            Initialize();
            boolean b=true;
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            IncomeDate=sdf.format(jDateChooser2IncomeDate.getDate()).toString();
            EntryDate=sdf.format(jDateChooser1EntryDate.getDate()).toString();
        if(jTextField2SLID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," Serial ID Is Empty");
            jTextField2SLID.requestFocus();
        }
        else if(IncomeDate.isEmpty()){
            JOptionPane.showMessageDialog(this," Income Date Emptry");
            jDateChooser2IncomeDate.requestFocus();
        }
        else if(IncomeType.isEmpty()){
            JOptionPane.showMessageDialog(this," Select Income Type");
            jComboBox1IncomeType.requestFocus();
        }
        else if(Authorization.isEmpty()){
            JOptionPane.showMessageDialog(this," Authorization Is Empty");
            jTextField3Authorization.requestFocus();
        }
        else if(EntryDate.isEmpty()){
            JOptionPane.showMessageDialog(this," Entry Date Is Empty");
            jDateChooser1EntryDate.requestFocus();
        }
        else if(VoucherNo.isEmpty()){
            JOptionPane.showMessageDialog(this," Voucher Number Is Empty");
            jTextField5VoucherjNo.requestFocus();
        }
        else if(jTextField1Ammount.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," Ammount Is Empty");
            jTextField1Ammount.requestFocus();
        }
        else if(Discription.isEmpty()){
            JOptionPane.showMessageDialog(this," Discription Is Empty");
            jTextArea1Discription.requestFocus();
        }else{
        connection();
         ps=null;
        String se=null;
            se="SELECT `SL_ID`,`Voucher_No` FROM `income` WHERE `SL_ID` = ? || `Voucher_No` = ?";
        try {
            ps=jcon.prepareStatement(se);
            ps.setString(1, jTextField2SLID.getText());
            ps.setString(2,VoucherNo);
            rs=ps.executeQuery();
            if(rs.next()){
            JOptionPane.showMessageDialog(this, " This Serial Id and Voucher No Is Aleardly Insert Please Change Information");
            jTextField2SLID.setText("");
            jTextField5VoucherjNo.setText("");
            jTextField2SLID.requestFocus();
            }else{
            String in=null;
        in="INSERT INTO `income`(`SL_ID`,`Income_Date`,`Income_Type`,`Authorization_By`,`Entry_Date`,`Entry_By`,`Voucher_No`,`Ammount`,`Discroption`) VALUE(?,?,?,?,?,?,?,?,?)";
            try {
                ps=jcon.prepareStatement(in);
                ps.setString(1, id);
                ps.setString(2,IncomeDate);
                ps.setString(3,IncomeType);
                ps.setString(4,Authorization);
                ps.setString(5,EntryDate);
                ps.setString(6,EntryBy);
                ps.setString(7,VoucherNo);
                ps.setString(8,ammount);
                ps.setString(9,Discription);
                b=ps.execute();
                if(!b){
                JOptionPane.showMessageDialog(this,"Income Ectry Operation Successfully...");
                }
                else{
                 JOptionPane.showMessageDialog(this,"Income Ectry Operation Filed...");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Income_Entry.class.getName()).log(Level.SEVERE, null, ex);
            } 
            }
                } catch (SQLException ex) {
                    Logger.getLogger(Income_Entry.class.getName()).log(Level.SEVERE, null, ex);
                }}
        return b;
    }
    public void credites(){
    Initialize();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    IncomeDate=sdf.format(jDateChooser2IncomeDate.getDate()).toString();
        if(IncomeDate.isEmpty()){
            JOptionPane.showMessageDialog(this," Income Date Emptry");
            jDateChooser2IncomeDate.requestFocus();
        }else if(Discription.isEmpty()){
            JOptionPane.showMessageDialog(this," Discription Is Empty");
            jTextArea1Discription.requestFocus();
        }else if(IncomeType.isEmpty()){
            JOptionPane.showMessageDialog(this," Select Income Type");
            jComboBox1IncomeType.requestFocus();
        }else if(jTextField1Ammount.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," Ammount Is Empty");
            jTextField1Ammount.requestFocus();
        }else{
    connection();
    String se=null;
    ps=null;
    se="INSERT INTO `account_details`(`Date`,`Details`,`Type`,`Credit`) VALUES(?,?,?,?);";
        try {
         ps=jcon.prepareStatement(se);
         ps.setString(1,IncomeDate);
         ps.setString(2, Discription);
         ps.setString(3, IncomeType);
         ps.setString(4, ammount);
         boolean b=ps.execute();
                if(!b){
                JOptionPane.showMessageDialog(this," Credit Operation Successfully...");
                }
                else{
                 JOptionPane.showMessageDialog(this," Operation Filed...");
                }
        } catch (SQLException ex) {
            Logger.getLogger(Income_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // Update Button
        if(jTextField2SLID.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Please At First You View Data");
        }else{
        Initialize();
        if(jTextField2SLID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," Serial ID Is Empty");
            jTextField2SLID.requestFocus();
        }
        else if(jDateChooser2IncomeDate.getDate()==null){
            JOptionPane.showMessageDialog(this," Income Date Emptry");
            jDateChooser2IncomeDate.requestFocus();
        }
        else if(IncomeType.isEmpty()){
            JOptionPane.showMessageDialog(this," Select Expense Type");
            jComboBox1IncomeType.requestFocus();
        }
        else if(Authorization.isEmpty()){
            JOptionPane.showMessageDialog(this," Authorization Is Empty");
            jTextField3Authorization.requestFocus();
        }
        else if(jDateChooser1EntryDate.getDate()==null){
            JOptionPane.showMessageDialog(this," Authorization Is Empty");
            jDateChooser1EntryDate.requestFocus();
        }
        else if(VoucherNo.isEmpty()){
            JOptionPane.showMessageDialog(this," Authorization Is Empty");
            jTextField5VoucherjNo.requestFocus();
        }
        else if(jTextField1Ammount.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," Authorization Is Empty");
            jTextField1Ammount.requestFocus();
        }
        else if(Discription.isEmpty()){
            JOptionPane.showMessageDialog(this," Authorization Is Empty");
            jTextArea1Discription.requestFocus();
        }else{
        connection();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            IncomeDate=sdf.format(jDateChooser2IncomeDate.getDate()).toString();
            EntryDate=sdf.format(jDateChooser1EntryDate.getDate()).toString();
        String up=null;
        up="UPDATE `income` SET `Income_Date`=?,`Income_Type`=?,`Authorization_By`=?,`Entry_Date`=?,`Entry_By`=?,`Voucher_No`=?,`Ammount`=?,`Discroption`=? WHERE `SL_ID`="+jTextField2SLID.getText();
        try {ps=null;
            ps=jcon.prepareStatement(up);
            ps.setString(1,IncomeDate);
            ps.setString(2,IncomeType);
            ps.setString(3,Authorization);
            ps.setString(4,EntryDate);
            ps.setString(5,EntryBy);
            ps.setString(6,VoucherNo);
            ps.setString(7,ammount);
            ps.setString(8,Discription);
            int i=ps.executeUpdate();
            if(i==1){
            JOptionPane.showMessageDialog(this," Data Update Successfully...");
            }else{
            JOptionPane.showMessageDialog(this," Data Update Filed...");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Income_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }}}
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // Clear Button 
        clear();
    }//GEN-LAST:event_ClearActionPerformed
    public void clear(){
        jTextField2SLID.setText("");
        jDateChooser2IncomeDate.setDate(null);
        jDateChooser1EntryDate.setDate(null);
        jComboBox1IncomeType.setSelectedIndex(0);
        jTextField3Authorization.setText("");
        jTextField4EntryBy.setText("");
        jTextField5VoucherjNo.setText("");
        jTextField1Ammount.setText("");
        jTextArea1Discription.setText("");
    }
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        connection();
        if(jTextField5VoucherjNo.getText().isEmpty()){
        JOptionPane.showMessageDialog(this," Data View By Voucher_No So You Set Voucher_No On Voucher Field ");
        jTextField5VoucherjNo.requestFocus();
        }else{
            try {ps=null;
                String se=null;
                se="SELECT *FROM `income` WHERE `Voucher_No` = ?";
                ps=jcon.prepareStatement(se);
                ps.setString(1, jTextField5VoucherjNo.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                jTextField2SLID.setText(rs.getString("SL_ID"));
                jDateChooser2IncomeDate.setDate(rs.getDate("Income_Date"));
                jComboBox1IncomeType.setSelectedItem(rs.getString("Income_Type"));
                jTextField3Authorization.setText(rs.getString("Authorization_By"));
                jDateChooser1EntryDate.setDate(rs.getDate("Entry_Date"));
                jTextField4EntryBy.setText(rs.getString("Entry_By"));
                jTextField5VoucherjNo.setText(rs.getString("Voucher_No"));
                jTextField1Ammount.setText(rs.getString("Ammount"));
                jTextArea1Discription.setText(rs.getString("Discroption"));
                boolean b=ps.execute();
                if(b){
                JOptionPane.showMessageDialog(this," Data View Successfully");
                }else{
                JOptionPane.showMessageDialog(this," Data View Filed");
                }
                }else{
                JOptionPane.showMessageDialog(this," Your ID Is Rong");
                jTextField5VoucherjNo.setText("");
                jTextField5VoucherjNo.requestFocus();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Income_Entry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_viewActionPerformed

    private void Exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit2ActionPerformed
        // Delete Button
        if(jTextField2SLID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this," At First You View Record");
            view.requestFocus();
        }else{
            int BBB=JOptionPane.showConfirmDialog(this," Are you sure you want to permanently Delete this Record");
            if(BBB==0){
                try {
                    connection();
                    String de=null;
                    ps=null;
                    de="DELETE FROM `income` WHERE `SL_ID`=?";
                    ps=jcon.prepareStatement(de);
                    ps.setString(1,jTextField2SLID.getText());
                    int i=ps.executeUpdate();
                    if(i==1){
                        JOptionPane.showMessageDialog(this,"Record Delete Successfully...");
                        clear();
                    }else{
                        JOptionPane.showMessageDialog(this,"Record Delete Filed...");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Expense_Entry.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_Exit2ActionPerformed

    private void jTextField2SLIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2SLIDKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2SLIDKeyTyped

    private void jTextField1AmmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1AmmountKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1AmmountKeyTyped


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
            java.util.logging.Logger.getLogger(Income_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Income_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Income_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Income_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Income_Entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Exit2;
    private javax.swing.JButton Save;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox jComboBox1IncomeType;
    private com.toedter.calendar.JDateChooser jDateChooser1EntryDate;
    private com.toedter.calendar.JDateChooser jDateChooser2IncomeDate;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextArea jTextArea1Discription;
    private javax.swing.JTextField jTextField1Ammount;
    private javax.swing.JTextField jTextField2SLID;
    private javax.swing.JTextField jTextField3Authorization;
    private javax.swing.JTextField jTextField4EntryBy;
    private javax.swing.JTextField jTextField5VoucherjNo;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
