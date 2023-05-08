/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;
import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class PracticeService {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public PracticeClass crearCliente(){
        PracticeClass cl = new PracticeClass();
        Set<PracticeClass> clientes = new HashSet();
        
        System.out.println("Ingrese la cantidad de clientes que desea agregar");
        int cantidad = input.nextInt();
        for(int i =0; i<cantidad;i++){
            System.out.println("Ingrese el nombre del cliente º"+(i+1));
            cl.setNombreCliente(input.next());
            
            cl.setCuentaCliente(000000000+i+1);
            System.out.println("El numero de cuenta de "+cl.getNombreCliente()+" es: "+cl.getCuentaCliente());
            
            System.out.println("Ingrese el saldo del cliente "+cl.getNombreCliente());
            cl.setSaldoCliente(input.nextInt());
            
            System.out.println("Cuenta registrada exitosamente.....");
            
            clientes.add(new PracticeClass(cl.getNombreCliente(),cl.getCuentaCliente(),cl.getSaldoCliente()));
        }
        System.out.println("Los clientes ingresados al banco son: ");
        System.out.println(clientes.size());
        for (PracticeClass cliente : clientes) {
            System.out.println(cliente);
        }
        
        return cl;
    }
    
}
