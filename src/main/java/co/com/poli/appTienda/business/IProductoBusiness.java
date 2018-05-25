/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.business;

import co.com.poli.appTienda.model.Producto;
import java.util.List;

/**
 *
 * @author ISABEL MEDINA
 */
public interface IProductoBusiness {
    List<Producto> obtenerProductos();
    Producto ObtenerProducto(String id);
    String crearProducto(Producto producto);
    String eliminarProducto(String id);
    String modificarProducto(Producto producto);
}
