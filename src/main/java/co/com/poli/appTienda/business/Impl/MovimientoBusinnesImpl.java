/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.business.Impl;

import co.com.poli.appTienda.business.IMovimientoBusiness;
import co.com.poli.appTienda.dao.IMovimientoDao;
import co.com.poli.appTienda.model.Movimiento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovimientoBusinnesImpl implements IMovimientoBusiness{
    
    @Autowired
    IMovimientoDao  movimientoDao;

    @Override
    public List<Movimiento> obtenerMovimientos() {
       return movimientoDao.obtenerMovimientos();
    }

    @Override
    public Movimiento ObtenerMovimiento(String id) {
       return movimientoDao.ObtenerMovimiento(id);
    }

    @Override
    public String crearMovimiento(Movimiento movimiento) {
         return movimientoDao.crearMovimiento(movimiento);
    }

    @Override
    public String eliminarMovimiento(String id) {
        return movimientoDao.eliminarMovimiento(id);
    }

    @Override
    public String modificarMovimiento(Movimiento movimiento) {
         return movimientoDao.modificarMovimiento(movimiento);
    }
    
    
    
    
}
