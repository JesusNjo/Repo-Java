package JavaBasico;

import java.util.Scanner;

public class EjercicioGuia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase menor o igual a 8");
        frase=leer.nextLine();
        
        if(frase.length()==8){
            System.out.println("La frase ingresada tiene 8 palabras: "+frase);
        }else{
            System.out.println("Su palabra excede los 8 caracteres");
        }
    }
    
}

