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
public class PokemonAgua extends Pokemon {

    public static final int PROBABILIDAD_DEFENSA_AGUA = 50;

    public PokemonAgua(int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio) {
        super(probabilidadAtaque, nombre, tipo, numeroAleatorio);
    }
    
    
    @Override
    public boolean atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean defender() {
         setNumeroAleatorio((int) (Math.random() * 100));
         if(getNumeroAleatorio() <= PROBABILIDAD_DEFENSA_AGUA & getNumeroAleatorio() > 0){
             return true;
         }else{
             if(getNumeroAleatorio() > PROBABILIDAD_DEFENSA_AGUA & getNumeroAleatorio() <= 100){
                 return false;
             }
         }
        return false;
    }
    
}
