/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Ejercicio_4;

/**
 *
 * @author JesusNjo
 */
public class Rectangulo implements calculoFormas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public void crearObjeto(){
        System.out.print("Ingrese la base: ");
        base = input.nextDouble();
        System.out.print("Indique la altura: ");
        altura = input.nextDouble();
        
        System.out.println("El area es: "+calcularArea());
        System.out.println("El perimetro es: "+calcularPerimetro());
       
    }
    @Override
    public double calcularArea() {
        

        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base+altura)*2;
    }

}
