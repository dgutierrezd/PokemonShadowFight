/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Elementos.Computadora;
import Elementos.Jugador;
import Elementos.Pokemon;
import Elementos.PokemonAgua;
import Elementos.PokemonFuego;
import Elementos.PokemonTierra;
import Elementos.Usuario;
import Vistas.VistaArena;
import Vistas.VistaPrincipal;
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
    
    public static void main(String args[]) {
        
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
//        //Borrar esto al finalizar programa. Pruebas de ataque y defensa a los pokemones.
//        PokemonTierra bulbasaur = new PokemonTierra(0, 0, "Bulbasaur ", "Tierra", 0, "",new int []{30,60,100,100});
//        System.out.println(bulbasaur.defender()+ " y " + bulbasaur.getNumeroAleatorio() );
//        
//        PokemonFuego charizard = new PokemonFuego(0, 0, "Charizard","Fuego", 0, "",new int []{100,100,100,100});
//        System.out.println(charizard.atacar(bulbasaur)+ " y " + charizard.getNumeroAleatorio() + " enemigo: " + charizard.getTipoEnemigo() +
//                                                    "  tipo: " + charizard.getTipoEnemigo() + "  probabilidad:  " + charizard.determinarProbabilidad(bulbasaur));
//
//        PokemonAgua squirtle = new PokemonAgua(0, 0, "Michael", "Agua", 0, "",new int[]{100,100,60,30});
//        System.out.println("Atacar: " + squirtle.atacar(bulbasaur)+ " y "+ squirtle.getNumeroAleatorio() + " enemigo: " + squirtle.getTipoEnemigo() +
//                                                    "  tipo: " + squirtle.getTipoEnemigo() + "  probabilidad:  " + squirtle.determinarProbabilidad(bulbasaur));
        
        
        
        
        }
        public void generarPokemones(){
            Computadora computadora = new Computadora("Pc", true);
            Usuario usuario = crearJugador();
            Pokemon pokemon = crearPokemonUsuario(usuario);
            System.out.println(pokemon.getNombre() + " , " +  pokemon.getTipo());

            Pokemon enemyPokemon = crearPokemonComputadora(usuario);
            System.out.println(enemyPokemon.getNombre() + " , " +  enemyPokemon.getTipo());
            
            System.out.println("Pokemon: "+pokemon.getNombre()+" , ataca a "+ enemyPokemon.getNombre());
            System.out.println("Estado Ataque: "+pokemon.atacar(enemyPokemon)+" con un numero random de: "+pokemon.getNumeroAleatorio());
            
            String pokemonUsuario = "C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PokemonShadowFight\\src\\Imagenes\\Pokemons\\"+pokemon.getNombre()+".png";
            String pokemonPc = "C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\PokemonShadowFight\\src\\Imagenes\\Pokemons\\Sliuetas\\"+enemyPokemon.getNombre()+"Negro.png";

            ImageIcon imagenPokemonUsuario = new ImageIcon(pokemonUsuario);
            ImageIcon imagenPokemonPc = new ImageIcon(pokemonPc);
                        
            VistaArena vistaArena = new VistaArena();
            vistaArena.setVisible(true);
            
            actualizarPokemonVista(vistaArena, pokemon, enemyPokemon);
            
            vistaArena.ipokemonUsuario.setIcon(imagenPokemonUsuario);
            vistaArena.ipokemonPc.setIcon(imagenPokemonPc);
            
              
        }
        public Pokemon crearPokemonUsuario(Usuario usuario){
            Pokemon pokemon = usuario.elegirPokemon();
            return pokemon;
        }
        public Pokemon crearPokemonComputadora(Usuario usuario){
            Pokemon enemyPokemon = usuario.elegirPokemon();
            return enemyPokemon;
        }
        public Usuario crearJugador(){
            Usuario usuario = new Usuario("Daniel", true);
            return usuario;
        }
        
        /**
         * Cambia el nombre y el tipo del pokemon del jugador en la VistaArena,
         * para tener la informacion completa.
         * @param vistaArena Vista en la cual se realizan los cambios.
         * @param pokemon Pokemon del jugador.
         * @param enemyPokemon Pokemon del computador.
         */
        public void actualizarPokemonVista(VistaArena vistaArena, Pokemon pokemon, Pokemon enemyPokemon){
            vistaArena.lblNombrePokemonJugador.setText(pokemon.getNombre());
            vistaArena.lblTipoPokemonJugador.setText(pokemon.getTipo());
            
            vistaArena.lblTipoPokemonComputadorEscondido.setText(enemyPokemon.getTipo());
        }
        
}
