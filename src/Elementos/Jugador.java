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
public abstract class Jugador extends Pokemon {
    private String usuario;
    private boolean turno;

    public Jugador(String usuario, boolean turno, int resistenciaVida, int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio, String tipoEnemigo, int[] arrayProbabilidades) {
        super(resistenciaVida, probabilidadAtaque, nombre, tipo, numeroAleatorio, tipoEnemigo, arrayProbabilidades);
        arrayProbabilidades = new int[]{100,100,60,30};
        this.usuario = usuario;
        this.turno = turno;
    }

    /**
     * Se genera un pokemon aleatoriamente, se genera su nombre, y 
     * @return pokemonAleatorio 
     */
    public String elegirPokemon() {
        String pokemonAleatorio = "";
        int numeroAleatorio = (int)Math.random() * 4;
        int tipoAleatorio = (int)Math.random() * 2;
     
        switch (numeroAleatorio) {
            case 1:
                setTipo("Agua");
                switch(tipoAleatorio) {
                    case 1:
                        setNombre("Squirtle");
                    break;
                    case 2:
                        setNombre("Piplup");
                    break;
                }
            break;
            case 2:
                setTipo("Fuego");
                switch(tipoAleatorio) {
                    case 1:
                        setNombre("Charizard");
                    break;
                    case 2:
                        setNombre("Eevee");
                    break;
                }
            break;
            case 3:
                setTipo("Tierra");
                switch(tipoAleatorio) {
                    case 1:
                        setNombre("Diglett");
                    break;
                    case 2:
                        setNombre("Sandshrew");
                    break;
                }
            break;
            case 4:
                setTipo("Viento");
                switch(tipoAleatorio) {
                    case 1:
                        setNombre("Nidorina");
                    break;
                    case 2:
                        setNombre("Nidorino");
                    break;
                }
            break;
        }
        pokemonAleatorio = getTipo() + ", " + getNombre();
        
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
