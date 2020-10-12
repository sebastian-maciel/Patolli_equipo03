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
import java.awt.geom.Ellipse2D;

/**
 *
 * @author DELL
 */
public class CnvDibujo extends Canvas {
    public void paint(Graphics g) { 
        
        Graphics2D g2d = (Graphics2D)g;
        //se establece el color para dibujar
	g2d.setColor(Color.BLACK);
        //se dibuja el rectángulo del contorno del Canvas (que es como un panel especial para dibujar)
        Rectangle rect = new Rectangle();
        rect.setBounds(0, 0, this.getWidth()-1, this.getHeight()-1);
        
        g2d.draw(rect);
        g2d.rotate(Math.toRadians(45));
        
        
       
                
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        //x,y es el punto donde se iniciará a dibujar el tablero
        //ancho y alto son las medidas de las casillas
        int x=50,y=-40,ancho=20, alto=20;
        //se dibuja la linea de casillas de arriba
        dibujaHorizontal(x,y,ancho,alto,16,g2d);
        dibujaHorizontal(x,-ancho,ancho,alto,16,g2d);
       
        dibujaVertical(x+140,y+alto*2,ancho,alto,7,g2d,5); 
        //se dibuja la columna de casillas de la izquierda
       dibujaVertical(x+160,y+alto*2,ancho,alto,7,g2d,5);  
       
       
       dibujaVertical(x+140,(y+alto*-7),ancho,alto,7,g2d,1); 
        //se dibuja la columna de casillas de la izquierda
       dibujaVertical(x+160,(y+alto*-7),ancho,alto,7,g2d,1);
        
        //se dibuja una ficha        
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.WHITE);
        Ellipse2D.Double ficha = new Ellipse2D.Double(x+(ancho/7), y+(alto/7), ancho-(ancho/4), alto-(alto/4));
        g2d.fill(ficha);        
        g2d.setColor(Color.BLACK);
        g2d.draw(ficha);
        
    }    
    
    //para dibujar una linea de casillas horizontal
    void dibujaHorizontal(int x, int y, int ancho, int alto, int cuantos, Graphics2D g){        
        Rectangle rect = new Rectangle();
       
        for(int i=0; i<cuantos; i++) {           
           
          
             g.setColor(Color.WHITE);
            System.out.println(i);
            if(i==1||i==14)
            {
              
               
                g.setColor(Color.RED);
                 g.fill(rect);   
                  g.draw(rect);  
                
                
                
                
                
            }else{
               g.draw(rect);
                  
           
               
            }
             x+=ancho;
           //  g.setColor(Color.WHITE);
            
             
        
        }
    }
    
    //para dibujar una linea de casillas vertical
    void dibujaVertical(int x, int y, int ancho, int alto, int cuantos, Graphics2D g,int pintar){
        Rectangle rect = new Rectangle();
        for(int i=0; i<cuantos; i++) {           
            rect.setBounds(x, y, ancho, alto);
            g.setColor(Color.WHITE);
            System.out.println(i);
            if(i==pintar)
            {
              
                System.out.println("entre");
                g.setColor(Color.RED);
                 g.fill(rect);   
                  g.draw(rect);  
                
                
                
                
                
            }else{
               g.draw(rect);
                  
           
               
            }

            
            y+=alto;
        }
    }    
}
