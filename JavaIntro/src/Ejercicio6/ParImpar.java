/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicio6;

/**
 *
 * @author JesusNjo
 */
public class ParImpar {
    
    
    public boolean numParImpar(int num){
        
        if(num % 2 ==0){
            System.out.println("Es par");
            return true;
        }else{
            System.out.println("Es impar");
            return false;
        }
    }
    
}
