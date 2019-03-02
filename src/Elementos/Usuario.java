/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author USUARIO
 */
public class Usuario extends Jugador {

    public Usuario(String nombre, boolean turno) {
        super(nombre, false);
    }
    
    /**
     * Se determina que si el usuario escoge la opción de atacar, ésta opción se
     * habilite automaticamente y ataque al enemigo ó pokemon manejado por el servidor.
     * 
     * @param pokemon
     * @param enemyPokemon 
     */
    public void elegirAtacar(Pokemon pokemon, Pokemon enemyPokemon) {
        pokemon.atacar(enemyPokemon);
    }
    
    /**
     * Se determina que si el usuario escoge la opción de defender, ésta opción se
     * habilite automaticamente éste Pokemon se defienda de algún ataque del 
     * Pokémon enemigo.
     * 
     * @param pokemon 
     */
    public void elegirDefender(Pokemon pokemon){
        pokemon.defender();      
    }
    
}
