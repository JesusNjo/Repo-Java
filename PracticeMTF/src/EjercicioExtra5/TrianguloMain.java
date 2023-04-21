/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package EjercicioExtra5;

/**
 *
 * @author JesusNjo
 */
public class TrianguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrianguloClass[] triangulos = new TrianguloClass[]{
            
            new TrianguloClass(Math.round(Math.random()*100), Math.round(Math.random()*100), Math.round(Math.random()*100)),
            new TrianguloClass(Math.round(Math.random()*100), Math.round(Math.random()*100), Math.round(Math.random()*100)),
           
        };
        
        TrianguloClass trianguloMayorArea = new TrianguloService().mayorArea(triangulos);
        TrianguloService area = new TrianguloService();
        System.out.println("Triángulo con mayor área:");
        System.out.println("Base: " + trianguloMayorArea.getBase());
        System.out.println("Altura: " + trianguloMayorArea.getAltura());
        System.out.println("Lado: " + trianguloMayorArea.getLado());
        System.out.println("Area " + area.calcularArea(trianguloMayorArea));
    }
    
}
