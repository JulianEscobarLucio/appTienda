package co.com.poli.appTienda.controller;

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

import co.com.poli.appTienda.business.IMovimientoBusiness;
import co.com.poli.appTienda.model.Movimiento;

@RestController
@RequestMapping(value = "/")
public class MovimientoController {
	
	@Autowired
	IMovimientoBusiness  movimientoBusiness;
	
    @GetMapping("/movimientos")
    public List<Movimiento> obtenerMovimientos(){
     return movimientoBusiness.obtenerMovimientos();
    }
    
    @GetMapping("/movimientos/{id}")
    public Movimiento obtenerMovimiento(@PathVariable String id){
     return movimientoBusiness.obtenerMovimiento(id);
    }
    
    @PostMapping("/movimientos")
    public String crearMovimiento(Movimiento movimiento){
        return movimientoBusiness.crearMovimiento(movimiento);
    }
    
    @PutMapping("/movimientos")
    public String modificarMovimiento(@RequestBody Movimiento movimiento,HttpServletResponse hsr){
        return movimientoBusiness.modificarMovimiento(movimiento);
    }
    
    @DeleteMapping("/movimientos/{id}")
    public String eliminarMovimiento(@PathVariable String id) {
    	return movimientoBusiness.eliminarMovimiento(id);
    }
}
