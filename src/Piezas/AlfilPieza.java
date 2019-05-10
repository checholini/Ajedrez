/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

import ajedrez.Tablero;
import java.util.Scanner;

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
        System.out.println("Los movimientos disponibles son: ");
        System.out.println("1. Diagonal Derecha Hacia Arriba");
        System.out.println("2. Diagonal Derecha Hacia Abajo");
        System.out.println("3. Diagonal Izquierda Hacia Arriba");
        System.out.println("4. Diagonal Izquierda Hacia Abajo");
    }

    @Override
    public Tablero hacerMovimiento(int x, int y, Tablero tablero) {
        Scanner sc = new Scanner(System.in);
        Pieza pieza = tablero.obtenerPieza(x, y);
        switch (sc.nextInt()) {
            case 1:
                hacerRecorrido(x, y, tablero, 1, -1);
                break;
            case 2:
                hacerRecorrido(x, y, tablero, 1, 1);
                break;
            case 3:
                hacerRecorrido(x, y, tablero, -1, -1);
                break;
            case 4:

                hacerRecorrido(x, y, tablero, -1, 1);
                break;
        }
        return tablero;
    }
    
    //Optimizar Luego
    private Tablero hacerRecorrido(int x, int y, Tablero tablero, int dirY, int dirX) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de casillas que quiere recorrer");
        int max = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        if (dirY > 0) {
            if (dirX > 0) {
                if (validarRango(max, x, y, 2)) {
                    for (int i = 1; i < max; i ++) {
                        Pieza pieza = tablero.obtenerPieza(x + i, y + i);
                        if (pieza != null && pieza.getJugador() != this.getJugador()) {
                            tablero.agregarPieza(x + i, y + i, this);
                            tablero.eliminarPieza(x, y);
                            System.out.println("El alfil ha comido una pieza");
                            flag = false;
                            break;
                        } else if (pieza != null && pieza.getJugador() == this.getJugador()) {
                            System.out.println("El alifil no puede pasar sobre una pieza del mismo equipo");
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        tablero.agregarPieza(x + max, y + max, this);
                        tablero.eliminarPieza(x, y);
                    }
                } else {
                    System.out.println("El alfil no puede recorrer esa cantidad de espacios porque se saldria del tablero");
                    System.out.println("Intentelo de nuevo");
                    return hacerRecorrido(x, y, tablero, dirY, dirX);
                }
            } else {
                if (validarRango(max, x, y, 1)) {
                    for (int i = 1; i <  max; i++) {
                        System.out.println("pos "+(x-i) + " , "+(y+i));
                            Pieza pieza = tablero.obtenerPieza(x-i,y+i);                            
                            if (pieza != null && pieza.getJugador() != this.getJugador()) {
                                tablero.agregarPieza(x-i, y+i, this);
                                tablero.eliminarPieza(x, y);
                                System.out.println("El alfil ha comido una pieza");
                                flag = false;
                                break;
                            } else if (pieza != null && pieza.getJugador() == this.getJugador()) {
                                System.out.println(pieza.getCaracterPieza()+" en la pos "+(x-i)+" , "+(y+1));
                                System.out.println("El alifil no puede pasar sobre una pieza del mismo equipo");
                                flag = false;
                                break;
                            }
                    }
                    if (flag) {
                        tablero.eliminarPieza(x, y);
                        tablero.agregarPieza(x - max, y + max, this);
                    }
                } else {
                    System.out.println("El alfil no puede recorrer esa cantidad de espacios porque se saldria del tablero");
                    System.out.println("Intentelo de nuevo");
                    return hacerRecorrido(x, y, tablero, dirY, dirX);
                }
            }

        } else {
            if (dirX < 0) {
                if (validarRango(max, x, y, 3)) {
                    for (int i = 1; i < max; i ++) {
                        Pieza pieza = tablero.obtenerPieza(x - i, y - i);
                        if (pieza != null && pieza.getJugador() != this.getJugador()) {
                            tablero.agregarPieza(x - i, y - i, this);
                            tablero.eliminarPieza(x, y);
                            System.out.println("El alfil ha comido una pieza");
                            flag = false;
                            break;
                        } else if (pieza != null && pieza.getJugador() == this.getJugador()) {
                            System.out.println("El alifil no puede pasar sobre una pieza del mismo equipo");
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        tablero.agregarPieza(x - max, y - max, this);
                        tablero.eliminarPieza(x, y);
                    }
                } else {
                    System.out.println("El alfil no puede recorrer esa cantidad de espacios porque se saldria del tablero");
                    System.out.println("Intentelo de nuevo");
                    return hacerRecorrido(x, y, tablero, dirY, dirX);
                }
            } else {
                if (validarRango(max, x, y, 4)) {
                    for (int i = 1; i < max; i += dirX) {
                            Pieza pieza = tablero.obtenerPieza(x + i, y-i);
                            if (pieza != null && pieza.getJugador() != this.getJugador()) {
                                tablero.agregarPieza(x + i, y-i, this);
                                tablero.eliminarPieza(x, y);
                                System.out.println("El alfil ha comido una pieza");
                                flag = false;
                                break;
                            } else if (pieza != null && pieza.getJugador() == this.getJugador()) {
                                System.out.println("El alifil no puede pasar sobre una pieza del mismo equipo");
                                flag = false;
                                break;
                            }
                        
                    }
                    if (flag) {
                        tablero.agregarPieza(x + max, y - max, this);
                        tablero.eliminarPieza(x, y);
                    }
                } else {
                    System.out.println("El alfil no puede recorrer esa cantidad de espacios porque se saldria del tablero");
                    System.out.println("Intentelo de nuevo");
                    return hacerRecorrido(x, y, tablero, dirY, dirX);
                }
            }

        }
        return tablero;
    }

    private boolean validarRango(int max, int x, int y, int caso) {
        boolean resultado = true;
        switch (caso) {
            case 1:
                System.out.println((x + max) + "< 8 && "+(y + max)+" < 8");
                resultado = (max - x  < 8 && y + max < 8);
                break;
            case 2:
                System.out.println((x - max) + "> 0 && "+(y + max)+" < 8");
                resultado = (x - max < 8 && y + max < 8);
                break;
            case 3:
                System.out.println((x - max) + " > 0 && "+(y - max)+" > 0");
                resultado = (x - max >= 0 && y - max  >= 0);
                break;
            case 4:
                System.out.println((x + max) + "< 8 && "+(y - max)+" > 0");
                resultado = (x + max < 8 &&  y - max >= 0);
                break; 
        }
        return resultado;
    }

}
