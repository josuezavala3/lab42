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
public class persona {
    
    private String nombre;
    private int ID;
    private int edad;
    private int alura;
    private int peso;
    private String residencia;

    public persona(String nombre, int ID, int edad, int alura, int peso, String residencia) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.alura = alura;
        this.peso = peso;
        this.residencia = residencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAlura() {
        return alura;
    }

    public void setAlura(int alura) {
        this.alura = alura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", ID=" + ID + ", edad=" + edad + ", alura=" + alura + ", peso=" + peso + ", residencia=" + residencia + '}';
    }
    
    
    
}
