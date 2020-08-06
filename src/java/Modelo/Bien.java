/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Bien {
    private int idbien;
    private String nombre;
    private int Stock;
    private String Categoria;
    private String HoraDeVenta;
    private String FechaDeVenta;

    public Bien(int idbien, String nombre, int Stock, String Categoria, String HoraDeVenta, String FechaDeVenta) {
        this.idbien = idbien;
        this.nombre = nombre;
        this.Stock = Stock;
        this.Categoria = Categoria;
        this.HoraDeVenta = HoraDeVenta;
        this.FechaDeVenta = FechaDeVenta;
    }

    public int getIdbien() {
        return idbien;
    }

    public void setIdbien(int idbien) {
        this.idbien = idbien;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getHoraDeVenta() {
        return HoraDeVenta;
    }

    public void setHoraDeVenta(String HoraDeVenta) {
        this.HoraDeVenta = HoraDeVenta;
    }

    public String getFechaDeVenta() {
        return FechaDeVenta;
    }

    public void setFechaDeVenta(String FechaDeVenta) {
        this.FechaDeVenta = FechaDeVenta;
    }
    
    
}
