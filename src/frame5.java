/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swathi
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class frame5 extends javax.swing.JFrame {

    /**
     * Creates new form frame5
     */
    String s,q;
    public frame5() {
        initComponents();
    }
    public frame5(String a, String b)
    {
     
        initComponents();
        s=a;
        q=b;
        jLabel9.setText(s);
          jLabel20.setText(q);
          Connection con;
          Connect ob=new Connect();
          con=ob.getConnection();
          String sql="Select name,age,gender,phoneno,alternateph,occupation,district,state,address from savings where name=?";
      try {
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,q);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                jLabel12.setText(rs.getString("name"));
                jLabel11.setText(String.valueOf(rs.getInt("age")));
                jLabel13.setText(rs.getString("gender"));
                jLabel14.setText(String.valueOf(rs.getString("phoneno")));
                jLabel15.setText(String.valueOf(rs.getString("alternateph")));
                jLabel16.setText(rs.getString("address"));
                jLabel17.setText(rs.getString("district"));
                jLabel18.setText(rs.getString("state"));
                jLabel19.setText(rs.getString("occupation"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frame5.class.getName()).log(Level.SEVERE, null, ex);
        }
              
              
       
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(731, 557));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel1.setText("Full Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(104, 73, 100, 18);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel3.setText("Age:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(104, 109, 50, 18);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel10.setText("Gender");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(104, 145, 70, 18);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel7.setText("Phone No:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(104, 188, 100, 18);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel4.setText("Address:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(104, 276, 100, 18);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel5.setText("Occupation:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(104, 403, 130, 18);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel6.setText("District:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(104, 307, 85, 36);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel2.setText("State:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(104, 361, 90, 18);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel8.setText("Alternate Phone No:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(104, 231, 170, 18);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 30, 49, 30);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(412, 109, 70, 18);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(412, 73, 80, 18);

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(412, 145, 57, 18);

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(412, 188, 160, 18);

        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(412, 231, 180, 18);

        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(412, 276, 190, 30);

        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(412, 316, 210, 18);

        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(412, 361, 170, 18);

        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(412, 403, 190, 18);

        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 10, 57, 18);

        jLabel21.setFont(new java.awt.Font("URW Palladio L", 1, 24)); // NOI18N
        jLabel21.setText("Profile");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(260, 20, 150, 32);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(527, 450, 59, 30);

        jButton2.setBackground(new java.awt.Color(255, 128, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("/home/swathi/Downloads/icons8-login-50.png")); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 0, 130, 50);

        jLabel22.setIcon(new javax.swing.ImageIcon("/home/swathi/Downloads/Blooker20.jpg")); // NOI18N
        jLabel22.setText("jLabel22");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(0, 0, 740, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        frame4 f1=new frame4(s,q);
        f1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        frame2 f=new frame2();
        f.setVisible(true);
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
            java.util.logging.Logger.getLogger(frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
