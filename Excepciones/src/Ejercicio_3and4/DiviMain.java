/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3and4;
import java.util.*;
/**
 *
 * @author JesusNjo
 */
public class DiviMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        DivisionNumero nums = new DivisionNumero();
        System.out.println("Indique un numero");
        String num1 = input.next();
        System.out.println("Indique el segundo num");
        String num2 = input.next();
        
        try {
            
        int n=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
            System.out.println(nums.dividir(n,n2));
        } catch (ArithmeticException e) {
            System.out.println("ERROR!");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }catch(NumberFormatException a){
            System.out.println(a.toString());
        }
        
        try {
            System.out.print("Ingresa un numero ");
            int n = input.nextInt();
        }  catch (InputMismatchException e) {
            System.out.println(e.toString());
        }
    }
    
}
