/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

/**
 * Clase para manejar el peon
 * @author SergioRodriguez
 */
public class PeonPieza extends Pieza{

    public PeonPieza(int jugador) {
        super("Peon", 'p', jugador);
    }

    @Override
    public void hacerMovimiento(int x, int y) {
        
    }
    
}
