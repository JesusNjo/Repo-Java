/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente
 */
 
package Ejer4_NIF;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class NIF2SERVICE {
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public NIF2CLASS crearNif(){
        NIF2CLASS nif = new NIF2CLASS();
        System.out.println("Ingrese su DNI correspondiente.");
        nif.setDni(input.nextLong());
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        String[] letraV = new String[23];
        
        for(int i =0; i<letraV.length;i++){
            letraV[i]= letras.substring(i, i+1);
        }
        int resto = (int) (nif.getDni()%23);
        System.out.println(resto);
        nif.setLetra(letraV[resto]);
        
        
        return nif;
    }
    public void mostrar(NIF2CLASS c){
        System.out.println(c.getDni());
        System.out.println(c.getLetra());
        System.out.println(c.getDni()+"-"+c.getLetra());
    }
    
    
    
}
