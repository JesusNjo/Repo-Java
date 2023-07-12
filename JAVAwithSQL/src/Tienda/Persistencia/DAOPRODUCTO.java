/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Persistencia;

import java.util.ArrayList;

/**
 *
b) Lista los nombres y los precios de todos los productos de la tabla producto.
 */
public class DAOPRODUCTO extends DAO{
    
    public void listarTodosLosProductos(ArrayList<String> prodc) throws Exception {
        try {
            String sql = "SELECT DISTINCT nombre FROM producto";
            consula(sql);
            
            while (resultado.next()) {
                prodc.add(resultado.getString("nombre"));
            }
            desconectarDB();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarDB();
            throw e;
        }
    }
    
    public void listarTodos(ArrayList<String> nombres) throws Exception{
        
        try {
            String sql = "SELECT nombre,precio from producto;";
            consula(sql);
            
            while(resultado.next()){
                nombres.add(resultado.getString("nombre") +" - "+ (resultado.getString("precio") + "$"));
            }
            desconectarDB();
        } catch (Exception e) {
            e.getMessage();
            desconectarDB();
            throw e;
        }
    }
    
    
    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    
    public void listarPorOrden(ArrayList<String> orden){
        
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";
            consula(sql);
            
            while(resultado.next()){
                orden.add(resultado.getString("nombre")+ " - "+resultado.getString("precio")+"$");
            }
        } catch (Exception e) {
        }
    }
    
}
