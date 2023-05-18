/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_P1;
import java.util.*;
/**
 *
 * @author JesusNjo
 */
public class VideoJuegosS {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void crearV(){
        
        List<VideoJuegos> jg = new ArrayList();
        
        
        /*for (int i = 0; i <4; i++) {
            vid = new VideoJuegos();
            System.out.print("Ingrese el titulo del video juego: ");
            vid.setTitulo(input.next());
            System.out.print("Ingrese el codigo del juego: ");
            vid.setCodigo(input.nextInt());
            System.out.print("Ingrese el tipo de consola: ");
            vid.setConsola(input.next());
            System.out.print("Ingrese la cantidad de jugadores: ");
            vid.setCantidadJugadores(input.nextInt());
            System.out.println("Ingrese la categoria del juego");
            vid.setCategoria(input.next());
            jg.add(vid);
        }*/
        
        VideoJuegos vid1 = new VideoJuegos(58485,"Mortal Kombat","Nintendo 64",2,"Violencia");
        VideoJuegos vid2 = new VideoJuegos(15845,"James Bond","Nintendo 64",4,"Shooter");
        VideoJuegos vid3 = new VideoJuegos(84216,"Crash BandiCurt","PlayStatin 2",1,"Aventura");
        VideoJuegos vid4 = new VideoJuegos(22452,"Read Redention","PlayStation 4",1,"Aventura");
        VideoJuegos vid5 = new VideoJuegos(94852,"Zombie Land","PC",2,"BattleRoyal");
        
        jg.add(vid1);
        jg.add(vid2);
        jg.add(vid3);
        jg.add(vid4);
        jg.add(vid5);
        
        for (VideoJuegos aux : jg) {
            System.out.println("Titulos: "+aux.getTitulo());
           
            System.out.println("Consolas: "+aux.getConsola());
            
            System.out.println("Cantidad de jugadores en: "+aux.getConsola()+" es: "+aux.getCantidadJugadores());
            System.out.println();
        }
        
        
        for (int i = 0; i <2; i++) {
        cambiarN(jg);
        }
        
        
        System.out.println("-----JUEGOS ACTUALIZADOS-----");
           for (VideoJuegos aux : jg) {
            System.out.println("Titulos: "+aux.getTitulo());
           
            System.out.println("Consolas: "+aux.getConsola());
            
            System.out.println("Cantidad de jugadores en "+aux.getTitulo()+" es: "+aux.getCantidadJugadores());
            System.out.println();
        }
           
          for (int i = 0; i <4; i++) {
              if(jg.get(i).getConsola().equalsIgnoreCase("Nintendo 64")){
                  System.out.println("Juegos de "+jg.get(i).getConsola()+" son :" +jg.get(i).getTitulo());
              }
        } 
          
     
    }
    
    
    public void cambiarN(List<VideoJuegos> camb){
        System.out.println("Ingrese el titulo del juego que desea cambiar");
        String nombre = input.next();
        boolean band = true;
        for (int i = 0; i <camb.size(); i++) {
            
            if(nombre.equalsIgnoreCase(camb.get(i).getTitulo())){
                System.out.println("Ingrese el nuevo titulo de: "+nombre);
                
                camb.get(i).setTitulo(input.next());
                
                System.out.println("Ingrese la nueva cantidad de jugadores de : "+nombre);
                camb.get(i).setCantidadJugadores(input.nextInt());
                System.out.println("Juego actualizado!!");
                band = false;
            
            }
            
        }if(band){
            System.out.println("Juego no encontrado...");
        }
    }
}
