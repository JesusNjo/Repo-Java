/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * b) Lista los nombres y los precios de todos los productos de la tabla
 * producto.
 */
public class DAOProductivo extends DAO {

    public void listarTodosLosProductos(ArrayList<String> prodc) throws Exception {
        try {
            
            
            String sql = "SELECT DISTINCT nombre FROM producto";
            consulta(sql);

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

    public void listarTodos(ArrayList<String> nombres) throws Exception {

        try {
            String sql = "SELECT nombre,precio from producto;";
            consulta(sql);

            while (resultado.next()) {
                nombres.add(resultado.getString("nombre") + " - " + (resultado.getString("precio") + "$"));
            }
            desconectarDB();
        } catch (Exception e) {
            e.getMessage();
            desconectarDB();
            throw e;
        }
    }

    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    public void listarPorOrden(ArrayList<String> orden) throws Exception {

        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";
            consulta(sql);

            while (resultado.next()) {
                orden.add(resultado.getString("nombre") + " - " + resultado.getString("precio") + "$");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto
    public void listarPortatiles(ArrayList<String> portatil) throws Exception {

        try {
            String sql = "SELECT * FROM producto WHERE nombre like '%Portátil%';";

            consulta(sql);

            while (resultado.next()) {
                portatil.add(resultado.getString("nombre") + " - " + resultado.getString("precio") + "$");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    // e) Listar el nombre y el precio del producto más barato
    public String listarMasBarato() throws Exception {

        try {
            String sql = "SELECT nombre,min(precio)as precio FROM producto group by nombre order by precio asc limit 1;";
            consulta(sql);

            while (resultado.next()) {
                return resultado.getString("nombre") + " - " + resultado.getString("precio") + "$";
            }
        } catch (Exception e) {
            throw e;
        }

        return null;
    }

    // f) Ingresar un producto a la base de datos.
    public void ingresarProducto(Producto producto) throws Exception {

        try {
            if(producto == null){
                throw new Exception("No puede ingresar datos vacios");
            }
            
            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante)values('"
                    + producto.getCodigo() + "','" + producto.getNombre() + "','" + producto.getPrecio() + "','" + producto.getCodigo_fabricante() + "');";
            crud(sql);
        } catch (Exception e) {
            throw e;
        }

    }


    //g) Ingresar un fabricante a la base de datos
    public void agregarFabricante(Fabricante fabricante) throws Exception {

        try {
            
            if(fabricante == null){
                throw new Exception("No puede ingresar datos vacios");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre) values ('" + fabricante.getCodigo() + "','" + fabricante.getNombre() + "');";
            crud(sql);
        } catch (Exception e) {
            throw e;
        }

    }
    // h) Editar un producto con datos a elección.
    public void modificarProductoCF(String codigoF, String codigo) throws Exception {

        try {
            
            if(codigoF == null || codigo==null){
                throw new Exception("No puede ingresar datos vacios");
            }
            
            String sql = "UPDATE producto SET codigo_fabricante = '" + codigoF + "'where codigo = '" + codigo + "';";
            crud(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    // eliminar fabricante
    
    public void eliminarF(Fabricante fabricante) throws Exception{
        
        try {
            if(fabricante == null){
                throw new Exception("No puede ingresar datos vacios");
            }
            String sql = "DELETE FROM fabricante WHERE codigo = '"+fabricante.getCodigo()+"';";

            crud(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
