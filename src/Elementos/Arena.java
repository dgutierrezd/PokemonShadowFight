/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Control.Mundo;
import Elementos.Computadora;
import Elementos.Jugador;
import Elementos.Pokemon;
import Elementos.PokemonAgua;
import Elementos.PokemonFuego;
import Elementos.PokemonTierra;
import Elementos.Usuario;
import Vistas.VistaArena;
import Vistas.VistaPrincipal;
import javax.swing.ImageIcon;
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
    
    // LA ARENA DEFINE TODOS LOS METODOS SOBRE LA PELEA DE LOS POKEMONS
    public void iniciarJuego(){
        Usuario usuario = new Usuario("Daniel", false);
        Computadora computadora = new Computadora("Pc", false);
        Pokemon pokemon = usuario.elegirPokemon();
        Pokemon enemyPokemon = usuario.elegirPokemon();
    }
    public void generarPokemonRandom(Mundo mundo){
        int numRandom = (int)(Math.random()*8+1);
        mundo.getPokemons();
    }
        
}
