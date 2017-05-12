
package lab4;

import java.util.Date;

/**
 *
 * @author HP
 */
public class producto{
    
    private Date fechaEmision;
    private int vidaUtil;
    private int precio;
    private int tamaño;
    private String descripcion;
    private String nombre;
    private int numeroProductos;

    public producto() {
        super();
    }

    public producto(Date fechaEmision, int vidaUtil, int precio, int tamaño, String descripcion, String nombre, int numeroProductos) {
        this.fechaEmision = fechaEmision;
        this.vidaUtil = vidaUtil;
        this.precio = precio;
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.numeroProductos = numeroProductos;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }

    @Override
    public String toString() {
        return "producto{" + "fechaEmision=" + fechaEmision + ", vidaUtil=" + vidaUtil + ", precio=" + precio + ", tama\u00f1o=" + tamaño + ", descripcion=" + descripcion + ", nombre=" + nombre + ", numeroProductos=" + numeroProductos + '}';
    }

}
