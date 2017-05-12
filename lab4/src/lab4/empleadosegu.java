/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Date;

/**
 *
 * @author HP
 */
public class empleadosegu extends persona{
    
    private int claves;
    private Date dia;

    public empleadosegu(int claves, Date dia, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
        this.claves = claves;
        this.dia = dia;
    }

    public int getClaves() {
        return claves;
    }

    public void setClaves(int claves) {
        this.claves = claves;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "empleadosegu{" + "claves=" + claves + ", dia=" + dia + '}';
    }
    
    
}
