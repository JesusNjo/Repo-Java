/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JesusNjo
 */
public class Ejercicios {

    //Suma dos numeros
    public int sumar(int n1, int n2) {
        return n1 + n2;
    }

    //Calcular iva del producto
    public double iva(double producto) {
        double iva = producto * 0.5;

        return producto += iva;
    }
    // Celcius a F

    public double CAF(double valor) {

        return (valor * 1.8) + 32;
    }

    //Validacion de contraseña
    public Boolean validar(String pass) {

        List<Integer> lista = new ArrayList();
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        for (int i = 0; i < pass.length(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (Character.getNumericValue(pass.charAt(i)) == lista.get(j)) {
                    return true;
                }
            }
        }

        return false;

    }

    public Boolean validar2(String pass) {

        String nums = "[a-z]+";
        Pattern p = Pattern.compile(nums);
        Matcher m = p.matcher(pass);
        if (m.find() && pass.length() >= 8) {

            return true;
        } else {
            return false;

        }

    }

    //Numeros romanos
    public char nums(char a) {
        switch (a) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanos(String nu) {

        int result = 0;
        for (int i = 0; i < nu.length(); i++) {
            int value = nums(nu.charAt(i));
            if (i < nu.length() - 1 && value < nums(nu.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }

        }

        return result;
    }

    //Localizar el objetivo
    public List<Integer> localizar() {
        List<Integer> obj = new ArrayList();
        int[] array = {2, 3, 4, 5, 6, 7, 9};
        int target = 8;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    obj.add(i);
                    obj.add(j);
                    return obj;
                }
            }
        }
        return obj;
    }

    public List<Integer> localizar2() {
        List<Integer> obj = new ArrayList<>();
        int[] array = {2, 3, 4, 5, 6, 7, 9};
        int target = 8;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                obj.add(map.get(complement));
                obj.add(i);
                return obj; // Devolver las posiciones encontradas
            }
            map.put(array[i], i);
        }

        return obj;
    }

    //Ordenamiento de un array
    public List<Integer> ordenamiento() {
        List<Integer> arrayOrd = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int nR = (int) (Math.random() * 100) + 1;
            arrayOrd.add(nR);
        }

        for (Integer integer : arrayOrd) {
            System.out.println(integer);
        }
        Collections.sort(arrayOrd);
        return arrayOrd;
    }

    public void numPrimos() {
        int[] numeros = {2, 6, 3, 9, 5, 11, 12, 14, 7};
        List<Integer> numPrimos = new ArrayList();
        List<Integer> numNoPrimos = new ArrayList();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] <= 1) {
                System.out.println("No puede haber numeros menores a 2");
            } else {
                boolean esPrimo = true;

                for (int j = 2; j <= Math.sqrt(numeros[i]); j++) {
                    if (numeros[i] % j == 0 && numeros[i] != 2) {
                        esPrimo = false;
                        break;
                    }
                }
                if (numeros[i] == 2) {
                    numPrimos.add(numeros[i]);
                } else if (esPrimo) {
                    numNoPrimos.add(numeros[i]);
                } else {
                    numPrimos.add(numeros[i]);
                }
            }

        }
        System.out.println("Números primos:");
        for (Integer numPrimo : numPrimos) {
            System.out.print(numPrimo + " - ");
        }
        System.out.println();

        System.out.println("Números no primos:");
        for (Integer numNoPrimo : numNoPrimos) {
            System.out.print(numNoPrimo + " - ");
        }

    }
}
