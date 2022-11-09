package railway.management.system;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sagar Jadhav
 */
public class singup_from extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs,rs2;
PreparedStatement pst,pst2;
    /**
     * Creates new form singup_from
     */
    public singup_from() {
        initComponents();
        laodimg();
        Connect();
        setIconImage();
    }
    
    public void Connect(){
    try{
        
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_database","root","");
      stmt = con.createStatement();
     
    }catch(SQLException ex){
       JOptionPane.showMessageDialog(this,ex.getMessage());
    }
    
    }
    
    
 public void laodimg(){
 ImageIcon icn = new ImageIcon(getClass().getResource("/src/singup.jpg"));
    Image img = icn.getImage();
    Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    jLabel1.setIcon(scaledIcon);    
 
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobile_nn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emil = new javax.swing.JTextField();
        iddu = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        pas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 30));

        name.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 139, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile No:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, 30));

        mobile_nn.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jPanel1.add(mobile_nn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 139, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email Id:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Id:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, 30));

        emil.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jPanel1.add(emil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 139, 30));

        iddu.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jPanel1.add(iddu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 139, 30));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        pas.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jPanel1.add(pas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 139, 30));

        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 437, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setText("Back To Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 437, -1, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 568, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //submit
                 if(name.getText().isEmpty() && iddu.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Empty filed");
             }
             else{
        try{
             
               String pl = name.getText();
               String emi = emil.getText();
               String mo = mobile_nn.getText();
                String gender = "";
                if(male.isSelected()){
                 gender="Male";
                }else if(female.isSelected()){
                          gender ="Female";
        }
                String ui = iddu.getText();
               String pas1 = pas.getText();
               
              
               
          String sql = "INSERT INTO `user_login`( `name`, `mobile_no`, `gender`, `email`, `userId`, `password`) "
                  + "VALUES ('"+pl+"','"+mo+"','"+gender+"','"+emi+"','"+ui+"','"+pas1+"')";
          stmt.executeUpdate(sql);
          name.setText("");
          iddu.setText("");
          pas.setText("");
          buttonGroup1.clearSelection();
          emil.setText("");
          mobile_nn.setText("");
         
          JOptionPane.showMessageDialog(this, "Recored Save Successfully");
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());}      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // back to login
        login_system lg = new login_system();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singup_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singup_from().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emil;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField iddu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobile_nn;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pas;
    // End of variables declaration//GEN-END:variables

private void setIconImage() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/src/railway-station.png")));
    }
}
