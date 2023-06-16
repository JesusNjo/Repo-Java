/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

/**
 *
 * @author JesusNjo
 */
public class Prueba {

    public void metodoA() {
        System.out.println("sentencia_a1");
        System.out.println("sentencia_a2");
        try {
            System.out.println("sentencia_a3");
            System.out.println("sentencia_a4");
            throw new MioException("Ocurrio un error");
        } catch (MioException e) {
            System.out.println(e.toString());
            System.out.println("sentencia_a6");
        }
        System.out.println("sentencia_a5");
    }
}
