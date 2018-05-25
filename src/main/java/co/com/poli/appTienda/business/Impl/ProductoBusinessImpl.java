/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.business.Impl;

import co.com.poli.appTienda.business.IProductoBusiness;
import co.com.poli.appTienda.dao.IProductoDao;
import co.com.poli.appTienda.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoBusinessImpl implements IProductoBusiness{
    
    @Autowired
    IProductoDao productoDao;
    
    @Override
    public List<Producto> obtenerProductos() {
     return productoDao.obtenerProductos();
    }

    @Override
    public Producto ObtenerProducto(String id) {
      return  productoDao.ObtenerProducto(id);
    }

    @Override
    public String crearProducto(Producto producto) {
        return productoDao.crearProducto(producto);
    }

    @Override
    public String eliminarProducto(String id) {
       return productoDao.eliminarProducto(id);
    }

    @Override
    public String modificarProducto(Producto producto) {
        return productoDao.modificarProducto(producto);
    }
    
}
