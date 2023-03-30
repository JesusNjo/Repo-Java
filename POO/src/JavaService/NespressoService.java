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
package JavaService;

import entidades.NespressoClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class NespressoService {

    Scanner input = new Scanner(System.in);


    public NespressoClass llenarCafetera() {
    NespressoClass cafe = new NespressoClass();

        System.out.println("¿Cual es la capacidad maxima de la cafetera?");
        cafe.setCapacidadMaxima(input.nextInt());
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        return cafe;
    }

    public int servirTaza(NespressoClass c) {
        if(c.getCantidadActual() == 0){
            System.out.println("Lo sentimos no hay cafe disponible en este momento.");
        }else{
            
        System.out.println("Ingrese el tamaño de su taza (VACIA)");
        int taza = input.nextInt();
        
        
        if (c.getCantidadActual() == taza) {
            System.out.println("La cafetera quedo vacia y la taza fue llenada con "+c.getCantidadActual());
            c.setCantidadActual(0);
        } else if (c.getCantidadActual() < taza) {

            System.out.println("El cafe no es suficiente, pero se llena con lo que tiene disponible");
            System.out.println("La taza se llenó con: " + c.getCantidadActual());
            c.setCantidadActual(0);
        } else {
            c.setCantidadActual(c.getCantidadActual() - taza);
            System.out.println("Se lleno la taza y quedo disponible: "+c.getCantidadActual());
        }

    }
        return c.getCantidadActual();
            }

    public int vaciarCafetera(NespressoClass c){
        
        c.setCantidadActual(0);
        
        return c.getCantidadActual();
    }
    
    public int agregarCafe(NespressoClass v){
        
        System.out.println("Cuanto desea agregar de cafe?");
        int cap = input.nextInt();
        
        if((cap+v.getCantidadActual()) <= v.getCapacidadMaxima()){
            
            v.setCantidadActual(cap+ v.getCantidadActual());
            System.out.println("La cafetera tiene actualmente la cantidad de: "+ v.getCantidadActual());
        
        }else{
            System.out.println("Disculpe, la cafetera no tiene espacio para agregar esa cantidad");
        }
        
        return v.getCantidadActual();
    }
}
