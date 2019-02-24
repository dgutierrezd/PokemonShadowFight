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
     * para luego poder generar la imagen
     * @return pokemonAleatorio 
     */
    public String elegirPokemon() {
        String pokemonAleatorio = "";
        int numeroAleatorio = (int)Math.random() * 4;
        int tipoAleatorio = (int)Math.random() * 2;
        String tipo = "";
        String nombre = "";
        
        switch (numeroAleatorio) {
            case 1:
                tipo = "Agua";
                switch(tipoAleatorio) {
                    case 1:
                        nombre = "Squirtle";
                    break;
                    case 2:
                        nombre = "Piplup";
                    break;
                }
            break;
            case 2:
                tipo = "Fuego";
                switch(tipoAleatorio) {
                    case 1:
                        nombre = "Charizard";
                    break;
                    case 2:
                        nombre = "Eevee";
                    break;
                }
            break;
            case 3:
                tipo = "Tierra";
                switch(tipoAleatorio) {
                    case 1:
                        nombre = "Diglett";
                    break;
                    case 2:
                        nombre = "Sandshrew";
                    break;
                }
            break;
            case 4:
                tipo = "Viento";
                switch(tipoAleatorio) {
                    case 1:
                        nombre = "Nidorina";
                    break;
                    case 2:
                        nombre = "Nidorino";
                    break;
                }
            break;
        }
        pokemonAleatorio = tipo + ", " + nombre;
        
        return pokemonAleatorio;
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
