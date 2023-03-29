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
package JavaService;

import entidades.CircuferenciaClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class CircuferenciaService {
    
    Scanner input = new Scanner(System.in);
     
    
    public CircuferenciaClass crearCircunferencia(){
    CircuferenciaClass radio = new CircuferenciaClass();
        System.out.println("Ingrese el tamaño de su radio");
        radio.setRadio(input.nextDouble());

        return radio;

    
    }
    public double area(CircuferenciaClass a){
        
        a.setArea(Math.PI * (a.getRadio() * a.getRadio()));
        
        return a.getArea();
 
    }
    public double perimetro(CircuferenciaClass p){
        p.setPerimetro(2 * Math.PI * p.getRadio());
        
        return p.getPerimetro();   
    }
   }
    
    
    

