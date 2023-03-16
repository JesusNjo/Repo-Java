/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int moneda;
        double n2, Euros = 0.86, dolar = 1.28611, yen = 129.852;
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija la moneda");
        System.out.println("1: Euros, 2: Dolares, 3: Yenes");
        moneda = leer.nextInt();
        System.out.println("Ingrese la cantidad que desea convertir");
        n2 = leer.nextInt();

        switch (moneda) {
            case 1:
                System.out.println("La cantidad euros que desea convertir :");
                System.out.println(Euros(Euros, n2));
                break;
            case 2:
                System.out.println("La cantidad de dolares que desea convertir es: ");
                System.out.println(Dolares(dolar, n2));
                break;
            case 3:
                System.out.println("La cantidad de yenes que desea convertir es: ");
                System.out.println(Yen(yen, n2));
                break;
        }
    }

    public static double Euros(double Euros, double n2) {

        double resultado = Euros * n2;
        return resultado;
    }

    public static double Dolares(double dolar, double n2) {

        double resultado = dolar * n2;
        return resultado;
    }

    public static double Yen(double yen, double n2) {

        double resultado = yen * n2;
        return resultado;
    }

}
/*public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float euros;
        String divisa_a_convertir;
        System.out.println("Ingrese la cantidad de euros");
        euros = input.nextFloat();
        System.out.println("¿A qué divisa quiere convertir? \n [dolares, yenes, libras]");
        divisa_a_convertir = input.next();
        convertirMoneda(euros, divisa_a_convertir);
    }
    
    private static void convertirMoneda(float euros, String moneda_convertir){
        
        switch(moneda_convertir){
            case "dolares":
                System.out.println(euros + " euros equivale a = " + (euros * 1.28611) + " " + moneda_convertir);
                break;
            case "yenes":
                System.out.println(euros + " euros equivale a = " + (euros * 129.852) + " " + moneda_convertir);
                break;
            case "libras":
                System.out.println(euros + " euros equivale a = " + (euros * 0.86) + " " + moneda_convertir);
                break;
            default:
                System.out.println("Opción no permitida");
        }
    }*/
