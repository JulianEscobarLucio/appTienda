/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appTienda.data;

import co.com.poli.appTienda.model.Producto;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ISABEL MEDINA
 */
public class ProductoData {
        private static List<Producto> listaProducto;
    static{
        listaProducto = new ArrayList<Producto>(){
           { 
            add(new Producto("100", "Camiseta azul", 10D, 0D));
            add(new Producto("101", "Jean negro", 10D, 0D));
            add(new Producto("102", "Tenis", 10D, 0D));
           }
       };
    }

    public static List<Producto> getListaProductos() {
        return listaProducto;
    }

    public static void setListaProductos(List<Producto> aListaProducto) {
       listaProducto = aListaProducto;
    }
}
