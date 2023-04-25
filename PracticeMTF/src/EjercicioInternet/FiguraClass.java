/*
Jerarquía de figuras geométricas: En este ejercicio, puedes crear una clase abstracta Figura 
que tenga métodos abstractos para calcular el área y el perímetro.
Luego, puedes crear clases concretas como 
Circulo, Rectangulo y Triangulo que extiendan la clase Figura y proporcionen implementaciones para estos métodos. 
Por ejemplo, 
la clase Circulo podría tener un atributo radio y sobrescribir el método calcularArea 
para devolver el valor de Math.PI * radio * radio
 */
package EjercicioInternet;

/**
 *
 * @author JesusNjo
 */
public class FiguraClass {
    
    private double area;
    private double perimetro;
    private double radio;

    public FiguraClass() {
    }

    public FiguraClass(double area,double perimetro,double radio){
        this.area= area;
        this.perimetro=perimetro;
        this.radio = radio;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    
}
