/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ajedrez;

import Piezas.AlfilPieza;
import Piezas.CaballoPieza;
import Piezas.PeonPieza;
import Piezas.Pieza;

/**
 *
 * @author SergioRodriguez
 */
public class Tablero {
    private static Pieza[][] layout;
    
    /**
     * Constructor del tablero para jugar
     */
    public Tablero() {
        layout = new Pieza[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                switch (i) {
                    case 0:
                        anadirPieza(i,j);
                        break;
                    case 1:
                        PeonPieza peonUno = new PeonPieza(1);
                        layout[i][j] = peonUno;
                        break;
                    case 6:
                        PeonPieza peonDos = new PeonPieza(2);
                        layout[i][j] = peonDos;
                        break;
                    case 7:
                        anadirPieza(i,j);
                        break;
                    default:
                        layout[i][j] = null;
                        break;
                }
            }
        }
    }
    
    /**
     * Metodo para mostrar el estado actual del tablero
     */
    public void imprimirTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(layout[i][j] == null){
                    System.out.print("[    ]");
                }
                else{
                    System.out.print("[ "+layout[i][j].getCaracterPieza()+" ]");
                }                
            }
            System.out.println("");
        }
    }

    /**
     * Metodo para determinar la pieza que se va a colocar en una posicion
     * @param i
     * @param j 
     */
    private void anadirPieza(int i, int j) {
        int jugador = 1;
        if(i == 7){
            jugador = 2;
        }
        switch (j) {
            case 0:
                
                break;
            case 1:
                AlfilPieza alfilUno = new AlfilPieza(jugador);
                layout[i][j] = alfilUno;
                break;
            case 2:
                CaballoPieza caballoUno = new CaballoPieza(jugador);
                layout[i][j] = caballoUno;
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                CaballoPieza caballoDos = new CaballoPieza(jugador);
                layout[i][j] = caballoDos;
                break;
            case 6:
                AlfilPieza alfilDos = new AlfilPieza(jugador);
                layout[i][j] = alfilDos;
                break;
            case 7:
                
                break;
        }
    }

    public Pieza obtenerPieza(int x, int y) {
        return layout[x][y];
    }
    
    public void agregarPieza(int x, int y, Pieza pieza){
        layout[x][y] = pieza;
    }
    
    public void eliminarPieza(int x, int y){
        layout[x][y] = null;
    }
    
}
