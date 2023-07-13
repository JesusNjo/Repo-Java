/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.services;

import Estancias.entidades.Familias;
import Estancias.persistencia.DAOSentencias;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class ServiceProductivo {
    DAOSentencias sente= new DAOSentencias();
    Familias familias = null;
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void menu() throws Exception{
    ArrayList<String> lista = new ArrayList();
        int op = 0;
        
        do {            
            System.out.println("Ingrese una opción del menú");  
            System.out.println("\n1:Familias con más de 3 hijos");
            op = input.nextInt();
            switch(op){
                case 1:
                    sente.familiasMasTresH(lista);
                    for (String string : lista) {
                        System.out.println(string);
                    }
                    break;
            }
        } while (true);
    }
}
