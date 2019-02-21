/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Elementos.Pokemon;
import Elementos.PokemonAgua;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Arena {
    public static void main(String args[]) {
        PokemonAgua squirtle = new PokemonAgua(21, "Squirtle", "Agua", 0);
        JOptionPane.showMessageDialog(null, squirtle.defender() + " y "+ squirtle.getNumeroAleatorio());
    }
}
