/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagraficos;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Ficha {
     
    List <RegistroMovimiento> registros= new  ArrayList<>();
iCasilla casilla;
    public Ficha(iCasilla casilla) {
       this.casilla=casilla;
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
