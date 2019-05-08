/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

import ajedrez.Tablero;

/**
 *
 * @author SergioRodriguez
 */
public class CaballoPieza extends Pieza{

    public CaballoPieza(int jugador) {
        super("Caballo", "c"+jugador, jugador);
    }

    @Override
    public void darMovimientos() {
        System.out.println("Ha seleccinado un Caballo");
        System.out.println("Movimientos disponibles: ");
        System.out.print("1. _  2. _ _  3. _   4. _ _ \n");
        System.out.print("  |     |         |        |\n");
        System.out.print("  |               |\n");
        System.out.println("");
        System.out.print("5.|   6.|    7.   | 8.     |\n");
        System.out.print("  |      ¯ ¯      |     ¯ ¯\n");
        System.out.print("   ¯             ¯    \n");
    }

    @Override
    public Tablero hacerMovimiento(int x, int y, Tablero tablero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
