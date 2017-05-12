/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author HP
 */
public class almacenplanta extends almacen {
    private int plant;

    public almacenplanta() {
        super();
    }

    public almacenplanta(int plant, double tamano, int altura) {
        super(tamano, altura);
        this.plant = plant;
    }

    public int getPlant() {
        return plant;
    }

    public void setPlant(int plant) {
        this.plant = plant;
    }

    @Override
    public String toString() {
        return "almacenplanta{" + "plant=" + plant + '}';
    }
   
}
