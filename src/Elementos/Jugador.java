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
 * @author Sebastián Cordero Rampirez
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
