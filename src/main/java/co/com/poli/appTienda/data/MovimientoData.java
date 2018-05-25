
package co.com.poli.appTienda.data;
import co.com.poli.appTienda.model.Movimiento;
import co.com.poli.appTienda.model.Producto;
import java.util.List;
import java.util.ArrayList;



public class MovimientoData {
        private static List<Movimiento> listaMovimientos;
    static{
        listaMovimientos = new ArrayList<Movimiento>(){
           { 
                
            add(new Movimiento("100", new Producto("102", "Tenis", 0D, 0D), 
                    5D, 20000D, Movimiento.TipoMovimiento.entrada));
    
           }
       };
    }

    public static List<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public static void setListaMovimientos(List<Movimiento> aListaMovimientos) {
        listaMovimientos = aListaMovimientos;
    }
}
