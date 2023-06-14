/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Ejercicio_7;

/**
 *
 * @author JesusNjo
 */
public class Camping extends ExtraHotelero {

    private int cantMaximaCarpas;
    private int cantBanosDisp;
    private boolean restaurant;

    public Camping(int cantMaximaCarpas, int cantBanosDisp, boolean restaurant, boolean privado, Integer cantidadMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetros, nombre, direccion, localidad, gerente);
        this.cantMaximaCarpas = cantMaximaCarpas;
        this.cantBanosDisp = cantBanosDisp;
        this.restaurant = restaurant;
    }

  

    
    public Camping() {
    }

    public int getCantMaximaCarpas() {
        return cantMaximaCarpas;
    }

    public void setCantMaximaCarpas(int cantMaximaCarpas) {
        this.cantMaximaCarpas = cantMaximaCarpas;
    }

    public int getCantBanosDisp() {
        return cantBanosDisp;
    }

    public void setCantBanosDisp(int cantBanosDisp) {
        this.cantBanosDisp = cantBanosDisp;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return super.toString() + "[Camping]" + "Cantidad máxima de carpas: "
                + cantMaximaCarpas + " | Cantidad de baños disponibles: "
                + cantBanosDisp + "| Restaurant: " + (restaurant?"Si" : "No");
    }

}
