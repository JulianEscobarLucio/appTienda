/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.dao.impl;

import co.com.poli.appTienda.dao.IMovimientoDao;
import co.com.poli.appTienda.data.MovimientoData;
import co.com.poli.appTienda.model.Movimiento;
import co.com.poli.appTienda.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MovimientoDaoImpl implements IMovimientoDao{

    @Override
    public List<Movimiento> obtenerMovimientos() {
        return MovimientoData.getListaMovimientos();
    }

    @Override
    public Movimiento ObtenerMovimiento(String id) {
        Movimiento movimiento = null;
        List<Movimiento> listado = MovimientoData.getListaMovimientos();
        for(Movimiento mov :  listado){
            if(mov.getIdMovimiento().equals(id)){
                movimiento = mov;
            }
        }
        return movimiento;
    }

    @Override
    public String crearMovimiento(Movimiento Movimiento) {
        String respuesta = "Movimiento Ya Registrado";
        List<Movimiento> listado = MovimientoData.getListaMovimientos();
        if(!listado.contains(Movimiento)){
            listado.add(Movimiento);
            MovimientoData.setListaMovimientos(listado);
            respuesta = "Movimiento Registrado";
        }    
        return respuesta;
    }

    @Override
    public String eliminarMovimiento(String id) {
        String respuesta = "Movimiento Eliminado";
        List<Movimiento> listado = MovimientoData.getListaMovimientos();
        
        Movimiento movimiento = ObtenerMovimiento(id);
        listado.remove(movimiento);
        MovimientoData.setListaMovimientos(listado);
        return respuesta;       
    }

    @Override
    public String modificarMovimiento(Movimiento movimiento) {
        String respuesta = "Movimiento Modificado";
        List<Movimiento> listado = MovimientoData.getListaMovimientos();
        Movimiento movimientoConsulta = ObtenerMovimiento(movimiento.getIdMovimiento());
        listado.set(listado.indexOf(movimientoConsulta), movimiento);
        MovimientoData.setListaMovimientos(listado);
        return respuesta;    
     }
    
}
