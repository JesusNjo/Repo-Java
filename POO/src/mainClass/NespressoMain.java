/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package mainClass;

import JavaService.NespressoService;
import entidades.NespressoClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class NespressoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NespressoService cof = new NespressoService();
        NespressoClass c1 = cof.llenarCafetera();

        int op;

        do {
            System.out.println("Ingrese la operacion que desea realizar");
            System.out.println("1: Servir la taza");
            System.out.println("2: Vaciar la cafetera");
            System.out.println("3: Agregar cafe");

            System.out.println("6: Salir");
            op = input.nextInt();
            switch (op) {

                case 1:
                    cof.servirTaza(c1);
                    break;
                case 2:
                    cof.vaciarCafetera(c1);
                    break;
                case 3:
                    cof.agregarCafe(c1);
                    break;

                case 4:
                    System.out.println("Ha salido del menu");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 4);
    }

}
