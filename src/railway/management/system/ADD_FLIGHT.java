
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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sagar Jadhav
 */
public class ADD_FLIGHT extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
PreparedStatement pst,pst2; 
    public ADD_FLIGHT() {
        initComponents();
        laodimgff();
        Connect();
        setIconImage();
    }
public void laodimgff(){
ImageIcon icn = new ImageIcon(getClass().getResource("/src/add_railway.jpg"));
    Image img = icn.getImage();
    Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    jLabel1.setIcon(scaledIcon);    
}
    public void Connect(){
    try{
        
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway_database","root","");
      stmt = con.createStatement();
     
    }catch(SQLException ex){
       JOptionPane.showMessageDialog(this,ex.getMessage());
    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ralway_number = new javax.swing.JTextField();
        dep_set = new javax.swing.JComboBox<>();
        departure_date_set = new com.toedter.calendar.JDateChooser();
        arri_time = new javax.swing.JTextField();
        qouta_set = new javax.swing.JComboBox<>();
        class_first = new javax.swing.JComboBox<>();
        pric = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sel_arrival = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD RAILWAY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Railway Number:-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departure:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Departure Date:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arrival Time:-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 120, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Qouta:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 120, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Class:-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 120, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price:-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, 30));

        ralway_number.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(ralway_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 171, 25));

        dep_set.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dep_set.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Aurangabad", "DELHI", "BANGLORE", "MUMBAI", "PUNE", "BHIHAR", "UP", "KOLKATA", "RAJASTHAN", "GUJRAT" }));
        jPanel1.add(dep_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 171, 30));

        departure_date_set.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(departure_date_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 171, 28));

        arri_time.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(arri_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 96, 30));

        qouta_set.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        qouta_set.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "LADIES", "LOWER BERTH/SR.CITIZEN", "DIVYAANG", "TATKAL", "PREMIUM TATKAL" }));
        jPanel1.add(qouta_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, 30));

        class_first.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        class_first.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIRST AC             1A", "EXECUTIVE CLASS      EC", "EXECUTIVE ANUBHUTI    EA", "SECOND AC            2A", "THIRD AC             3A", "3 AC Economy          3E", "AC CHAIR CAR         CC", "FIRST CLASS          FC" }));
        jPanel1.add(class_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 176, 30));

        pric.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(pric, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 78, 30));

        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Arrival:-");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 30));

        sel_arrival.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sel_arrival.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Aurangabad", "DELHI", "BANGLORE", "MUMBAI", "PUNE", "BHIHAR", "UP", "KOLKATA", "RAJASTHAN", "GUJRAT" }));
        jPanel1.add(sel_arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 729, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // SUBMIT
                if(ralway_number.getText().isEmpty() && arri_time.getText().isEmpty()){
              JOptionPane.showMessageDialog(this,"Empty filed");
             }
             else{
        try{
             
               String ral_no = ralway_number.getText();
               String dep_tr = dep_set.getSelectedItem().toString();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
               String arrival_Setarea = sel_arrival.getSelectedItem().toString();
               String dep_date_set = sdf.format( departure_date_set.getDate());
               
               String arri = arri_time.getText();
                String ui = qouta_set.getSelectedItem().toString();
               String pas1 = class_first.getSelectedItem().toString();
               String paise_set = pric.getText();
               
              
               
          String sql = "INSERT INTO `railway_detail`( `railway_number`, `departure`, `arrival`, `arrival_time`, `departure_date`, `quota_set`, `class`, `price`)"
                  + "VALUES ('"+ral_no+"','"+dep_tr+"','"+arrival_Setarea+"','"+arri+"','"+dep_date_set+"','"+ui+"','"+pas1+"','"+paise_set+"')";
          stmt.executeUpdate(sql);
          ralway_number.setText("");
          dep_set.setSelectedIndex(0);
          arri_time.setText("");
          qouta_set.setSelectedIndex(0);
          sel_arrival.setSelectedIndex(0);
          class_first.setSelectedIndex(0);
          pric.setText("");
         
          JOptionPane.showMessageDialog(this, "Recored Save Successfully");
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());} 
        catch (SQLException ex) {
                        Logger.getLogger(ADD_FLIGHT.class.getName()).log(Level.SEVERE, null, ex);
                    }      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Cancel
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
            java.util.logging.Logger.getLogger(ADD_FLIGHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new ADD_FLIGHT().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arri_time;
    private javax.swing.JComboBox<String> class_first;
    private javax.swing.JComboBox<String> dep_set;
    private com.toedter.calendar.JDateChooser departure_date_set;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField pric;
    private javax.swing.JComboBox<String> qouta_set;
    private javax.swing.JTextField ralway_number;
    private javax.swing.JComboBox<String> sel_arrival;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/src/railway-station.png")));
    }
}
