/*
Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 

24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia30 {


    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int dividendo,divisor,contador = 0;
    int restar = 0;
    
    System.out.println ("Ingrese su dividendo");
    dividendo = leer.nextInt();
    System.out.println("Ingrese el divisor");
    divisor = leer.nextInt();
    
    int aux1 = dividendo;
    int aux2 = divisor;
  
    for(int i = 0; i<=dividendo+contador-1;i++){
        
        ++contador;
        restar = dividendo - divisor;
        System.out.println(dividendo +"-"+divisor+"="+restar);
        dividendo= dividendo- divisor;
        
       
    }
        System.out.println("El resultado de dividir "+aux1+"/"+aux2+"="+ (contador));
    
    }
    
}
