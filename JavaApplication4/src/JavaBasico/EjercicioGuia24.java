/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        String frase;
       
        Scanner leer = new Scanner(System.in);
        String volares = "aeiou";
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println(frase);
        int contadoA =0;
        int contadoE =0;
        int contadoI =0;
        int contadoO =0;
        int contadoU =0;
        int contadoC= 0;
        for(int i =0; i<frase.length();i++){
           
        String aux = frase.substring(i,i+1);

                    if("a".equals(aux)){
                    contadoA++; }
                    if("e".equals(aux)){
                    contadoE++;}
                   
                    if("i".equals(aux)){
                    contadoI++;}
                   
                    if("o".equals(aux)){
                    contadoO++;}
                    
                    if("u".equals(aux)){
                    contadoU++;}
                    else{
                        contadoC++;
                    }
              }
       
        if(contadoA ==0 && contadoE == 0 && contadoI == 0 && contadoO ==0 && contadoU ==0){
            System.out.println("No se detectaron vocales");
            System.out.println("Se detectaron "+contadoC+" consonantes");
        }else{
            System.out.println("Se detectaron "+contadoA+" a");
             System.out.println("Se detectaron "+contadoE+" e");
             System.out.println("Se detectaron "+contadoI+" i");
             System.out.println("Se detectaron "+contadoO+" o");
             System.out.println("Se detectaron "+contadoU+" u");
             System.out.println("Se detectaron "+contadoC+" consonantes");
            
        }
            
        }
        
    }
    

