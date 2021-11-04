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
public class CartaLegendaria extends Cartas {
    private int ataque;
    private int vida;

    public CartaLegendaria(int ataque, int vida, int costoElixir, int velocidad, String nombre) {
        super(costoElixir, velocidad, nombre);
        this.ataque = ataque;
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "CartaLegendaria{" + "ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
    
}
