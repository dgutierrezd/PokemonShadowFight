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
     
    /**
     * Se asignan las acciones a la partida, dependiendo el botón seleccionado. 
     * @param vistaArena
     * @return accion
     */
    public int accionarBotones(VistaArena vistaArena) {
       
        int status = vistaArena.getEstadoVistaArena();
        if(status == 1) {
            System.out.println("Ataco");
            return pokemon.atacar(enemyPokemon);    
        }
        if(status == 2) {
            System.out.println("Defendio");
            return pokemon.defender();
        }
        if(status == 3) {
            int nombreEnemigo = Integer.parseInt(enemyPokemon.getNombre());
            System.out.println(nombreEnemigo);
            return nombreEnemigo;
        }
        return -1;
    }
    public void determinarLucha(){
        if((accionarBotones(vistaArena)== 1) & (computadora.seleccionarAccion(enemyPokemon, pokemon) == 0 )){
            
            if((pokemon.atacar(enemyPokemon)== 1) & (enemyPokemon.atacar(pokemon) == 1)){
                System.out.println("Los dos pokemons se atacaron.");
                pokemon.setResistenciaVida(pokemon.getResistenciaVida()+pokemon.ATAQUE);
                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+ pokemon.ATAQUE);
            }
            if((pokemon.atacar(enemyPokemon)== 0) & (enemyPokemon.atacar(pokemon) == 1)){
                System.out.println("Solo "+pokemon.getNombre()+" se le baja la vida.");
                pokemon.setResistenciaVida(pokemon.getResistenciaVida()+pokemon.ATAQUE);
            }
            if((pokemon.atacar(enemyPokemon)== 1) & (enemyPokemon.atacar(pokemon) == 0)){
                System.out.println("Solo "+enemyPokemon.getNombre()+" se le baja la vida.");
                enemyPokemon.setResistenciaVida(enemyPokemon.getResistenciaVida()+pokemon.ATAQUE);
            }
            if((pokemon.atacar(enemyPokemon)== 0) & (enemyPokemon.atacar(pokemon) == 0)){
                System.out.println("Los dos fallaron el ataque.");
            }
            
        }else{
            if((accionarBotones(vistaArena)== 2) & (computadora.seleccionarAccion(enemyPokemon, pokemon) == 0 )){
                
            }
        }
    }
    /**
     * Determina metodo yoSeQuienEres, si fue correcto, cambia la imagen,
     * si fue incorrecto, la deja como estaba originalmente.
     * Ademas le rebaja el 50% de vida al pokemon, dependiendo el resultado.
     */
    public void restaurarImagenPc(){
            
            if(vistaArena.saberQuienEs() == 1){
                obtenerPokemonEnemigo();
                modificarVidaEnemigo();
            } else {
                modificarVidaJugador();
            }
    }
    
    /**
     * Al adivnar el nombre del Pokemon, se modifica la barra de vida.
     */
    public void modificarVidaEnemigo() {
        vistaArena.barPokemonEnemigo.setValue(vistaArena.barPokemonEnemigo.getValue()/2);
        int strEnemy = Integer.parseInt(vistaArena.barPokemonEnemigo.getString());
        strEnemy = strEnemy / 2;
        String strE = Integer.toString(strEnemy);
        vistaArena.barPokemonEnemigo.setString(strE);
        vistaArena.bConocer.setEnabled(false);
    }
    
    /**
     * Si no se logra adivinar el nombre del Pokemon, la barra de vida del Jugador
     * se modificará.
     */
    public void modificarVidaJugador() {
        vistaArena.barPokemonJugador.setValue(vistaArena.barPokemonJugador.getValue()/2);
        int strUser = Integer.parseInt(vistaArena.barPokemonJugador.getString());
        strUser = strUser / 2;
        String strU = Integer.toString(strUser);
        vistaArena.barPokemonJugador.setString(strU);
    }
    
    /**
     * Obtener el nombre del Pokemon enemigo para poder adivnarlo.
     */
    public void obtenerPokemonEnemigo() {
        String pokemonImage = vistaArena.ipokemonPc.getIcon().toString();
        pokemonImage = pokemonImage.substring(31, pokemonImage.length()-9);
        String pokemonPc = "src\\Imagenes\\Pokemons\\"+pokemonImage+".png";
        ImageIcon imagenPokemonPc = new ImageIcon(pokemonPc);
        vistaArena.ipokemonPc.setIcon(imagenPokemonPc);
        vistaArena.lblNombrePokemonComputador.setText(pokemonImage);
        vistaArena.lblTipoPokemonComputador.setText(vistaArena.lblTipoPokemonComputadorEscondido.getText());
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public Pokemon getEnemyPokemon() {
        return enemyPokemon;
    }
    
}
