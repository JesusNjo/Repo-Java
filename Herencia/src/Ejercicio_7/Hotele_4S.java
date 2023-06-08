/*
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

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
public class Hotele_4S extends Hoteles {

    protected boolean gym;
    protected String nombreRestaurant;
    protected int capacidadRest;
    protected Character tipoGym;

    public Hotele_4S(boolean gym, String nombreRestaurant, int capacidadRest, char tipoGym, int cantidadHabitacion, int numeroCamas, int precioHabitacion) {
        super(cantidadHabitacion, numeroCamas, precioHabitacion);
        this.gym = gym;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRest = capacidadRest;
        this.tipoGym = tipoGym;
    }

    public Hotele_4S() {
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public double precios() {
        int precio;

        if (this.capacidadRest <= 30) {
            precio = 10;
        } else if (this.capacidadRest > 30 && this.capacidadRest <= 50) {
            precio = 30;
        } else {
            precio = 50;
        }
        if (gym) {

            if (tipoGym == 'A') {
                precio += 50;
            } else if (tipoGym == 'B') {
                precio += 30;
            }
        }
        return super.precios() + precio;
    }

    @Override
    public String toString() {
        return "Hotel 4 estrellas: " + super.toString() +
               "| Gimnasio: " + (gym ? "Sí" : "No") +
               "| Tipo de gimnasio: " + tipoGym +
               "| Nombre del restaurante: " + nombreRestaurant +
               "| Capacidad del restaurante: " + capacidadRest;
    }
    
    
}
