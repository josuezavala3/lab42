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
public class almacenregiio extends almacen{
    private String nombredep;

    public almacenregiio() {
        super();
    }

    public almacenregiio(String nombredep, double tamano, int altura) {
        super(tamano, altura);
        this.nombredep = nombredep;
    }

    public String getNombredep() {
        return nombredep;
    }

    public void setNombredep(String nombredep) {
        this.nombredep = nombredep;
    }

    @Override
    public String toString() {
        return "almacenregiio{" + "nombredep=" + nombredep + '}';
    }
    
    
    
}
