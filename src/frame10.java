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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
public class frame10 extends javax.swing.JFrame {

    /**
     * Creates new form frame10
     */
    String s,q;
    int a=0;
    public frame10() {
        initComponents();
    }
public frame10(String s,String q)
{
    this.s=s;
    this.q=q;
    initComponents();
    Connection con;
    Connect ob=new Connect();
    con=ob.getConnection();
    if(s.equals("Savings"))
    {
        String sql="Select accountno from savings where name=?";
        try {
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,q);
            ResultSet r1=pst.executeQuery();
            if(r1.next())
            {
                a=r1.getInt(1);
               
                
            }
            
          } 
        catch (SQLException ex) {
            Logger.getLogger(frame10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     if(s.equals("Current"))
    {
        String sql1="Select accountno from current where name=?";
        try {
            PreparedStatement pst1=con.prepareStatement(sql1);
            pst1.setString(1,q);
            ResultSet r2=pst1.executeQuery();
            if(r2.next())
            {
                a=r2.getInt(1);
               
                
            }
            
            
        }
        catch (SQLException ex) {
            Logger.getLogger(frame10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       String sq="Select date,time,amount,type from transact where accountno=?" ;
       
            try {
                PreparedStatement ps=con.prepareStatement(sq);
                ps.setInt(1,a);
                ResultSet res=ps.executeQuery();
                
                    jTable1.setModel(DbUtils.resultSetToTableModel(res));
                    
                
            } 
            catch (SQLException ex) {
                Logger.getLogger(frame10.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 601));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("URW Palladio L", 1, 24)); // NOI18N
        jLabel6.setText("Transaction Details");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 40, 260, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(2, 142, 810, 250);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 460, 90, 40);

        jButton2.setBackground(new java.awt.Color(255, 128, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("/home/swathi/Downloads/icons8-login-50.png")); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 0, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/swathi/Downloads/Blooker20.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 820, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        frame2 f=new frame2();
        f.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        frame4 f=new frame4(s,q);
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frame10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
