/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class PruebasTec {

    public void fizzbuss() {
//        List<Integer> lista = new ArrayList();
//        for (int i = 1; i <= 100; i++) {
//
//            lista.add(i);
//        }
//
//        for (Integer integer : lista) {
//
//            if (integer / 3 * 3 == integer) {
//                if (integer / 5 * 5 == integer && integer / 3 * 3 == integer) {
//                    System.out.println("FizzBuss 3 y 5");
//                    continue;
//                }
//                System.out.println("Fizz 3");
//
//                continue;
//            }
//            if (integer / 5 * 5 == integer) {
//                System.out.println("Buss 5");
//                continue;
//            }
//            System.out.println(integer);
//        }
//    }

        for (int i = 1; i < 100; i++) {

            if (i / 3 * 3 == i && i / 5 * 5 == i) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i / 3 * 3 == i) {
                System.out.println("Fizz");
                continue;
            }
            if (i / 5 * 5 == i) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
       
    }

    public void numerosPrimos() {
        List<Integer> listaEntera = new ArrayList();
        List<Integer> numerosPrimos = new ArrayList();
        List<Integer> numerosNOPrimos = new ArrayList();

        for (int i = 0; i < 100; i++) {
            listaEntera.add(i);
        }

        for (Integer integer : listaEntera) {

            if (integer >= 2) {

                if (integer == 2) {
                    numerosPrimos.add(integer);
                } else if (integer % 2 == 0) {
                    numerosNOPrimos.add(integer);
                } else {
                    boolean esPrimo = true;
                    for (int i = 3; i <= Math.sqrt(integer); i += 2) {
                        if (integer % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        numerosPrimos.add(integer);
                    } else {
                        numerosNOPrimos.add(integer);
                    }
                }
            }
        }

        System.out.println("Numeros NO primos");
        for (Integer numerosNOPrimo : numerosNOPrimos) {
            System.out.println(numerosNOPrimo);
        }
        System.out.println("Numeros primos primos");
        for (Integer numerosPrimo : numerosPrimos) {
            System.out.println(numerosPrimo);
        }
    }

    public void invertirCaracter() {

        String palabra = "Palabra";
        String palabraNueva = "";

        for (int i = palabra.length(); i > 0; i--) {
            palabraNueva += palabra.substring((i - 1), i);
        }
        System.out.println(palabraNueva);

        String[] palabraN = palabra.split("");
        System.out.println(Arrays.toString(palabraN));
        String palabraPru = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabraN[i]);
            palabraPru += palabraN[i];
            if (i == 0) {
                System.out.println();
            }
        }
        System.out.println(palabraPru + "--");
        String texto = "Palabra";
        StringBuilder textoReversa = new StringBuilder(texto);
        textoReversa.reverse();
        textoReversa.replace(0, 1, "x");
        textoReversa.append(""); //Agrega texto al principio
        //textoReversa.delete(0, texto.length()); // elimina
        System.out.println(textoReversa);

        String palabraC = "";
        for (String string : palabraN) {
            palabraC = string + palabraC;
        }
        System.out.println(palabraC);
    }

    public void cuantasVecesSeRepite() {

        String cadena = "adsgfgasdfsaferrafdsasdfsasfsda";
        char buscar = 'd';
        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if ("a".equalsIgnoreCase(cadena.substring((i), (i + 1)))) {
                cont++;
            }

        }
        System.out.println(cont);

        cont = 0;
        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == buscar) {
                cont++;
            }
        }

        System.out.println(cont);

    }

    public void cadenasComparadas(String cadena1, String cadena2) {

        int cont = 0;
        int i = 0;
        int j = 0;

        while (i < cadena1.length() && j < cadena2.length()) {

            if (cadena1.charAt(i) == cadena2.charAt(j) && cadena1.charAt(i) != ' ') {
                cont++;
            }
            i++;
            j++;
        }

        System.out.println("Cantidad de letras iguales: " + cont);

    }

    public void contradorDePalabras(String cadena) {

        
        String[] texto = cadena.trim().replaceAll("\\s+", " ").split(" ");
        
        int cont = texto.length;
        
        System.out.println("Palabras: "+cont);

    }
    
   public void contadorNumeros(String cadena){
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                cont++;
            }
        }
        System.out.println("Números: "+cont);
        
        
        cont = 0;
        String[] numeros = cadena.split("[^0-9]+");
        cont = numeros.length;
        System.out.println("Números: "+cont);
    }

}
