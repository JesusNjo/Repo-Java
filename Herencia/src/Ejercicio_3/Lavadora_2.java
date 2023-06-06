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

/**
 *
 * @author JesusNjo
 */
public class Lavadora_2 extends Electrodomestico_2 {
    private int carga;

    public Lavadora_2(int carga, int precio, String color, String consumoE) {
        super(precio, color, consumoE);
        this.carga = carga;
    }

    public Lavadora_2() {
       
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    // metodos
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        this.carga = input.nextInt();
        
        if(this.carga>30){
            this.precio += 500;
        }
        System.out.println("El precio de la lavadora es: "+this.precio+"\n Su color es: "+this.color+"\nLa carga es: "+this.carga);
    }
}
