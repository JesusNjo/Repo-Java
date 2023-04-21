/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package EjercicioExtra7;

/**
 *
 * @author JesusNjo
 */
public class AutoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoService nC = new AutoService();
        
        AutoClass carro1 = nC.crearAuto();
        
        nC.modificar(carro1);
        nC.recorrido(carro1);
        
    }
    
}
