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
public class empleadosegu extends empleado{
    
    private antirobo claves;
    private Date dia;

<<<<<<< HEAD
    public empleadosegu(int contraseña, int clave, Date dia, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
        this.claves = 
        
=======
    public empleadosegu(String contraseña, String clave, Date dia, int sueldo, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(sueldo, nombre, ID, edad, alura, peso, residencia);
        this.claves = new antirobo(contraseña, clave);
        this.dia = dia;
>>>>>>> 29d8ed493fe262e1325e3b6b4f8962c152eb868f
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
        
    }

    
    
    
}
