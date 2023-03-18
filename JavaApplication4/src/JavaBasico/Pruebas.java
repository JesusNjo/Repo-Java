/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     
        Scanner leer = new Scanner(System.in);
       
       String frase = null;
       
       int n1,n2 = 0;
       
       
       int op=0;
        System.out.println("Ingrese la operación que desea realizar");
        
        
        do{
         System.out.println("1: SUMA, 2: RESTA, 3: MULTIPLICACION, 4: DIVISION, 5: SALIR");
        op = leer.nextInt();
        switch(op){
            
            case 1: System.out.println("Ingrese el primer valor");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println("Su resultado es: "+Sumar(n1,n2));
            
            break; 
            
            case 2: System.out.println("Ingrese el primer valor");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println("Su resultado es: "+Restar(n1,n2));
            
           
            break; 
            
            case 3: System.out.println("Ingrese el primer valor");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println("Su resultado es: "+Multiplicar(n1,n2));
            
            break; 
            
            case 4: System.out.println("Ingrese el primer valor");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor");
            n2 = leer.nextInt();
            System.out.println("Su resultado es: "+Dividir(n1,n2));
           
            break; 
            
            case 5: 
                System.out.println("¿Desea salir del menú? S/N");
                frase = leer.next();
                if("s".equalsIgnoreCase(frase)){
                    System.out.println("Salio del menú");
                    op = 0;
                }
               
                break;
                
                default: System.out.println("Operacion incorrecta");break;
                
                 }}while(op != 0 || "n".equalsIgnoreCase(frase));

        
        
        }
    
    
    public static int Sumar(int n1,int n2){
        
        int resultado = n1 + n2;
        
        return resultado;
    }
    public static int Multiplicar(int n1,int n2){
        
        int resultado = n1 * n2;
        
        return resultado;
    }
    public static int Restar(int n1,int n2){
        
        int resultado = n1 - n2;
        
        return resultado;
    }
    public static int Dividir(int n1,int n2){
        
        int resultado = n1 / n2;
        
        return resultado;
    }

    }


