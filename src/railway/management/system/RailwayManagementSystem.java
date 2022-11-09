package railway.management.system;

import java.awt.Color;

public class RailwayManagementSystem {


    public static void main(String[] args) {
        
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RailwayManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        
    splash_screen sp = new splash_screen();
      sp.setVisible(true);
      login_system lg = new login_system();
      try{
       sp.bar.setForeground(Color.green);
       sp.bar.setBackground(Color.WHITE);
      for(int i=0;i<=100;i++){
      Thread.sleep(39);
      sp.bar.setValue(i);
     
      if(i==100){
      sp.setVisible(false);
      lg.setVisible(true);
      }
      
      }
      }catch(InterruptedException ex){
      
      }
    }
    
}
