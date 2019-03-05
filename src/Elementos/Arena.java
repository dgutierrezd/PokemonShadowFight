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
    public void entregarOpcionComputadora(){
        computadora.seleccionarAccion(pokemon, enemyPokemon);
    }
    /**
     * Determina metodo yoSeQuienEres, si fue correcto, cambia la imagen,
     * si fue incorrecto, la deja como estaba originalmente.
     * Ademas le rebaja el 50% de vida al pokemon, dependiendo el resultado.
     */
    public void restaurarImagenPc(){
            
            if(vistaArena.saberQuienEs() == 0){
                String pokemonImage = vistaArena.ipokemonPc.getIcon().toString();
                pokemonImage = pokemonImage.substring(31, pokemonImage.length()-9);
                String pokemonPc = "src\\Imagenes\\Pokemons\\"+pokemonImage+".png";
                ImageIcon imagenPokemonPc = new ImageIcon(pokemonPc);
                vistaArena.ipokemonPc.setIcon(imagenPokemonPc);
                vistaArena.lblNombrePokemonComputador.setText(pokemonImage);
                vistaArena.lblTipoPokemonComputador.setText(vistaArena.lblTipoPokemonComputadorEscondido.getText());
                


                int vidaPokemon = enemyPokemon.getResistenciaVida()/2;
                vistaArena.barPokemonEnemigo.setValue(vidaPokemon);
                System.out.println(vidaPokemon);
                int strEnemy = Integer.parseInt(vistaArena.barPokemonEnemigo.getString());
                strEnemy = strEnemy / 2;
                String strE = Integer.toString(strEnemy);
                vistaArena.barPokemonEnemigo.setString(strE);
                vistaArena.bConocer.setEnabled(false);
            } else {

                

                if(vistaArena.saberQuienEs() == 1) {
                    vistaArena.barPokemonJugador.setValue(pokemon.getResistenciaVida()/2);
                    int strUser = Integer.parseInt(vistaArena.barPokemonJugador.getString());
                    strUser = strUser / 2;
                    String strU = Integer.toString(strUser);
                    vistaArena.barPokemonJugador.setString(strU);
                }

            }
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public Pokemon getEnemyPokemon() {
        return enemyPokemon;
    }
    
}
