
package School;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class School_Profile extends javax.swing.JFrame {
Connection jcon=null;
PreparedStatement ps=null;
ResultSet rs=null;
Statement st=null;
String Slid,Name,PinCode,Email,MobileNo,PhoneNo,Address,Division,Distric,Estd,web;
byte[] picture;
String filename=null;
    public School_Profile() {
        initComponents();
        setTitle("School Profile");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }

public void connection(){
    try {
        jcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","");
       st=jcon.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(Student_Addmission_From.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
public void Datashow(){

Name=jTextField1Name.getText();
PinCode=jTextField2pincode.getText();
Email=jTextField3Email.getText();
MobileNo=jTextField4Mobile.getText();
PhoneNo=jTextField5Phone.getText();
Address=jTextArea1Address.getText();
Division=jTextField7Divition.getText();
Distric=jTextField8Distrink.getText();
Estd=jTextField9estd.getText();
web=jTextField10Web.getText();
Slid=jTextField1SLID.getText();
}
public void AddData(){
Datashow();
if(Slid.isEmpty()){
JOptionPane.showMessageDialog(this,"ID Is Empty");
jTextField1SLID.requestFocus();
}else if(Name.isEmpty()){
    JOptionPane.showMessageDialog(this,"School Name Is Empty");
    jTextField1Name.requestFocus();
}else if(PinCode.isEmpty()){
    JOptionPane.showMessageDialog(this,"School PinCide Is Empty");
    jTextField2pincode.requestFocus();
}else if(Estd.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your Distric Address");
    jTextField9estd.requestFocus();
}else if(Email.isEmpty()){
    JOptionPane.showMessageDialog(this,"Your Email Is Empty");
    jTextField3Email.requestFocus();
}else if(MobileNo.isEmpty()){
    JOptionPane.showMessageDialog(this,"Your Mobile Number Is Empty");
    jTextField4Mobile.requestFocus();
}else if(PhoneNo.isEmpty()){
    JOptionPane.showMessageDialog(this,"Your Phone Number Is Empty");
    jTextField8Distrink.requestFocus();
}else if(Address.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your School Address");
    jTextArea1Address.requestFocus();
}else if(Division.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your Division Address");
    jTextField7Divition.requestFocus();
}else if(Distric.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your Distric Address");
    jTextField8Distrink.requestFocus();
}else if(web.isEmpty()){
    JOptionPane.showMessageDialog(this,"School Web Is Empty");
    jTextField10Web.requestFocus();
}
else{
    Datashow();
    connection();
String se=null;
se="SELECT `SL` FROM `schoolprofile` WHERE `SL` =?";
    try {
        ps=jcon.prepareStatement(se);
        ps.setString(1, Slid);
        rs=ps.executeQuery();
        if(rs.next()){
        JOptionPane.showMessageDialog(this, " This Serial ID is Aleardly Insert Please Change Your Serial ID");
        jTextField1SLID.requestFocus();
        }else{
        String in=null;
 in="INSERT INTO schoolprofile(`SL`,`SchoolName`,`PinCode`,`Estd`,`Email`,`MobileNo`,`PhoneNo`,`Address`,`Division`,`Distric`,`Web`,`Image`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
try {
ps=jcon.prepareStatement(in);
ps.setString(1,Slid);
ps.setString(2,Name);
ps.setString(3,PinCode);
ps.setString(4,Estd);
ps.setString(5,Email);
ps.setString(6,MobileNo);
ps.setString(7,PhoneNo);
ps.setString(8,Address);
ps.setString(9,Division);
ps.setString(10,Distric);
ps.setString(11,web);
ps.setBytes(12,picture);
boolean b=ps.execute();
if(!b){
JOptionPane.showMessageDialog(this," Operation Success....");
}else{
JOptionPane.showMessageDialog(this," Opetation Filed....");
}
jcon.close();
        } catch (SQLException ex) {
            Logger.getLogger(School_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    } catch (SQLException ex) {
        Logger.getLogger(School_Profile.class.getName()).log(Level.SEVERE, null, ex);
    }}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2Sname = new javax.swing.JLabel();
        jTextField1Name = new javax.swing.JTextField();
        jLabel3Pin = new javax.swing.JLabel();
        jLabel4Email = new javax.swing.JLabel();
        jTextField3Email = new javax.swing.JTextField();
        jTextField4Mobile = new javax.swing.JTextField();
        jLabel5Mno = new javax.swing.JLabel();
        jTextField8Distrink = new javax.swing.JTextField();
        jLabel6Phone = new javax.swing.JLabel();
        jLabel7Address = new javax.swing.JLabel();
        jLabel8Divition = new javax.swing.JLabel();
        jLabel9Web = new javax.swing.JLabel();
        jTextField7Divition = new javax.swing.JTextField();
        jTextField5Phone = new javax.swing.JTextField();
        SaveData = new javax.swing.JButton();
        jTextField2pincode = new javax.swing.JTextField();
        jTextField9estd = new javax.swing.JTextField();
        jLabel12picture = new javax.swing.JLabel();
        ImageChoose = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel13Distric = new javax.swing.JLabel();
        jTextField10Web = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Address = new javax.swing.JTextArea();
        UpdateB1Exit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel10ID = new javax.swing.JLabel();
        jTextField1SLID = new javax.swing.JTextField();
        View = new javax.swing.JButton();
        jLabel12estd = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To School Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 484, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 50);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(null);

        jLabel2Sname.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2Sname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2Sname.setText("School Name");
        jPanel2.add(jLabel2Sname);
        jLabel2Sname.setBounds(30, 110, 130, 30);

        jTextField1Name.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1Name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField1Name);
        jTextField1Name.setBounds(180, 108, 340, 30);

        jLabel3Pin.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3Pin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3Pin.setText("Pin Code");
        jPanel2.add(jLabel3Pin);
        jLabel3Pin.setBounds(30, 170, 130, 30);

        jLabel4Email.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4Email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4Email.setText("Email");
        jPanel2.add(jLabel4Email);
        jLabel4Email.setBounds(30, 230, 140, 30);

        jTextField3Email.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3Email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField3Email);
        jTextField3Email.setBounds(180, 230, 340, 30);

        jTextField4Mobile.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4Mobile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField4Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4MobileActionPerformed(evt);
            }
        });
        jTextField4Mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4MobileKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4Mobile);
        jTextField4Mobile.setBounds(180, 290, 340, 30);

        jLabel5Mno.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5Mno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5Mno.setText("Mobile No");
        jPanel2.add(jLabel5Mno);
        jLabel5Mno.setBounds(30, 290, 140, 30);

        jTextField8Distrink.setBackground(new java.awt.Color(204, 255, 204));
        jTextField8Distrink.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField8Distrink);
        jTextField8Distrink.setBounds(390, 520, 130, 30);

        jLabel6Phone.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6Phone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6Phone.setText("Phone No");
        jPanel2.add(jLabel6Phone);
        jLabel6Phone.setBounds(30, 350, 140, 30);

        jLabel7Address.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7Address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7Address.setText("Address");
        jPanel2.add(jLabel7Address);
        jLabel7Address.setBounds(30, 440, 140, 30);

        jLabel8Divition.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8Divition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8Divition.setText("Division");
        jPanel2.add(jLabel8Divition);
        jLabel8Divition.setBounds(30, 520, 140, 30);

        jLabel9Web.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9Web.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9Web.setText("Web");
        jPanel2.add(jLabel9Web);
        jLabel9Web.setBounds(30, 580, 140, 30);

        jTextField7Divition.setBackground(new java.awt.Color(204, 255, 204));
        jTextField7Divition.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField7Divition);
        jTextField7Divition.setBounds(180, 520, 130, 30);

        jTextField5Phone.setBackground(new java.awt.Color(204, 255, 204));
        jTextField5Phone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5PhoneKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5Phone);
        jTextField5Phone.setBounds(180, 350, 340, 30);

        SaveData.setBackground(new java.awt.Color(255, 0, 0));
        SaveData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveData.setForeground(new java.awt.Color(255, 255, 255));
        SaveData.setText("Save ");
        SaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDataActionPerformed(evt);
            }
        });
        jPanel2.add(SaveData);
        SaveData.setBounds(110, 650, 120, 40);

        jTextField2pincode.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2pincode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2pincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2pincodeKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2pincode);
        jTextField2pincode.setBounds(180, 170, 140, 30);

        jTextField9estd.setBackground(new java.awt.Color(204, 255, 204));
        jTextField9estd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField9estd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9estdKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField9estd);
        jTextField9estd.setBounds(390, 170, 130, 30);

        jLabel12picture.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel12picture);
        jLabel12picture.setBounds(670, 110, 210, 200);

        ImageChoose.setBackground(new java.awt.Color(255, 0, 0));
        ImageChoose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ImageChoose.setForeground(new java.awt.Color(255, 255, 255));
        ImageChoose.setText("Upload School Logo");
        ImageChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageChooseActionPerformed(evt);
            }
        });
        jPanel2.add(ImageChoose);
        ImageChoose.setBounds(670, 340, 210, 30);

        Update.setBackground(new java.awt.Color(255, 0, 0));
        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel2.add(Update);
        Update.setBounds(240, 650, 120, 40);

        jLabel13Distric.setBackground(new java.awt.Color(204, 255, 204));
        jLabel13Distric.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13Distric.setText("Dristic");
        jPanel2.add(jLabel13Distric);
        jLabel13Distric.setBounds(320, 520, 70, 30);

        jTextField10Web.setBackground(new java.awt.Color(204, 255, 204));
        jTextField10Web.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(jTextField10Web);
        jTextField10Web.setBounds(180, 580, 340, 30);

        jTextArea1Address.setBackground(new java.awt.Color(204, 255, 204));
        jTextArea1Address.setColumns(20);
        jTextArea1Address.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextArea1Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Address);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(180, 410, 340, 80);

        UpdateB1Exit.setBackground(new java.awt.Color(255, 0, 0));
        UpdateB1Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateB1Exit.setForeground(new java.awt.Color(255, 255, 255));
        UpdateB1Exit.setText("Exit");
        UpdateB1Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateB1ExitActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateB1Exit);
        UpdateB1Exit.setBounds(760, 650, 120, 40);

        Clear.setBackground(new java.awt.Color(255, 0, 0));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear);
        Clear.setBounds(630, 650, 120, 40);

        jLabel10ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10ID.setText("SL ID");
        jPanel2.add(jLabel10ID);
        jLabel10ID.setBounds(30, 50, 130, 30);

        jTextField1SLID.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1SLID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1SLID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1SLIDActionPerformed(evt);
            }
        });
        jTextField1SLID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1SLIDKeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1SLID);
        jTextField1SLID.setBounds(180, 50, 150, 30);

        View.setBackground(new java.awt.Color(255, 0, 0));
        View.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel2.add(View);
        View.setBounds(500, 650, 120, 40);

        jLabel12estd.setBackground(new java.awt.Color(204, 255, 204));
        jLabel12estd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12estd.setText("ESTD");
        jPanel2.add(jLabel12estd);
        jLabel12estd.setBounds(330, 170, 60, 20);

        Delete.setBackground(new java.awt.Color(255, 0, 0));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);
        Delete.setBounds(370, 650, 120, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 970, 740);

        setSize(new java.awt.Dimension(983, 832));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MobileActionPerformed

    private void SaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDataActionPerformed
        // TODO add your handling code here:
        AddData();
    }//GEN-LAST:event_SaveDataActionPerformed

    private void ImageChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageChooseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon( new ImageIcon(filename).getImage().getScaledInstance(jLabel12picture.getWidth(),jLabel12picture.getHeight(),Image.SCALE_SMOOTH));
        jLabel12picture.setIcon(icon);
        try{
        File image = new File(filename);
        FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            byte[] by = new byte[2048];
            for(int readNum;(readNum=fis.read(by))!=-1;){
            bao.write(by, 0, readNum);
            }
            picture=bao.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);}
     
    }//GEN-LAST:event_ImageChooseActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       if(jTextField1SLID.getText().isEmpty()){
       JOptionPane.showMessageDialog(this,"No Record Found "
               + "Please At First You View Record");
       }else{
        Datashow();
if(Name.isEmpty()){
    JOptionPane.showMessageDialog(this,"School Name Is Empty");
    jTextField1Name.requestFocus();
}else if(PinCode.isEmpty()){
    JOptionPane.showMessageDialog(this,"School PinCide Is Empty");
    jTextField2pincode.requestFocus();
}else if(Estd.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your Distric Address");
    jTextField9estd.requestFocus();
}else if(Email.isEmpty()){
    JOptionPane.showMessageDialog(this,"Your Email Is Empty");
    jTextField3Email.requestFocus();
}else if(MobileNo.isEmpty()){
    JOptionPane.showMessageDialog(this,"Your Mobile Number Is Empty");
    jTextField4Mobile.requestFocus();
}else if(PhoneNo.isEmpty()){
    JOptionPane.showMessageDialog(this,"Your Phone Number Is Empty");
    jTextField8Distrink.requestFocus();
}else if(Address.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your School Address");
    jTextArea1Address.requestFocus();
}else if(Division.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your Division Address");
    jTextField7Divition.requestFocus();
}else if(Distric.isEmpty()){
    JOptionPane.showMessageDialog(this,"Pleas Filing Your Distric Address");
    jTextField8Distrink.requestFocus();
}else if(web.isEmpty()){
    JOptionPane.showMessageDialog(this,"School Web Is Empty");
    jTextField10Web.requestFocus();
}else{
    try {
        
        connection();
        String up="UPDATE `schoolprofile` SET `SchoolName` = ?,`PinCode` = ?,`Estd` = ?,`Email` = ?,`MobileNo` = ?,`PhoneNo` = ?,`Address` = ?,`Division` = ?,`Distric` = ?,`Web` = ?,`Image` = ? WHERE `SL`="+jTextField1SLID.getText();
        ps=jcon.prepareStatement(up);
        ps.setString(1, Name);
        ps.setString(2, PinCode);
        ps.setString(3, Estd);
        ps.setString(4, Email);
        ps.setString(5, MobileNo);
        ps.setString(6 ,PhoneNo);
        ps.setString(7, Address);
        ps.setString(8, Division);
        ps.setString(9, Distric);
        ps.setString(10, web);
        ps.setBytes(11, picture);
        int b=ps.executeUpdate();
        if(b==1){
        JOptionPane.showMessageDialog(this," Operation Successfull...");
        }else{
        JOptionPane.showMessageDialog(this," Operation Filed...");
        }  
    } catch (SQLException ex) {
        Logger.getLogger(School_Profile.class.getName()).log(Level.SEVERE, null, ex);
    }}}
    }//GEN-LAST:event_UpdateActionPerformed

    private void UpdateB1ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateB1ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_UpdateB1ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        jTextField1SLID.setText("");
        jTextField1Name.setText("");
        jTextField2pincode.setText("");
        jTextField9estd.setText("");
        jTextField3Email.setText("");
        jTextField4Mobile.setText("");
        jTextField5Phone.setText("");
        jTextArea1Address.setText("");
        jTextField7Divition.setText("");
        jTextField8Distrink.setText("");
        jTextField9estd.setText("");
        jTextField10Web.setText("");
        jLabel12picture.setIcon(null); 
    }//GEN-LAST:event_ClearActionPerformed
     void imgUp(byte pic[] ){
    picture=pic;
    }
    
    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // Button OF The View Code
        String sl=jTextField1SLID.getText();
        if(sl.isEmpty()){
        JOptionPane.showMessageDialog(this," Please At First You Entered Serial ID");
        }else{
        Datashow();    
        connection();
        String selected=null;
        selected="SELECT *FROM `schoolprofile` WHERE `SL`=?";
    try {
        ps=jcon.prepareStatement(selected);
        ps.setString(1,Slid);
        rs=ps.executeQuery();
        if(rs.next()){
        jTextField1Name.setText(rs.getString("SchoolName"));
        jTextField2pincode.setText(rs.getString("PinCode"));
        jTextField9estd.setText(rs.getString("Estd"));
        jTextField3Email.setText(rs.getString("Email"));
        jTextField4Mobile.setText(rs.getString("MobileNo"));
        jTextField5Phone.setText(rs.getString("PhoneNo"));
        jTextArea1Address.setText(rs.getString("Address"));
        jTextField7Divition.setText(rs.getString("Division"));
        jTextField8Distrink.setText(rs.getString("Distric"));
        jTextField10Web.setText(rs.getString("Web"));
        byte pic[]=rs.getBytes("Image");
        imgUp(pic );
        ImageIcon im=new ImageIcon(new ImageIcon(pic).getImage().getScaledInstance(jLabel12picture.getWidth(),jLabel12picture.getHeight(),Image.SCALE_SMOOTH));
        jLabel12picture.setIcon(im);
        boolean b=ps.execute();
       if(b){
       JOptionPane.showMessageDialog(this,"Data View Successfully...");
       }else{
       JOptionPane.showMessageDialog(this,"Data View Filed...");
       }
        }else{
        JOptionPane.showMessageDialog(this," Your ID Is Rong");
        jTextField1SLID.setText("");
        jTextField1SLID.requestFocus();
        }
       
    } catch (SQLException ex) {
        Logger.getLogger(Show_School_Profile.class.getName()).log(Level.SEVERE, null, ex);
    }}
    }//GEN-LAST:event_ViewActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
     if(jTextField1SLID.getText().isEmpty()){
     JOptionPane.showMessageDialog(this," No Recond Found"
             + "Please At First You View Record");
     }else{
        int d=JOptionPane.showConfirmDialog(this," Do You Want To Delect This Data ?");
      if(d==0){connection();
        try {  
        String de=null;
        de="DELETE FROM `schoolprofile` WHERE `SL` = ?";
        ps=jcon.prepareStatement(de);
        ps.setString(1,jTextField1SLID.getText());
        int b=ps.executeUpdate();
        if(b==1){
        JOptionPane.showMessageDialog(this," Data Delete Successfully...");
        }else{
        JOptionPane.showMessageDialog(this," Data Delete Filed...");
        }
    } catch (SQLException ex) {
        Logger.getLogger(School_Profile.class.getName()).log(Level.SEVERE, null, ex);
    }}}      
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTextField1SLIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SLIDKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1SLIDKeyTyped

    private void jTextField2pincodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2pincodeKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2pincodeKeyTyped

    private void jTextField9estdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9estdKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9estdKeyTyped

    private void jTextField4MobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4MobileKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4MobileKeyTyped

    private void jTextField5PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5PhoneKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5PhoneKeyTyped

    private void jTextField1SLIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1SLIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SLIDActionPerformed

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
            java.util.logging.Logger.getLogger(School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new School_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton ImageChoose;
    private javax.swing.JButton SaveData;
    private javax.swing.JButton Update;
    private javax.swing.JButton UpdateB1Exit;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10ID;
    private javax.swing.JLabel jLabel12estd;
    private javax.swing.JLabel jLabel12picture;
    private javax.swing.JLabel jLabel13Distric;
    private javax.swing.JLabel jLabel2Sname;
    private javax.swing.JLabel jLabel3Pin;
    private javax.swing.JLabel jLabel4Email;
    private javax.swing.JLabel jLabel5Mno;
    private javax.swing.JLabel jLabel6Phone;
    private javax.swing.JLabel jLabel7Address;
    private javax.swing.JLabel jLabel8Divition;
    private javax.swing.JLabel jLabel9Web;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1Address;
    private javax.swing.JTextField jTextField10Web;
    private javax.swing.JTextField jTextField1Name;
    private javax.swing.JTextField jTextField1SLID;
    private javax.swing.JTextField jTextField2pincode;
    private javax.swing.JTextField jTextField3Email;
    private javax.swing.JTextField jTextField4Mobile;
    private javax.swing.JTextField jTextField5Phone;
    private javax.swing.JTextField jTextField7Divition;
    private javax.swing.JTextField jTextField8Distrink;
    private javax.swing.JTextField jTextField9estd;
    // End of variables declaration//GEN-END:variables
}
