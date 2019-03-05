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
    private Computadora computadora;
    private Vistas.VistaArena vistaArena;
    private Mundo mundo;
    
    /**
     * Generar los Pokemones para asignarlos en la vista Arena.
     */
    public void generarPokemon(){
        pokemon = generarPokemonRandom();
        enemyPokemon = generarPokemonRandom();
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
    public void setMundo(Mundo mundo) {
        this.mundo = mundo;
    }
    
    /**
     * Método cuando el Jugador ataca y el computador se defiende.
     * @param pokemon
     * @param enemyPokemon
     * @return 
     */
//    public boolean AtacarDefender(Pokemon pokemon, Pokemon enemyPokemon) {
//        
//    }
     
    
//    public void determinarLucha(){
//        if((accionarBotones(vistaArena)== 1) & (computadora.seleccionarAccion(enemyPokemon, pokemon) == 0 )){//Atacar - Atacar
//            
//            if((pokemon.atacar(enemyPokemon)== 1) & (enemyPokemon.atacar(pokemon) == 1)){
//                System.out.println("Los dos pokemons se atacaron.");
//                pokemon.setResistenciaVida(pokemon.getResistenciaVida()+pokemon.ATAQUE);
//                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+ pokemon.ATAQUE);
//            }
//            if((pokemon.atacar(enemyPokemon)== 0) & (enemyPokemon.atacar(pokemon) == 1)){
//                System.out.println("Solo "+pokemon.getNombre()+" se le baja la vida.");
//                pokemon.setResistenciaVida(pokemon.getResistenciaVida()+pokemon.ATAQUE);
//            }
//            if((pokemon.atacar(enemyPokemon)== 1) & (enemyPokemon.atacar(pokemon) == 0)){
//                System.out.println("Solo "+enemyPokemon.getNombre()+" se le baja la vida.");
//                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+pokemon.ATAQUE);
//            }
//            if((pokemon.atacar(enemyPokemon)== 0) & (enemyPokemon.atacar(pokemon) == 0)){
//                System.out.println("Los dos fallaron el ataque.");
//            }
//            
//        }else{
//            if((accionarBotones(vistaArena)== 2) & (computadora.seleccionarAccion(enemyPokemon, pokemon) == 1 )){//Defender - defender
//                if((pokemon.defender() == 3) & (enemyPokemon.defender() == 3)){
//                    System.out.println("No pasa nada, los dos se defendieron.");
//                }
//                if((pokemon.defender() == 4) & (enemyPokemon.defender() == 4)){
//                    System.out.println("No pasa nada, los dos se defendieron.");
//                }
//            }else{
//                if((accionarBotones(vistaArena)== 2) & (computadora.seleccionarAccion(enemyPokemon, pokemon) == 0 )){ // Defender - atacar
//                    if((pokemon.defender() == 3) & (enemyPokemon.atacar(pokemon) == 1)){
//                        System.out.println("No pasa nada, "+pokemon.getNombre()+" se defendio exitosamente, pokemon "+enemyPokemon.getNombre()+
//                                                            ", ataco exitosamente.");
//                    }
//                    if((pokemon.defender() == 4) & (enemyPokemon.atacar(pokemon) == 1)){
//                        System.out.println(""+enemyPokemon.getNombre()+" ataco exitosamente a "+pokemon.getNombre()+" que no se defendio exitosamente.");
//                        pokemon.setResistenciaVida(pokemon.getResistenciaVida()+pokemon.ATAQUE);
//                    }
//                }
//            }
//        }
//    }
    public int entregarOpcionComputadora(){
        int random = computadora.seleccionarAccion();
        return random;
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
     * Si no se logra adivinar el nombre del Pokemon, la barra de vida del Jugador
     * se modificará.
     */
    public void modificarVidaJugador() {
        pokemon.setResistenciaVida(pokemon.getResistenciaVida()/2);
        vistaArena.barPokemonJugador.setValue(pokemon.getResistenciaVida());
        vistaArena.barPokemonJugador.setString(Integer.toString(pokemon.getResistenciaVida()));
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
    
    public Pokemon getPokemon() {
        return pokemon;
    }

    public Pokemon getEnemyPokemon() {
        return enemyPokemon;
    }

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
                System.out.println("El pokemon"+pokemon.getNombre()+" ataco correctamente a "+enemyPokemon.getNombre());
                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+Pokemon.ATAQUE);
            }
            
            if(enemyAccion == 1){
                System.out.println("El pokemon"+enemyPokemon.getNombre()+" ataco correctamente a "+pokemon.getNombre());
                pokemon.setResistenciaVida(pokemon.getResistenciaVida()+Pokemon.ATAQUE);
            }
            System.out.println("VIDA POKEMON: "+pokemon.getResistenciaVida());
            System.out.println("VIDA Enemy Pokemon: "+enemyPokemon.getResistenciaVida());
        }
        
        
        if((accionUsuario == 0) & (accionMaquina == 1)){
            int accionU = pokemon.defender();
            int enemyAccion = enemyPokemon.atacar(pokemon);

            if(accionU == 0 & enemyAccion ==1){
                pokemon.setResistenciaVida(pokemon.getResistenciaVida()+Pokemon.ATAQUE);
            }
        }
        
        
        if((accionUsuario == 1) & (accionMaquina == 0)){
            
            int enemyAccion = pokemon.defender();
            int accionU = enemyPokemon.atacar(pokemon);

            if(accionU == 1 & enemyAccion ==0){
                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+Pokemon.ATAQUE);
            }
        }
    }
    
}
