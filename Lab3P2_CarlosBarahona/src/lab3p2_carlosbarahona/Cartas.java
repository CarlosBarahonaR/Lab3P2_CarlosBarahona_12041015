/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Cartas {
    private int costoElixir;
    private int velocidad;
    private String nombre;

    public Cartas(int costoElixir, int velocidad, String nombre) {
        this.costoElixir = costoElixir;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }
    
    

    public int getCostoElixir() {
        return costoElixir;
    }

    public void setCostoElixir(int costoElixir) {
        this.costoElixir = costoElixir;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cartas{" + "costoElixir=" + costoElixir + ", velocidad=" + velocidad + ", nombre=" + nombre + '}';
    }
    
    
}
