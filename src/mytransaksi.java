
import javax.swing.JOptionPane;

public class mytransaksi extends javax.swing.JFrame
{    
    public mytransaksi()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lima = new javax.swing.JButton();
        satu1 = new javax.swing.JButton();
        dua1 = new javax.swing.JButton();
        tiga1 = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\COREL\\BANK.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 26)); // NOI18N
        jLabel1.setText("Pilih Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 30));

        lima.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jPanel1.add(lima, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 30));

        satu1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        satu1.setText("1");
        satu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satu1ActionPerformed(evt);
            }
        });
        jPanel1.add(satu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 30));

        dua1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dua1.setText("2");
        dua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dua1ActionPerformed(evt);
            }
        });
        jPanel1.add(dua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 30));

        tiga1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tiga1.setText("3");
        tiga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiga1ActionPerformed(evt);
            }
        });
        jPanel1.add(tiga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 30));

        empat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jPanel1.add(empat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("___________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        JOptionPane.showMessageDialog(null, "Terimkasih Sudah Bertransaksi di ATM BNI Syariah-Bojonegoro");
        myframe a = new myframe();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_limaActionPerformed

    private void satu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satu1ActionPerformed
     int saldo = 50000;
     JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : Rp " + saldo +",00");
    }//GEN-LAST:event_satu1ActionPerformed

    private void dua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dua1ActionPerformed
        JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia", "ERROR", 0);
    }//GEN-LAST:event_dua1ActionPerformed

    private void tiga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiga1ActionPerformed
        String tarik;
        tarik = JOptionPane.showInputDialog(null, "Masukkan Jumlah Penarikan!", "ATM BNI SYARIAH-BOJONEGORO", 0);
        int saldo = 50000;
        int jmltarik = Integer.parseInt(tarik);
        int total = saldo-jmltarik;
        JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : Rp " + total +",00");
    }//GEN-LAST:event_tiga1ActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        myinfo a = new myinfo();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_empatActionPerformed

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
            java.util.logging.Logger.getLogger(mytransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mytransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mytransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mytransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mytransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dua1;
    private javax.swing.JButton empat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lima;
    private javax.swing.JButton satu1;
    private javax.swing.JButton tiga1;
    // End of variables declaration//GEN-END:variables
}
