/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

/**
 *
 * @author USUARIO
 */
public abstract class Pokemon {
    public static final int ATAQUE = 1;
    public static final int VIDA_TOTAL = 10;
    private int resistenciaVida;
    private int probabilidadAtaque;
    private String nombre;
    private String tipo;
    private int numeroAleatorio;

    public Pokemon(int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio) {
        this.probabilidadAtaque = probabilidadAtaque;
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroAleatorio = numeroAleatorio;
    }
    
    public abstract boolean atacar();
    
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
