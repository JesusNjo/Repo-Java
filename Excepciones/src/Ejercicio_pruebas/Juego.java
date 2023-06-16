/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_pruebas;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int numAle = (int) ((Math.random() * 500) + 1);
        int num = 0;
        do {
            try {
                System.out.println("Indique el numero");
                num = input.nextInt();
                System.out.println(numAle);
               
                
                if(num<numAle){
                    throw new Menor("Numero menor");
                }else if(num>numAle){
                    throw new Mayor("Numero mayor");
                }else{
                    throw new Igual("Adivinaste");
                }

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }catch(Menor|Mayor|Igual x){
                System.out.println(x.getMessage());
            }

        } while (num != numAle);
    }

}
