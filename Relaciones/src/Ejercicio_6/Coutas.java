/*
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */
package Ejercicio_6;

import java.util.Date;

/**
 *
 * @author JesusNjo
 */
public class Coutas {
    private int numCuotas;
    private int montoTCoutas;
    private boolean pagada;
    private Date fechaVencimiento;
    private String formaDePago;
    private Poliza poliza;

    public Coutas(int numCuotas, int montoTCoutas, boolean pagada, Date fechaVencimiento, String formaDePago, Poliza poliza) {
        this.numCuotas = numCuotas;
        this.montoTCoutas = montoTCoutas;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
        this.poliza = poliza;
    }

    public Coutas() {
    }
    
    
}
