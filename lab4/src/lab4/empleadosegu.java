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
    
    private ArrayList<antirobo> claves;
    private Date dia;

    public empleadosegu(int contraseña, int clave, Date dia, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(nombre, ID, edad, alura, peso, residencia);
        
        
        this.dia = dia;
    }

    
    
    
}
