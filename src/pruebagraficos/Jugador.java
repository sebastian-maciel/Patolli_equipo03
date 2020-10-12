/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagraficos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javie
 */
public class Jugador {
    String nombre;
    boolean turno;
    int montoFijo;
    CasillaCentral casillaInicio;
    List<Apuesta> apuestas=new ArrayList<>();

    public Jugador(String nombre, boolean turno, int montoFijo,CasillaCentral casillaInicio) {
        this.nombre = nombre;
        this.turno = turno;
        this.montoFijo = montoFijo;
        this.casillaInicio=casillaInicio;
        
    }

    public CasillaCentral getCasillaInicio() {
        return casillaInicio;
    }

    public void setCasillaInicio(CasillaCentral casillaInicio) {
        this.casillaInicio = casillaInicio;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(int montoFijo) {
        this.montoFijo = montoFijo;
    }
    
    
}
