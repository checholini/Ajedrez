/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

import ajedrez.Tablero;

/**
 * Clase para manejar el Alfil
 * @author SergioRodriguez
 */
public class AlfilPieza extends Pieza{

    public AlfilPieza(int jugador) {
        super("Alfil", "a"+jugador, jugador);
    }

    @Override
    public void darMovimientos() {
        System.out.println("Ha seleccionado un alfil");
    }

    @Override
    public Tablero hacerMovimiento(int x, int y, Tablero tablero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
