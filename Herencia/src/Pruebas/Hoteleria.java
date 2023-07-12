
 
package Pruebas;

/**
 *
 * @author JesusNjo
 */
public class Hoteleria {
    protected int cantidadHabitacion;
    protected int cantidadCamas;

    public Hoteleria(int cantidadHabitacion, int cantidadCamas) {
        this.cantidadHabitacion = cantidadHabitacion;
        this.cantidadCamas = cantidadCamas;
    }

    public Hoteleria() {
    }

    public int getCantidadHabitacion() {
        return cantidadHabitacion;
    }

    public void setCantidadHabitacion(int cantidadHabitacion) {
        this.cantidadHabitacion = cantidadHabitacion;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }
    
    public int calcularPrecio(){
        
        return cantidadCamas * cantidadHabitacion;
    }
}
