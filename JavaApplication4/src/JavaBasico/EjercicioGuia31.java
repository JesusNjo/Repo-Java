/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1;
        int cierre=0;
        System.out.println("Ingrese el numero para acertar la multiplicación");
        n1 = leer.nextInt();
        do{
        int nr1 = (int) (Math.random()+1);
        int nr2 = (int) (Math.random()*10);
        
           
        int resultado = nr1 * nr2;
       
        if(resultado == n1){
            System.out.println("El numero "+resultado+" es igual al numero "+n1);
            cierre++;
        }else{
            System.out.println("No coincidieron los numeros, ingrese nuevamente su valor");
            n1 = leer.nextInt();
        }
           
        }while(cierre == 0);
        
    }
    
}
