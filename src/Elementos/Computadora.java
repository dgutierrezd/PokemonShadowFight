/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 * Clase Computador para poder permitirle al pokemon manejado por el servidor, 
 * poder realizar sus acciones específicas.
 * 
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramirez
 * @version 20190220
 * @since 1.0
 */
public class Computadora extends Jugador {
    
    public Computadora( String usuario, boolean turno) {
        super(usuario, turno);
    }
  
    /**
     * Se determina la acción ejercida por el Pokémon controlado por el 
     * computador, ya sea atacar o defenderse.
     * @param pokemon
     * @param enemyPokemon
     * @return accion
     */
    public int seleccionarAccion(Pokemon pokemon ,  Pokemon enemyPokemon){
        int numRandom = (int)(Math.random()*1);
        if(numRandom == 0){
            return pokemon.atacar(enemyPokemon);    
        }
        else{
            if(numRandom == 1){
            return  pokemon.defender();
            }
        }
        return -1;
    }
    
    
}
