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
package Ejercicio_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Alquiler {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    protected String nombre;
    protected long documentoC;
    protected LocalDate fechaA;
    protected LocalDate fechaD;
    protected int amarre;
    protected Barcos nombreBarco;

    public Alquiler(String nombre, long documentoC, LocalDate fechaA, LocalDate fechaD, int amarre, Barcos nombreBarco) {
        this.nombre = nombre;
        this.documentoC = documentoC;
        this.fechaA = fechaA;
        this.fechaD = fechaD;
        this.amarre = amarre;
        this.nombreBarco = nombreBarco;
    }

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumentoC() {
        return documentoC;
    }

    public void setDocumentoC(long documentoC) {
        this.documentoC = documentoC;
    }

    public LocalDate getFechaA() {
        return fechaA;
    }

    public void setFechaA(LocalDate fechaA) {
        this.fechaA = fechaA;
    }

    public LocalDate getFechaD() {
        return fechaD;
    }

    public void setFechaD(LocalDate fechaD) {
        this.fechaD = fechaD;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barcos getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(Barcos nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public double calcularAlquiler() {
        System.out.println("Indique la fecha de alquiler");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int anio = input.nextInt();
        fechaA = LocalDate.of(anio, mes, dia);

        System.out.println("Indique la fecha de retorno");
        dia = input.nextInt();
        mes = input.nextInt();
        anio = input.nextInt();
        fechaD = LocalDate.of(anio, mes, dia);

        double cantD = ChronoUnit.DAYS.between(fechaA, fechaD);

        double alquiler = cantD * nombreBarco.getEslora() * 10;
        
        return alquiler;
    }

    public void modulo() {

        calcularAlquiler();
    }
}
