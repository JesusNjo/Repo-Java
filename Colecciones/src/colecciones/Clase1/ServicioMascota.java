/*

 */
package colecciones.Clase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ServicioMascota {
    private Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    private List<String> mascotas;
    /**
     
     
     */
    public ServicioMascota(){
        this.mascotas = new ArrayList();
    }
    /*public Mascota crearMascota(){
        System.out.println("Ingrese el nombre");
        String nombre = input.next();
        System.out.println("Ingrese apodo");
        String apodo = input.next();
        System.out.println("Ingrese tipo");
        String tipo = input.next();
        
        
        return new Mascota(nombre,apodo,tipo);
    }*/
    
    public void crearMascota(){
        Mascota loco = new Mascota();
        System.out.println("Ingrese el nombre");
        loco.setNombre(input.next());
        System.out.println("Ingrese apodo");
        loco.setApodo(input.next());
        System.out.println("Ingrese tipo");
        loco.setTipo(input.next());
        
        
        String mascota = "\nNombre: "+ loco.getNombre()+"\nApodo: "+loco.getApodo()+" "+"\nTipo: "+ loco.getTipo();
        //mascotas.add("\nNombre: "+ nombre+"\nApodo: "+apodo+" "+"\nTipo: "+ tipo);
        
        mascotas.add(mascota);
        
    }
    
    public void mostrarMascota(){
        System.out.println("Las mascotas actuales de la lista de mascotas son: \n");
        /*for (String mascota : mascotas) {
            
        }*/
        
        mascotas.forEach((mascota) -> {
            System.out.println(mascota);
        });
        System.out.print("La cantidad de mascotas son: "+mascotas.size()+"\n");
    }
    
    public void agregarMascota(){
       
        crearMascota();
         System.out.println("Lista actualizada, actualmente hay: "+mascotas.size());
        mascotas.forEach((mascota) -> {
            System.out.println(mascota);
        });
    }
    
    public void eliminarMascota(Mascota x){
        
        System.out.println("Ingrese el nombre de la mascota que desea eliminar");
        String nombre = input.next();
        
            if(nombre.equalsIgnoreCase(x.getNombre())){
            mascotas.remove(nombre);
            
            
                System.out.println("Entra");
        }
       
        
        
        System.out.println("Lista actualizada, actualmente hay: "+mascotas.size());
        mascotas.forEach((mascota) -> {
            System.out.println(mascota);
        });
    }
    
}
