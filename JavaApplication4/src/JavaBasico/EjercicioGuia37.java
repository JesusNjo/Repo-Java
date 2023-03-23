/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n = 1,contadorM=0,contadorMe=0,contadorP=0;
        String nombre = null, edad = null;
        String salir = "n";

       

        
        do{
            System.out.println("Indique el nombre de la persona " + (++contadorP));
            nombre = leer.next();
            System.out.println("Indique la edad de la persona " + (contadorP));
            edad= leer.next();
            
            int valor = Integer.parseInt(edad);
            
            
            if(valor >=18){
                System.out.print("Es mayor de edad esta ");
                System.out.println(indicarNombre(nombre,edad));
                contadorM++;
            }else{
                System.out.print("Es menor de edad esta ");
                System.out.println(indicarNombre(nombre,edad));
                contadorMe++;
            }
            System.out.println("Desea salir del sistema?");
            salir = leer.next();
        }while("n".equalsIgnoreCase(salir));
        
        
        System.out.println("Mayores de edad : "+contadorM);
        System.out.println("Menores de edad : "+contadorMe);
    }

    public static String indicarNombre(String nombre, String edad) {

        

        return "Persona: "+ nombre + " " + edad;
    }
}
