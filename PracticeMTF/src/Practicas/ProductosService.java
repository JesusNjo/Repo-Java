/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author JesusNjo
 */
public class ProductosService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public Productos almacenarComidaS() {
        Productos c = new Productos();
        
        System.out.println("Ingrese la cantidad de productos secos a inventariar");
        String[] strS = new String[input.nextInt()];
        
        System.out.println("Ingrese la cantidad de carnes a inventariar");
        String[] strC = new String[input.nextInt()];
        
        
        System.out.println("Ingrese los productos que desea guardar");
        Arrays.setAll(strS, i -> input.next());
        c.setComidaSeca(strS);
        System.out.println("Ingrese las carnes/pollos que desea guardar");

        Arrays.setAll(strC, i -> input.next());
        c.setCarnes(strC);
        
        System.out.println(Arrays.toString(c.getComidaSeca()));
        System.out.println(Arrays.toString(c.getCarnes()));
        return c;
    }
    
    public void calcularElPrecio(Productos p){
        double[] precioS = new double[p.getComidaSeca().length];
        
        double[] precioC = new double[p.getCarnes().length];
        
        for(int i = 0 ; i<p.getComidaSeca().length;i++){
            System.out.println("Ingrese el precio de: "+p.getComidaSeca()[i]);
            precioS[i] = input.nextDouble();
        }
        p.setComidaPrecios(precioS);
        
        
        for(int i = 0 ; i<p.getCarnes().length;i++){
            System.out.println("Ingrese el precio de: "+p.getCarnes()[i]);
            precioC[i] = input.nextDouble();  
        }
        p.setCarnePrecios(precioC);
        
        for(int i = 0 ; i<p.getComidaSeca().length;i++){
            System.out.println("El precio de: "+p.getComidaSeca()[i]+ " es: "+p.getComidaPrecios()[i]+"$");
        }
        
        
        for(int i = 0 ; i<p.getCarnes().length;i++){
            System.out.println("El precio de: "+p.getCarnes()[i] + " es: "+p.getCarnePrecios()[i]+"$");
        }
    }

}
