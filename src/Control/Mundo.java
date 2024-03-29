/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Elementos.Arena;
import Elementos.Pokemon;
import Elementos.PokemonAgua;
import Elementos.PokemonFuego;
import Elementos.PokemonTierra;
import Elementos.PokemonViento;
import Vistas.VistaArena;
import java.util.ArrayList;

/**
 * Se almacenan y se crean los Pokemones. 
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20160228
 * @since 1.0
 */
public class Mundo {
    
   
    /**
     * ArrayList donde se almacenarán los Pokemones.
     */
    private ArrayList <Pokemon> pokemons = new ArrayList<>();
    
    public static void main(String args[]) throws CloneNotSupportedException {
        
        Mundo mundo = new Mundo();
        mundo.poblarMundoPokemons();
        Arena arena = new Arena();
        arena.setMundo(mundo);
        arena.generarPokemon();
        
        VistaArena vistaArena = new VistaArena();
        vistaArena.setArena(arena);
        arena.setVistaArena(vistaArena);
        vistaArena.crearImagenes();
        vistaArena.setLocationRelativeTo(null);
      
       
        
    }
          
    /**
     * Se añaden los Pokémones al ArrayList, con su respectiva cantidad e vida,
     * probabilidad de ataque inicial, su nombre, su tipo, número generado,
     * su tipo de enemigo(desconocido al incio) y un arreglo, con las 
     * probabilidades de ataque.
     */
    public void poblarMundoPokemons(){
                Pokemon Squirtle = new PokemonAgua(10, 0, "Squirtle", "Agua", 0, "", new int[]{100,100,60,30});
                Pokemon Piplup = new PokemonAgua(10, 0, "Piplup", "Agua", 0, "", new int[]{100,100,60,30});
                Pokemon Charizard = new PokemonFuego(10, 0, "Charizard", "Fuego", 0, "", new int []{100,100,100,100});
                Pokemon Eeevee = new PokemonFuego(10, 0, "Eevee", "Fuego", 0, "", new int []{100,100,100,100});
                Pokemon Diglett = new PokemonTierra(10, 0, "Diglett", "Tierra", 0, "", new int []{30,60,100,100});
                Pokemon Sandshrew = new PokemonTierra(10, 0, "Sandshrew", "Tierra", 0, "", new int []{30,60,100,100});
                Pokemon Nidorina = new PokemonViento(10, 0, "Nidorina", "Viento", 0, "", new int []{100,30,60,100});
                Pokemon Nidorino = new PokemonViento(10, 0, "Nidorino", "Viento", 0, "", new int []{100,30,60,100});
                
                pokemons.add(Squirtle);
                pokemons.add(Piplup);
                pokemons.add(Charizard);
                pokemons.add(Eeevee);
                pokemons.add(Diglett);
                pokemons.add(Sandshrew);
                pokemons.add(Nidorina);
                pokemons.add(Nidorino);
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}
