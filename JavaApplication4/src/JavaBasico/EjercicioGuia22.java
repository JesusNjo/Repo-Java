/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia22 {

    public static void main(String[] args) {
       
        int time = 0;
        int minutos = 0;
        int horas = 0;
        int dias = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos que desea calcular");
        time = leer.nextInt();
        while(time>0){
            if(time >= 1440){
                dias += 1;
                System.out.println();
                time -= 1440;
            }else if(time >= 60){
                horas += 1;
                time -= 60;
            }else{
                minutos += 1;
                time -= 1;
            }
        }
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        
    }
    
    
    
}
