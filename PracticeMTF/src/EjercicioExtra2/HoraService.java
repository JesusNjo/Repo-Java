/*
 Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package EjercicioExtra2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class HoraService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public HoraClass imprimirHoraCompleta() {
        HoraClass h = new HoraClass();
        System.out.println("Ingrese la hora");
        h.setHora(input.nextInt());
        System.out.println("Ingrese los minutos");
        h.setMinutos(input.nextInt());
        System.out.println("Ingrese los segundos");
        h.setSegundos(input.nextInt());

        return h;
    }
    
    public void mostrarHora(HoraClass m){
        
     if(m.getHora()<24 && m.getHora()>=0 && m.getMinutos()<60 && m.getMinutos()>=0 && m.getSegundos()<60 && m.getSegundos()>=0){
         System.out.println(m.getHora()+":"+m.getMinutos()+":"+m.getSegundos());
     }else{
         System.out.println("Hora incorrecta");
     }
    }       
}
