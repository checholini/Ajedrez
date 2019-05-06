/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

/**
 *
 * @author SergioRodriguez
 */
public class CaballoPieza extends Pieza{

    public CaballoPieza(int jugador) {
        super("Caballo", 'c', jugador);
    }

    @Override
    public void hacerMovimiento(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
