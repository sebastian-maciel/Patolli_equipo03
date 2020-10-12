/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagraficos;

/**
 *
 * @author javie
 */
public enum Color {
    
     BLANCO("blanco"), 
    AMARILLO("amarillo"), 
    ROJO("rojo"),
    NEGRO("negro"),
    GRIS("gris"),
    AZUL("azul");

  
    private String color;
    


    private Color(String color) {
        this.color = color;
      
    }

    public static Color getBLANCO() {
        return BLANCO;
    }

    public static Color getAMARILLO() {
        return AMARILLO;
    }

    public static Color getROJO() {
        return ROJO;
    }

    public static Color getNEGRO() {
        return NEGRO;
    }

    public static Color getGRIS() {
        return GRIS;
    }

    public static Color getAZUL() {
        return AZUL;
    }

    public String getColor() {
        return color;
    }

    
   
   
    
       
    
    
}
