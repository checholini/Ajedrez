/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

import ajedrez.Tablero;

/**
 * Clase para manejar el peon
 * @author SergioRodriguez
 */
public class PeonPieza extends Pieza{

    public PeonPieza(int jugador) {
        super("Peon", "p"+jugador, jugador);
    }

    @Override
    public Tablero hacerMovimiento(int x, int y, Tablero tablero) {
        if(super.jugador == 1){
            if( x+1 < 8 ||x+1 > 0){
                System.out.println("in "+ this);
                tablero.agregarPieza(x+1, y, this);
                tablero.eliminarPieza(x, y);
            }      
            else{
                System.out.println("El peon no se puede mover");
            }
        }
        else{
            if( x-1 < 8 || x-1 > 0){
                tablero.agregarPieza(x-1, y, this);
                tablero.eliminarPieza(x, y);
            }   
            else{
                System.out.println("El peon no se puede mover");
            }
        }
        return tablero;
    }

    @Override
    public void darMovimientos() {
        System.out.println("Ha seleccionado el peon");
        System.out.println();        
    }
    
}
