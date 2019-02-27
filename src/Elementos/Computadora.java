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
public class Computadora extends Jugador {
    
    public Computadora( String usuario, boolean turno) {
        super(usuario, turno);
    }
  
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
