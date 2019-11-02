
package School;

import java.awt.Toolkit;
import java.util.logging.*;



public class Loding_From extends javax.swing.JFrame {

    public Loding_From() {
        initComponents();
        setResizable(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage(getClass().getResource("icons8_Home_100px.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LoopMassage = new javax.swing.JLabel();
        Loop = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(530, 399));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/School/if_go-home_118770.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, -1));

        LoopMassage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoopMassage.setForeground(new java.awt.Color(0, 255, 255));
        LoopMassage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LoopMassage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 530, 20));

        Loop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Loop.setForeground(new java.awt.Color(255, 255, 0));
        Loop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Loop, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 120, 110));

        jProgressBar1.setBackground(new java.awt.Color(0, 204, 204));
        jProgressBar1.setForeground(new java.awt.Color(204, 0, 153));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 540, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText(" School Management ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 400, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/School/asdfg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));

        setSize(new java.awt.Dimension(532, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        Loding_From ps=new Loding_From();
        Loging_Form ls=new Loging_Form();
         ps.setVisible(true);
    for (int i = -1; i < 100; ) {i++;
     try {
        Thread.sleep(80);
        jProgressBar1.setValue(i);
        if(i==01){
        LoopMassage.setText("Your Prosess Is Running...");
        }
        if(i==90){
        LoopMassage.setText("Your Prosses Is Done...");
        }
        if(i==100){
        //Loging_Form lf=new Loging_Form();
        ls.setVisible(true);
        ps.setVisible(false);
        }
        } catch (InterruptedException ex) {
        Logger.getLogger(Loding_From.class.getName()).log(Level.SEVERE, null, ex);
        }}
        }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Loop;
    private static javax.swing.JLabel LoopMassage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
