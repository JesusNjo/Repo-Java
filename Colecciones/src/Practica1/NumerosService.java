/*
Programa Java que lea una serie de valores numéricos enteros desde el teclado y 
los guarde en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca
el valor -99. Este valor no se guarda en el ArrayList. A continuación, el programa mostrará por pantalla el 
número de valores que se han leído, su suma y su media. Por último, se mostrarán todos los valores leídos, 
indicando cuántos de ellos son mayores que la media .
 */
package Practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class NumerosService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<NumerosClass> numeros() {
        NumerosClass n = new NumerosClass();
        ArrayList<NumerosClass> prac = new ArrayList();
        ArrayList<Integer> nums = new ArrayList();
        int cont = 1;
        int num = 0;
        int suma = 0;

        
        System.out.println("Para salir marque -99");
        do {

            
            
            

            System.out.println("Agregue el numero (" + (cont++) + ") de tu lista");
            num = input.nextInt();
            
            if(num != -99){
                
            nums.add(num);
            suma+=num;
            }
           
            

            prac.add(new NumerosClass(nums));
            n.setEntero(nums);
           
           
            
            
            
        } while (num != -99);
        
      
        
        
        
        
        System.out.println("Numeros registrados: "+n.getEntero());
        Collections.sort(n.getEntero());
        System.out.println("Numeros ordenados de menor a mayor: "+n.getEntero());
        Collections.sort(n.getEntero(),Comparator.reverseOrder());
        System.out.println("Numeros ordenados de mayor a menor: "+n.getEntero());
        System.out.print("Numeros guardados: "+n.getEntero().size());
        System.out.println();
        System.out.println("Suma de todos los numeros: "+suma);
        System.out.println("Media de todos los numeros: "+(double)suma/n.getEntero().size());

        return prac;
    }

}
