/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CircuferenciaClass {
    
    private double radio;

    public CircuferenciaClass() {
    }

    public CircuferenciaClass(double radio) {
        this.radio = radio;
    }

    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public double crearCircunferencia(){
        
        return this.radio;
    }
    
    public double area(){
        
        double Area = Math.PI * (this.radio*this.radio);
        return Area;
    }
    
    public double perimetro (){
        
        double Perimetro = 2 * Math.PI * this.radio;
        return Perimetro;
    }

   
    
}
