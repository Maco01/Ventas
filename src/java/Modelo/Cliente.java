package Modelo;

public class Cliente {
    private int idcliente;
    private String nombre;
    private String fecha;
    private int dni;
    private String estado;
    private int CantidadDeProductosComprados;

    public Cliente(int idcliente, String nombre, String fecha, int dni, String estado, int CantidadDeProductosComprados) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.fecha = fecha;
        this.dni = dni;
        this.estado = estado;
        this.CantidadDeProductosComprados = CantidadDeProductosComprados;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadDeProductosComprados() {
        return CantidadDeProductosComprados;
    }

    public void setCantidadDeProductosComprados(int CantidadDeProductosComprados) {
        this.CantidadDeProductosComprados = CantidadDeProductosComprados;
    }
   
    
}
