
package School;

import java.awt.Toolkit;

public class Addmission_From extends javax.swing.JFrame {


    public Addmission_From() {
        initComponents();
        setResizable(false);
        setTitle("Addmission From");
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        allEmployee = new javax.swing.JButton();
        allTeacher = new javax.swing.JButton();
        allStudent = new javax.swing.JButton();
        StudentAddmission = new javax.swing.JButton();
        EmployeeAddmission = new javax.swing.JButton();
        TeacherAddmission = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To School Management System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 0, 935, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1380, 60);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(null);

        allEmployee.setBackground(new java.awt.Color(0, 255, 153));
        allEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        allEmployee.setForeground(new java.awt.Color(0, 0, 255));
        allEmployee.setText("All Employs");
        allEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        allEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allEmployeeActionPerformed(evt);
            }
        });
        jPanel4.add(allEmployee);
        allEmployee.setBounds(40, 290, 230, 31);

        allTeacher.setBackground(new java.awt.Color(0, 255, 153));
        allTeacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        allTeacher.setForeground(new java.awt.Color(0, 0, 255));
        allTeacher.setText("All Teacher");
        allTeacher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        allTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTeacherActionPerformed(evt);
            }
        });
        jPanel4.add(allTeacher);
        allTeacher.setBounds(40, 190, 230, 31);

        allStudent.setBackground(new java.awt.Color(0, 255, 153));
        allStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        allStudent.setForeground(new java.awt.Color(0, 0, 255));
        allStudent.setText("All Student");
        allStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        allStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentActionPerformed(evt);
            }
        });
        jPanel4.add(allStudent);
        allStudent.setBounds(40, 240, 230, 31);

        StudentAddmission.setBackground(new java.awt.Color(0, 255, 153));
        StudentAddmission.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StudentAddmission.setForeground(new java.awt.Color(0, 0, 255));
        StudentAddmission.setText("Student Addmission");
        StudentAddmission.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StudentAddmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentAddmissionActionPerformed(evt);
            }
        });
        jPanel4.add(StudentAddmission);
        StudentAddmission.setBounds(40, 40, 230, 31);

        EmployeeAddmission.setBackground(new java.awt.Color(0, 255, 153));
        EmployeeAddmission.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmployeeAddmission.setForeground(new java.awt.Color(0, 0, 255));
        EmployeeAddmission.setText("Employee Join");
        EmployeeAddmission.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmployeeAddmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeAddmissionActionPerformed(evt);
            }
        });
        jPanel4.add(EmployeeAddmission);
        EmployeeAddmission.setBounds(40, 140, 230, 30);

        TeacherAddmission.setBackground(new java.awt.Color(0, 255, 153));
        TeacherAddmission.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TeacherAddmission.setForeground(new java.awt.Color(0, 0, 255));
        TeacherAddmission.setText("Teacher Join");
        TeacherAddmission.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TeacherAddmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherAddmissionActionPerformed(evt);
            }
        });
        jPanel4.add(TeacherAddmission);
        TeacherAddmission.setBounds(40, 90, 230, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Coworking_35px.png"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 290, 41, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Add_User_Male_35px.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(0, 40, 40, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Programing\\Java Project\\School_Management\\src\\Icon\\icons8_Police_35px_1.png")); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 90, 41, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Worker_35px.png"))); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(0, 140, 41, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Payroll_35px.png"))); // NOI18N
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 190, 41, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_User_Group_35px.png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(0, 240, 41, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 300, 700);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1380, 700);

        setSize(new java.awt.Dimension(1395, 798));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void allEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allEmployeeActionPerformed
        Employee_Record er=new Employee_Record();
        er.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_allEmployeeActionPerformed

    private void allTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allTeacherActionPerformed
        Teacher_Record tr=new Teacher_Record();
        tr.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_allTeacherActionPerformed

    private void allStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentActionPerformed
      Student_Record sr=new Student_Record();
      sr.setVisible(true);
      //this.setVisible(false);
    }//GEN-LAST:event_allStudentActionPerformed

    private void StudentAddmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentAddmissionActionPerformed
       Student_Addmission_From sa=new Student_Addmission_From();
       sa.setVisible(true);
       //this.setVisible(false);
    }//GEN-LAST:event_StudentAddmissionActionPerformed

    private void EmployeeAddmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeAddmissionActionPerformed
        Employe_addmission emp=new Employe_addmission();
        emp.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_EmployeeAddmissionActionPerformed

    private void TeacherAddmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherAddmissionActionPerformed
       Teacher_Addmission ta=new Teacher_Addmission();
       ta.setVisible(true);
       //this.setVisible(false);
    }//GEN-LAST:event_TeacherAddmissionActionPerformed

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
            java.util.logging.Logger.getLogger(Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addmission_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addmission_From().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeAddmission;
    private javax.swing.JButton StudentAddmission;
    private javax.swing.JButton TeacherAddmission;
    private javax.swing.JButton allEmployee;
    private javax.swing.JButton allStudent;
    private javax.swing.JButton allTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
