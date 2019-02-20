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
    private int resistenciaVida;
    private int probabilidadAtaque;
    private int prbabilidadDefensa;
    private String nombre;
    private String tipo;

    public Pokemon(int resistenciaVida, int probabilidadAtaque, int prbabilidadDefensa) {
        this.resistenciaVida = resistenciaVida;
        this.probabilidadAtaque = probabilidadAtaque;
        this.prbabilidadDefensa = prbabilidadDefensa;
    }
    public abstract void atacar();
    
    public abstract void defender();

    public static int getATAQUE() {
        return ATAQUE;
    }

    public int getResistenciaVida() {
        return resistenciaVida;
    }

    public int getProbabilidadAtaque() {
        return probabilidadAtaque;
    }

    public int getPrbabilidadDefensa() {
        return prbabilidadDefensa;
    }

    public void setProbabilidadAtaque(int probabilidadAtaque) {
        this.probabilidadAtaque = probabilidadAtaque;
    }

    public void setPrbabilidadDefensa(int prbabilidadDefensa) {
        this.prbabilidadDefensa = prbabilidadDefensa;
    }

    public void setResistenciaVida(int resistenciaVida) {
        this.resistenciaVida = resistenciaVida;
    }
}
