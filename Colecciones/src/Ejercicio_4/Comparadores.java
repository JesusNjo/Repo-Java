/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;
import java.util.Comparator;
/**
 *
 * @author JesusNjo
 */
public class Comparadores {
    
    public static Comparator<PeliculaClass> ordenar = new Comparator<PeliculaClass>() {
        @Override
        public int compare(PeliculaClass t, PeliculaClass t1) {
            return t.getDuracionP().compareTo(t1.getDuracionP());
        }
    };
    public static Comparator<PeliculaClass> ordenart = new Comparator<PeliculaClass>() {
        @Override
        public int compare(PeliculaClass t, PeliculaClass t1) {
            return t.getTituloP().toLowerCase().compareTo(t1.getTituloP().toLowerCase());
        }
    };
    public static Comparator<PeliculaClass> ordenard = new Comparator<PeliculaClass>() {
        @Override
        public int compare(PeliculaClass t, PeliculaClass t1) {
            return t.getDirectorP().toLowerCase().compareTo(t1.getDirectorP().toLowerCase());
        }
    };
    
    
}
