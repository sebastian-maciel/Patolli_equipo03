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
public enum Colores {
    
     BLANCO("blanco"), 
    AMARILLO("amarillo"), 
    ROJO("rojo"),
    NEGRO("negro"),
    GRIS("gris"),
    AZUL("azul");

  
    private String color;
    


    private Colores(String color) {
        this.color = color;
      
    }

    public static Colores getBLANCO() {
        return BLANCO;
    }

    public static Colores getAMARILLO() {
        return AMARILLO;
    }

    public static Colores getROJO() {
        return ROJO;
    }

    public static Colores getNEGRO() {
        return NEGRO;
    }

    public static Colores getGRIS() {
        return GRIS;
    }

    public static Colores getAZUL() {
        return AZUL;
    }

    public String getColor() {
        return color;
    }

    
   
   
    
       
    
    
}
