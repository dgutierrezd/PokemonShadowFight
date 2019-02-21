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
public class PokemonAgua extends Pokemon {
    
    public PokemonAgua(int resistenciaVida, int probabilidadAtaque, int prbabilidadDefensa) {
        super(100, probabilidadAtaque, prbabilidadDefensa);
        
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
