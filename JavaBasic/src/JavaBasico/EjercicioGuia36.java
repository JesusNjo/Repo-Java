/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int op = 0;
      int n1 = 0;
      int n2 = 0;
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Opciones: 1: Sumar, 2: Restar, 3:Multiplicar, 4:Dividir");
        op = leer.nextInt();
      switch(op){
          case 1: System.out.println("Ingrese el primer digito");
                  n1 = leer.nextInt();
                  System.out.println("Ingrese el segungo digito");
                  n2 = leer.nextInt();
                  System.out.println(Suma(n1,n2));
                  break;
          case 2: System.out.println("Ingrese el primer digito");
                  n1 = leer.nextInt();
                  System.out.println("Ingrese el segungo digito");
                  n2 = leer.nextInt();
                  System.out.println(Resta(n1,n2));
                  break;
          case 3: System.out.println("Ingrese el primer digito");
                  n1 = leer.nextInt();
                  System.out.println("Ingrese el segungo digito");
                  n2 = leer.nextInt();
                  System.out.println(Multiplicacion(n1,n2));
                  break;
          case 4: System.out.println("Ingrese el primer digito");
                  n1 = leer.nextInt();
                  System.out.println("Ingrese el segungo digito");
                  n2 = leer.nextInt();
                  System.out.println(Division(n1,n2));
                  break;
          
      }
        
        
      
    }
    
    public static int Suma(int n1,int n2){
 
        return n1 + n2;
    }
    public static int Resta(int n1,int n2){

        return n1 - n2;
    }
    public static int Multiplicacion(int n1,int n2){

        return n1 * n2;
    }
    public static int Division(int n1,int n2){
        return n1 /n2;
    }
}
