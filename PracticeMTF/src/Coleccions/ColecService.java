/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccions;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ColecService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    List<ColecClass> carros = new ArrayList();

    public ColecClass crearCarro() {
        ColecClass carro = new ColecClass();
        System.out.println("Ingrese la marca de su carro");
        carro.setMarca(input.next());
        System.out.println("Ingrese el modelo de su carro");
        carro.setModelo(input.next());
        System.out.println("Ingrese el año de su carro");
        carro.setAnio(input.nextInt());
        System.out.println("Ingrese la placa de su vehilo");
        carro.setPlaca(input.next());

        return carro;
    }

    public void almacen(int cantidad) {
        ColecClass au = new ColecClass();

        for (int i = 0; i < cantidad; i++) {
            au = crearCarro();
            carros.add(au);
        }
        System.out.println("Autos almacenados: ");
        mostrar(au);

        System.out.println("¿Desea eliminar algun carro? S/N");
        String op = input.next();
        if ("s".equalsIgnoreCase(op)) {
            System.out.println("Ingrese el vehiculo que desee eliminar");

            eliminar(au);

        }

    }

    public void mostrar(ColecClass valor) {
        carros.forEach((x) -> System.out.println(x));
    }

    public void eliminar(ColecClass x) {
        ColecClass au = new ColecClass();
        au.setModelo(input.next());
        for (int i = 0; i < carros.size(); i++) {

            x = carros.get(i);

            if (x.getModelo().equals(au.getModelo())) {
                carros.remove(x);
            }

            System.out.println("Lista actualizada");
            System.out.println(carros.get(i));
        }

    }
}
