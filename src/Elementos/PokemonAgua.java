/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 * Pokemon tipo agua, pokemon para lucha.
 * 
 * @author Daniel Gutierrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190220
 * @since 1.0
 */
public class PokemonAgua extends Pokemon {

    /**
     * Efectividad de defensa a los ataques del oponente
     */
    public static final int PROBABILIDAD_DEFENSA_AGUA = 50;

    public PokemonAgua(int resistenciaVida, int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio, String tipoEnemigo, int[] arrayProbabilidades) {
        super(resistenciaVida, probabilidadAtaque, nombre, tipo, numeroAleatorio, tipoEnemigo, arrayProbabilidades);
        arrayProbabilidades = new int[]{100,100,60,30};
    }  
    
    @Override
    public int atacar(Pokemon enemyPokemon) {
        setNumeroAleatorio((int) (Math.random() * 100));
        if(getNumeroAleatorio()>0 & getNumeroAleatorio() <=100){
            if(getNumeroAleatorio() <= determinarProbabilidad(enemyPokemon)){
                return 1;
            }
            System.out.println("Fallo ataque");
            return 0;
        }
        return 0;
    }

    @Override
    public int defender() {
         setNumeroAleatorio((int) (Math.random() * 100));
         if(getNumeroAleatorio() <= PROBABILIDAD_DEFENSA_AGUA & getNumeroAleatorio() > 0){
             return 1;
         }else{
             if(getNumeroAleatorio() > PROBABILIDAD_DEFENSA_AGUA & getNumeroAleatorio() <= 100){
                 return 0;
             }
         }
        return 0;
    }

    @Override
    public int determinarProbabilidad(Pokemon enemyPokemon) {
        setTipoEnemigo(enemyPokemon.getTipo());
        switch (getTipoEnemigo()){
            case "Agua":
                setProbabilidadAtaque(arrayProbabilidades[0]);
            break;
            case "Fuego":
                setProbabilidadAtaque(arrayProbabilidades[1]);
            break;
            case "Tierra":
                setProbabilidadAtaque(arrayProbabilidades[2]);
            break;
            case "Viento":
                setProbabilidadAtaque(arrayProbabilidades[3]);
            break;   
        }
        return getProbabilidadAtaque();
    }

}
