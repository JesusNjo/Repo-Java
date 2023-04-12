/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Herencia.Herencia2Class;

/**
 *
 * @author JesusNjo
 */
public class HerenciaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Herencia2Class estudiante = new Herencia2Class (123,15.6f,"Francisco","Naranjo",29);
        
        estudiante.mostrarDatos();
    }
    
}
