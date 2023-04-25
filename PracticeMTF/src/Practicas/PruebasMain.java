/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
Crea sus métodos get, set y toString. Tendrá dos métodos especiales1.
 */
package Practicas;

/**
 *
 * @author JesusNjo
 */
public class PruebasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PruebaClass cliente = new PruebaClass().crearCuenta();
        System.out.println(cliente.toString());

    }

}
