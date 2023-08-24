/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial.
 */
package Ejerciciox10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ValorP {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public void limite(){
        
        System.out.println("Ingrese el numero hasta donde desea limitar");
        int limite = input.nextInt();
        int result =0;
        
        for (int i = 0; i <limite; i++) {
            System.out.println("Ingrese los numeros para superar el limite: "+limite);
            int sum = input.nextInt();
            result += sum;
            if(result >= limite){
                System.out.println("Limite alcanzado");
                System.out.println("Cantidad actual: "+result+"/ Cantidad limite: "+limite);
                break;
            }
        }
        
    }
    
    public void limiteW(){
        
        int result = 0;
        int sum = 0;
        System.out.println("Ingrese el limite que desea alcanzar");
        int limite = input.nextInt();
        
        
        while(limite>result){
            System.out.println("Ingrese la cantidad para alcanzar el limite: "+limite);
            sum = input.nextInt();
            result+=sum;
            
        }
        if(result>=limite){
            System.out.println("Limite alcanzado");
            System.out.println("Cantidad actual: "+result+"/ Cantidad limite: "+limite);
        }
    }
    
}
