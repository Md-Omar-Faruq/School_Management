
package School;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class View_Mark_Sheet extends javax.swing.JFrame {
    Connection jcon=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public View_Mark_Sheet() {
        initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField5Sreg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1ExamName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2Fname = new javax.swing.JTextField();
        jTextField3Mname = new javax.swing.JTextField();
        jTextField4Sroll = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelSubject6 = new javax.swing.JLabel();
        jLabelSubject5 = new javax.swing.JLabel();
        jLabelSubject4 = new javax.swing.JLabel();
        jLabelSubject3 = new javax.swing.JLabel();
        jLabelSubject2 = new javax.swing.JLabel();
        jLabelCGPA = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6Sgroup = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField7Ssession = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField1Sname = new javax.swing.JTextField();
        jLabelSubject14 = new javax.swing.JLabel();
        jLabelSubject12 = new javax.swing.JLabel();
        jLabelSubject11 = new javax.swing.JLabel();
        jLabelSubject10 = new javax.swing.JLabel();
        jLabelSubject9 = new javax.swing.JLabel();
        jLabelSubject8 = new javax.swing.JLabel();
        jLabelSubject7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabelSubject13 = new javax.swing.JLabel();
        jTextFieldMark2 = new javax.swing.JTextField();
        jTextFieldMark1 = new javax.swing.JTextField();
        jTextFieldMark3 = new javax.swing.JTextField();
        jTextFieldMark4 = new javax.swing.JTextField();
        jTextFieldMark5 = new javax.swing.JTextField();
        jTextFieldMark6 = new javax.swing.JTextField();
        jTextFieldMark7 = new javax.swing.JTextField();
        jTextFieldMark8 = new javax.swing.JTextField();
        jTextFieldMark9 = new javax.swing.JTextField();
        jTextFieldMark10 = new javax.swing.JTextField();
        jTextFieldMark11 = new javax.swing.JTextField();
        jTextFieldMark12 = new javax.swing.JTextField();
        jTextFieldMark13 = new javax.swing.JTextField();
        jTextFieldMark14 = new javax.swing.JTextField();
        jLabelSubject1 = new javax.swing.JLabel();
        jComboBoxSClass = new javax.swing.JComboBox<>();
        jLabelSubject15 = new javax.swing.JLabel();
        jLabelSubject16 = new javax.swing.JLabel();
        jLabelSubject17 = new javax.swing.JLabel();
        jLabelSubject18 = new javax.swing.JLabel();
        jLabelSubject19 = new javax.swing.JLabel();
        jLabelSubject20 = new javax.swing.JLabel();
        jLabelSubject21 = new javax.swing.JLabel();
        jLabelSubject22 = new javax.swing.JLabel();
        jLabelSubject23 = new javax.swing.JLabel();
        jLabelSubject24 = new javax.swing.JLabel();
        jLabelSubject25 = new javax.swing.JLabel();
        jLabelSubject26 = new javax.swing.JLabel();
        jLabelSubject27 = new javax.swing.JLabel();
        jLabelSubject28 = new javax.swing.JLabel();
        jLabelLatter1 = new javax.swing.JLabel();
        jLabelLatter2 = new javax.swing.JLabel();
        jLabelLatter3 = new javax.swing.JLabel();
        jLabelLatter4 = new javax.swing.JLabel();
        jLabelLatter5 = new javax.swing.JLabel();
        jLabelLatter6 = new javax.swing.JLabel();
        jLabelLatter7 = new javax.swing.JLabel();
        jLabelLatter8 = new javax.swing.JLabel();
        jLabelLatter9 = new javax.swing.JLabel();
        jLabelLatter10 = new javax.swing.JLabel();
        jLabelLatter11 = new javax.swing.JLabel();
        jLabelLatter12 = new javax.swing.JLabel();
        jLabelLatter13 = new javax.swing.JLabel();
        jLabelLatter14 = new javax.swing.JLabel();
        jTextFieldMark15 = new javax.swing.JTextField();
        jTextFieldMark16 = new javax.swing.JTextField();
        jTextFieldMark17 = new javax.swing.JTextField();
        jTextFieldMark18 = new javax.swing.JTextField();
        jTextFieldMark19 = new javax.swing.JTextField();
        jTextFieldMark20 = new javax.swing.JTextField();
        jTextFieldMark21 = new javax.swing.JTextField();
        jTextFieldMark22 = new javax.swing.JTextField();
        jTextFieldMark23 = new javax.swing.JTextField();
        jTextFieldMark24 = new javax.swing.JTextField();
        jTextFieldMark25 = new javax.swing.JTextField();
        jTextFieldMark26 = new javax.swing.JTextField();
        jTextFieldMark27 = new javax.swing.JTextField();
        jTextFieldMark28 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBoxSID1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBoxSClass1 = new javax.swing.JComboBox<>();
        jComboBoxSID = new javax.swing.JComboBox<>();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACADEMIC TRANSCRIPT");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(350, 30, 720, 30);
        jPanel2.add(jTextField5Sreg);
        jTextField5Sreg.setBounds(480, 190, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Reg No");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(340, 190, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Serial No");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 30, 130, 30);
        jPanel2.add(jTextField1ExamName);
        jTextField1ExamName.setBounds(350, 60, 720, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Class");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 70, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Student ID");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 110, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Father's Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 150, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mother's Name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(340, 150, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Roll No");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 190, 130, 30);
        jPanel2.add(jTextField2Fname);
        jTextField2Fname.setBounds(150, 150, 170, 30);
        jPanel2.add(jTextField3Mname);
        jTextField3Mname.setBounds(480, 150, 170, 30);
        jPanel2.add(jTextField4Sroll);
        jTextField4Sroll.setBounds(150, 190, 170, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"80-100", "A+", "5.00"},
                {"70-79", "A", "4.00"},
                {"60-69", "A-", "3.50"},
                {"50-59", "B", "3.00"},
                {"40-49", "C", "2.00"},
                {"33-39", "D", "1.00"},
                {"00-32", "F", "0.00"}
            },
            new String [] {
                "Range Of Marks", "Latter Gread", "Gread Point"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(1020, 100, 380, 150);

        jLabelSubject6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject6);
        jLabelSubject6.setBounds(220, 510, 240, 30);

        jLabelSubject5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject5);
        jLabelSubject5.setBounds(220, 470, 240, 30);

        jLabelSubject4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject4);
        jLabelSubject4.setBounds(220, 430, 240, 30);

        jLabelSubject3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject3);
        jLabelSubject3.setBounds(220, 390, 240, 30);

        jLabelSubject2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject2);
        jLabelSubject2.setBounds(220, 350, 240, 30);

        jLabelCGPA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCGPA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelCGPA);
        jLabelCGPA.setBounds(1240, 310, 130, 550);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("GPA");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(1240, 270, 130, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Written by_ _ _ _ _ _ _ _ _ _ _ __ _");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(60, 900, 340, 30);
        jPanel2.add(jTextField6Sgroup);
        jTextField6Sgroup.setBounds(150, 230, 170, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Session");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(340, 230, 130, 30);
        jPanel2.add(jTextField7Ssession);
        jTextField7Ssession.setBounds(480, 230, 170, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Student Name");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(340, 110, 130, 30);
        jPanel2.add(jTextField1Sname);
        jTextField1Sname.setBounds(480, 110, 170, 30);

        jLabelSubject14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject14);
        jLabelSubject14.setBounds(220, 830, 240, 30);

        jLabelSubject12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject12);
        jLabelSubject12.setBounds(220, 750, 240, 30);

        jLabelSubject11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject11);
        jLabelSubject11.setBounds(220, 710, 240, 30);

        jLabelSubject10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject10);
        jLabelSubject10.setBounds(220, 670, 240, 30);

        jLabelSubject9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject9);
        jLabelSubject9.setBounds(220, 630, 240, 30);

        jLabelSubject8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject8);
        jLabelSubject8.setBounds(220, 590, 240, 30);

        jLabelSubject7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject7);
        jLabelSubject7.setBounds(220, 550, 240, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 204));
        jLabel26.setText("Serial No");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(70, 270, 80, 30);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 204));
        jLabel27.setText("Subject Name");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(220, 270, 240, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 204));
        jLabel28.setText("Full Mark");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(480, 270, 170, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 204));
        jLabel29.setText("Obtained Mark");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(670, 270, 170, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 204));
        jLabel30.setText("Latter Gread");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(860, 270, 170, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 204));
        jLabel31.setText("Gread Point");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(1050, 270, 170, 30);

        jLabelSubject13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject13);
        jLabelSubject13.setBounds(220, 790, 240, 30);

        jTextFieldMark2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark2KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark2);
        jTextFieldMark2.setBounds(670, 350, 170, 30);

        jTextFieldMark1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark1KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark1);
        jTextFieldMark1.setBounds(670, 310, 170, 30);

        jTextFieldMark3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark3KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark3);
        jTextFieldMark3.setBounds(670, 390, 170, 30);

        jTextFieldMark4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark4KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark4);
        jTextFieldMark4.setBounds(670, 430, 170, 30);

        jTextFieldMark5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark5KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark5);
        jTextFieldMark5.setBounds(670, 470, 170, 30);

        jTextFieldMark6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark6KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark6);
        jTextFieldMark6.setBounds(670, 510, 170, 30);

        jTextFieldMark7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark7KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark7);
        jTextFieldMark7.setBounds(670, 550, 170, 30);

        jTextFieldMark8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark8KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark8);
        jTextFieldMark8.setBounds(670, 590, 170, 30);

        jTextFieldMark9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark9KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark9);
        jTextFieldMark9.setBounds(670, 630, 170, 30);

        jTextFieldMark10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark10KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark10);
        jTextFieldMark10.setBounds(670, 670, 170, 30);

        jTextFieldMark11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark11KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark11);
        jTextFieldMark11.setBounds(670, 710, 170, 30);

        jTextFieldMark12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark12KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark12);
        jTextFieldMark12.setBounds(670, 750, 170, 30);

        jTextFieldMark13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark13KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark13);
        jTextFieldMark13.setBounds(670, 790, 170, 30);

        jTextFieldMark14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark14KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark14);
        jTextFieldMark14.setBounds(670, 830, 170, 30);

        jLabelSubject1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject1);
        jLabelSubject1.setBounds(220, 310, 240, 30);

        jComboBoxSClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseMoved(evt);
            }
        });
        jComboBoxSClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSClassMouseClicked(evt);
            }
        });
        jComboBoxSClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSClassActionPerformed(evt);
            }
        });
        jComboBoxSClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxSClassKeyReleased(evt);
            }
        });
        jPanel2.add(jComboBoxSClass);
        jComboBoxSClass.setBounds(150, 70, 170, 30);

        jLabelSubject15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject15.setText("100");
        jLabelSubject15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject15);
        jLabelSubject15.setBounds(480, 310, 170, 30);

        jLabelSubject16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject16.setText("100");
        jLabelSubject16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject16);
        jLabelSubject16.setBounds(480, 350, 170, 30);

        jLabelSubject17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject17.setText("100");
        jLabelSubject17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject17);
        jLabelSubject17.setBounds(480, 390, 170, 30);

        jLabelSubject18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject18.setText("100");
        jLabelSubject18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject18);
        jLabelSubject18.setBounds(480, 430, 170, 30);

        jLabelSubject19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject19.setText("100");
        jLabelSubject19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject19);
        jLabelSubject19.setBounds(480, 470, 170, 30);

        jLabelSubject20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject20.setText("100");
        jLabelSubject20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject20);
        jLabelSubject20.setBounds(480, 510, 170, 30);

        jLabelSubject21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject21.setText("100");
        jLabelSubject21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject21);
        jLabelSubject21.setBounds(480, 550, 170, 30);

        jLabelSubject22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject22.setText("100");
        jLabelSubject22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject22);
        jLabelSubject22.setBounds(480, 590, 170, 30);

        jLabelSubject23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject23.setText("100");
        jLabelSubject23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject23);
        jLabelSubject23.setBounds(480, 630, 170, 30);

        jLabelSubject24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject24.setText("100");
        jLabelSubject24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject24);
        jLabelSubject24.setBounds(480, 670, 170, 30);

        jLabelSubject25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject25.setText("100");
        jLabelSubject25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject25);
        jLabelSubject25.setBounds(480, 710, 170, 30);

        jLabelSubject26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject26.setText("100");
        jLabelSubject26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject26);
        jLabelSubject26.setBounds(480, 750, 170, 30);

        jLabelSubject27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject27.setText("100");
        jLabelSubject27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject27);
        jLabelSubject27.setBounds(480, 790, 170, 30);

        jLabelSubject28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject28.setText("100");
        jLabelSubject28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelSubject28);
        jLabelSubject28.setBounds(480, 830, 170, 30);

        jLabelLatter1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter1);
        jLabelLatter1.setBounds(860, 310, 170, 30);

        jLabelLatter2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter2);
        jLabelLatter2.setBounds(860, 350, 170, 30);

        jLabelLatter3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter3);
        jLabelLatter3.setBounds(860, 390, 170, 30);

        jLabelLatter4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter4);
        jLabelLatter4.setBounds(860, 430, 170, 30);

        jLabelLatter5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter5);
        jLabelLatter5.setBounds(860, 470, 170, 30);

        jLabelLatter6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter6);
        jLabelLatter6.setBounds(860, 510, 170, 30);

        jLabelLatter7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter7);
        jLabelLatter7.setBounds(860, 550, 170, 30);

        jLabelLatter8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter8);
        jLabelLatter8.setBounds(860, 590, 170, 30);

        jLabelLatter9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter9);
        jLabelLatter9.setBounds(860, 630, 170, 30);

        jLabelLatter10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter10);
        jLabelLatter10.setBounds(860, 670, 170, 30);

        jLabelLatter11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter11);
        jLabelLatter11.setBounds(860, 710, 170, 30);

        jLabelLatter12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter12);
        jLabelLatter12.setBounds(860, 750, 170, 30);

        jLabelLatter13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter13);
        jLabelLatter13.setBounds(860, 790, 170, 30);

        jLabelLatter14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLatter14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.add(jLabelLatter14);
        jLabelLatter14.setBounds(860, 830, 170, 30);

        jTextFieldMark15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark15KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark15);
        jTextFieldMark15.setBounds(1050, 310, 170, 30);

        jTextFieldMark16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark16KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark16);
        jTextFieldMark16.setBounds(1050, 350, 170, 30);

        jTextFieldMark17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark17KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark17);
        jTextFieldMark17.setBounds(1050, 390, 170, 30);

        jTextFieldMark18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark18KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark18);
        jTextFieldMark18.setBounds(1050, 430, 170, 30);

        jTextFieldMark19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark19KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark19);
        jTextFieldMark19.setBounds(1050, 470, 170, 30);

        jTextFieldMark20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark20KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark20);
        jTextFieldMark20.setBounds(1050, 510, 170, 30);

        jTextFieldMark21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark21KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark21);
        jTextFieldMark21.setBounds(1050, 550, 170, 30);

        jTextFieldMark22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark22KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark22);
        jTextFieldMark22.setBounds(1050, 590, 170, 30);

        jTextFieldMark23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark23KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark23);
        jTextFieldMark23.setBounds(1050, 630, 170, 30);

        jTextFieldMark24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark24KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark24);
        jTextFieldMark24.setBounds(1050, 670, 170, 30);

        jTextFieldMark25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark25KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark25);
        jTextFieldMark25.setBounds(1050, 710, 170, 30);

        jTextFieldMark26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark26KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark26);
        jTextFieldMark26.setBounds(1050, 750, 170, 30);

        jTextFieldMark27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark27KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark27);
        jTextFieldMark27.setBounds(1050, 790, 170, 30);

        jTextFieldMark28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMark28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMark28KeyReleased(evt);
            }
        });
        jPanel2.add(jTextFieldMark28);
        jTextFieldMark28.setBounds(1050, 830, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Chanua Islamia Dhakhil Madrasha Chanua Feni");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(350, 0, 720, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Group");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 230, 130, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Head Master _ _ _ _ _ _ _ _ _ _ _ _ ");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(1050, 900, 320, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Vice Head Master _ _ _ _ _ _ _ _ _ _ _ _ ");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(640, 900, 340, 30);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(150, 30, 170, 30);

        jComboBoxSID1.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxSID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSID1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        jComboBoxSID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSID1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxSID1);
        jComboBoxSID1.setBounds(150, 110, 170, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(70, 310, 80, 550);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 30, 1410, 940);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1050, 0, 110, 31);

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1290, 0, 110, 31);

        jButton3.setBackground(new java.awt.Color(102, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1170, 0, 110, 31);

        jComboBoxSClass1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSClass1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class", "Play", "Nursary", "One ", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" }));
        jComboBoxSClass1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBoxSClass1MouseMoved(evt);
            }
        });
        jComboBoxSClass1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxSClass1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxSClass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSClass1MouseClicked(evt);
            }
        });
        jComboBoxSClass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSClass1ActionPerformed(evt);
            }
        });
        jComboBoxSClass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxSClass1KeyReleased(evt);
            }
        });
        jPanel1.add(jComboBoxSClass1);
        jComboBoxSClass1.setBounds(370, 0, 170, 30);

        jComboBoxSID.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxSID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxSID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        jComboBoxSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSIDActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxSID);
        jComboBoxSID.setBounds(120, 0, 170, 30);

        jLabel355.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel355.setForeground(new java.awt.Color(153, 0, 102));
        jLabel355.setText("Student ID ");
        jPanel1.add(jLabel355);
        jLabel355.setBounds(0, 0, 110, 30);

        jLabel356.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel356.setForeground(new java.awt.Color(153, 0, 102));
        jLabel356.setText("Class");
        jPanel1.add(jLabel356);
        jLabel356.setBounds(300, 0, 70, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1400, 30);

        setSize(new java.awt.Dimension(1422, 1015));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMark2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark2KeyReleased
        
    }//GEN-LAST:event_jTextFieldMark2KeyReleased

    private void jTextFieldMark1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark1KeyReleased
        // TODO add your handling code here:
               
    }//GEN-LAST:event_jTextFieldMark1KeyReleased

    private void jTextFieldMark3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark3KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark3.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter3.setText("A+");
            jTextFieldMark17.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter3.setText("A");
            jTextFieldMark17.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter3.setText("A-");
            jTextFieldMark17.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter3.setText("B");
            jTextFieldMark17.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter3.setText("C");
            jTextFieldMark17.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter2.setText("D");
            jTextFieldMark17.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter2.setText("F");
            jTextFieldMark17.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark3KeyReleased

    private void jTextFieldMark4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark4KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark4.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter4.setText("A+");
            jTextFieldMark18.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter4.setText("A");
            jTextFieldMark18.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter4.setText("A-");
            jTextFieldMark18.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter4.setText("B");
            jTextFieldMark18.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter4.setText("C");
            jTextFieldMark18.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter4.setText("D");
            jTextFieldMark18.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter4.setText("F");
            jTextFieldMark18.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark4KeyReleased

    private void jTextFieldMark5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark5KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark5.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter5.setText("A+");
            jTextFieldMark19.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter5.setText("A");
            jTextFieldMark19.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter5.setText("A-");
            jTextFieldMark19.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter5.setText("B");
            jTextFieldMark19.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter5.setText("C");
            jTextFieldMark19.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter5.setText("D");
            jTextFieldMark19.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter5.setText("F");
            jTextFieldMark19.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark5KeyReleased

    private void jTextFieldMark6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark6KeyReleased

    }//GEN-LAST:event_jTextFieldMark6KeyReleased

    private void jTextFieldMark7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark7KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark7.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter7.setText("A+");
            jTextFieldMark21.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter7.setText("A");
            jTextFieldMark21.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter7.setText("A-");
            jTextFieldMark21.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter7.setText("B");
            jTextFieldMark21.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter7.setText("C");
            jTextFieldMark21.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter7.setText("D");
            jTextFieldMark21.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter7.setText("F");
            jTextFieldMark21.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark7KeyReleased

    private void jTextFieldMark8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark8KeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextFieldMark8KeyReleased

    private void jTextFieldMark9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark9KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark9.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter9.setText("A+");
            jTextFieldMark23.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter9.setText("A");
            jTextFieldMark23.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter9.setText("A-");
            jTextFieldMark23.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter9.setText("B");
            jTextFieldMark23.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter9.setText("C");
            jTextFieldMark23.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter9.setText("D");
            jTextFieldMark23.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter9.setText("F");
            jTextFieldMark23.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark9KeyReleased

    private void jTextFieldMark10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark10KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark10.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter10.setText("A+");
            jTextFieldMark24.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter10.setText("A");
            jTextFieldMark24.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter10.setText("A-");
            jTextFieldMark24.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter10.setText("B");
            jTextFieldMark24.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter10.setText("C");
            jTextFieldMark24.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter10.setText("D");
            jTextFieldMark24.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter10.setText("F");
            jTextFieldMark24.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark10KeyReleased

    private void jTextFieldMark11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark11KeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextFieldMark11KeyReleased

    private void jTextFieldMark12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark12KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark12.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter12.setText("A+");
            jTextFieldMark26.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter12.setText("A");
            jTextFieldMark26.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter12.setText("A-");
            jTextFieldMark26.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter12.setText("B");
            jTextFieldMark26.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter12.setText("C");
            jTextFieldMark26.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter12.setText("D");
            jTextFieldMark26.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter12.setText("F");
            jTextFieldMark26.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark12KeyReleased

    private void jTextFieldMark13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark13KeyReleased
        // TODO add your handling code here:
        int m1=0;
        m1=Integer.parseInt(jTextFieldMark13.getText());
        if(m1 >= 80 && m1 <= 100){
            jLabelLatter13.setText("A+");
            jTextFieldMark27.setText("5.00");
        }else if(m1 >= 70 && m1 <80){
            jLabelLatter13.setText("A");
            jTextFieldMark27.setText("4.00");
        }else if(m1 >= 60 && m1 <70){
            jLabelLatter13.setText("A-");
            jTextFieldMark27.setText("3.50");
        }else if(m1 >= 50 && m1 <60){
            jLabelLatter13.setText("B");
            jTextFieldMark27.setText("3.50");
        }else if(m1 >= 40 && m1 <50){
            jLabelLatter13.setText("C");
            jTextFieldMark27.setText("3.00");
        }else if(m1 >= 33 && m1 <40){
            jLabelLatter13.setText("D");
            jTextFieldMark27.setText("3.00");
        }else if(m1 >= 0 && m1 <33){
            jLabelLatter13.setText("F");
            jTextFieldMark27.setText("0.00");
        }
    }//GEN-LAST:event_jTextFieldMark13KeyReleased

    private void jTextFieldMark14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark14KeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextFieldMark14KeyReleased

    private void jComboBoxSClassMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClassMouseMoved

    private void jComboBoxSClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClassMouseClicked

    }//GEN-LAST:event_jComboBoxSClassMouseClicked

    private void jComboBoxSClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSClassActionPerformed
        // TODO add your handling code here:
        connection();
        String se=null;
        se="SELECT `Subject_1`,`Subject_2`,`Subject_3`,`Subject_4`,`Subject_5`,`Subject_6`,`Subject_7`,`Subject_8`,`Subject_9`,`Subject_10`,`Subject_11`,`Subject_12`,`Subject_13`,`Subject_14` FROM `subject` WHERE `Class`=?";
        try {
            ps=jcon.prepareStatement(se);
            ps.setString(1, jComboBoxSClass.getSelectedItem().toString());
            rs=ps.executeQuery();
            if(rs.next()){
                jLabelSubject1.setText(rs.getString("Subject_1"));
                jLabelSubject2.setText(rs.getString("Subject_2"));
                jLabelSubject3.setText(rs.getString("Subject_3"));
                jLabelSubject4.setText(rs.getString("Subject_4"));
                jLabelSubject5.setText(rs.getString("Subject_5"));
                jLabelSubject6.setText(rs.getString("Subject_6"));
                jLabelSubject7.setText(rs.getString("Subject_7"));
                jLabelSubject8.setText(rs.getString("Subject_8"));
                jLabelSubject9.setText(rs.getString("Subject_9"));
                jLabelSubject10.setText(rs.getString("Subject_10"));
                jLabelSubject11.setText(rs.getString("Subject_11"));
                jLabelSubject12.setText(rs.getString("Subject_12"));
                jLabelSubject13.setText(rs.getString("Subject_13"));
                jLabelSubject14.setText(rs.getString("Subject_14"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jComboBoxSClassActionPerformed

    private void jComboBoxSClassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSClassKeyReleased

    }//GEN-LAST:event_jComboBoxSClassKeyReleased

    private void jComboBoxSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSIDActionPerformed
        //init();
        connection();
        String se="SELECT `Name`,`FatherName`,`Mother_Name`,`Roll_NO`,`Group`,`Session` FROM `student_admission` WHERE `Id` = ?";
        try {
            ps=jcon.prepareStatement(se);
            ps.setString(1,jComboBoxSID.getSelectedItem().toString());
            rs=ps.executeQuery();
            if(rs.next()){
                jTextField1Sname.setText(rs.getString("Name"));
                jTextField2Fname.setText(rs.getString("FatherName"));
                jTextField3Mname.setText(rs.getString("Mother_Name"));
                jTextField4Sroll.setText(rs.getString("Roll_NO"));
                jTextField6Sgroup.setText(rs.getString("Group"));
                jTextField7Ssession.setText(rs.getString("Session"));
                boolean b=ps.execute();
                if(b){
                    JOptionPane.showMessageDialog(this,"Operation Success..");
                }else{
                    JOptionPane.showMessageDialog(this,"Operation Filed..");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student_Attendence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxSIDActionPerformed

    private void jTextFieldMark15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark15KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark15KeyReleased

    private void jTextFieldMark16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark16KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark16KeyReleased

    private void jTextFieldMark17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark17KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark17KeyReleased

    private void jTextFieldMark18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark18KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark18KeyReleased

    private void jTextFieldMark19KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark19KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark19KeyReleased

    private void jTextFieldMark20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark20KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark20KeyReleased

    private void jTextFieldMark21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark21KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark21KeyReleased

    private void jTextFieldMark22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark22KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark22KeyReleased

    private void jTextFieldMark23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark23KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark23KeyReleased

    private void jTextFieldMark24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark24KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark24KeyReleased

    private void jTextFieldMark25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark25KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark25KeyReleased

    private void jTextFieldMark26KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark26KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark26KeyReleased

    private void jTextFieldMark27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark27KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark27KeyReleased

    private void jTextFieldMark28KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMark28KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMark28KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // View Mark Sheet
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxSClass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClass1MouseClicked

    }//GEN-LAST:event_jComboBoxSClass1MouseClicked

    private void jComboBoxSClass1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxSClass1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        connection();
        //jComboBoxSubject.removeAllItems();
        int i=jComboBoxSClass.getSelectedIndex();
        String se=null;
        se="SELECT `Subject` FROM `class_subject` WHERE `Class_ID`="+i;
        try {
            ps=jcon.prepareStatement(se);
            rs=ps.executeQuery();
            while(rs.next()){
                //jComboBoxSubject.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Exam_Routine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxSClass1PopupMenuWillBecomeInvisible

    private void jComboBoxSClass1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSClass1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClass1MouseMoved

    private void jComboBoxSClass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSClass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSClass1ActionPerformed

    private void jComboBoxSClass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSClass1KeyReleased

    }//GEN-LAST:event_jComboBoxSClass1KeyReleased

    private void jComboBoxSID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSID1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(View_Mark_Sheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Mark_Sheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Mark_Sheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Mark_Sheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Mark_Sheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxSClass;
    private javax.swing.JComboBox<String> jComboBoxSClass1;
    private javax.swing.JComboBox<String> jComboBoxSID;
    private javax.swing.JComboBox<String> jComboBoxSID1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCGPA;
    private javax.swing.JLabel jLabelLatter1;
    private javax.swing.JLabel jLabelLatter10;
    private javax.swing.JLabel jLabelLatter11;
    private javax.swing.JLabel jLabelLatter12;
    private javax.swing.JLabel jLabelLatter13;
    private javax.swing.JLabel jLabelLatter14;
    private javax.swing.JLabel jLabelLatter2;
    private javax.swing.JLabel jLabelLatter3;
    private javax.swing.JLabel jLabelLatter4;
    private javax.swing.JLabel jLabelLatter5;
    private javax.swing.JLabel jLabelLatter6;
    private javax.swing.JLabel jLabelLatter7;
    private javax.swing.JLabel jLabelLatter8;
    private javax.swing.JLabel jLabelLatter9;
    private javax.swing.JLabel jLabelSubject1;
    private javax.swing.JLabel jLabelSubject10;
    private javax.swing.JLabel jLabelSubject11;
    private javax.swing.JLabel jLabelSubject12;
    private javax.swing.JLabel jLabelSubject13;
    private javax.swing.JLabel jLabelSubject14;
    private javax.swing.JLabel jLabelSubject15;
    private javax.swing.JLabel jLabelSubject16;
    private javax.swing.JLabel jLabelSubject17;
    private javax.swing.JLabel jLabelSubject18;
    private javax.swing.JLabel jLabelSubject19;
    private javax.swing.JLabel jLabelSubject2;
    private javax.swing.JLabel jLabelSubject20;
    private javax.swing.JLabel jLabelSubject21;
    private javax.swing.JLabel jLabelSubject22;
    private javax.swing.JLabel jLabelSubject23;
    private javax.swing.JLabel jLabelSubject24;
    private javax.swing.JLabel jLabelSubject25;
    private javax.swing.JLabel jLabelSubject26;
    private javax.swing.JLabel jLabelSubject27;
    private javax.swing.JLabel jLabelSubject28;
    private javax.swing.JLabel jLabelSubject3;
    private javax.swing.JLabel jLabelSubject4;
    private javax.swing.JLabel jLabelSubject5;
    private javax.swing.JLabel jLabelSubject6;
    private javax.swing.JLabel jLabelSubject7;
    private javax.swing.JLabel jLabelSubject8;
    private javax.swing.JLabel jLabelSubject9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1ExamName;
    private javax.swing.JTextField jTextField1Sname;
    private javax.swing.JTextField jTextField2Fname;
    private javax.swing.JTextField jTextField3Mname;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField4Sroll;
    private javax.swing.JTextField jTextField5Sreg;
    private javax.swing.JTextField jTextField6Sgroup;
    private javax.swing.JTextField jTextField7Ssession;
    private javax.swing.JTextField jTextFieldMark1;
    private javax.swing.JTextField jTextFieldMark10;
    private javax.swing.JTextField jTextFieldMark11;
    private javax.swing.JTextField jTextFieldMark12;
    private javax.swing.JTextField jTextFieldMark13;
    private javax.swing.JTextField jTextFieldMark14;
    private javax.swing.JTextField jTextFieldMark15;
    private javax.swing.JTextField jTextFieldMark16;
    private javax.swing.JTextField jTextFieldMark17;
    private javax.swing.JTextField jTextFieldMark18;
    private javax.swing.JTextField jTextFieldMark19;
    private javax.swing.JTextField jTextFieldMark2;
    private javax.swing.JTextField jTextFieldMark20;
    private javax.swing.JTextField jTextFieldMark21;
    private javax.swing.JTextField jTextFieldMark22;
    private javax.swing.JTextField jTextFieldMark23;
    private javax.swing.JTextField jTextFieldMark24;
    private javax.swing.JTextField jTextFieldMark25;
    private javax.swing.JTextField jTextFieldMark26;
    private javax.swing.JTextField jTextFieldMark27;
    private javax.swing.JTextField jTextFieldMark28;
    private javax.swing.JTextField jTextFieldMark3;
    private javax.swing.JTextField jTextFieldMark4;
    private javax.swing.JTextField jTextFieldMark5;
    private javax.swing.JTextField jTextFieldMark6;
    private javax.swing.JTextField jTextFieldMark7;
    private javax.swing.JTextField jTextFieldMark8;
    private javax.swing.JTextField jTextFieldMark9;
    // End of variables declaration//GEN-END:variables
}
