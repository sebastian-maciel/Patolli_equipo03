/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author javie
 */
public class RegistroMovimiento {

    private String casilla;
    private boolean apuesta;

    public RegistroMovimiento(String casilla, boolean apuesta) {
        this.casilla = casilla;
        this.apuesta = apuesta;
    }

    public String getCasilla() {
        return casilla;
    }

    public void setCasilla(String casilla) {
        this.casilla = casilla;
    }

    public boolean isApuesta() {
        return apuesta;
    }

    public void setApuesta(boolean apuesta) {
        this.apuesta = apuesta;
    }
    
    
}
