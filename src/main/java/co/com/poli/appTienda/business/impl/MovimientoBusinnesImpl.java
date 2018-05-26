/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.business.impl;

import co.com.poli.appTienda.business.IMovimientoBusiness;
import co.com.poli.appTienda.dao.IMovimientoDao;
import co.com.poli.appTienda.dao.IProductoDao;
import co.com.poli.appTienda.model.Movimiento;
import co.com.poli.appTienda.model.Producto;
import co.com.poli.appTienda.model.TipoMovimiento;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovimientoBusinnesImpl implements IMovimientoBusiness{
    
    @Autowired
    IMovimientoDao  movimientoDao;

    @Autowired
    IProductoDao productoDao;
    
    @Override
    public List<Movimiento> obtenerMovimientos() {
       return movimientoDao.obtenerMovimientos();
    }

    @Override
    public Movimiento obtenerMovimiento(String id) {
       return movimientoDao.ObtenerMovimiento(id);
    }

    @Override
    public String crearMovimiento(Movimiento movimiento) {
    	Producto producto = productoDao.ObtenerProducto(movimiento.getProducto().getIdproducto());
    	if(producto != null) {
    		return "El productono no existe, no se puede realizar el momiviento";
    	}
    	if(movimiento.getPrecio() < 0) {
    		return "El valor debe ser mayor a 0";
    	}
    	producto.setExistencia(producto.getExistencia() + movimiento.getProducto().getExistencia());
    	productoDao.modificarProducto(producto);
        return movimientoDao.crearMovimiento(movimiento);
    }

    @Override
    public String eliminarMovimiento(String id) {
        return movimientoDao.eliminarMovimiento(id);
    }

    @Override
    public String modificarMovimiento(Movimiento movimiento) {
    	Producto producto = productoDao.ObtenerProducto(movimiento.getProducto().getIdproducto());
    	if(producto == null) {
    		return "El productono no existe, no se puede realizar el momiviento";
    	}
    	
    	if(TipoMovimiento.entrada.equals(movimiento.getTipoMovmiento())) {
	    	if(movimiento.getPrecio() < 0) {
	    		return "El valor debe ser mayor a 0";
	    	}
	    	producto.setExistencia(producto.getExistencia() + movimiento.getProducto().getExistencia());
        }else {
        	if(movimiento.getPrecio() > producto.getExistencia()) {
	    		return "La existencia del producto es menor a la cantidad requerida";
	    	}
        	producto.setExistencia(producto.getExistencia() - movimiento.getProducto().getExistencia());
        }
    	
    	productoDao.modificarProducto(producto);
        return movimientoDao.modificarMovimiento(movimiento);
    }
    
    
    
    
}
