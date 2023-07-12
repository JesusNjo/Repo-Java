/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Service;

import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;
import Tienda.Persistencia.DAOProductivo;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Servicios {

    DAOProductivo prod = new DAOProductivo();
    Producto prodN = null;
    Fabricante fabri = null;
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void menu() throws Exception {
        
        int op = 0;
        ArrayList<String> prodx = new ArrayList();

        do {
            System.out.println("\n1:Consultar productos\n2:Consultar precio y nombre\n3:Precio entre 120 y 202 order by precio"
            +"\n4:Mostrar los portatiles\n5:Producto mas barato\n6:Ingresar nuevo producto\n"
                    + "7:Modificar un producto\n8:Agregar un fabricante\n9:Eliminar un fabricante\n0:Salir");
            op = input.nextInt();
            switch (op) {
                case 1:
                    prod.listarTodosLosProductos(prodx);
                    for (String string : prodx) {
                        System.out.println(string);
                        
                    }
                    break;
                case 2:
                    prod.listarTodos(prodx);
                    for (String string : prodx) {
                        System.out.println(string);
                        
                    }
                    break;
                case 3:
                    prod.listarPorOrden(prodx);
                    for (String string : prodx) {
                        System.out.println(string);
                        
                    }
                    break;
                case 4: 
                    prod.listarPortatiles(prodx);
                    for (String string : prodx) {
                        System.out.println(string);
                        
                    }
                break;
                case 5:
                    
                    String resultado = prod.listarMasBarato();
                    System.out.println(resultado);
                    break;
                    
                case 6:
                    prodN = new Producto();
                    System.out.println("Ingrese el codigo del producto");
                    prodN.setCodigo(input.nextInt());
                    System.out.println("Ingrese el nombre del producto");
                    prodN.setNombre(input.next());
                    System.out.println("Ingrese el precio del producto");
                    prodN.setPrecio(input.nextDouble());
                    System.out.println("Ingrese el codigo de fabricante");
                    prodN.setCodigo_fabricante(input.nextInt());
                    System.out.println("Producto ("+prodN.getNombre()+ ") creado satisfactoriamente!");
                    prod.ingresarProducto(prodN);
                   
                    break;
                    
                case 7:
                    System.out.println("Ingrese el codigo de fabricante");
                    String codigoF = input.next();
                    System.out.println("Ingrese el codigo del producto");
                    String codigo = input.next();
                    prod.modificarProductoCF(codigoF, codigo);
                    break;
                    
                    
                case 8:
                    fabri = new Fabricante();
                    System.out.println("Ingrese el codigo de fabricante");
                    fabri.setCodigo(input.nextInt());
                    System.out.println("Ingrese el nombre del fabricante");
                    fabri.setNombre(input.next());
                    System.out.println("Fabricante ingresado correctamente..");
                    System.out.println("Fabricante ("+fabri.getNombre()+ ") creado satisfactoriamente!");
                    prod.agregarFabricante(fabri);
                    break;
                    
                case 9:
                    fabri = new Fabricante();
                    System.out.println("Ingrese el codigo del fabricante que desea eliminar..");
                    fabri.setCodigo(input.nextInt());
                    System.out.println("Fabricante eliminado..");
                    prod.eliminarF(fabri);
                    break;
                case 0:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opción equivodada");
            }
        } while (op !=0);
    }
}
