/*
Escribe un programa en Java que cuente la frecuencia de cada palabra en un texto dado. 
Para ello, utiliza un Map donde las claves son las palabras y los valores son la cantidad de veces 
que aparece cada palabra. Al final, imprime cada palabra junto con su frecuencia.
 */
package Ejercicios_Prueba;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class PruebaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void contPalabras() {
        System.out.println("Indique el texto que desea contar las palabras");
        String palabra = input.next();
        String[] text = palabra.split(" ");
        Map<String,Integer> mapa = new HashMap();
        
        
        for (String string : text) {
            if(mapa.containsKey(string)){
                mapa.put(string, mapa.get(string)+1);
            }else{
                mapa.put(string, 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            
            System.out.println(entry.getKey() + ": "+entry.getValue());
            
        }
    }
}

