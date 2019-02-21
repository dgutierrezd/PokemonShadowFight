/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 * Pokemon tipo tierra, pokemon para lucha.
 * 
 * @author Daniel Gutierrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190220
 * @since 1.0
 */
public class PokemonTierra extends Pokemon {

    /**
     * Efectividad de defensa a los ataques del oponente
     */
    public static final int PROBABILIDAD_DEFENSA_TIERRA = 70;

    public PokemonTierra(int resistenciaVida, int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio, String tipoEnemigo, int[] arrayProbabilidades) {
        super(resistenciaVida, probabilidadAtaque, nombre, tipo, numeroAleatorio, tipoEnemigo, arrayProbabilidades);
    }
    public PokemonTierra(int resistenciaVida, int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio, String tipoEnemigo) {
        super(resistenciaVida, probabilidadAtaque, nombre, tipo, numeroAleatorio, tipoEnemigo);
    }

    
    @Override
    public boolean atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean defender() {
        setNumeroAleatorio((int) (Math.random() * 100));
         if(getNumeroAleatorio() <= PROBABILIDAD_DEFENSA_TIERRA & getNumeroAleatorio() > 0){
             return true;
         }else{
             if(getNumeroAleatorio() > PROBABILIDAD_DEFENSA_TIERRA & getNumeroAleatorio() <= 100){
                 return false;
             }
         }
        return false;
    }  

    @Override
    public int determinarProbabilidad(Pokemon enemyPokemon) {
        setTipoEnemigo(enemyPokemon.getTipo());
        switch (getTipoEnemigo()){
            case "Agua":
                setProbabilidadAtaque(30);
            break;
            case "Fuego":
                setProbabilidadAtaque(60);
            break;
            case "Tierra":
                setProbabilidadAtaque(100);
            break;
             case "Viento":
                 setProbabilidadAtaque(100);
            break;   
        }
        return getProbabilidadAtaque();
    }
}
