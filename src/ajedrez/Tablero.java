/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ajedrez;

import Piezas.PeonPieza;
import Piezas.Pieza;

/**
 *
 * @author SergioRodriguez
 */
public class Tablero {
    static Pieza[][] layout;
    
    public Tablero() {
        layout = new Pieza[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                switch (i) {
                    case 0:
                        
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
                        
                        break;
                    default:
                        layout[i][j] = null;
                        break;
                }
            }
        }
    }
    
    public static void imprimirTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(layout[i][j] == null){
                    System.out.print("[   ]");
                }
                else{
                    System.out.print("[ "+layout[i][j].getCaracterPieza()+" ]");
                }                
            }
            System.out.println("");
        }
    }
    
}
