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
  // POR FAVOR AYUDEME, Hacer que haga lo mismo que los metodos de la clase Usuario(Mirelo por fa).
    public  boolean   decidirAtaque(Pokemon pokemon){
        int numeroAleatorio = ((int) (Math.random() * 2 + 1));
        if(numeroAleatorio == 1){
                return pokemon.atacar(pokemon);
        }else{
            if(numeroAleatorio == 2){
                    return pokemon.defender();
            }
        return false;
        }
    }
    
    
    
}
