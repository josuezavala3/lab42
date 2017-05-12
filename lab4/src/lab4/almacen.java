package lab4;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class almacen {

    ArrayList<empleado> cl = new ArrayList();
    ArrayList<producto> pro = new ArrayList();
    private double tamano;
    private int altura;
    ArrayList<cliente> cliente = new ArrayList();

    public almacen() {
    }

    public almacen(double tamano, int altura) {
        this.tamano = tamano;
        this.altura = altura;
    }

    public ArrayList<empleado> getCl() {
        return cl;
    }

    public void setCl(ArrayList<empleado> cl) {
        this.cl = cl;
    }

    public ArrayList<producto> getPro() {
        return pro;
    }

    public void setPro(ArrayList<producto> pro) {
        this.pro = pro;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<cliente> cliente) {
        this.cliente = cliente;
    }
    
}
