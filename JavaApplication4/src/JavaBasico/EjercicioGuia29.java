/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
y la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n1;
        int cantidad=0;
        int cont= 0;
        int pares = 0;
        int impares = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea leer");
        cantidad=leer.nextInt();
        
        
        for(int i=0; i<cantidad;i++){
            System.out.println("Ingrese los numeros");
            n1 = leer.nextInt();
            if(n1<0){
                System.out.println("No puede ingresar numeros negativos");
                break;
            }
            
            cont++;
            if(n1%2==0){
                pares++;
            }else{
                impares++;
            }
            if(n1%5==0){
                System.out.println("Ingresó un numero que es multiplo de 5");
                System.out.println("La cantidad de numeros ingresados son: "+cont);
                System.out.println("Se detectaron "+pares+" numeros pares");
                System.out.println("Se detectaron "+impares+" numeros impares");
                break;
            }
        }
        
    }
    
}
