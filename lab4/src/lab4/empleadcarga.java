/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class empleadcarga extends empleado {

    private int horaEntrada;
    private int horaSalida;
    private Date fechaInicio;
    private antirobo claves;

    public empleadcarga(String contraseña, String clave, int horaEntrada, int horaSalida, Date fechaInicio, int sueldo, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(sueldo, nombre, ID, edad, alura, peso, residencia);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fechaInicio = fechaInicio;
        this.claves = new antirobo(contraseña, clave);
        System.out.println(claves);
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "empleadcarga{" + "horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", fechaInicio=" + fechaInicio + '}';
    }

    @Override
    public void modificar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        super.nombre = sc.next();
        System.out.println("Ingrese ID");
        super.ID = sc.nextInt();
        System.out.println("Ingrese altura");
        super.altura = sc.nextInt();
        System.out.println("Ingrese peso");
        super.peso = sc.nextInt();
        System.out.println("Ingrese redidencia");
        super.residencia = sc.next();
        System.out.println("Ingrese sueldo");
        super.sueldo = sc.nextInt();
        System.out.println("Ingrese hora entrada");
        this.horaEntrada = sc.nextInt();
        System.out.println("Ingrese hora salida");
        this.horaSalida = sc.nextInt();
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
