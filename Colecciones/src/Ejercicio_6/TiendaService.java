/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Ejercicio_6;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class TiendaService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void menu() {
        Map<String, Double> mapa = new HashMap();
        int op = 0;

        System.out.println("Ingrese una opción");

        do {
        System.out.println("1: Agregar un producto");
        System.out.println("2: Modificar un producto");
        System.out.println("3: Eliminar un producto");
        System.out.println("4: Mostrar los productos");
        System.out.println("5: Salir");
          op = input.nextInt();  
            switch (op) {
                case 1:
                    
                    agregarP(mapa);break;
                case 2:
                    modificarP(mapa);
                    break;
                case 3:
                    eliminarP(mapa);
                    break;
                case 4:
                    mostrarP(mapa);
                    break;
                case 5:
                    System.out.println("Saliendo del menú...");
                    break;
                default:break;
            }
            
            
        } while (op != 5);
        segundo(1000);
        System.out.println("Ha salido del menú!");
    }

    public void agregarP(Map<String, Double> agg) {
        TiendaClass ob = new TiendaClass();
        System.out.print("Ingrese el nombre del producto: ");   
        ob.setNombre(input.next());
        System.out.print("Ingrese el precio del producto: ");
        ob.setCodigo(input.nextDouble());
        
        agg.put(ob.getNombre(), ob.getCodigo());
       
        System.out.println("\nSi desea agregar otro producto marca 1 en el siguiente menú...\n");
    }
    
    
    public void modificarP(Map<String,Double> mod){
        
        System.out.println("Ingrese el nombre del producto que desea modificar: ");
        String nombre = input.next();
        
        for (Map.Entry<String, Double> entry : mod.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            if(nombre.equalsIgnoreCase(key)){
                System.out.print("Ingrese el nuevo precio del producto: ");
                entry.setValue(input.nextDouble());
                
                
                System.out.println(key + " " + value);
            }
        }
    }
    
    public void eliminarP(Map<String,Double> elim){
        
        System.out.print("Ingrese el nombre del producto que desea eliminar: ");
        String nombre = input.next();
        boolean it = true;
        for (Map.Entry<String, Double> entry : elim.entrySet()) {
            String key = entry.getKey();
            
            if(nombre.equalsIgnoreCase(key)){
                elim.remove(key);
                System.out.println("Producto eliminado!");
                it = false;
                break;
            }
        }
        if(it){
            System.out.println("El producto no se encuentra en su tienda..");
        }
    }
    
    public void mostrarP(Map<String,Double> mos){
        
        for (Map.Entry<String, Double> entry : mos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            
            System.out.println("[Producto: "+key +",Precio: "+value+"$]");
        }
    }
    
    private static void segundo(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException e){}        
    }
}
