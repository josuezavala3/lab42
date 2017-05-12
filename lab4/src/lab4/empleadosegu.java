/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class empleadosegu extends persona{
    
    private antirobo claves;
    private Date dia;

    public empleadosegu(String contraseña, String clave, Date dia, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
        this.claves = new antirobo(contraseña, clave);
        this.dia = dia;
    }

    public empleadosegu(antirobo claves, Date dia, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
        this.claves = claves;
        this.dia = dia;
    }

    public antirobo getClaves() {
        return claves;
    }

    public void setClaves(antirobo claves) {
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

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
