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
 * Encuentro de los dos Pokemones a luchar, donde se llevan a atacar o defender.
 *
 * @author Daniel Gutérrez  Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190220
 * @since 1.0
 * 
 */
public class Arena {
    public static void main(String args[]) {
        PokemonAgua squirtle = new PokemonAgua(0, 0, "Michael", "Fuego", 0, "");
        JOptionPane.showMessageDialog(null, squirtle.defender() + " y "+ squirtle.getNumeroAleatorio());
    }
}
