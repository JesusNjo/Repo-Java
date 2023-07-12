/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Service;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.DAOFABRICANTE;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class FabricanteService {

    public void consultasF() throws Exception {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        DAOFABRICANTE fabricante = new DAOFABRICANTE();
        System.out.println("Indique la consulta que desea realizar");
        int code = 0;
        do {
            Fabricante fabri;
            System.out.println("1: Ingresar fabricante\n2: Consultar fabricante");
            code = input.nextInt();
            switch (code) {
                case 1:

                    System.out.println("Indique el codigo del fabricante");
                    int cod = input.nextInt();
                    System.out.println("Ingrese el nombre del fabricante");
                    String nombre = input.next();
                    fabri = new Fabricante(cod, nombre);
                    fabricante.crearFabricante(fabri);
                    break;

                case 2:
                    System.out.println("Indique el codigo del fabricante");
                    String nombreC = input.next();
                    fabricante.consultarDato(nombreC);
            }
        } while (code != 0);
    }
}
