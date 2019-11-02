
package School;

import java.awt.Toolkit;


public class School_Report extends javax.swing.JFrame {


    public School_Report() {
        initComponents();
        setTitle("School Report");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
        //setIconImage(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3Subject = new javax.swing.JButton();
        jButton4AdmitCard = new javax.swing.JButton();
        jButton5MarkSheet = new javax.swing.JButton();
        jButton7IDcard = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2Exam = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Record1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1390, 60);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(null);

        jButton3Subject.setBackground(new java.awt.Color(255, 0, 0));
        jButton3Subject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3Subject.setForeground(new java.awt.Color(255, 255, 255));
        jButton3Subject.setText("Subject");
        jButton3Subject.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton3Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3SubjectActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3Subject);
        jButton3Subject.setBounds(60, 40, 200, 29);

        jButton4AdmitCard.setBackground(new java.awt.Color(255, 0, 0));
        jButton4AdmitCard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4AdmitCard.setForeground(new java.awt.Color(255, 255, 255));
        jButton4AdmitCard.setText("Admit Card");
        jButton4AdmitCard.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton4AdmitCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4AdmitCardActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4AdmitCard);
        jButton4AdmitCard.setBounds(60, 190, 200, 29);

        jButton5MarkSheet.setBackground(new java.awt.Color(255, 0, 0));
        jButton5MarkSheet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5MarkSheet.setForeground(new java.awt.Color(255, 255, 255));
        jButton5MarkSheet.setText("Mark Sheet");
        jButton5MarkSheet.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton5MarkSheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5MarkSheetActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5MarkSheet);
        jButton5MarkSheet.setBounds(60, 240, 200, 29);

        jButton7IDcard.setBackground(new java.awt.Color(255, 0, 0));
        jButton7IDcard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7IDcard.setForeground(new java.awt.Color(255, 255, 255));
        jButton7IDcard.setText("ID Card");
        jButton7IDcard.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton7IDcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7IDcardActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7IDcard);
        jButton7IDcard.setBounds(60, 340, 200, 29);

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Notis Bord");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(60, 290, 200, 29);

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Registration Card");
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(60, 390, 200, 29);

        jButton2Exam.setBackground(new java.awt.Color(255, 0, 0));
        jButton2Exam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2Exam.setForeground(new java.awt.Color(255, 255, 255));
        jButton2Exam.setText("Exam Routione");
        jButton2Exam.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2Exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ExamActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2Exam);
        jButton2Exam.setBounds(60, 140, 200, 31);

        jLabel7.setText("jLabel2");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(-20, 90, 10, 30);

        Record1.setBackground(new java.awt.Color(255, 0, 0));
        Record1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Record1.setForeground(new java.awt.Color(255, 255, 255));
        Record1.setText("Fees Details");
        Record1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Record1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Record1ActionPerformed(evt);
            }
        });
        jPanel3.add(Record1);
        Record1.setBounds(60, 90, 200, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Book_Shelf_38px_1.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 40, 41, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Cash_in_Hand_40px.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 90, 41, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Reading_38px.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 140, 38, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Smart_Card_38px.png")); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 190, 38, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Data_Sheet_38px.png")); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 240, 38, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Group_Message_38px.png")); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 290, 38, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_ID_Verified_38px.png")); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 340, 38, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Driver_License_38px.png")); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 390, 38, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 300, 750);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1390, 750);

        setSize(new java.awt.Dimension(1402, 856));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ExamActionPerformed
        // Exam Routine
        View_Exam_Routine ver=new View_Exam_Routine();
        ver.setVisible(true);
    }//GEN-LAST:event_jButton2ExamActionPerformed

    private void jButton3SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3SubjectActionPerformed
        // School Subject
        Subject s=new Subject();
        s.setVisible(true);
    }//GEN-LAST:event_jButton3SubjectActionPerformed

    private void jButton4AdmitCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4AdmitCardActionPerformed
        // Admit Card Record
        AdmitCard_view av=new AdmitCard_view();
        av.setVisible(true);
    }//GEN-LAST:event_jButton4AdmitCardActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // School Notish Bord
        School_Notish_bord snb=new School_Notish_bord();
        snb.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5MarkSheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5MarkSheetActionPerformed
        // TODO add your handling code here:
        Student_Mark_Sheet sms=new Student_Mark_Sheet();
        sms.setVisible(true);
    }//GEN-LAST:event_jButton5MarkSheetActionPerformed

    private void jButton7IDcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7IDcardActionPerformed
        // TODO add your handling code here:
        View_ID_Card vi=new View_ID_Card();
        vi.setVisible(true);
    }//GEN-LAST:event_jButton7IDcardActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        View_Registation_card rs=new View_Registation_card();
        rs.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void Record1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Record1ActionPerformed
        // School Fees
        Student_Fees_Details sfd=new Student_Fees_Details();
        sfd.setVisible(true);
    }//GEN-LAST:event_Record1ActionPerformed

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
            java.util.logging.Logger.getLogger(School_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new School_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Record1;
    private javax.swing.JButton jButton2Exam;
    private javax.swing.JButton jButton3Subject;
    private javax.swing.JButton jButton4AdmitCard;
    private javax.swing.JButton jButton5MarkSheet;
    private javax.swing.JButton jButton7IDcard;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
