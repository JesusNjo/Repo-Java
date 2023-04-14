/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package EjercicioExtra;

/**
 *
 * @author JesusNjo
 */
public class FraccionClass {
    private int n1;
    private int n1D;
    private int n2;
    private int n2D;

    public FraccionClass() {
    }

    public FraccionClass(int n1, int n1D, int n2, int n2D) {
        this.n1 = n1;
        this.n1D = n1D;
        this.n2 = n2;
        this.n2D = n2D;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN1D() {
        return n1D;
    }

    public void setN1D(int n1D) {
        this.n1D = n1D;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN2D() {
        return n2D;
    }

    public void setN2D(int n2D) {
        this.n2D = n2D;
    }
    
    
    
    
}
