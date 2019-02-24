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
    
    public Usuario(String usuario, boolean turno) {
        super(usuario, turno);
        
    }

    public boolean elegirAtacar(Pokemon pokemon, Pokemon enemyPokemon) {
        return pokemon.atacar(enemyPokemon);
    }

    public boolean elegirDefender(Pokemon pokemon){
        return pokemon.defender();      
    }
    
}
