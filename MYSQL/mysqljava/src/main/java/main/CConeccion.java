/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;

/**
 *
 * @author JesusNjo
 */
public class CConeccion {
    
    Connection conectar = null;
    String usuario ="root";
    String contrasenia ="root";
    String bd ="dbjavamysql";
    String ip="localhost";
    String puerto="3307";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConec(){
        try {
            Class.forName("com.mysql.jdb.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
