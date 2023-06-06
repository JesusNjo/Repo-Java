/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
electrodomésticos, 2000 para lavadora y 5000 para televisor
 */
package Ejercicio_3;

import java.util.ArrayList;

/**
 *
 * @author JesusNjo
 */
public class ElectroMain_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico_2> electro = new ArrayList();

        Electrodomestico_2 lav1 = new Lavadora_2(16, 1000, "Rojo", "A");
        Electrodomestico_2 lav2 = new Lavadora_2(20, 800, "Negro", "F");

        //--------------------------
        Electrodomestico_2 tv1 = new Televisor_2(42, true, 800, "Blanco", "A");
        Electrodomestico_2 tv2 = new Televisor_2(60, false, 1000, "Negro", "E");

        electro.add(lav1);
        electro.add(lav2);
        electro.add(tv1);
        electro.add(tv2);

        double precioTotal = 0;

        for (Electrodomestico_2 objeto : electro) {
            precioTotal += objeto.getPrecio();
        }

        electro.forEach((x) -> System.out.println(x.toString() + "\n-------"));

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Precio total de los productos es : " + precioTotal);
    }

}
