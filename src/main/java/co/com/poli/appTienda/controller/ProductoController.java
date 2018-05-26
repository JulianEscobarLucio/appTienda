/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.controller;

import co.com.poli.appTienda.business.IProductoBusiness;
import co.com.poli.appTienda.model.Producto;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class ProductoController {
    
    @Autowired
    private IProductoBusiness  productoBusiness;
    
    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
     return productoBusiness.obtenerProductos();
    }
    
    @GetMapping("/productos/{id}")
    public Producto obtenerProducto(@PathVariable String id){
     return productoBusiness.obtenerProducto(id);
    }
    
    @PostMapping("/productos")
    public String crearProductos(Producto producto){
        return productoBusiness.crearProducto(producto);
    }
    
    @PutMapping("/productos")
    public String modificarProducto(@RequestBody Producto producto,HttpServletResponse hsr){
        return productoBusiness.modificarProducto(producto);
    }
    
    @DeleteMapping("/productos/{id}")
    public String eliminarProducto(@PathVariable String id) {
    	return productoBusiness.eliminarProducto(id);
    }
}
