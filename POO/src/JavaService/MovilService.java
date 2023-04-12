/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package JavaService;

import entidades.MovilClass;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class MovilService {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public MovilClass cargarCelular(){
        MovilClass tlf = new MovilClass();
        System.out.println("Ingrese la marca de su equipo");
        tlf.setMarca(input.next());
        System.out.println("Ingrese el costo de su equipo");
        tlf.setPrecio(input.nextInt());
        System.out.println("Ingrese el modelo de su equipo");
        tlf.setModelo(input.next());
        System.out.println("Ingrese la memoria RAM del equipo");
        tlf.setMemoriaRam(input.nextInt());
        System.out.println("Ingrese el tamaño de almacenamiento del equipo");
        tlf.setAlmacenamiento(input.nextInt());
        
        
       return tlf; 
    }
    
    
    public void ingresarCodigo(MovilClass j){
        
        System.out.println("Ingrese los 7 codigos del equipo");
        int[] moviles = new int[7];
        for(int i=0; i<j.getCodigo().length;i++){
            moviles[i]= input.nextInt();
        }
        j.setCodigo(moviles);
    }
}
