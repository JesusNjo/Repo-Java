/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package Ejercicio_6;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class EdifMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Edificio> edif = new ArrayList();
        int contC = 0;
        int contA = 0;

        Edificio polideportivo = new Polideportivo("Manaure", "Abierto", 500, 300, 50);
        Edificio polideportivo2 = new Polideportivo("Miramar", "Cerrado", 800, 400, 40);

        Edificio oficinasEdif = new EdificioDeOficinas(8, 12, 4, 40, 10, 120);
        Edificio oficinasEdif2 = new EdificioDeOficinas(4, 6, 2, 20, 12, 100);

        edif.add(oficinasEdif);
        edif.add(oficinasEdif2);
        //--------------
        edif.add(polideportivo);
        edif.add(polideportivo2);

        System.out.println("Superficies");
        for (Edificio edificio : edif) {
            System.out.println(edificio.calcularSuperficie());

        }
        System.out.println("\n\nVolúmen");
        for (Edificio edificio : edif) {
            System.out.println(edificio.calcularVolumen());

        }

        System.out.println("---------------------------------");
        for (Edificio edificio : edif) {
            System.out.println(edificio.toString());
            if (edificio instanceof EdificioDeOficinas) {

                ((EdificioDeOficinas) edificio).cantPersonas();

            }
            if(edificio instanceof Polideportivo){
                if(((Polideportivo) edificio).getTipo().equalsIgnoreCase("Cerrado")){
                    contC++;
                }
                if(((Polideportivo) edificio).getTipo().equalsIgnoreCase("Abierto")){
                    contA++;
                }
            }
        }

        System.out.println("Cantidad de polideportivos CERRADOS son: "+contC);
        System.out.println("Cantidad de polideportivos ABIERTOS son: "+contA);
    }

}
