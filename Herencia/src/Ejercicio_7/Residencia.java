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
public class Residencia extends ExtraHotelero {

    private int cantHabitaciones;
    private boolean descuentosGremios;
    private boolean campoDeportivo;

    public Residencia(int cantHabitaciones, boolean descuentosGremios, boolean campoDeportivo, boolean privado, Integer cantidadMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetros, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia() {
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getCantidadMetros() {
        return cantidadMetros;
    }

    public void setCantidadMetros(Integer cantidadMetros) {
        this.cantidadMetros = cantidadMetros;
    }

    @Override
    public String toString() {
        return super.toString() + "[Residencia]" + " Cantidad de Habitaciones: " + cantHabitaciones
                + " |Descuentos para gremios: " + (descuentosGremios ? "Sí" : "No") + " |Campo deportivo: "
                + (campoDeportivo ? "Si" : "No");
    }

}
