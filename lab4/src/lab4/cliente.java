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
public class cliente extends persona {
    private int dinero;
    private Date fecha=new Date();
    private int producto=0;

    public cliente(int dinero, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
        this.dinero = dinero;
    }

    

    public cliente(String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
