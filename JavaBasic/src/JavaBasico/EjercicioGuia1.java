/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia1 {

    
    public static void main(String[] args) {
        
        int num1,num2;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese el primer digito");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo digito");
        num2 = leer.nextInt();
        System.out.println(suma(num1,num2));
    }
    
    public static int suma(int n1,int n2){
        
        int resultado;

        resultado = n1 + n2;
        return resultado;
    }
}
