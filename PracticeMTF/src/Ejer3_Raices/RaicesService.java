/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c

 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.

 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.

 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.


 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Ejer3_Raices;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class RaicesService {

    public RaicesClass datos() {
        RaicesClass r = new RaicesClass();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el valor de a: ");
        r.setA(input.nextDouble());
        System.out.print("Ingrese el valor de b: ");
        r.setB(input.nextDouble());
        System.out.print("Ingrese el valor de c: ");
        r.setC(input.nextDouble());
        
        
        r.setDiscriminante(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());    //(b^2)-4*a*c
        return r;
    }
    public void obtenerRaices(RaicesClass o) {
        double x1 = (-o.getB() + Math.sqrt(o.getDiscriminante())) / (2 * o.getA());
        double x2 = (-o.getB() - Math.sqrt(o.getDiscriminante())) / (2 * o.getA());
        
        System.out.print("Solucion x1: ");
        System.out.println(x1);
        System.out.print("Solucion x2: ");
        System.out.println(x2);
    }

    public void obtenerRaiz(RaicesClass r) {

        double x = (-r.getB()) / (2 * r.getA());
        System.out.println("Unica solucion");
        System.out.println(x);
    }

    

    public boolean tieneRaices() {
        RaicesClass d = new RaicesClass();
        return d.getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        RaicesClass d = new RaicesClass();
        return d.getDiscriminante() == 0;

    }

    public void calcular(RaicesClass v) {

        if (tieneRaices()) {
            obtenerRaices(v);
        } else if (tieneRaiz()) {
            obtenerRaiz(v);
        } else {
            System.out.println("No tiene raiz/s");
        }

    }
}
