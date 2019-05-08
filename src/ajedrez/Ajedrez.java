/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import Piezas.Pieza;
import java.util.Scanner;


/**
 *
 * @author SergioRodriguez
 */
public class Ajedrez {
    static Scanner sc = new Scanner(System.in);
    static Tablero tablero;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iniciarPartida();        
    }

    private static void iniciarPartida() {
        tablero = new Tablero();
        int turno = 0;
        while(true){
            tablero.imprimirTablero();
            int jugador = mostrarMenu(turno);
            selecionarOpcion(Integer.parseInt(sc.nextLine()), jugador);
            turno++;
        }
    }

    private static int mostrarMenu(int turno) {
        int jugador;
        if(turno%2 == 0){
            jugador = 1;            
        }
        else{
            jugador = 2;
        }
        System.out.println("Es el turno del jugador "+ jugador);
        System.out.println("1. Mover Pieza\n"
                + "2. Reiniciar Partida\n"
                + "3. Salir");
        return jugador;
    }
    
    private static void selecionarOpcion(int opcion, int jugador) {
        switch (opcion) {
            case 1:
                moverPieza(jugador);
                break;
            case 2:
                iniciarPartida();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida, por favor vuelva a intentar");
                selecionarOpcion(Integer.parseInt(sc.nextLine()), jugador);
        }
    }

    private static void moverPieza(int jugador) {
        System.out.println("Seleccione una posicion");
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        Pieza pieza = tablero.obtenerPieza(x,y);
        if(pieza != null){
            pieza.darMovimientos();
            tablero = pieza.hacerMovimiento(x, y, tablero);
        }
        else{
            System.out.println("No existe una pieza en esa posicion, vuelva a intentarlo");
            moverPieza(jugador);
        }
    }
    
}
