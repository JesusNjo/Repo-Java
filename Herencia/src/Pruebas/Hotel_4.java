/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author JesusNjo
 */
public class Hotel_4 extends Hoteleria {

    protected boolean gym;
    protected String nombreRestaurant;
    protected char tipoGym;
    protected int capacidadRest;

    public Hotel_4(boolean gym, String nombreRestaurant, char tipoGym, int capacidadRest, int cantidadHabitacion, int cantidadCamas) {
        super(cantidadHabitacion, cantidadCamas);
        this.gym = gym;
        this.nombreRestaurant = nombreRestaurant;
        this.tipoGym = tipoGym;
        this.capacidadRest = capacidadRest;
    }

    public Hotel_4() {
    }

    @Override
    public final int calcularPrecio() {
        int total = 0;

        if (capacidadRest <= 30) {
            total += 30;
        } else if (capacidadRest == 30) {
            total += 50;
        } else {
            total += 80;
        }

        if (gym) {

            if (tipoGym == 'A') {
                total += 50;
            } else if (tipoGym == 'B') {
                total += 30;
            }
        }else{
             tipoGym='X';
        }
        ;

        return super.calcularPrecio() + total;
    }

    @Override
    public String toString() {
        return "Hotel_4{" + "gym=" + gym + ", nombreRestaurant=" + nombreRestaurant + ", tipoGym=" + tipoGym + ", capacidadRest=" + capacidadRest + " Precio: " +calcularPrecio()+ '}';
    }

    
}
