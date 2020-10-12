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
    
    iCasilla []casillas=new iCasilla[32];
    Caña cañas[];

   
   
    public void setCasillas(iCasilla[] casillas) {
        this.casillas = casillas;
    }
    
    
    
    
    @Override
    public void paint(Graphics g)
    {
        System.out.println("entre");
         Graphics2D g2d = (Graphics2D)g;
        Casilla a = new Casilla(40,40);
      //  a.paint(g);
        
        iCasilla b = new Casilla(40, 40);
       // b.paint(g);
     
      for (int i = 0; i < casillas.length; i++) 
       {
       casillas[i]= new Casilla(40, 40+40*i);
       if(i==16){
            casillas[i]= new Casilla(60, 40+40*i);
       }
       
       
      casillas[i].paint(g);
        
        //}
    }
    
    }    
}
