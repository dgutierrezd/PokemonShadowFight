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
        super(nombre, turno);
    }
    
    

    public void elegirAtacar(Pokemon pokemon, Pokemon enemyPokemon) {
        pokemon.atacar(enemyPokemon);
    }

    public boolean elegirDefender(Pokemon pokemon){
        return pokemon.defender();      
    }
    
}
