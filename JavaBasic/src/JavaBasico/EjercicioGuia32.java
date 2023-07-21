/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        int contador=0;
        System.out.println("Ingrese su numero");
        n1 = leer.nextInt();
        System.out.println("--------------");
        
        
        for(int i = 0; i < n1;i++){
            
            System.out.println(n1);
            contador++;
            n1 = (n1/10);
            i--;
        }

        System.out.println("Su numero tiene "+contador+" digitos");

    }
    
}
