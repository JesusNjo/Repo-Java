/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package JavaService;

import entidades.RectanguloClass;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class RectanguloService {
    
    
    
    public RectanguloClass crearRec(){
    RectanguloClass rectangulo = new RectanguloClass();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos del rectangulo");
        System.out.print("Base: ");
        rectangulo.setBase(input.nextInt());
        System.out.print("Altura: ");
        rectangulo.setAltura(input.nextInt());

        
        return rectangulo;
        
    }
    
    public int superficie(RectanguloClass s){
        s.setSuperficie(s.getBase() * s.getAltura());
        
        
        return s.getSuperficie();
    }
    
    public int perimetro(RectanguloClass p){
       p.setPerimetro(p.getBase() + p.getAltura() * 2);
        return p.getPerimetro();
       
       
        
    }
    
    public void dibujo(RectanguloClass r){
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if(i == 0 || i == r.getAltura()-1){
                    System.out.print("*");
                }else if(j == 0 || j == r.getBase()-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
