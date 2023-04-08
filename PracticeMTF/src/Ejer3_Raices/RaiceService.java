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

/**
 *
 * @author JesusNjo
 */
public class RaiceService {

    public RaicesClass asignarValores() {
        RaicesClass num = new RaicesClass();
        num.setA(Math.random() * 3);
        num.setB(Math.random() * 3);
        num.setC(Math.random() * 3);

        return num;
    }

    public double getDiscriminante(RaicesClass D) {

        double dis = (Math.pow(D.getB(), 2) - 4 * D.getA() * D.getC());

        return dis;
    }

    public boolean tieneRaices(RaicesClass x) {

        boolean var = getDiscriminante(x) >= 0;
        return var;
    }

    public boolean tieneRaiz(RaicesClass r) {

        boolean var = getDiscriminante(r) == 0;

        return var;
    }

    public void obtenRaices(RaicesClass b) {
        if (tieneRaiz(b)) {
            double op1 = (-b.getB() + Math.sqrt(getDiscriminante(b))) / (2 * b.getA());
            double op2 = (-b.getB() - Math.sqrt(getDiscriminante(b))) / (2 * b.getA());
            System.out.println("Las raices son : " + op1 + " | " + "op2");
        } else {
            System.out.println("No hay soluciones");
        }

    }

    public void obtenerRaiz(RaicesClass r) {
        if (tieneRaiz(r)) {
            double op = -r.getB() / (2 * r.getA());
            System.out.println("La raíz es " + op);
        } else {
            System.out.println("No hay solución real");
        }
    }

    public void calcular(RaicesClass c) {
        if (tieneRaices(c)) {
            obtenRaices(c);

        } else if (tieneRaiz(c)) {
            obtenerRaiz(c);
        } else {
            System.out.println("No hay solución real");
        }
    }

}
