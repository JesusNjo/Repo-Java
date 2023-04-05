/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainClass;

import JavaService.MatematicaService;
import entidades.MatematicaClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatematicaService n = new MatematicaService();
        MatematicaClass n1 = new MatematicaClass();
        
        n1.setNum1 (Math.random()*10);
        n1.setNum2(Math.random()*10);
        
        System.out.println("Devolver los valores");
        System.out.println(n.devolverMayor(n1));
        System.out.println();
        System.out.println();
        System.out.println("Calcular la potencia de los valores");
        System.out.println(n.calcularPotencia(n1));
        System.out.println();
        System.out.println();
        System.out.println("Devolver la raiz del bajo mas bajo");
        System.out.println(n.calculaRaiz(n1));
    }
    
}
