/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.tor.
 */
package JavaService;

import entidades.VectoresClass;
import java.util.Arrays;

/**
 *
 * @author JesusNjo
 */
public class VectoresService {

    public VectoresClass crearVector() {
        VectoresClass arr = new VectoresClass();

        return arr;
    }

    public void llenarArreglo(VectoresClass a) {

//        Arrays.setAll(a.getVectorGrande(), (elemento) -> (Math.random() * 51));
// 
//        for (double elemento : a.getVectorGrande()) {
//            System.out.println(elemento);
//        }
        double[] arregloA = new double[50];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 51;
            a.setVectorGrande(arregloA);
            System.out.println(a.getVectorGrande()[i]);
        }
    }

    public void ordenarArreglo(VectoresClass a) {
//        Arrays.sort(arreglos.getVectorGrande());
//
//        for (double elemento : arreglos.getVectorGrande()) {
//            System.out.println(elemento);
//        }
        Arrays.sort(a.getVectorGrande());
        for (int i = 0; i < a.getVectorGrande().length; i++) {
            System.out.println(a.getVectorGrande()[i]);
        }
    }

    public void llenarArregloChicoConGrande(VectoresClass arreglos) {
//        Arrays.setAll(arreglos.getVectorPequenio(), (elemento) -> (elemento < 10) ? arreglos.getVectorGrande()[elemento] : 0.5);
//        for (double elemento : arreglos.getVectorPequenio()) {
//            System.out.println(elemento);
//        }
        double[] arregloB = new double[20];
        for (int i = 0; i < arregloB.length; i++) {

            arreglos.setVectorPequenio(arreglos.getVectorGrande());
            if (i >= 10) {
                arregloB[i] = 0.5;
                arreglos.setVectorPequenio(arregloB);
            }

            System.out.println(arreglos.getVectorPequenio()[i]);
        }

    }
}
