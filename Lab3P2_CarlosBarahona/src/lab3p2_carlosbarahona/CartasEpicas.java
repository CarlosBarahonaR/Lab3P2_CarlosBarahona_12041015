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
public class CartasEpicas extends Cartas {
    private int ataque;

    public CartasEpicas(int ataque, int costoElixir, int velocidad, String nombre) {
        super(costoElixir, velocidad, nombre);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "CartasEpicas{" + "ataque=" + ataque + '}';
    }
    
    
}
