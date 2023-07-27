/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjpa2.Services;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Menu {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    AutorService autorS = new AutorService();
    EditorialService editorialS = new EditorialService();
    
    public void menu() throws Exception {
        
        int op = 0;
        int oper = 0;
        do {
            System.out.println("Seleccione una opcion\n1:Buscar autores/libros/editoriales\n2:Crear autor/editorial/libro\n3:Eliminar autor/editorial/libro"
                    + "\n4:Modificar autor/editorial/libro\n5:");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Indique que desea consultar");
                    System.out.println("1: Autores / 2:Editoral / 3:Libros");
                    oper = input.nextInt();
                    if (oper == 1) {
                        autorS.consultarAutores();
                        
                    }
                    if (oper == 2) {
                        editorialS.consultarEditorial();
                    }
                    break;
                case 2:
                    System.out.println("Indique que desea crear");
                    System.out.println("1: Autores / 2:Editoral / 3:Libros");
                    oper = input.nextInt();
                    if (oper == 1) {
                        System.out.println("Indique el nombre del autor a crear");
                        autorS.crearAutor(input.next());
                    }
                    if (oper == 2) {
                        System.out.println("Indique el nombre de la editorial a crear");
                        editorialS.crearEditorial(input.next());
                    }
                    break;
                case 3:
                    System.out.println("Indique que desea eliminar");
                    System.out.println("1: Autores / 2:Editoral / 3:Libros");
                    oper = input.nextInt();
                    
                    if (oper == 1) {
                        System.out.println("Indique el ID del autor que desea eliminar");
                        autorS.eliminarAutor(input.nextInt());
                    }
                    if (oper == 2) {
                        System.out.println("Indique el ID del editorial que desea eliminar");
                        editorialS.eliminarEditorial(input.nextInt());
                    }
                    break;
                case 4:
                    System.out.println("Indique que desea modificar");
                    System.out.println("1: Autores / 2:Editoral / 3:Libros");
                    oper = input.nextInt();
                    if (oper == 1) {
                        
                        System.out.println("Indique el ID del autor que desea modificar");
                        autorS.modificarAutor(input.nextInt());
                    }
                    if (oper == 2) {
                        System.out.println("Indique el ID del usuario que desea modificar");
                        editorialS.modificarEditorial(input.nextInt());
                    }
                    break;
                case 5:
                    
                    break;
            }
        } while (op != 0);
    }
    
}
