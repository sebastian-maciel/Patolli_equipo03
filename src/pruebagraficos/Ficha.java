/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagraficos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Ficha {
     
    List <RegistroMovimiento> registros= new  ArrayList<>();
iCasilla casilla;

private int x=40;
private int y=40;

private final int ancho = 40;
private final int alto = 40;
private final int movimiento = 40;


    public Ficha(iCasilla casilla) {
       this.casilla=casilla;
    }

    Ficha() {
      
    }

    public void paint(Graphics g) {
        g.setColor(Color.PINK);
        g.fillOval(x, y, alto, ancho);
        //dibujar contorno
        g.setColor(Color.BLACK);
        g.drawOval(x, y, alto, ancho);
    }


    
    public List<RegistroMovimiento> getRegistros() {
        return registros;
    }

    public void setRegistros(List<RegistroMovimiento> registros) {
        this.registros = registros;
    }

    public iCasilla getCasilla() {
        return casilla;
    }

    public void setCasilla(iCasilla casilla) {
        this.casilla = casilla;
    }
    
    
    public void caminar()
    {
        System.out.println("caminando...");
    }
}
