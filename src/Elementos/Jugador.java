/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 * Clase Jugador que permite conocer el nombre del jugador que va a jugar
 * y dispone el turno de juego al usuario o a la computadora.
 * 
 * @author Daniel Gutiérrez Duque
 * @author Sebastián Cordero Ramirez
 * @version 20190220
 * @since 1.0
 */
public abstract class Jugador {
    private String usuario;
    private boolean turno;

    public Jugador(String usuario, boolean turno) {
        this.usuario = usuario;
        this.turno = turno;
    }
    
    /**
     * Se genera un pokemon aleatoriamente, se genera su tipo, 
     * y de acuerdo a éste se le asigna el nombre del Pokemon,
     * para luego poder generar la imagen.
     */
    public Pokemon  elegirPokemon() {
        int numeroAleatorio = ((int) (Math.random() * 4 + 1));
        int tipoAleatorioRandom = ((int) (Math.random() * 2 + 1));
        
        if(numeroAleatorio == 1){
                PokemonAgua pokemonAgua = new PokemonAgua(10, 0, "", "Agua", 0, "", new int[]{100,100,60,30});
                switch(tipoAleatorioRandom){
                    case 1:
                        pokemonAgua.setNombre("Squirtle"); 
                    break;
                    case 2:
                        pokemonAgua.setNombre("Piplup");
                    break;
                }
                return pokemonAgua;
        }
        if(numeroAleatorio == 2){
                PokemonFuego pokemonFuego = new PokemonFuego(10, 0, "", "Fuego", 0, "", new int []{100,100,100,100});
                switch(tipoAleatorioRandom) {
                    case 1:
                        pokemonFuego.setNombre("Charizard");
                    break;
                    case 2:
                        pokemonFuego.setNombre("Eevee");
                    break;
                }
                return pokemonFuego;
        }
        if(numeroAleatorio == 3){
                PokemonTierra pokemonTierra = new PokemonTierra(10, 0, "", "Tierra", 0, "", new int []{30,60,100,100});
                switch(tipoAleatorioRandom) {
                    case 1:
                        pokemonTierra.setNombre("Diglett");
                    break;
                    case 2:
                        pokemonTierra.setNombre("Sandshrew");
                    break;
                }
                return pokemonTierra;
        }
        if(numeroAleatorio == 4){
                PokemonViento pokemonViento = new PokemonViento(10, 0, "", "Viento", 0, "", new int []{100,30,60,100});
                switch(tipoAleatorioRandom) {
                    case 1:
                        pokemonViento.setNombre("Nidorina");
                    break;
                    case 2:
                        pokemonViento.setNombre("Nidorino");
                    break;
                }
                return pokemonViento;
        }
        return null;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    
}
