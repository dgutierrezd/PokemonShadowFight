/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
            
            Usuario usuario = new Usuario("Sebas", true);
            Pokemon pokemon = usuario.elegirPokemon();
            System.out.println(pokemon.getNombre() + " , " +  pokemon.getTipo());

            Pokemon pokemon2 = usuario.elegirPokemon();
            System.out.println(pokemon2.getNombre() + " , " +  pokemon2.getTipo());

            System.out.println("Pokemon: "+pokemon.getNombre()+" , ataca a "+ pokemon2.getNombre());
            System.out.println("Estado Ataque: "+pokemon.atacar(pokemon2)+" con un numero random de: "+pokemon.getNumeroAleatorio());
            
            
            String pokemonUsuario = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\PokemonShadowFight\\src\\Imagenes\\Pokemons\\"+pokemon.getNombre()+".png";
            String pokemonPc = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\PokemonShadowFight\\src\\Imagenes\\Pokemons\\Sliuetas\\"+pokemon2.getNombre()+"Negro.png";
            ImageIcon imagenPokemonUsuario = new ImageIcon(pokemonUsuario);
            ImageIcon imagenPokemonPc = new ImageIcon(pokemonPc);
            
            VistaArena vistaArena = new VistaArena();
            vistaArena.setVisible(true);
            vistaArena.ipokemonUsuario.setIcon(imagenPokemonUsuario);
            vistaArena.ipokemonPc.setIcon(imagenPokemonPc);
        }
        
}
