/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Elementos.Pokemon;
import Elementos.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Vista donde se realiza las acciones de ataque y defensa, 
 * donde sucede la lucha entre los Pokemones.
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramírez
 * @version  20192102
 * @since 2.0 
 */
public class VistaArena extends javax.swing.JFrame {

    Usuario usuario;
    Pokemon pokemon;
    Pokemon enemyPokemon;
    VistaInstrucciones instrucciones;
    /**
     * Creates new form VistaArenaa
     */
    public VistaArena() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bVolver = new javax.swing.JButton();
        bConocer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ipokemonUsuario = new javax.swing.JLabel();
        ipokemonPc = new javax.swing.JLabel();
        barPokemonEnemigo = new javax.swing.JProgressBar();
        barPokemonJugador = new javax.swing.JProgressBar();
        lblTipoPokemonJugador = new javax.swing.JLabel();
        lblNombrePokemonJugador = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();
        btnDefender = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        bConocer.setText("Yo sé quién eres!");
        bConocer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConocerActionPerformed(evt);
            }
        });
        getContentPane().add(bConocer, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/International_Pokémon_logo.svg (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 2, 18)); // NOI18N
        jLabel2.setText("Shadow Fight");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));
        getContentPane().add(ipokemonUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 220, 220));
        getContentPane().add(ipokemonPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, 220));

        barPokemonEnemigo.setForeground(new java.awt.Color(255, 51, 51));
        barPokemonEnemigo.setMaximum(10);
        barPokemonEnemigo.setValue(10);
        barPokemonEnemigo.setString("10/10");
        barPokemonEnemigo.setStringPainted(true);
        getContentPane().add(barPokemonEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 220, 30));

        barPokemonJugador.setForeground(new java.awt.Color(51, 102, 255));
        barPokemonJugador.setMaximum(10);
        barPokemonJugador.setToolTipText("");
        barPokemonJugador.setValue(10);
        barPokemonJugador.setString("10/10");
        barPokemonJugador.setStringPainted(true);
        getContentPane().add(barPokemonJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, 30));

        lblTipoPokemonJugador.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblTipoPokemonJugador.setText("Tipo:");
        getContentPane().add(lblTipoPokemonJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        lblNombrePokemonJugador.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblNombrePokemonJugador.setText("Nombre");
        getContentPane().add(lblNombrePokemonJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 90, -1));

        btnDefender.setText("Defender");
        btnDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnDefender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 90, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArenaDeCombate.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Volver a la vista anterior (Instrucciones).
     * @param evt 
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        dispose();
        instrucciones = new VistaInstrucciones();
        instrucciones.setVisible(true);
    }//GEN-LAST:event_bVolverActionPerformed

    /**
     * Si se conoce quien es el Pokemon oponente, y se revela su identidad.
     * @param evt 
     */
    private void bConocerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConocerActionPerformed
        
        String pokemon = ipokemonPc.getIcon().toString();
        pokemon = pokemon.substring(91, pokemon.length()-9);
        System.out.println(pokemon);
        String pokemonOponente = JOptionPane.showInputDialog(null, "Cómo se llama este Pokémon?");
        System.out.println(pokemonOponente);
        if(pokemonOponente.equals(pokemon)) {
            JOptionPane.showMessageDialog(null, "¡Acertaste! Ese es pokemon contricante, lo conocerás a continuación.");
        } else {
            if(pokemonOponente != pokemon)
            JOptionPane.showMessageDialog(null, "Has fallado! Ese no es tu Pokemon contrincante :-(");
        }
    }//GEN-LAST:event_bConocerActionPerformed

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
       usuario.elegirAtacar(pokemon, enemyPokemon);
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenderActionPerformed
        usuario.elegirDefender(pokemon);
    }//GEN-LAST:event_btnDefenderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConocer;
    private javax.swing.JButton bVolver;
    public javax.swing.JProgressBar barPokemonEnemigo;
    public javax.swing.JProgressBar barPokemonJugador;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnDefender;
    private javax.swing.JLabel fondo;
    public javax.swing.JLabel ipokemonPc;
    public javax.swing.JLabel ipokemonUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel lblNombrePokemonJugador;
    public javax.swing.JLabel lblTipoPokemonJugador;
    // End of variables declaration//GEN-END:variables
}
