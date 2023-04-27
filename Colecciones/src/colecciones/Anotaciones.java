package colecciones;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JesusNjo
 */
public class Anotaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] newArray = new String[5];
        
        for (int i = 0; i <newArray.length; i++) {
            newArray[i] = "Chiquito" + (i+1);
        }
        
        for(String string:newArray){
            System.out.println(string);
        }
        ArrayList<String> nombre = new ArrayList();
        
        
        System.out.println(Integer.MAX_VALUE); // Para ver el valor maximo del Integer
        
        nombre.add("Chiquito"); // Agregar un elemento
        System.out.println(nombre.size()); // Para mostrar las dimensiones del array
        
        nombre.remove("Chiquito"); // Para eliminar un elemento
        System.out.println();
        
    }
    
}
