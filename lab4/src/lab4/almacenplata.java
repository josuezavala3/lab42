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
public class almacenplata extends almacen {
    private int mayorclientes;

    public almacenplata(int mayorclientes, double tamano, int altura) {
        super(tamano, altura);
        this.mayorclientes = mayorclientes;
    }

    public almacenplata() {
        super();
    }

    public int getMayorclientes() {
        return mayorclientes;
    }

    public void setMayorclientes(int mayorclientes) {
        this.mayorclientes = mayorclientes;
    }

    @Override
    public String toString() {
        return "almacenplata{" + "mayorclientes=" + mayorclientes + '}';
    }
    
}
