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
     * Cantidad de resistincia disminuida al realizar un ataque exitoso.
     */
    public static final int ATAQUE = 1;
    /**
     * Cantidad de resistencia con la cual inicia el juego cada Pokemon.
     */
    public static final int VIDA_TOTAL = 10;
    /**
     * 
     */
    private int resistenciaVida;

    public int getResistenciaVida() {
        return resistenciaVida;
    }

    public void setResistenciaVida(int resistenciaVida) {
        this.resistenciaVida = resistenciaVida;
    }
    /**
     * Cantida de probabilidad al atacar al oponente, esta varia dependiendo.
     * del Pokemon atacante.
     */
    private int probabilidadAtaque;
    /**
     * Nombre del pokemon, éste es distinto al tipo de Pokemon.
     */
    private String nombre;
    /**
     * Tipo del Pokemon: Agua, Fuego, Tierra o Viento.
     */
    private String tipo;
    /**
     * Número aleatorio para la probabilidad de defensa.
     */
    private int numeroAleatorio;
    /**
     * Guarda el tipo del pokemon enemigo, para utilizarlo al calcular la probabilidad.
     */
    private String tipoEnemigo;
    /**
     * Guarda las probabilidades de ataque que un Pokemon tiene sobre el pokemon enemigo.
     */
    int[] arrayProbabilidades = new int [3];

    public Pokemon(int resistenciaVida, int probabilidadAtaque, String nombre, String tipo, int numeroAleatorio, String tipoEnemigo, int[] arrayProbabilidades) {
        this.resistenciaVida = resistenciaVida;
        this.probabilidadAtaque = probabilidadAtaque;
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroAleatorio = numeroAleatorio;
        this.tipoEnemigo = tipoEnemigo;
        this.arrayProbabilidades = arrayProbabilidades;
    }
    
    /**
     * Opción al obtener el turno, y eliminar resitencia al oponente.
     * @param enemyPokemon usado para saber contra que Pokemon sera enfrentado.
     * @return si la opción fue escogida o no.
     */
    public abstract boolean atacar(Pokemon enemyPokemon);
    /**
     * Opción al obtener el turno, y poder defenderse de los ataques del oponente.
     * @return si la opción escogida o no
     */
    public abstract boolean defender();
    /**
     * Calcula la probabilidad que tiene el pokemon elegido frente al pokemon a combatir.
     * @param enemyPokemon usado para determinar el tipo de Pokemon.
     * @return int con el porcentaje de probabilidad de ataque.
     */
    public abstract int determinarProbabilidad(Pokemon enemyPokemon);

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

    public String getTipoEnemigo() {
        return tipoEnemigo;
    }

    public void setTipoEnemigo(String tipoEnemigo) {
        this.tipoEnemigo = tipoEnemigo;
    }

    public int[] getArrayProbabilidades() {
        return arrayProbabilidades;
    }
}
