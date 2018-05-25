/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.controller;

import co.com.poli.appTienda.business.IProductoBusiness;
import co.com.poli.appTienda.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
