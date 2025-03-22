/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import ui.RegistroSocio;
import ui.PagarCuotaMensual;
import ui.MostrarDatos;
import ui.MontoTotalCancelado;
import javax.swing.JOptionPane;

/**
 *
 * @author isisd
 */
public class VentanaSocio1 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaSocio1
     */
    public VentanaSocio1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chbRegistrarSocio = new javax.swing.JCheckBox();
        chbVerDatosSocio = new javax.swing.JCheckBox();
        chbPagoCuota = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Socios Cuenta Socios");

        chbRegistrarSocio.setText("Registrar Socio");
        chbRegistrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbRegistrarSocioActionPerformed(evt);
            }
        });

        chbVerDatosSocio.setText("Ver Datos Socio");
        chbVerDatosSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbVerDatosSocioActionPerformed(evt);
            }
        });

        chbPagoCuota.setText("Pagar Cuota Mensual");
        chbPagoCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPagoCuotaActionPerformed(evt);
            }
        });

        jLabel1.setText("Hola, bienvenido a Dulce Hogar! Por favor seleccione una opción:");

        jCheckBox1.setText("Monto Total Cancelado");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbPagoCuota)
                    .addComponent(chbVerDatosSocio)
                    .addComponent(chbRegistrarSocio)
                    .addComponent(jCheckBox1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(chbRegistrarSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbVerDatosSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbPagoCuota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chbVerDatosSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbVerDatosSocioActionPerformed
        new MostrarDatos().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_chbVerDatosSocioActionPerformed

    private void chbRegistrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbRegistrarSocioActionPerformed
        new RegistroSocio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_chbRegistrarSocioActionPerformed

    private void chbPagoCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPagoCuotaActionPerformed
        new PagarCuotaMensual().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_chbPagoCuotaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        new MontoTotalCancelado().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSocio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSocio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbPagoCuota;
    private javax.swing.JCheckBox chbRegistrarSocio;
    private javax.swing.JCheckBox chbVerDatosSocio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
