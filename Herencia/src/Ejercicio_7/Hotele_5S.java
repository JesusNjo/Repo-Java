/*
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
 */
package Ejercicio_7;

/**
 *
 * @author JesusNjo
 */
public class Hotele_5S extends Hotele_4S {

    private int cantidadSalones;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public Hotele_5S(int cantidadSalones, int cantidadSuites, int cantidadLimosinas, boolean gym, String nombreRestaurant, int capacidadRest, Character tipoGym, int cantidadHabitacion, int numeroCamas, int precioHabitacion, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nombreRestaurant, capacidadRest, tipoGym, cantidadHabitacion, numeroCamas, precioHabitacion, cantPisos, nombre, direccion, localidad, gerente);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public double precios() {
        double precio = super.precios();
        precio += 15 * this.cantidadLimosinas;

        return precio;
    }

    public String toString() {
        return "Hotel 5 estrellas: " + super.toString()
                + "| Cantidad de salones de conferencia: " + cantidadSalones
                + "| Cantidad de suites: " + cantidadSuites
                + "| Cantidad de limosinas: " + cantidadLimosinas;
    }

}
