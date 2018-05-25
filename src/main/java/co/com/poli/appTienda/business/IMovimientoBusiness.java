/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.business;

import co.com.poli.appTienda.model.Movimiento;
import java.util.List;

/**
 *
 * @author ISABEL MEDINA
 */
public interface IMovimientoBusiness {
    List<Movimiento> obtenerMovimientos();
    Movimiento ObtenerMovimiento(String id);
    String crearMovimiento(Movimiento movimiento);
    String eliminarMovimiento(String id);
    String modificarMovimiento(Movimiento movimiento);  
}
