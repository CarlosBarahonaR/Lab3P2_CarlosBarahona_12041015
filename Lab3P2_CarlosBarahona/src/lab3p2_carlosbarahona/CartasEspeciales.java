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
public class CartasEspeciales extends Cartas {
    private int vida;


    public CartasEspeciales(int vida, int costoElixir, int velocidad, String nombre) {
        super(costoElixir, velocidad, nombre);
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "CartasEspeciales{" + "vida=" + vida + '}';
    }
    
    
    
    
}
