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
public class Producto {
    
    private String idproducto;
    private String nombre;
    private Double stock;
    private Double existencia;

    public Producto() {
    }

    public Producto(String idproducto, String nombre, Double stock, Double existencia) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.stock = stock;
        this.existencia = existencia;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Double getExistencia() {
        return existencia;
    }

    public void setExistencia(Double existencia) {
        this.existencia = existencia;
    } 

}
