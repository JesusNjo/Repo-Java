/*

1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package Ejercicio_5_2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class AlquilerB {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private String nombreCliente;
    private long documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaRetorno;
    private int posicionAmarra;
    private Barcos nombreBarco;

    public AlquilerB(String nombreCliente, long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaRetorno, int posicionAmarra, Barcos nombreBarco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaRetorno = fechaRetorno;
        this.posicionAmarra = posicionAmarra;
        this.nombreBarco = nombreBarco;
    }

    public AlquilerB() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    //Getters and setters;
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(long documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(LocalDate fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public int getPosicionAmarra() {
        return posicionAmarra;
    }

    public void setPosicionAmarra(int posicionAmarra) {
        this.posicionAmarra = posicionAmarra;
    }

    public Barcos getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(Barcos nombreBarco) {
        this.nombreBarco = nombreBarco;
    }
    
    
    
    public double calcularPrecio(){
       
        System.out.println("Indique el dia de alquiler");
        System.out.print("Dia: ");
        int dia = input.nextInt();
        System.out.print("Mes: ");
        int mes = input.nextInt();
        System.out.print("Año: ");
        int anio = input.nextInt();
        
        this.fechaAlquiler = LocalDate.of(anio,mes,dia);
        System.out.println("Indique el dia de retorno");
        System.out.print("Dia: ");
        int diaR = input.nextInt();
        System.out.print("Mes: ");
        int mesR = input.nextInt();
        System.out.print("Año: ");
        int anioR = input.nextInt();
        this.fechaRetorno = LocalDate.of(anioR,mesR,diaR);
        double diasOcu= ChronoUnit.DAYS.between(fechaAlquiler, fechaRetorno);
        
      
        return diasOcu * nombreBarco.moduloCal();
    }

    @Override
    public String toString() {
        return "NombreCliente: " + nombreCliente + "\nDocumentoCliente: " + documentoCliente + "\nfechaAlquiler: " + fechaAlquiler + "\nfechaRetorno: " + fechaRetorno + "\nPosicionAmarre:" + posicionAmarra;
    }
    
    
    
}
