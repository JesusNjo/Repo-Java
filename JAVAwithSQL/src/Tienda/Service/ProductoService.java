/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Service;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.DAOPRODUCTO;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ProductoService {

    DAOPRODUCTO prod = new DAOPRODUCTO();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void menu() throws Exception {
        
        int op = 0;
        ArrayList<String> prodx = new ArrayList();

        do {
            System.out.println("\n1:Consultar productos\n2:Consultar precio y nombre\n3:Precio entre 120 y 202 order by precio");
            op = input.nextInt();
            switch (op) {
                case 1:
                    prod.listarTodosLosProductos(prodx);
                    for (String string : prodx) {
                        System.out.println(string);
                        break;
                    }
                    
                case 2:
                    prod.listarTodos(prodx);
                    for (String string : prodx) {
                        System.out.println(string);
                        
                    }
                    
                case 3:
                    prod.listarPorOrden(prodx);
                    for (String string : prodx) {
                        System.out.println(string);
                        
                    }
            }
        } while (op !=0);
    }
}
