/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class empleadosegu extends empleado{
    
    private antirobo claves;
    private Date dia;

    public empleadosegu(String contraseña, String clave, Date dia, int sueldo, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(sueldo, nombre, ID, edad, alura, peso, residencia);
        this.claves = new antirobo(contraseña, clave);
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
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingrese nuevo sueldo");
        int sueldo=sc.nextInt();
        System.out.println("Ingrese nuevo nombre");
        String nombre=sc.next();
        System.out.println("Ingrese nuevo ID");
        int ID=sc.nextInt();
        System.out.println("Ingrese nueva altura");
        int alura=sc.nextInt();
        System.out.println("Ingrese nuevo peso");
        super.peso=sc.nextInt();
        String residencia;
    }

    
    
    
}
