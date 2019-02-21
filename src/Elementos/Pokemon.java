/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 * Clase abstracta Pokemon la cual permite diponer los distintos métodos 
 * y variables, a la utilización de los distintos tipos de Pokemon
 * 
 * @author Daniel Gutierrez Duque
 * @author Sebastián Cordero Ramírez
 * @version 20190220
 * @since 1.0
 */
public abstract class Pokemon {
    /**
     * Cantidad de resistincia disminuida al realizar un ataque exitoso
     */
    public static final int ATAQUE = 1;
    /**
     * Cantidad de resistencia con la cual inicia el juego cada Pokemon
     */
    public static final int VIDA_TOTAL = 10;
    /**
     * 
     */
    private int resistenciaVida;
    /**
     * Cantida de probabilidad al atacar al oponente, esta varia dependiendo
     * del Pokemon atacante.
     */
    private int probabilidadAtaque;
    /**
     * Nombre del pokemon, éste es distinto al tipo de Pokemon
     */
    private String nombre;
    /**
     * Tipo del Pokemon: Agua, Fuego, Tierra o Viento
     */
    private String tipo;
    /**
     * Número aleatorio para la probabilidad de defensa
     */
    private int numeroAleatorio;

    public Pokemon(int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio) {
        this.probabilidadAtaque = probabilidadAtaque;
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroAleatorio = numeroAleatorio;
    }
    
    /**
     * Opción al obtener el turno, y eliminar resitencia al oponente
     * @return si la opción fue escogida o no
     */
    public abstract boolean atacar();
    /**
     * Opción al obtener el turno, y poder defenderse de los ataques del oponente
     * @return si la opción escogida o no
     */
    public abstract boolean defender();


    public int getProbabilidadAtaque() {
        return probabilidadAtaque;
    }

    public void setProbabilidadAtaque(int probabilidadAtaque) {
        this.probabilidadAtaque = probabilidadAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    
}
