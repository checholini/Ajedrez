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
        if(super.getJugador() == 1){
            if( x+1 < 8 ||x+1 > 0){
                if(tablero.obtenerPieza(x+1, y) !=  null){
                    int opc = puedeComer(x, y, tablero);
                    switch(opc){
                        case 0:
                                System.out.println("El peon no se puede mover");
                                 
                        break;
                        case 1:
                                tablero.agregarPieza(x+1, y-1, this);
                                 tablero.eliminarPieza(x, y);
                        break;
                        case 2:
                            tablero.agregarPieza(x+1, y+1, this);
                            tablero.eliminarPieza(x, y);
                        break;
                    }
                } else{
                    int opc = puedeComer(x, y, tablero);
                    switch(opc){
                        case 0:
                                tablero.agregarPieza(x+1, y, this);
                                 tablero.eliminarPieza(x, y);                                 
                        break;
                        case 1:
                                tablero.agregarPieza(x+1, y-1, this);
                                 tablero.eliminarPieza(x, y);
                        break;
                        case 2:
                            tablero.agregarPieza(x+1, y+1, this);
                            tablero.eliminarPieza(x, y);
                        break;
                    }
                }
            }    
            else{
                System.out.println("El peon no se puede mover");
            }
        }
        else{
            if( x-1 < 8 || x-1 > 0){
                if(tablero.obtenerPieza(x-1, y) !=  null){
                    int opc = puedeComer(x, y, tablero);
                    switch(opc){
                        case 0:
                                System.out.println("El peon no se puede mover");
                                 
                        break;
                        case 1:
                                tablero.agregarPieza(x-1, y-1, this);
                                 tablero.eliminarPieza(x, y);
                        break;
                        case 2:
                            tablero.agregarPieza(x-1, y+1, this);
                            tablero.eliminarPieza(x, y);
                        break;
                    }
                } else{
                    int opc = puedeComer(x, y, tablero);
                    switch(opc){
                        case 0:
                                tablero.agregarPieza(x-1, y, this);
                                 tablero.eliminarPieza(x, y);                                 
                        break;
                        case 1:
                                tablero.agregarPieza(x-1, y-1, this);
                                 tablero.eliminarPieza(x, y);
                        break;
                        case 2:
                            tablero.agregarPieza(x-1, y+1, this);
                            tablero.eliminarPieza(x, y);
                        break;
                    }
                }   
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

    private int puedeComer(int x, int y, Tablero tablero) {
        int pos;
        if(super.getJugador() == 1)
            pos = x+1;
        else
            pos = x-1;
        if(y-1 >= 0 && y+1 < 8){
            Pieza adjIzq = tablero.obtenerPieza(pos, y-1);
            Pieza adjDer = tablero.obtenerPieza(pos, y+1);
            if(adjIzq != null && adjIzq.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la izquierda");
                return 1;
            }
            else if(adjDer != null && adjDer.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la derecha");
                return 2;
            }
        }
        else if(y-1 > 0){
            Pieza adjIzq = tablero.obtenerPieza(pos, y-1);
            if(adjIzq != null && adjIzq.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la izquierda");
                return 1;
            }
        }
        else if(y+1 < 8){
            Pieza adjDer = tablero.obtenerPieza(pos, y+1);
            if(adjDer != null && adjDer.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la derecha");
               return 2;
            }
        }
        return 0;
    }
    
    /*private Tablero comerArriba(int x, int y, Tablero tablero) {
        int pos;
        if(super.getJugador() == 1)
            pos = x+1;
        else
            pos = x-1;
        if(y-1 >= 0 && y+1 < 8){
            Pieza adjIzq = tablero.obtenerPieza(pos, y-1);
            Pieza adjDer = tablero.obtenerPieza(pos, y+1);
            if(adjIzq != null && adjIzq.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la izquierda");
                tablero.eliminarPieza(pos, y-1);
                tablero.agregarPieza(pos, y-1, this);
                tablero.eliminarPieza(pos, y);

            }
            else if(adjDer != null && adjDer.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la derecha");
                tablero.eliminarPieza(pos, y+1);
                tablero.agregarPieza(pos, y+1, this);
                tablero.eliminarPieza(pos, y);
            }
        }
        else if(y-1 > 0){
            Pieza adjIzq = tablero.obtenerPieza(pos, y-1);
            if(adjIzq != null && adjIzq.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la izquierda");
                tablero.eliminarPieza(pos, y-1);
                tablero.agregarPieza(pos, y-1, this);
                tablero.eliminarPieza(pos, y);
            }
        }
        else if(y+1 < 8){
            Pieza adjDer = tablero.obtenerPieza(pos, y+1);
            if(adjDer != null && adjDer.getJugador() != super.getJugador()){
                System.out.println("El peon puede comer una ficha hacia la derecha");
                tablero.eliminarPieza(pos, y+1);
                tablero.agregarPieza(pos, y+1, this);
                tablero.eliminarPieza(pos, y);
            }
        }
        return tablero;
    }*/
    
}
