
package School;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.TimeZone;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;


public class Main_From extends javax.swing.JFrame {

  
    public Main_From() {
        initComponents();
        dates();
        Time();
        setResizable(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        //int width=(int) tk.getScreenSize().getWidth();
        //int height=(int) tk.getScreenSize().getHeight();
        //setSize(width, height);
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
        
    }
    public void loding(){
       
        jLabel5.setText("");
    }
    
    public void dates(){
    Date dt=new Date();
        DateFormat dd=new SimpleDateFormat("yyyy-MM-dd");
        jLabel4.setText(dd.format(dt));
    }
   
     
     
   public void Time(){
  final LocalDateTime dat=LocalDateTime.now();
   new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //jLabelHowr.setText(String.valueOf(dat.getHour()));
                //jLabelMinite.setText(String.valueOf(dat.getMinute()));
                //jLabelSecend.setText(String.valueOf(dat.getSecond()));
            }
        }).start();
}
     
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelYoutube = new javax.swing.JLabel();
        jLabelFacebook = new javax.swing.JLabel();
        jLabelTwitter = new javax.swing.JLabel();
        jLabelInstagram = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Employs = new javax.swing.JButton();
        Student = new javax.swing.JButton();
        Teacher = new javax.swing.JButton();
        School = new javax.swing.JButton();
        Salary = new javax.swing.JButton();
        Account = new javax.swing.JButton();
        Record = new javax.swing.JButton();
        Addmission = new javax.swing.JButton();
        Record3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        desktopPane.setBackground(new java.awt.Color(102, 102, 0));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To School Management System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 10, 935, 44);

        jLabelYoutube.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Play_Button_48px.png")); // NOI18N
        jLabelYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelYoutubeMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelYoutube);
        jLabelYoutube.setBounds(1590, 10, 50, 50);

        jLabelFacebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFacebook.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Facebook_48px.png")); // NOI18N
        jLabelFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFacebookMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelFacebook);
        jLabelFacebook.setBounds(1830, 10, 50, 50);

        jLabelTwitter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTwitter.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Twitter_48px_1.png")); // NOI18N
        jLabelTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTwitterMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelTwitter);
        jLabelTwitter.setBounds(1750, 10, 50, 50);

        jLabelInstagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInstagram.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Instagram_48px.png")); // NOI18N
        jLabelInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInstagramMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelInstagram);
        jLabelInstagram.setBounds(1670, 10, 50, 50);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Facebook");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1820, 60, 70, 16);

        jLabel18.setText("YouTube");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(1590, 60, 50, 16);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Instagram");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(1660, 60, 70, 16);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Twitter");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1750, 60, 50, 16);

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 1910, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(null);

        Employs.setBackground(new java.awt.Color(255, 255, 204));
        Employs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Employs.setForeground(new java.awt.Color(255, 51, 51));
        Employs.setText("Employs");
        Employs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Employs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmploysActionPerformed(evt);
            }
        });
        jPanel3.add(Employs);
        Employs.setBounds(60, 330, 230, 40);

        Student.setBackground(new java.awt.Color(255, 255, 204));
        Student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Student.setForeground(new java.awt.Color(255, 51, 51));
        Student.setText("Student");
        Student.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        jPanel3.add(Student);
        Student.setBounds(60, 210, 230, 40);

        Teacher.setBackground(new java.awt.Color(255, 255, 204));
        Teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Teacher.setForeground(new java.awt.Color(255, 51, 51));
        Teacher.setText("Teacher");
        Teacher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherActionPerformed(evt);
            }
        });
        jPanel3.add(Teacher);
        Teacher.setBounds(60, 270, 230, 40);

        School.setBackground(new java.awt.Color(255, 255, 204));
        School.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        School.setForeground(new java.awt.Color(255, 51, 51));
        School.setText("School Details");
        School.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        School.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolActionPerformed(evt);
            }
        });
        jPanel3.add(School);
        School.setBounds(60, 30, 230, 40);

        Salary.setBackground(new java.awt.Color(255, 255, 204));
        Salary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Salary.setForeground(new java.awt.Color(255, 51, 51));
        Salary.setText("Salary");
        Salary.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryActionPerformed(evt);
            }
        });
        jPanel3.add(Salary);
        Salary.setBounds(60, 390, 230, 40);

        Account.setBackground(new java.awt.Color(255, 255, 204));
        Account.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Account.setForeground(new java.awt.Color(255, 51, 51));
        Account.setText("Account");
        Account.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountActionPerformed(evt);
            }
        });
        jPanel3.add(Account);
        Account.setBounds(60, 450, 230, 40);

        Record.setBackground(new java.awt.Color(255, 255, 204));
        Record.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Record.setForeground(new java.awt.Color(255, 51, 51));
        Record.setText("Record");
        Record.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordActionPerformed(evt);
            }
        });
        jPanel3.add(Record);
        Record.setBounds(60, 510, 230, 40);

        Addmission.setBackground(new java.awt.Color(255, 255, 204));
        Addmission.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Addmission.setForeground(new java.awt.Color(255, 51, 51));
        Addmission.setText("Addmission");
        Addmission.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Addmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddmissionActionPerformed(evt);
            }
        });
        jPanel3.add(Addmission);
        Addmission.setBounds(60, 150, 230, 40);

        Record3.setBackground(new java.awt.Color(255, 255, 204));
        Record3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Record3.setForeground(new java.awt.Color(255, 51, 51));
        Record3.setText("Report");
        Record3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Record3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Record3ActionPerformed(evt);
            }
        });
        jPanel3.add(Record3);
        Record3.setBounds(60, 90, 230, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("About This ");
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 840, 130, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Music_Record_40px.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 510, 40, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_School_Building_40px.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 30, 40, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_System_Report_40px.png"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 90, 40, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Join_40px.png")); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 150, 41, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Student_Male_40px_1.png"))); // NOI18N
        jLabel10.setText("jLabel2");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 210, 41, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_School_Director_40px.png")); // NOI18N
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 270, 41, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Worker_35px.png"))); // NOI18N
        jPanel3.add(jLabel12);
        jLabel12.setBounds(10, 330, 40, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Cash_in_Hand_40px.png"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 390, 40, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Pincode_Keyboard_40px.png"))); // NOI18N
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 450, 40, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 340, 920);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1640, 30, 250, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Calendar_48px.png")); // NOI18N
        jLabel5.setText("Current Date");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1410, 30, 220, 60);

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 80, 1910, 920);

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 1910, 1000);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1918, 1048));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        // Home Button
        Home ho=new Home();
        ho.setVisible(true);
        
    }//GEN-LAST:event_StudentActionPerformed

    private void SchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchoolActionPerformed
        // School Profile
        School_Details sd=new School_Details();
        sd.setVisible(true);
    }//GEN-LAST:event_SchoolActionPerformed

    private void TeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherActionPerformed
        // TODO add your handling code here:
        Teacher_Details td=new Teacher_Details();
        td.setVisible(true);
    }//GEN-LAST:event_TeacherActionPerformed

    private void RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordActionPerformed
        //Record Button : 
        Record r=new Record();
        r.setVisible(true);
    }//GEN-LAST:event_RecordActionPerformed

    private void AddmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddmissionActionPerformed
       Addmission_From ad=new Addmission_From();
       ad.setVisible(true);
    }//GEN-LAST:event_AddmissionActionPerformed

    private void EmploysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmploysActionPerformed
        // TODO add your handling code here:
        Employe_addmission emp=new Employe_addmission();
        emp.setVisible(true);
    }//GEN-LAST:event_EmploysActionPerformed

    private void SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryActionPerformed
        // Button OF The Salary..
        Salary sa=new Salary();
        sa.setVisible(true);
    }//GEN-LAST:event_SalaryActionPerformed

    private void AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountActionPerformed
        // TODO add your handling code here:
        Accound ac=new Accound();
        ac.setVisible(true);
    }//GEN-LAST:event_AccountActionPerformed

    private void Record3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Record3ActionPerformed
        //Button Of School Report
        School_Report sr=new School_Report();
        sr.setVisible(true);
    }//GEN-LAST:event_Record3ActionPerformed

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Aboit_This ab=new Aboit_This();
        ab.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabelFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFacebookMouseClicked
        // TODO add your handling code here:
        try {
            Desktop browser=Desktop.getDesktop();
            browser.browse(new URI("https://facebook.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelFacebookMouseClicked

    private void jLabelTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTwitterMouseClicked
        // TODO add your handling code here:
        try {
            Desktop browser=Desktop.getDesktop();
            browser.browse(new URI("https://twitter.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelTwitterMouseClicked

    private void jLabelInstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInstagramMouseClicked
        // TODO add your handling code here:
        try {
            Desktop browser=Desktop.getDesktop();
            browser.browse(new URI("https://instagram.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelInstagramMouseClicked

    private void jLabelYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelYoutubeMouseClicked
        // TODO add your handling code here:
        try {
            Desktop browser=Desktop.getDesktop();
            browser.browse(new URI("https://youtube.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main_From.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabelYoutubeMouseClicked

  

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
            java.util.logging.Logger.getLogger(Main_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_From().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account;
    private javax.swing.JButton Addmission;
    private javax.swing.JButton Employs;
    private javax.swing.JButton Record;
    private javax.swing.JButton Record3;
    private javax.swing.JButton Salary;
    private javax.swing.JButton School;
    private javax.swing.JButton Student;
    private javax.swing.JButton Teacher;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFacebook;
    private javax.swing.JLabel jLabelInstagram;
    private javax.swing.JLabel jLabelTwitter;
    private javax.swing.JLabel jLabelYoutube;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
