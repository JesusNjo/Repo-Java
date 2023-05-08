/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Ejercicio_5;
import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class PaisesClass {
    
    private String paises;
    private Set<String> paisR = new HashSet();

    public PaisesClass(String paises) {
        this.paises = paises;
    }

    public PaisesClass() {
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    public Set<String> getPaisR() {
        return paisR;
    }

    public void setPaisR(Set<String> paisR) {
        this.paisR = paisR;
    }
    
    
    
    
    @Override
    public String toString() {
        return "\nPais: " +paises;
    }
    
}
