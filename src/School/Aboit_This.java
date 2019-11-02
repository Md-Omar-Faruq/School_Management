
package School;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Aboit_This extends javax.swing.JFrame {
Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Aboit_This() {
        initComponents();
        setTitle("About Developar");
        //pppp();
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
    
    public void pppp(){
    connection();
    String se=null;
    se="SELECT `pic` FROM `about` ";
    try {
        ps=jcon.prepareStatement(se);
        rs=ps.executeQuery();
        if(rs.next()){
        byte p[]=rs.getBytes("pic");
        ImageIcon im=new ImageIcon(new ImageIcon(p).getImage().getScaledInstance(jLabel9.getWidth(),jLabel9.getHeight(),java.awt.Image.SCALE_SMOOTH));
        jLabel9.setIcon(im);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Aboit_This.class.getName()).log(Level.SEVERE, null, ex);
    }
    
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("This Is My First Project  In My Programintg Life ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 460, 670, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("THIS SOFTWARE IS DEVELOPAD BY");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 30, 360, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Md Omar Faruq");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 90, 360, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Feni Polytechnic Institute");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 130, 360, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Department Of Computer Science and Engineering ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 170, 420, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Mobile : 01626768530");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 210, 360, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Email : fmd92330@gmail.com");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 250, 360, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/School/fhyrt11.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(630, 60, 300, 280);

        jLabel10.setBackground(new java.awt.Color(255, 255, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("I Injoyed My Programing Life");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 500, 580, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 770);

        setSize(new java.awt.Dimension(1048, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(Aboit_This.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aboit_This.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aboit_This.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aboit_This.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aboit_This().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
