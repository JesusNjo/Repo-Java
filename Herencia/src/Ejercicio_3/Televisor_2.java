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
public class Televisor_2 extends Electrodomestico_2{
    private int pulgadas;
    private boolean sintonizador;

    public Televisor_2(int pulgadas, boolean sintonizador, int precio, String color, String consumoE) {
        super(precio, color, consumoE);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Televisor_2() {
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
