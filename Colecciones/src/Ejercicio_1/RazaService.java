/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class RazaService {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<String> perros = new ArrayList();
    
    public RazaClass crearRaza(){
        RazaClass perro = new RazaClass();
        System.out.println("Ingrese una raza");
        perro.setRaza(input.next());
        perros.add(perro.getRaza());
        agregarP(perro);
        return perro;
    }
    
    
    public void agregarP(RazaClass nuevo){
        String op = null;
        
        do{
        System.out.println("Desea agregar otro perro S/N?");
        op = input.next();
            
        if("s".equals(op)){
            System.out.println("Ingrese el nombre del nuevo perro");
            String x= input.next();
            perros.add(x);
        }
        }while(!"n".equals(op));
    }
    
    public void mostrar(RazaClass nuevo){
        
        /*for(int i = 0; i<perros.size();i++){
            String x = perros.get(i);
            
            System.out.println(x);
        }*/
        perros.forEach((x)->System.out.println(x));
    }
}
