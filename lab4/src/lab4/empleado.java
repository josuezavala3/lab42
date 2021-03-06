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
public abstract class empleado extends persona{
    
    protected int sueldo;

    public empleado(int sueldo, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
        this.sueldo = sueldo;
    }

    public abstract boolean permiso();

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "empleado{" + "sueldo=" + sueldo + '}';
    }

    @Override
    public abstract void modificar();
    
    
}
