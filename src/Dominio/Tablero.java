/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Dominio.Ficha;
import Dominio.CasillaCentral;
import Dominio.Casilla;
import Dominio.Caña;
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

    private iCasilla[] casillas = new iCasilla[60];
    private Caña cañas[];

    public void setCasillas(iCasilla[] casillas) {
        this.casillas = casillas;
    }

    public void lanzar() {
        System.out.println("lanzar cania");
    }

    /**
     * el siguiente metodo dibujara un tablero con 14 casillas por aspa y las 4
     * del centro
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {

        byte j = 0;
        byte k = 0;
        byte l = 0;
        byte p = 0;
        byte m = 0;
        byte n = 0;
        byte y = 0;
            // VER presentacion de sustitucion de liskov o abierto cerrado
            
        //VARIABLES ( estas variables son el numero de fichas que se dibujaran por aspa depende del tablero elejido )
        //de arriba al cento
        byte arribaCentro = (byte) ((((casillas.length - 4) / 4) / 2)+1);
        System.out.println(casillas.length+"cocaina");
        //del centro a la izquierda
        byte centroIzquierda = (byte) (arribaCentro - 1);
        byte centroIzquierdaAux = (byte) ((centroIzquierda * 2) +1);
        // de la izquierda al centro
        byte izquierdaCentro = (byte) (centroIzquierdaAux - 1);
        byte izquierdaCentroAux = (byte) ((izquierdaCentro) + (arribaCentro + 1));
        //del centro hacia bajo
        byte centroAbajo = (byte) (izquierdaCentroAux - 1);
        byte centroAbajoAux = (byte) (centroAbajo + arribaCentro);
        //de abajo al centro
        byte abajoCentro = (byte) (centroAbajoAux - 1);
        byte abajoCentroAux = (byte) ((abajoCentro) + (arribaCentro + 1));
        //del centro a la derecha
        byte centroDerecha = (byte) (abajoCentroAux - 1);
        byte centroDerechaAux = (byte) (centroDerecha + arribaCentro);
        //de derecha al centro
        byte derechaCentro = (byte) (centroDerechaAux - 1);
        byte derechaCentroAux = (byte) (derechaCentro + arribaCentro + 1);
        //del centro hacia arriba
        byte centroArriba = (byte) (derechaCentroAux - 1);
        byte centroArribaAux = (byte) (centroArriba + centroIzquierda+1);

        System.out.println("arriba centro->" + arribaCentro);
        System.out.println("centro Izquierda->" + centroIzquierda);
        System.out.println("centroIzquierda 2->" + centroIzquierdaAux);
        System.out.println("izquierda Centro->" + izquierdaCentro);
        System.out.println("izquierdaCentro 2->" + izquierdaCentroAux);
        System.out.println("centro Abajo->" + centroAbajo);
        System.out.println("centroAbajo 2->" + centroAbajoAux);
        System.out.println("abajo Centro ->" + abajoCentro);
        System.out.println("Abajo Centro 2->" + abajoCentroAux);
        System.out.println("centro Derecha->" + centroDerecha);
        System.out.println("centro Derecha 2->" + centroDerechaAux);
        System.out.println("derecha centro->" + derechaCentro);
        System.out.println("derecha Centro2 ->" + derechaCentroAux);
        System.out.println("centro Arriba ->" + centroArriba);
        System.out.println("centro Arriba 2->" + centroArribaAux);

        for (int i = 0; i < casillas.length; i++) {

            if (i != arribaCentro && i < arribaCentro) { //se dibuja de arriba al centro
                
                if (casillas[i] == null) {
                
                    casillas[i] = new Casilla(600, 40 + 30 * i);
                    casillas[i].paint(g);
                } else {
                    casillas[i].paint(g);
                     
                }
                System.out.println(i+"flag1");
            } else if (i > centroIzquierda && i < centroIzquierdaAux)//del centro a la izquierda
            {
                  
                j++;
                if (casillas[i] == null) {
                   
                    if (i == centroIzquierda+1) {
                         

                        casillas[i] = new CasillaCentral(600 - 30 * j, 280);

                        casillas[i].paint(g);

                    
                   
                } else {
                        
                    casillas[i] = new Casilla(600 - 30 * j, 280);
                    casillas[i].paint(g);
                }
            }else{
                
                 casillas[i].paint(g); 
              }
            } else if (i > izquierdaCentro && i < izquierdaCentroAux)//de la izquierda al centro
            {

              
                k++;
                if(casillas[i]==null){
                casillas[i] = new Casilla(330 + 30 * k, 310);
                casillas[i].paint(g);
                }else{
                     casillas[i].paint(g);
                }
            } else if (i > centroAbajo && i < centroAbajoAux)//del centro hacia bajo
            {
                l++;
                if(casillas[i]==null){
                if (i == centroAbajo+1) {
                    casillas[i] = new CasillaCentral(600, 340);
                    casillas[i].paint(g);
                } else {
                    casillas[i] = new Casilla(600, 310 + 30 * l);
                    casillas[i].paint(g);
                }
                }else{
                     casillas[i].paint(g);
                }

            } else if (i > abajoCentro && i < abajoCentroAux)//de abajo al centro       
            {
                p++;
                if(casillas[i]==null){
                casillas[i] = new Casilla(630, 580 - 30 * p);
                casillas[i].paint(g);
                }else{
                      casillas[i].paint(g);
                }
            } else if (i > centroDerecha && i < centroDerechaAux)//del centro a la derecha
            {
             
                m++;
                if(casillas[i]==null)
                {
                if (i == abajoCentroAux) {
                    casillas[i] = new CasillaCentral(660, 310);
                    casillas[i].paint(g);
                } else {
                    casillas[i] = new Casilla(630 + 30 * m, 310);
                    casillas[i].paint(g);
                }
                }else {
                     casillas[i].paint(g);
                }
            } else if (i > derechaCentro && i < derechaCentroAux)//de derecha al centro
            {
                n++;
                if(casillas[i]==null){
                casillas[i] = new Casilla(900 - 30 * n, 280);
                casillas[i].paint(g);
                }else{
                     casillas[i].paint(g);
                }
                
            } else if (i > centroArriba && i < centroArribaAux)//del centro hacia arriba
            {
                y++;
                if(casillas[i]==null){
                if (i == derechaCentroAux) {
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

    
    /**
     * este metodo recibe la ficha a mover, una vez que encuentra
     * la casilla en la que esta,se mueve a la siguiente casilla y la borra
     * de donde estava.
     * @param ficha 
     */
    public void moverFicha(Ficha ficha) {
        
        for (int i = 0; i < casillas.length; i++) {
          
            
            if (casillas[i].getFichaUno() != null) {
                
           
                
                if (casillas[i].getFichaUno().getColor().getColor() == ficha.getColor().getColor()) 
                {
                     
                  
                    
                  
                    if(i!=casillas.length-1)
                    {
                       
                    
                      casillas[i].setFichaUno(null);
                    casillas[i+1].setFichaUno(ficha);
                    }else{
                        
                         casillas[i].setFichaUno(null);
                    casillas[0].setFichaUno(ficha);
                    }
                      i=casillas.length-1;
                }
            }
           
        }
        
    }

    public iCasilla[] getCasillas() {
        return casillas;
    }
    
    
}
