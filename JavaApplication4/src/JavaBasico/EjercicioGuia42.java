/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package JavaBasico;

/**
 *
 * @author JesusNjo
 */
public class EjercicioGuia42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = new int[10];
        llenar(array);
        imprimir(array);

    }

    public static void llenar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int n = (int) (Math.random() * 10);
            array[i] = n;
        }
    }

    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]" + " ");
            
        }
    }

}
