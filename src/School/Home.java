
package School;

import java.awt.Toolkit;


public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
        setResizable(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int width=(int) tk.getScreenSize().getWidth();
        int height=(int) tk.getScreenSize().getHeight();
        setSize(width, height);
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Student_Add = new javax.swing.JButton();
        All_Student = new javax.swing.JButton();
        Student_Prpfile = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(301, 10, 790, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1990, 60);

        jPanel10.setBackground(new java.awt.Color(0, 204, 204));
        jPanel10.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Student Attendence");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(60, 240, 230, 29);

        Student_Add.setBackground(new java.awt.Color(255, 0, 0));
        Student_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Student_Add.setForeground(new java.awt.Color(255, 255, 255));
        Student_Add.setText("Student Addmission");
        Student_Add.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Student_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_AddActionPerformed(evt);
            }
        });
        jPanel2.add(Student_Add);
        Student_Add.setBounds(60, 40, 230, 31);

        All_Student.setBackground(new java.awt.Color(255, 0, 0));
        All_Student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        All_Student.setForeground(new java.awt.Color(255, 255, 255));
        All_Student.setText("View All Student ");
        All_Student.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        All_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                All_StudentActionPerformed(evt);
            }
        });
        jPanel2.add(All_Student);
        All_Student.setBounds(60, 90, 230, 29);

        Student_Prpfile.setBackground(new java.awt.Color(255, 0, 0));
        Student_Prpfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Student_Prpfile.setForeground(new java.awt.Color(255, 255, 255));
        Student_Prpfile.setText("View Student Profile");
        Student_Prpfile.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Student_Prpfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_PrpfileActionPerformed(evt);
            }
        });
        jPanel2.add(Student_Prpfile);
        Student_Prpfile.setBounds(60, 140, 230, 29);

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Student Fees Details");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(60, 190, 230, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Event_Accepted_35px.png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 230, 50, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Add_User_Male_35px.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 40, 50, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_User_Menu_Male_35px.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 90, 50, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Communicate_35px_1.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 140, 50, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Identification_Documents_35px.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 190, 50, 30);

        jPanel10.add(jPanel2);
        jPanel2.setBounds(0, 0, 330, 1010);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(0, 60, 1990, 1010);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Student_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_AddActionPerformed
        // Student Addmission Button
        Student_Addmission_From sa=new Student_Addmission_From();
        sa.setVisible(true);
    }//GEN-LAST:event_Student_AddActionPerformed

    private void All_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_All_StudentActionPerformed
        // Student Record
       Student_Record sr=new Student_Record();
       sr.setVisible(true);
    }//GEN-LAST:event_All_StudentActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Student Fees Details
        Student_Fees_Details sfd=new Student_Fees_Details();
        sfd.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Student_Attendence at=new Student_Attendence();
        at.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Student_PrpfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_PrpfileActionPerformed
        // TODO add your handling code here:
        Student_Profile sp=new Student_Profile();
        sp.setVisible(true);
    }//GEN-LAST:event_Student_PrpfileActionPerformed


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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton All_Student;
    private javax.swing.JButton Student_Add;
    private javax.swing.JButton Student_Prpfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
