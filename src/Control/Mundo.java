/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Elementos.Pokemon;
import Elementos.PokemonAgua;
import Elementos.PokemonFuego;
import Elementos.PokemonTierra;
import Elementos.PokemonViento;
import Vistas.VistaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Mundo {
    
    
    ArrayList <Pokemon> pokemons = new ArrayList<Pokemon>();
    public static void main(String args[]) {
        
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        
    }
    //GENERAR LOS POKEMONS Y METERLOS EN ARRAYLIST
    public void poblarMundoPokemons(){
                PokemonAgua Squirtle = new PokemonAgua(10, 0, "Squirtle", "Agua", 0, "", new int[]{100,100,60,30});
                PokemonAgua Piplup = new PokemonAgua(10, 0, "Piplup", "Agua", 0, "", new int[]{100,100,60,30});
                PokemonFuego Charizard = new PokemonFuego(10, 0, "Charizard", "Fuego", 0, "", new int []{100,100,100,100});
                PokemonFuego Eeevee = new PokemonFuego(10, 0, "Eevee", "Fuego", 0, "", new int []{100,100,100,100});
                PokemonTierra Diglett = new PokemonTierra(10, 0, "Diglett", "Tierra", 0, "", new int []{30,60,100,100});
                PokemonTierra Sandshrew = new PokemonTierra(10, 0, "Sandshrew", "Tierra", 0, "", new int []{30,60,100,100});
                PokemonViento Nidorina = new PokemonViento(10, 0, "Nidorina", "Viento", 0, "", new int []{100,30,60,100});
                PokemonViento Nidorino = new PokemonViento(10, 0, "Nidorino", "Viento", 0, "", new int []{100,30,60,100});
                
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
