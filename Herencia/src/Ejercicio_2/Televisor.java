/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Ejercicio_2;

import java.util.Random;

/**
 *
 * @author JesusNjo
 */
public class Televisor extends Electrodomestico {
    
    private int pulgadas;
    private boolean sintonizador;

    public Televisor(int pulgadas, boolean sintonizador, int precio, String color, String consumoE) {
        super(precio, color, consumoE);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Televisor() {
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTv(){
        crearElectrodomestico();
        
        System.out.println("Indique las pulgas de su TV");
        this.pulgadas = input.nextInt();
        
        if(pulgadas>40){
            precio = (int) (precio *1.30);
        }
        /*Random x= new Random();
        sintonizador = x.nextBoolean();*/
        
        System.out.println("¿Tiene TDT? S/N");
        String op = input.next();
        if("s".equalsIgnoreCase(op)){
            sintonizador = true;
        }else{
            sintonizador = false;
        }
        if(sintonizador){
            precio += 500;
        }
       
        System.out.println("TV: "+this.pulgadas+"'"+this.precio+ "\n¿Sintonizador?: "+sintonizador);
    }
    
}
