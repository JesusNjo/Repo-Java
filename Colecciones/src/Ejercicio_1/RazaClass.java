/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Ejercicio_1;



/**
 *
 * @author JesusNjo
 */
public class RazaClass {
   String raza;

    public RazaClass(String raza) {
        this.raza = raza;
    }

    public RazaClass() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
   
   
}
