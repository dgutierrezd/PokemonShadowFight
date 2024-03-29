
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Control.Mundo;
import Vistas.VistaArena;
import java.util.ArrayList;
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
    private Pokemon pokemon;
    private Pokemon enemyPokemon;
    private Vistas.VistaArena vistaArena;
    private Mundo mundo;
    
    /**
     * Generar los Pokemones para asignarlos en la vista Arena.
     */
    public void generarPokemon() throws CloneNotSupportedException {
        pokemon =  (Pokemon) generarPokemonRandom().clone();
        enemyPokemon = (Pokemon) generarPokemonRandom().clone();
    }

    public void setVistaArena(VistaArena vistaArena) {
        this.vistaArena = vistaArena;
    }
    
    /**
     * Se genera un pokemon aleatoriamente, se genera su tipo, 
     * y de acuerdo a éste se le asigna el nombre del Pokemon,
     * para luego poder generar la imagen.   
     */
    public Pokemon generarPokemonRandom(){
        int numRandom = (int)(Math.random()*7);
        Pokemon pokemon = mundo.getPokemons().get(numRandom);
        return pokemon;
    }
    /**
     * Genera la imagen del pokemon de el Usuario.
     */
    public ImageIcon pintarPokemonUsuario(){
            
        String pokemonUsuario = "src\\Imagenes\\Pokemons\\"+pokemon.getNombre()+".png";
        ImageIcon imagenPokemonUsuario = new ImageIcon(pokemonUsuario);
        return imagenPokemonUsuario;
    }
    /**
     * Genera la imagen de el pokemon de la computadora.
     */
    public ImageIcon pintarPokemonComputadora(){
            
        String pokemonPc = "src\\Imagenes\\Pokemons\\Sliuetas\\"+enemyPokemon.getNombre()+"Negro.png";
        
        ImageIcon imagenPokemonPc = new ImageIcon(pokemonPc);
        return imagenPokemonPc;
    }
    
    
    
    /**
     * Determina metodo yoSeQuienEres, si fue correcto, cambia la imagen,
     * si fue incorrecto, la deja como estaba originalmente.
     * Ademas le rebaja el 50% de vida al pokemon, dependiendo el resultado.
     */
    public void restaurarImagenPc(){
            
            switch(vistaArena.saberQuienEs()) {
                case -1:
                break;
                case 0:
                    modificarVidaJugador();
                break;
                case 1:
                    modificarResistenciaVidaEnemigo();
                    vistaArena.obtenerPokemonEnemigo();
                break;
            }
    }
    
    /**
     * En el momento que se adivina el nombre del Pokemon enemigo, se genera
     * su imagen original.
     * @return 
     */
    public String entregarImagenPokemonEnemigo(){
        String pokemonImage = enemyPokemon.getNombre();
        String pokemonPc = "src\\Imagenes\\Pokemons\\"+pokemonImage+".png";
        return pokemonPc;
    }
    /**
     * Al adivnar el nombre del Pokemon, se modifica la barra de vida.
     */
    public void modificarResistenciaVidaEnemigo() {
        enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()/2);
        vistaArena.modificarVidaEnemigo();
    }
    /**
     * Si no se logra adivinar el nombre del Pokemon, se le cambia la vida al 
     * pokemon del jugador a la mitad.
     */
    public void modificarVidaJugador(){
        pokemon.setResistenciaVida(pokemon.getResistenciaVida()/2);
        vistaArena.modificarVidaPokemon();
    }
    
    /**
     * se finaliza la partida cuando alguno de los dos jugadores obtengan su vida
     * menor o igual a cero.
     */
    public void finalizarPartida() {
        
        if(pokemon.getResistenciaVida() == 0 && enemyPokemon.getResistenciaVida() == 0) {
            JOptionPane.showMessageDialog(null, "La partida ha terminado en un empate! \n "
                                              + " Vuelve pronto...");
            vistaArena.salirPartida();
            
        } else {
            if(enemyPokemon.getResistenciaVida() <= 0) {
                JOptionPane.showMessageDialog(null, "Felicitaciones! Has ganado la partida! \n "
                                                  + "Vuelve pronto e incrementa tu fuerza ganadora!");
                vistaArena.salirPartida();
            } else {
                if(pokemon.getResistenciaVida() <= 0) {
                    JOptionPane.showMessageDialog(null, "Rayos! has perdido esta partida \n ");
                    vistaArena.salirPartida();
                }
            }
        }
    }
    
    public int generarNumeroMuerteSubita() {
        int numeroMuerteSubita = (int)(Math.random()*10 + 1);
        return numeroMuerteSubita;
    }
    
    public int determinarMuerteSubita(int numJugador) {
        int numeroMuerteSubita = generarNumeroMuerteSubita();
        System.out.println(numeroMuerteSubita);
        boolean muerteSubita = ganadorMuerteSubita();
        if(muerteSubita) {
            if(numJugador > numeroMuerteSubita) {
                return 1;
            } else {
                if(numJugador == numeroMuerteSubita) {
                    return -1;
                } else {
                    return 0;
                }
            }
        } else {
            if(!muerteSubita) {
                if(numJugador < numeroMuerteSubita) {
                    return 1;
                } else {
                    if(numJugador == numeroMuerteSubita) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            } 
        }
        return 0;
    } 
            
    public boolean escogerMuerteSubita(){
        int numeroComputadora = (int)(Math.random()*100+1);
        if(numeroComputadora <= 5){
            return true;
        }
        return false;
    }
    public boolean ganadorMuerteSubita() {
        int menorOMayor = (int)(Math.random()* 2);
        if(menorOMayor == 0) {
            System.out.println("Soy Mayor");
            return true;
        } else {
            System.out.println("SoyMenor");
            return false;
        }
    }
    
    /**
     * Se determinan las acciones realizadas por los dos Pokemones en combate, 
     * y dependiendo de estas se disminuyen sus vidas.
     * @param accionUsuario 
     */
    public void determinarCombate(int accionUsuario) {
        int accionMaquina = (int)(Math.random()*2);
       
        
        if((accionUsuario == 0) & (accionMaquina == 0)){
            System.out.println("No pasa nada, ambos se defendieron.");
            return;
        }
        
        if((accionUsuario == 1) & (accionMaquina == 1)){
            
            int accionU = pokemon.atacar(enemyPokemon);
            int enemyAccion = enemyPokemon.atacar(pokemon);
            
            if(accionU == 1){
                System.out.println("El pokemon "+pokemon.getNombre()+" ataco correctamente a "+enemyPokemon.getNombre());
                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+Pokemon.ATAQUE);
            }else{
            
                if(enemyAccion == 1){
                    System.out.println("El pokemon "+enemyPokemon.getNombre()+" ataco correctamente a "+pokemon.getNombre());
                    pokemon.setResistenciaVida(pokemon.getResistenciaVida()+Pokemon.ATAQUE);
                }else{
                    System.out.println("No paso nada, alguno de los pokemos fallo el ataque.");
                }
            }
            
        }
        
        
        if((accionUsuario == 0) & (accionMaquina == 1)){
            int accionU = pokemon.defender();
            int enemyAccion = enemyPokemon.atacar(pokemon);

            if(accionU == 0 & enemyAccion ==1){
                System.out.println(""+enemyPokemon.getNombre()+" ataco correctamente a "+pokemon.getNombre()+" que fallo la defensa.");
                pokemon.setResistenciaVida(pokemon.getResistenciaVida()+Pokemon.ATAQUE);
            }else{
                System.out.println("No paso nada, "+pokemon.getNombre()+" se defendio correctamente.");
            }
        }
        
        
        if((accionUsuario == 1) & (accionMaquina == 0)){
            
            int enemyAccion = pokemon.defender();
            int accionU = enemyPokemon.atacar(pokemon);

            if(accionU == 1 & enemyAccion == 0){
                System.out.println(""+pokemon.getNombre()+" ataco correctamente a "+enemyPokemon.getNombre()+" que fallo en la defensa.");
                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+Pokemon.ATAQUE);
            }else{
                System.out.println("No pasa nada, "+enemyPokemon.getNombre()+" se defendio correctamente. ");
            }
        }
    }
    public Pokemon getPokemon() {
        return pokemon;
    }

    public Pokemon getEnemyPokemon() {
        return enemyPokemon;
    }
    public void setMundo(Mundo mundo) {
        this.mundo = mundo;
    }
}
