/*
 Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
Profe. Adri Bestilleiro
● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
● Crear un método para verificar si el año ingresado es bisiesto
 */
package EjercicioExtra4;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class BiciestoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public BiciestoClass crearAnio() {
        BiciestoClass b = new BiciestoClass();
        System.out.println("Ingrese el dia");
        b.setDia(input.nextInt());
        System.out.println("Ingrese el mes");
        b.setMes(input.nextInt());
        System.out.println("Ingrese el año");
        b.setAnio(input.nextInt());

        return b;
    }

    public void verificar(BiciestoClass a) {
        Calendar fecha = Calendar.getInstance();
        fecha.set(a.getAnio(), a.getMes() - 1, a.getDia());

        String mesE = null;
        String[] meses = {"Enero", "Febrero", "Marzo",
            "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int cantidadDias = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);

        if (a.getAnio() >= 1900 && a.getAnio() <= 2021 && a.getDia() <= cantidadDias && a.getMes() <= meses.length) {
            for (int i = 0; i < meses.length; i++) {
                mesE = meses[a.getMes() - 1];

                if (a.getMes() == 2 && a.getAnio() % 4 == 0) {
                    cantidadDias = 29;

                } else if (a.getDia() > 29 && cantidadDias > 29 && "Febrero".equals(meses)) {
                    cantidadDias = 28;
                } else {
                    System.out.println("Fuera de rango");
                    break;
                }
            }

            System.out.println("Mes: " + mesE + "\n"
                    + "Dias del mes: " + cantidadDias + "\n"
                    + "Año: " + a.getAnio());
            bisiesto(a);
            int diaA;
            System.out.println();
            if (cantidadDias == a.getDia()) {
            diaA = cantidadDias - 1;

                System.out.println("Dia anterior: " + diaA + "-" + (meses[a.getMes() - 1]) + "-" + a.getAnio());
            } else {
                if(a.getDia()>1){
                    
                System.out.println("Dia anterior: " + (a.getDia()-1) + "-" + (meses[a.getMes() - 1]) + "-" + a.getAnio());
                }else if(a.getDia()==1 && "Enero".equals(mesE)){
                    System.out.println("Dia anterior: " + (cantidadDias-a.getDia()+1) + "-" + (meses[11]) + "-" + (a.getAnio()-1));
                }else if(a.getDia()==1){
                    System.out.println("Dia anterior: " + (cantidadDias-a.getDia()+1) + "-" + (meses[a.getMes()-1]) + "-" + (a.getAnio()));
                }
            }
            if (cantidadDias <= a.getDia()) {
                if(a.getDia()==31 && "Diciembre".equals(mesE)){
                System.out.println("Dia anterior: " + (cantidadDias-a.getDia()+1) + "-" + (meses[0]) + "-" + (a.getAnio()+1));
            }else{
                  int diaP = 1;
                System.out.println("Dia posterior: " + diaP + "-" + (meses[a.getMes()]) + "-" + a.getAnio());  
                }
                
                
                
            }
                
                    
            else {
                System.out.println("Dia posterior: " + (a.getDia() + 1) + "-" + (meses[a.getMes() - 1]) + "-" + a.getAnio());
            }

        } else {
            System.out.println("Fecha fuera de rango");
            a.setAnio(1900);
        }

    }

    public void bisiesto(BiciestoClass b) {
        boolean bisiesto = false;
        for (int i = 0; i < b.getAnio(); i++) {
            if (b.getAnio() % 4 == 0) {

                bisiesto = true;

            } else {
                bisiesto = false;
            }
        }
        if (bisiesto) {

            System.out.println("El año: " + b.getAnio() + " es bisiesto");
        } else {
            System.out.println("El año: " + b.getAnio() + " NO es bisiesto");
        }

    }
}
