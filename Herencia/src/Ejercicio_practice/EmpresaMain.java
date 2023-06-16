/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_practice;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class EmpresaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       /* Empleado ing = new Ingeniero();
        Empleado vend = new Vendedor();
        Empleado gerent = new Gerente();
        
        ing.calcularSalario();
        System.out.println("----------------");
        vend.calcularSalario();
        System.out.println("-----------------");
        gerent.calcularSalario();*/
       
       EmpresaService x = new EmpresaService();
       x.procedimientos();
        
    }

}
