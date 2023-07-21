/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;


import Estancias.entidades.Estancias;
import java.util.ArrayList;

/**
 *
 * @author JesusNjo
 */
public class DAOSentencias extends DAO {

    // a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public void familiasMasTresH(ArrayList<String> familias) throws Exception {
        try {

            String sql = "SELECT nombre,num_hijos FROM familias where num_hijos >= 3 and edad_maxima<10;";
            consultarBD(sql);

            while (resultado.next()) {
                familias.add(resultado.getString("nombre") + " - " + resultado.getString("num_hijos"));
            }
            desconectarDB();

        } catch (Exception e) {
            e.printStackTrace();
            desconectarDB();
            throw e;
        }
    }

    // b) Buscar y listar las casas disponibles para el periodo comprendido entre el 
    //1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido
    public void casasDispFecha(ArrayList<String> fechas) throws Exception {

        try {

            String sql = "SELECT * FROM casas WHERE fecha_desde <= '2020-08-01' AND fecha_hasta >= '2020-08-31' AND pais = 'Reino Unido';";

            consultarBD(sql);

            while (resultado.next()) {
                fechas.add(resultado.getString("calle") + " - " + resultado.getString("id_casa"));
            }
        } catch (Exception e) {
            throw e;
        }
    }
    // c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.

    public void familiasHotmail(ArrayList<String> hotmail) throws Exception {

        try {
            String sql = "SELECT * from familias where email like '%hotmail%';";

            consultarBD(sql);

            while (resultado.next()) {
                hotmail.add(resultado.getString("nombre") + "- " + resultado.getString("email"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    // d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada 
    //y un número de días específico
    public void fechaYnumD(ArrayList<String> dispo, String fech, String dias) throws Exception {

        try {

            String sql = "SELECT * from casas where fecha_desde >= '" + fech + "' and tiempo_maximo >='" + dias + "';";
            consultarBD(sql);

            while (resultado.next()) {
                dispo.add(resultado.getString("calle") + " - " + resultado.getString("id_casa"));
            }
        } catch (Exception e) {
            throw e;
        }

    }

    //e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la 
    //descripción de la casa donde la realizaron.
    public void listaClientesAlojados(ArrayList<String> clientes) throws Exception {

        try {
            String sql = "SELECT * from clientes c join estancias e on c.id_cliente = e.id_cliente;";

            consultarBD(sql);

            while (resultado.next()) {
                clientes.add(resultado.getString("nombre"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /*f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y 
    ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a 
    la anterior*/
    public void listarInfoClienteYCasa(ArrayList<String> info) throws Exception {

        try {
            String sql = "SELECT c.nombre,c.pais,c.ciudad,ca.* from estancias e join clientes c on c.id_cliente = e.id_cliente join casas ca on e.id_casa = ca.id_casa;";
            consultarBD(sql);

            while (resultado.next()) {
                info.add("[" + resultado.getString("c.nombre") + " - " + resultado.getString("c.pais") + " - " + resultado.getString("ciudad") + "\nDatos casa -"
                        + resultado.getString("ca.id_casa") + " - " + resultado.getString("ca.calle") + " - " + resultado.getString("ca.ciudad") + "/" + resultado.getString("ca.pais") + "]\n");

            }
        } catch (Exception e) {
            throw e;
        }
    }

    /*g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el 
    precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios 
    actualizados*/
    public void preciosActualizados(ArrayList<String> precios) throws Exception {

        try {
            String sql = "SELECT precio_habitacion,(precio_habitacion*1.05)as precioActual from casas where pais = 'Reino Unido';";
            consultarBD(sql);

            while (resultado.next()) {
                precios.add(resultado.getString("precio_habitacion") + " - " + resultado.getString("precioActual"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    // h) Obtener el número de casas que existen para cada uno de los países diferentes.
    public void listaDeCasas(ArrayList<String> casasL) throws Exception {

        try {
            String sql = "SELECT pais,count(pais)as conteo from casas group by pais;";
            consultarBD(sql);

            while (resultado.next()) {
                casasL.add(resultado.getString("pais") + " - " + resultado.getString("conteo"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /*i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) 
        que están ‘limpias’.*/
    public void casaLimpiaRU(ArrayList<String> casaLimpia) throws Exception {

        try {
            String sql = "SELECT * from casas c join comentarios co on c.id_casa = co.id_casa where c.pais = 'Reino unido' and co.comentario like '%limpia%';";
            consultarBD(sql);

            while (resultado.next()) {
                casaLimpia.add(resultado.getString("co.comentario"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    // j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
    public void agregarEstancia(Estancias estancia) throws Exception {

        try {
            String sql = "INSERT INTO estancias (id_estancia, id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) VALUES ('" + estancia.getId_estancia() + "','" + estancia.getId_cliente() + "','" + estancia.getId_casa() + "','" + estancia.getNombre_huesped() + "','" + estancia.getFecha_desde() + "','" + estancia.getFecha_hasta() + "')";

            crud(sql);
        } catch (Exception e) {
            throw e;
        }

    }
}
