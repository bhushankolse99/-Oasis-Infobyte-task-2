/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choicenumbergame;

import javax.swing.JOptionPane;

/**
 *
 * @author bhush
 */
public class game extends javax.swing.JFrame {
int c =0; 
String str2="";
    /**
     * Creates new form game
     */
    public game() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        userno = new javax.swing.JTextField();
        comguration = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        result.setBackground(new java.awt.Color(255, 255, 0));
        result.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        result.setForeground(new java.awt.Color(255, 0, 51));
        result.setText("                         Status");
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(result);
        result.setBounds(760, 650, 380, 60);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cheek");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(840, 600, 230, 40);

        userno.setBackground(new java.awt.Color(0, 0, 0));
        userno.setForeground(new java.awt.Color(0, 204, 0));
        userno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernoActionPerformed(evt);
            }
        });
        getContentPane().add(userno);
        userno.setBounds(750, 520, 440, 50);

        comguration.setBackground(new java.awt.Color(255, 255, 0));
        comguration.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        comguration.setForeground(new java.awt.Color(255, 0, 51));
        comguration.setText("Show the Number");
        comguration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comgurationMouseClicked(evt);
            }
        });
        getContentPane().add(comguration);
        comguration.setBounds(830, 710, 290, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/choicenumbergame/images.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(840, 280, 230, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Gause thye number between 1 to 100");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 0)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(670, 450, 710, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/choicenumbergame/—Pngtree—abstract hacker background with digital_1177210.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1910, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String user=userno.getText();
        int un=Integer.parseInt(user);
        if(un<=0||un>100){
            result.setText("INVALID GUESS");
        }
        else if(un==c){
        JOptionPane.showMessageDialog(this, "Correct answer",
                                          "INFORMATION",
                                          JOptionPane.INFORMATION_MESSAGE);
        }
         else if(un>c){
        result.setText("YOUR GUESS IS TO HIGH ....");
        }
         else if(un<c){
        result.setText("YOUR GUESS IS TO LOW ....");
        }
         else {
        result.setText("YOUR GUESS IS INCORRECT ....");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_usernoActionPerformed

    private void comgurationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comgurationMouseClicked
        // TODO add your handling code here:
        c =(int) (Math.random()*100+1); 
        str2 = Integer.toString(c );
        comguration.setText(str2);  
    }//GEN-LAST:event_comgurationMouseClicked

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comguration;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel result;
    private javax.swing.JTextField userno;
    // End of variables declaration//GEN-END:variables
}
