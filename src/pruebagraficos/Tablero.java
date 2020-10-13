/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagraficos;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author javie
 */
public class Tablero extends Canvas {

    iCasilla[] casillas = new iCasilla[68];
    Caña cañas[];

    public void setCasillas(iCasilla[] casillas) {
        this.casillas = casillas;
    }

    public void lanzar() {
        System.out.println("lanzar cania");
    }

    @Override
    public void paint(Graphics g) {
        
        int j = 0;
        int k = 0;
        int l = 0;
        int p = 0;
        int m = 0;
        int n = 0;
        int y = 0;
//se dibuja  

        for (int i = 0; i < casillas.length; i++) {
            
            if (i != 9 && i < 9) { //de arriba al centro
              if(casillas[i]==null){
                  
                    casillas[i] = new Casilla(600, 40 + 30 * i);
                casillas[i].paint(g);
              }else{
                   casillas[i].paint(g);
              }
              

            } else if (i > 8 && i < 17)//del centro a la izquierda
            {

                j++;
              if(casillas[i]==null){
                if (i == 9) {
                   
                    casillas[i] = new CasillaCentral(600 - 30 * j, 280);

                    casillas[i].paint(g);
                    
                    
                   
                } else {
                    casillas[i] = new Casilla(600 - 30 * j, 280);
                    casillas[i].paint(g);
                }
            }else{
                 
                 casillas[i].paint(g); 
              }
            } else if (i > 16 && i < 26)//de la izquierda al centro
            {

              
                k++;
                if(casillas[i]==null){
                casillas[i] = new Casilla(330 + 30 * k, 310);
                casillas[i].paint(g);
                }else{
                     casillas[i].paint(g);
                }
            } else if (i > 25 && i < 34)//del centro hacia bajo
            {
                l++;
                if(casillas[i]==null){
                if (i == 26) {
                    casillas[i] = new CasillaCentral(600, 340);
                    casillas[i].paint(g);
                } else {
                    casillas[i] = new Casilla(600, 310 + 30 * l);
                    casillas[i].paint(g);
                }
                }else{
                     casillas[i].paint(g);
                }

            } else if (i > 33 && i < 43)//de abajo al centro       
            {
                p++;
                if(casillas[i]==null){
                casillas[i] = new Casilla(630, 580 - 30 * p);
                casillas[i].paint(g);
                }else{
                      casillas[i].paint(g);
                }
            } else if (i > 42 && i < 51)//del centro a la derecha
            {
             
                m++;
                if(casillas[i]==null)
                {
                if (i == 43) {
                    casillas[i] = new CasillaCentral(660, 310);
                    casillas[i].paint(g);
                } else {
                    casillas[i] = new Casilla(630 + 30 * m, 310);
                    casillas[i].paint(g);
                }
                }else {
                     casillas[i].paint(g);
                }
            } else if (i > 50 && i < 60)//de derecha al centro
            {
                n++;
                if(casillas[i]==null){
                casillas[i] = new Casilla(900 - 30 * n, 280);
                casillas[i].paint(g);
                }else{
                     casillas[i].paint(g);
                }
                
            } else if (i > 59 && i < 68)//del centro hacia arriba
            {
                y++;
                if(casillas[i]==null){
                if (i == 60) {
                    casillas[i] = new CasillaCentral(630, 250);
                    casillas[i].paint(g);
                } else {
                    casillas[i] = new Casilla(630, 280 - 30 * y);
                    casillas[i].paint(g);
                  
                }
                }else{
                    casillas[i].paint(g);
                }
            }
        }

    }

    public void moverFicha(Ficha ficha) {
        
        for (int i = 0; i < casillas.length; i++) {
            System.out.println(i);
            if (casillas[i].getFichaUno() != null) {
                
           
                
                if (casillas[i].getFichaUno().getColor().getColor() == ficha.getColor().getColor()) 
                {
                     
                  
                    
                  
                    if(i!=casillas.length-1)
                    {
                       
                    
                      casillas[i].setFichaUno(null);
                    casillas[i+1].setFichaUno(ficha);
                    }else{
                         System.out.println("entre");
                         casillas[i].setFichaUno(null);
                    casillas[0].setFichaUno(ficha);
                    }
                      i=casillas.length-1;
                }
            }
           
        }
        
    }
}
