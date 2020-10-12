/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagraficos;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author javie
 */
public abstract class iCasilla extends Canvas {
Ficha fica[];
    private int x = 0;
    private int y = 0;
    private final int ancho = 40;
    private final int alto = 40;

    public iCasilla(int x, int y) {
        this.x = x;
        this.y = y;

    }
    
     public iCasilla() {
       
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }




   

    @Override
    public abstract void paint(Graphics g);
public abstract void analizarJugada();



    
}
