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
        System.out.println(claves);
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
        super.sueldo=sc.nextInt();
        System.out.println("Ingrese nuevo nombre");
        super.nombre=sc.next();
        System.out.println("Ingrese nuevo ID");
        super.ID=sc.nextInt();
        System.out.println("Ingrese nueva altura");
        super.altura=sc.nextInt();
        System.out.println("Ingrese nuevo peso");
        super.peso=sc.nextInt();
        sc.nextLine();
        super.residencia=sc.nextLine();
    }

    @Override
    public boolean permiso() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese contraseña codificada para vigenere");
        sc.nextLine();
        String contraseñaVig = sc.nextLine();
        System.out.println("Ingrese clave para vigenere");
        sc.nextLine();
        String claveVig = sc.nextLine();
        System.out.println("Ingrese contraseña codificada para adelantar");
        sc.nextLine();
        String contraseñaAdel = sc.nextLine();
        System.out.println("Ingrese contraseña codificada para binario");
        sc.nextLine();
        String contraseñaBin = sc.nextLine();
        boolean adelantar = false;
        for (int i = 0; i < 10; i++) {
            if (new adelantar().decoAdelantar(contraseñaAdel, i).equals(claves.getAdelantar())) {
                adelantar = true;
                break;
            }
        }
        if (new cifradoVigenere().decoVigenere(contraseñaVig, claveVig).equals(claves.getVigenere()) && adelantar && new binario().decoBinario(contraseñaBin).equals(claves.getBinario())) {
            return true;
        }else{
            return false;
        }
        
    }

    
    
    
}
