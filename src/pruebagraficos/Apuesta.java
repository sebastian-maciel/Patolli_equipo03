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
public class Apuesta {
    int montoApuesta;
    String nombreApuesta;

    public Apuesta(int montoApuesta, String nombreApuesta) {
        this.montoApuesta = montoApuesta;
        this.nombreApuesta = nombreApuesta;
    }

    
    
    
    public int getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(int montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    public String getNombreApuesta() {
        return nombreApuesta;
    }

    public void setNombreApuesta(String nombreApuesta) {
        this.nombreApuesta = nombreApuesta;
    }
    
    
            
}
