/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.applet.AudioClip;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class VistaPrincipal extends javax.swing.JDialog {

    

    /**
     * Conocer si la partida ha comenzado.
     */
    private boolean estadoInicialPartida = false;

    /**
     * Se conoce el estado que tiene la partida.
     * @return estado partida.
     */
    public boolean isEstadoInicialPartida() {
        return estadoInicialPartida;
    }
    
    /**
     * Estado de la vista, se modifica dependiendo de los botones.
     */
    private int estado = -1;
    /**
     * Referencia de la clase controladora de la logica de Presentacion.
     */
    private VistaArena vistaArena;
    /**
     * Opciones de botones al salir del juego.
     */
    private String[] options = new String[] {"Salir", "Cancelar"};
    /**
     * La musica que sonara durante la vista principal.
     */
    private AudioClip musica;
    
    /**
     * Creates new form VistaPrincipall
     */
    public VistaPrincipal(java.awt.Frame parent, boolean modal, VistaArena v) {
        super(parent , modal);
        initComponents();
        setLocationRelativeTo(this);
        generarMusica();
        vistaArena = v;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bComenzar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSobreNosotros = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bComenzar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/start_button_png_1310741 (1).png"))); // NOI18N
        bComenzar.setBorder(null);
        bComenzar.setBorderPainted(false);
        bComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(bComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 172, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/International_Pokémon_logo.svg (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 22, -1, -1));

        btnSobreNosotros.setText("Sobre Nosotros");
        btnSobreNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreNosotrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSobreNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 312, -1, -1));

        btnInstrucciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInstrucciones.setText("Instrucciones");
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 222, -1, -1));

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 312, -1, -1));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel1.setText("Shadow Fight");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 122, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ce9eeb5b1114993b7f9676a11d7d8d4e72e4ea9c_hq.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Se genera una música de fondo predeterminada.
     */
    public void generarMusica() {
        
        musica = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/BatallasGalacticas.wav"));
        musica.loop();
    }
    
    /**
     * Comenzar la partida (Play Now) botón.
     * @param evt 
     */
    private void bComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComenzarActionPerformed
        musica.stop();
        estado = 1;
        dispose();
//        if(estadoInicialPartida){
//            vistaArena.crearImagenes();
//        }
        estadoInicialPartida = true;
        
    }//GEN-LAST:event_bComenzarActionPerformed

    /**
     * Ir a la vista de SobreNosotros y conocer acerca de la aplicación.
     * @param evt 
     */
    private void btnSobreNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreNosotrosActionPerformed
        musica.stop();
        estado = 3;
        dispose();
    }//GEN-LAST:event_btnSobreNosotrosActionPerformed

    /**
     * Ir a la vista de instrucciones y conocer las instrucciones del juego.
     * @param evt 
     */
    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
        musica.stop();
        estado = 2;
        dispose();
    }//GEN-LAST:event_btnInstruccionesActionPerformed
    
    /**
     * Salir del juego.
     * @param evt 
     */
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        int salida = JOptionPane.showOptionDialog(null, "¿Seguro que deseas salir?", "Salir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.YES_NO_OPTION,
                null, options, options[1]);
                if(salida == 0) {
                    System.exit(0);
                }
    }//GEN-LAST:event_bSalirActionPerformed

    
     public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bComenzar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnSobreNosotros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
