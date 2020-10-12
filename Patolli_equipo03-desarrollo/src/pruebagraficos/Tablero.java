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
 * @author Ruben Cardoza, Javier Barreras, Jesus Murguia y Brayan Fajardo
 */
public class Tablero extends Canvas {
    /**
     * Aquí se declara el arreglo de Icasillas de una longitud de 71
     */
    iCasilla []casillas=new iCasilla[71];
    //variable de tipo objeto para las cañas
    Caña cañas[];

   
    /**
     * Este método asigna casillas
     * @param casillas 
     */
   
    public void setCasillas(iCasilla[] casillas) {
        this.casillas = casillas;
    }
    
    
    /**
     * Este método es el que genera/pinta el tablero principal del patolli
     * En este método se pinta tanto el tablero como los distintos tipos de casilla que conforman el tablero y sus colores.
     * @param g 
     */
    
    @Override
    public void paint(Graphics g)
    {
        int j = 1;
        int k=1;
        int l=1;

        for (int i = 0; i < casillas.length; i++) {
              
              //linea vertical de casillas
            if (i < 16) {
                if(i!=9)
                {
                   
                    System.out.println(i);
                    casillas[i] = new Casilla(600, 40 + 40 * i);
                casillas[i].paint(g);
                     // aqui se dibuja la primera casilla central
                }else if(i==9){
                    casillas[i] = new CasillaCentral(600, 40 + 40 * i);
                casillas[i].paint(g);
                }
                
                
                //segunda linea vertical de casillas
            } else if (i > 15 && i<32) {
 
                casillas[i] = new Casilla(640, 0 + 40 * j);
                casillas[i].paint(g);
                j++;
                if(i!=23)
                {
                    //aqui se dibuja la segunda casilla central
                    casillas[i] = new CasillaCentral(640,280);
                casillas[i].paint(g); 
                }
                //linea horizontal de casillas
            }else if(i>32 && i<51)
            {
               
                   casillas[i] = new Casilla(240+40*k,320);
                casillas[i].paint(g);
                k++;
                
                  
                if(i!=39)
                {
                    //aquí se dibuja la tercera casilla central
                 casillas[i] = new CasillaCentral(560,320);
                casillas[i].paint(g); 
                }
            }else if(i>52)
            {
                 casillas[i] = new Casilla(240+40*l,360);
                casillas[i].paint(g);
                l++;
                if(i!=60)
                {
                    //aqui se dibuja la ultima casilla central
                 casillas[i] = new CasillaCentral(680,360);
                casillas[i].paint(g); 
                }
            }

            //}
        }

    }  
}
