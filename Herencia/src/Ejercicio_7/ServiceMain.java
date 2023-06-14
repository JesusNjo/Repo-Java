/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

import java.util.*;

public class ServiceMain {

    public void todoProceso() {
        Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<Hoteles> hoteles = new ArrayList();
        List<ExtraHotelero> aloExtras = new ArrayList();
        hoteles.add(new Hotele_4S(true, "Il coloniale", 80, 'B', 40, 80, 20, 3, "Las Palmas", "Urb Santa Elena", "Punto Fijo", "Rafael Uyset"));
        hoteles.add(new Hotele_4S(true, "Tykil Y", 60, ' ', 20, 60, 12, 4, "Holliday", "Urb PMA", "Coro", "Pedro Rodriguez"));

        hoteles.add(new Hotele_5S(4, 8, 10, true, "Rest Bijou", 40, 'A', 60, 140, 25, 8, "Bijou", "Puerta Maraven", "Falcón", "Juan Quero"));
        hoteles.add(new Hotele_5S(6, 10, 12, true, "Marcolino's", 40, 'A', 60, 140, 30, 10, "Villa Suites", "Adjuntas", "Maracaibo", "Pedro Lopez"));

        System.out.println("-----------------------------------");

        aloExtras.add(new Camping(40, 4, false, true, 600, "Campamento Crazy", "Santa Ana", "Coro", "Rafael Zamora"));
        aloExtras.add(new Camping(80, 10, true, false, 800, "Lazy crack", "Villa Marina", "Los taques", "Julio Torres"));

        aloExtras.add(new Residencia(12, true, true, false, 350, "Residencias de paraguana", "Maracay", "El tigre", "Pedro Mata"));
        aloExtras.add(new Residencia(20, false, true, true, 450, "Vanilla Rest", "Valencia", "Carabobo", "Jesus Quiñonez"));

        //Menu
        int op = 0;
        do {
            System.out.println("Indique la operación que desea realizar");
            System.out.println("1:Consultar todos los alojamientos\n2:Los hoteles más caros al más barato\n3:Camping con restaurant\n4:Residencias con descuento\n0:Salir");
            op = input.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Alojamientos disponibles: ");
                    System.out.println("----HOTELES----");
                    for (Hoteles hotel : hoteles) {
                        System.out.println(hotel.toString());
                    }
                    System.out.println("---CAMPING Y RESIDENCIAS---");
                    for (ExtraHotelero aloExtra : aloExtras) {
                        System.out.println(aloExtra.toString());
                    }
                    break;
                case 2:
                    hoteles.sort((h1, h2) -> Double.compare(h2.precios(), h1.precios()));

                    System.out.println("Hoteles (de más caro a más barato):");
                    for (Hoteles hotel : hoteles) {
                        System.out.println(hotel.toString());
                    }
                    break;

                case 3:
                    for (ExtraHotelero aloExtra : aloExtras) {
                        if (aloExtra instanceof Camping) {

                            if (((Camping) aloExtra).isRestaurant()) {
                                System.out.println(aloExtra.toString());
                            }

                        }
                    }
                    break;
                case 4:
                    for (ExtraHotelero aloExtra : aloExtras) {
                        if (aloExtra instanceof Residencia) {
                            if (((Residencia) aloExtra).isDescuentosGremios()) {
                                System.out.println(aloExtra.toString());
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opción invalida, porfavor eliga una opción indicada");

            }

        } while (op != 0);
    }
}
