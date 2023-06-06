/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
electrodomésticos, 2000 para lavadora y 5000 para televisor
 */
package Ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class Electrodomestico_2 {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    protected int precio;
    protected String color;
    protected String consumoE;

    public Electrodomestico_2(int precio, String color, String consumoE) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
    }

    public Electrodomestico_2() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(String consumoE) {
        this.consumoE = consumoE;
    }

    //metodos
    public void comprobarConsumo(char letra) {

    }

    public void comprobarColor(String color) {

    }

    public void crearElectrodomestico() {
        this.precio = 1000;
        System.out.println("Porfavor indique el color de su producto ");
        System.out.println("\n1:Blanco\n2:Negro\n3:Rojo\n4:Azul\n5:Gris");
        int op = input.nextInt();
        String letra;

        switch (op) {
            case 1:
                letra = "Blanco";
                break;
            case 2:
                letra = "Negro";
                break;
            case 3:
                letra = "Rojo";
                break;
            case 4:
                letra = "Azul";
                break;
            case 5:
                letra = "Gris";

                break;
            default:
                letra = "Blanco";
        }

        this.color = letra;
        System.out.println("Porfavor indique el consumo de su producto ");
        System.out.println("\n1:A\n2:B\n3:C\n4:D\n5:E\n6:F");
        int op2 = input.nextInt();
        char chart;
        switch (op2) {
            case 1:
                chart = 'A';
                this.precio += 1000;
                break;
            case 2:
                chart = 'B';
                this.precio += 800;
                break;
            case 3:
                chart = 'C';
                this.precio += 600;
                break;
            case 4:
                chart = 'D';
                this.precio += 500;
                break;
            case 5:
                chart = 'E';
                this.precio += 300;
                break;

            case 6:
                chart = 'F';
                this.precio += 100;
            default:
                chart = 'F';
                this.precio += 100;
        }

        comprobarConsumo(chart);
        comprobarColor(letra);

    }

    public void precioFinal() {

        crearElectrodomestico();
    }

    @Override
    public String toString() {
        return "Electrodomestico: "+ "\nPrecio: " + precio + "\nColor: " + color + "\nConsumo energetico: " + consumoE;
    }
    
    
}
