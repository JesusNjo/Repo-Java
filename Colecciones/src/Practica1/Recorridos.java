/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class Recorridos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> nombres = new ArrayList();

        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Maria");
        System.out.println("-------ForEach ()----------\n");
        
            for (String nombre : nombres) {
                System.out.println(nombre);
            }
            System.out.println("-------For----------\n");

            for (int i = 0; i < nombres.size(); i++) {
                System.out.println(nombres.get(i));
            }
            System.out.println("-------.forEach----------\n");

            nombres.forEach((x) -> System.out.println(x));

            //Iterator
            System.out.println("-------Iterador----------\n");
                    Iterator<String> it = nombres.iterator();

            while (it.hasNext()) {
                String aux = it.next();
                System.out.println(aux);
                if(aux.equals("Maria")){
                    it.remove();
                }
            }

            //Maneras de recorrer y eliminar
            System.out.println("-----REMOVE-----");
            for (int i = 0; i < nombres.size(); i++) {

                String m = nombres.get(i);

                if (m.equals("Pedro")) {
                    nombres.remove(m);
                }
                System.out.println(nombres.get(i));
            }

            while (it.hasNext()) {
                String aux = it.next();
                System.out.println(aux);
                if(aux.equals("Maria")){
                    it.remove();
                }
            }

        

    }

}
