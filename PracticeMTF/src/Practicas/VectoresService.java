/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Practicas;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author JesusNjo
 */
public class VectoresService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    double[] vectorGrande = new double[50];
    double[] vectorPeque = new double[20];
    
    public VectoresClass crearVector() {
        VectoresClass vec = new VectoresClass();

        Arrays.setAll(vectorGrande, i -> Math.random() * 51);
        vec.setVectorGrande(vectorGrande);

        return vec;

    }

    public void ordenarVector(VectoresClass x) {
        

        for (double elemento : x.getVectorGrande()) {
            System.out.println("[" + elemento + "]");
        }
        System.out.println("------------------------------");
        Arrays.sort(x.getVectorGrande());
        
        for (double elemento : x.getVectorGrande()) {
            System.out.println("[" + elemento + "]");
        }

        for (int i = 0; i < vectorPeque.length; i++) {
            vectorPeque[i] = vectorGrande[i];
            if (i > 9) {
                vectorPeque[i] = 0.5;
                
            }
            x.setVectorPeque(vectorPeque);
            
        }
        System.out.println("------------------------------");
        x.setVectorPeque(vectorPeque);

        
        for (double elemento : x.getVectorPeque()) {
            System.out.println("[" + elemento + "]");
        }
    }
}
