/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;

/**
 * Vista Principal donde se ingresa el nombre de usuario o nickname
 * 
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190221
 * @since 1.0
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    VistaPrincipal principal;
    public VistaPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        bComenzar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel1.setText("Shadow Fight");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ingresa tu nombre para comenzar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });
        getContentPane().add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 141, -1));

        bComenzar.setText("Comenzar");
        bComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(bComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/International_Pokémon_logo.svg (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ce9eeb5b1114993b7f9676a11d7d8d4e72e4ea9c_hq.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Salir del juego
     * @param evt 
     */
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    /**
     * Dirigirse a la vista de instrucciones
     * @param evt 
     */
    private void bComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComenzarActionPerformed
        VistaInstrucciones instrucciones = new VistaInstrucciones(this, true);
        instrucciones.setVisible(true);
        dispose();
    }//GEN-LAST:event_bComenzarActionPerformed

    /**
     * Campo donde se ingresa el nombre del usuario o nickname
     * @param evt 
     */
    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        if(tNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre antes de continuar.");
        }
    }//GEN-LAST:event_tNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bComenzar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}
