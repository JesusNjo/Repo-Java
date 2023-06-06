/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author JesusNjo
 */
public class CrearFormas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Circulo circulo = new Circulo();
        circulo.crearObjeto();
        
        System.out.println("------------------------");
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearObjeto();
    }
    
}
