/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.model;

/**
 *
 * @author ISABEL MEDINA
 */
public class Movimiento {
    
    private String idMovimiento;
    private Producto producto;
    private Double cantidad;
    private Double precio;
    private TipoMovimiento tipoMovmiento;
       

    public Movimiento() {
    }

    public Movimiento(String idMovimiento, Producto producto, Double cantidad, Double precio, TipoMovimiento tipoMovmiento) {
        this.idMovimiento = idMovimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipoMovmiento = tipoMovmiento;
    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }   

    public TipoMovimiento getTipoMovmiento() {
        return tipoMovmiento;
    }

    public void setTipoMovmiento(TipoMovimiento tipoMovmiento) {
        this.tipoMovmiento = tipoMovmiento;
    }  
    
    public enum TipoMovimiento{
        entrada, salida
    }
    
    
}
