/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package JavaBasico;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int A,B,C,D,H;
        
        A = 15;
        B = 4;
        C = 55;
        D = 38;
        
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
        
        H = B;
        
        B = C;
        
        C = A;
        
        A = D;
        
        D = H;
        
        System.out.println("=============================");
        
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
       
    }
    
}
