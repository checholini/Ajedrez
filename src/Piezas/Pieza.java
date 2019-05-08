/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Piezas;

import ajedrez.Tablero;

/**
 * Clase abstracta para modelar el comportamiento de las piezas
 * @author SergioRodriguez
 */
public abstract class Pieza {
    
    String nombrePieza; 
    String caracterPieza;
    int jugador;
    /**
     * Constructor para la pieza
     * @param nombrePieza
     * @param caracterPieza
     * @param jugador 
     */
    public Pieza(String nombrePieza, String caracterPieza, int jugador) {
        this.nombrePieza = nombrePieza;
        this.caracterPieza = caracterPieza;
        this.jugador = jugador;
    }
    
    /**
     * Metodo para validar si el movimiento de una pieza es valido
     * @param x coordenada actual en x
     * @param y coordenada actual en y
     * @param tablero
     * @return 
     */
    public abstract Tablero hacerMovimiento(int x, int y, Tablero tablero); 
    
    public abstract void darMovimientos();

    /*
     * Getters 
     */
    public String getNombrePieza() {
        return nombrePieza;
    }

    public String getCaracterPieza() {
        return caracterPieza;
    }

    public int getJugador() {
        return jugador;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public void setCaracterPieza(String caracterPieza) {
        this.caracterPieza = caracterPieza;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    
}
