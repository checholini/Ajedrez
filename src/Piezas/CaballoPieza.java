/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

import ajedrez.Tablero;
import java.util.Scanner;

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
        System.out.print("  |     º         |        º\n");
        System.out.print("  º               º\n");
        System.out.println("");
        System.out.print("5.º   6.º    7.   º 8.     º\n");
        System.out.print("  |     |         |        |\n");
        System.out.print("  |      ¯ ¯      |     ¯ ¯\n");
        System.out.print("   ¯             ¯    \n");
    }

    @Override
    public Tablero hacerMovimiento(int x, int y, Tablero tablero) {
        System.out.println("Moviendo desde "+x +" , "+ y);
        Scanner sc = new Scanner(System.in);
        try{
            Pieza pieza = tablero.obtenerPieza(x, y);
            switch(sc.nextInt()){
                case 1:
                    System.out.println("hasta "+(x-2) +" , "+ (y+1));
                    if(puedeComer(x-2, y+1, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x-2, y+1, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x-2,y+1,tablero,pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x-2, y+1, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                case 2:
                    System.out.println("hasta "+(x-1) +" , "+ (y+2));
                    if(puedeComer(x-1, y+2, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x-1, y+2, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x-1, y+2, tablero, pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x-1, y+2, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                case 3:
                    if(puedeComer(x-2, y-1, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x-2, y-1, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x-2, y-1, tablero, pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x-2, y-1, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                case 4:
                    System.out.println("hasta "+(x-1) +" , "+ (y-2));
                    if(puedeComer(x-1, y-2, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x-1, y-2, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x-1, y-2, tablero, pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x-1, y-2, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                case 5:
                    System.out.println("hasta "+(x+2) +" , "+ y+1);
                    if(puedeComer(x+2, y+1, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x+2, y+1, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x+2, y+1, tablero, pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x+2, y+1, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                case 6:
                    System.out.println("hasta "+(x+1) +" , "+ y+2);
                    if(puedeComer(x+1, y+2, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x+1, y+2, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x+1, y+2, tablero, pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x+1, y+2, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                case 7:
                    System.out.println("hasta "+(x+2) +" , "+ (y-1));
                    if(puedeComer(x+2, y-1, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x+2, y-1, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x+2, y-1, tablero, pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x+2, y-1, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                case 8:
                    System.out.println("hasta "+(x+1) +" , "+ (y-2));
                    if(puedeComer(x+1, y-2, tablero, pieza.getJugador())){
                        tablero.agregarPieza(x+1, y-2, pieza);
                        tablero.eliminarPieza(x, y);
                    }else if(puedeAvanzar(x+1, y-2, tablero, pieza.getJugador())) {
                        System.out.println("No se puede colocar sobre una pieza del mismo equipo");
                    } else{
                        tablero.agregarPieza(x+1, y-2, pieza);
                        tablero.eliminarPieza(x, y);
                    }
                    break;
                default:
            }   
        } 
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getCause());
            System.out.println("La pieza no se puede mover a esa poscion");
        }
        return tablero;
    }

    private boolean puedeComer(int x, int y, Tablero tablero, int jugador) {
        Pieza pieza = tablero.obtenerPieza(x, y);
        return pieza != null && pieza.getJugador() != jugador;
    }

    private boolean puedeAvanzar(int x, int y, Tablero tablero, int jugador) {
        Pieza pieza = tablero.obtenerPieza(x, y);
        return pieza != null && pieza.getJugador() == jugador;
    }

}
