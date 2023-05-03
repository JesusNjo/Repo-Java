/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Iterator;
import java.util.List;


/**
 *
 * @author JesusNjo
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> array = new java.util.ArrayList();

        String palabra = "Amigo";
        String palabr2 = "Familia";
        String palabr3 = "Conocido";

        array.add(palabra);
        array.add(palabr2);
        array.add(palabr3);

        array.forEach((x) -> System.out.println(x));

        System.out.println("-----");
        Iterator<String> it = array.iterator();

        while (it.hasNext()) {
            String x = it.next();

            if ("Amigo".equals(x)) {
                it.remove();
            }

        }
        array.forEach((x) -> System.out.println(x));
        System.out.println("----");

        System.out.println(array.size());
        for (int i = 0; i < array.size(); i++) {
            String x = array.get(i);
            if (i < 2) {

                array.add("x");
            }

            System.out.println(x);
            System.out.println(array.size());

        }

        List<String> arrayList = new java.util.ArrayList();

        arrayList.add("Hola");

        int tamanio = arrayList.size();
        for (int i = 0; i < tamanio; i++) {
            String x = arrayList.get(i);
            arrayList.add("Holax");
            System.out.println(x);
           
        }
       arrayList.forEach((l)->System.out.println(l));
    }
    
}

