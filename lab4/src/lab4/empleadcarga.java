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
public class empleadcarga extends empleado{
    
    private int horaEntrada;
    private int horaSalida;
    private Date fechaInicio;

    public empleadcarga(int horaEntrada, int horaSalida, Date fechaInicio, int sueldo, String nombre, int ID, int edad, int alura, int peso, String residencia) {
        super(sueldo, nombre, ID, edad, alura, peso, residencia);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fechaInicio = fechaInicio;
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
    
    
}
