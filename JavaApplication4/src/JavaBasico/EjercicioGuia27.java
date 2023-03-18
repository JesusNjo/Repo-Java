/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int altos;
        
        int bajos = 0;
        int aux = 0;
        int aux2 = 0;
        int aux3 = 0;
        int persona = 0;
        int personaB = 0;
        int cantidad = 0;
        
        
        
        System.out.println("Ingrese la cantidad de personas");
        cantidad = leer.nextInt();
        
        
        
        for(int i=0; i<cantidad;i++){
            persona++;
            System.out.println("Ingrese las alturas");
            altos = leer.nextInt();
            
             if(altos>=1.6){
            aux+= altos;
            
            
            }else{
              bajos = leer.nextInt();
              aux2+= bajos;
              personaB++;

            
        }
             aux3= aux + aux3;
        }
        
        
        
        
                System.out.println("La cantidad de personas de totales es: "+cantidad+" y el promedio total es" + (cantidad/aux3)*cantidad);
                System.out.println("La cantidad de personas de 1.60 es: "+personaB+" y el promedio total es " + (personaB/aux2)*personaB);
  
        
        
        
    }
}



// Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese la altura de la persona: ");
//        int cont = 0;
//        int contP = 0;
//        double peque = 0;
//        double promedioTotal = 0;
//        double sumaAltura = 0;
//        double alto = 1;
//        while (alto != 0) {
//            alto = leer.nextDouble();
//            cont++;
//            sumaAltura = sumaAltura + alto;
//            if (alto < 1.60) {
//                peque = peque + alto;
//                contP++;
//            }
//
//            promedioTotal = sumaAltura / cont;
//
//            System.out.println("El promedio de altura de las " + cont + "personas cargadas es: " + promedioTotal);
//            System.out.println("Y el promedio de alturas de personas que miden menos de 1.60 es: " + (peque / contP));
//        }