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

/**
 *
 * @author JesusNjo
 */
public class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int cantidadP;
    private int numPisos;

    public EdificioDeOficinas(int numOficinas, int cantidadP, int numPisos, Integer ancho, Integer largo, Integer alto) {
        super(ancho, largo, alto);
        this.numOficinas = numOficinas;
        this.cantidadP = cantidadP;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas() {
        
    }

    
   /* public void calcularPersonas(){
        System.out.println("Ingrese la cantidad de oficinas");
        numOficinas = input.nextInt();
        System.out.println("Ingrese la cantidad de personas trabajando por cada oficina");
        cantidadP= input.nextInt();
        System.out.println("Indique la cantidad de pisos en el edificio");
        numPisos = input.nextInt();
    }*/
    public void cantPersonas(){
        
        int cantidadTotalPersonas = numOficinas * cantidadP * numPisos;
        
        System.out.println("La cantidad total de personas en el edificio son: "+cantidadTotalPersonas);
        System.out.println("La cantidad de personas por piso son: "+ cantidadTotalPersonas/numPisos);
    }
    @Override
    public double calcularSuperficie() {
        return ancho * alto;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    @Override
    public String toString() {
        return "Edificio de oficinas: [" + " Numero de oficinas: " + numOficinas + " CantidadP: " + cantidadP + " Numero de pisos: " + numPisos+"]";
    }
    
    
}

