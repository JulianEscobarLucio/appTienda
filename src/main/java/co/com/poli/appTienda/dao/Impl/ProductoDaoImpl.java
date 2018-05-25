/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.dao.Impl;

import co.com.poli.appTienda.dao.IProductoDao;
import co.com.poli.appTienda.data.ProductoData;
import co.com.poli.appTienda.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDaoImpl implements IProductoDao{

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListaProductos();
    }

    @Override
    public Producto ObtenerProducto(String id) {
        Producto producto = null;
        List<Producto> listado = ProductoData.getListaProductos();
        for(Producto est :  listado){
            if(est.getIdproducto().equals(id)){
                producto = est;
            }
        }
        return producto;
    }

    @Override
    public String crearProducto(Producto producto) {
        String respuesta = "Producto Ya Registrado";
        List<Producto> listado = ProductoData.getListaProductos();
        if(!listado.contains(producto)){
            listado.add(producto);
            ProductoData.setListaProductos(listado);
            respuesta = "Producto Registrado";
        }    
        return respuesta;
    }

    @Override
    public String eliminarProducto(String id) {
        String respuesta = "Producto Eliminado";
        List<Producto> listado = ProductoData.getListaProductos();
        Producto producto = new  Producto(id, "", 0D, 0D);
        listado.remove(producto);
        ProductoData.setListaProductos(listado);
        return respuesta;
    }

    @Override
    public String modificarProducto(Producto producto) {
        String respuesta = "Producto Modificado";
        List<Producto> listado = ProductoData.getListaProductos();
        listado.set(listado.indexOf(producto), producto);
        ProductoData.setListaProductos(listado);
        return respuesta;
    }
    
}
