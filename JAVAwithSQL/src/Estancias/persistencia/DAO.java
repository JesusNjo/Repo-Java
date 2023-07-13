/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JesusNjo
 */
public abstract class DAO {

    Connection conexion = null;
    ResultSet resultado = null;
    Statement sentencia = null;

    final String USER = "root";
    final String PASS = "root";
    final String DB = "estancias_exterior";
    final String Driver = "com.mysql.jdbc.Driver";

    public void conectarBD() throws ClassNotFoundException, SQLException {

        try {

            Class.forName(Driver);
            String urlDB = "jdbc:mysql://localhost:3306/" + DB + "?useSSL=false";
            conexion = DriverManager.getConnection(urlDB, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

    }

    public void desconectarDB() throws SQLException {

        try {
            if (conexion != null) {
                conexion.close();
            }
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    public void crud(String sql) throws Exception {

        try {

            conectarBD();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDB();
        }
    }

    public void consultarBD(String sql) throws Exception {

        try {

            conectarBD();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
    }

}
