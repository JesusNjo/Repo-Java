/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
package JavaBasico;

public class EjercicioGuia19 {

    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        matrizA[0][0] = 0;
        matrizA[0][1] = 2;
        matrizA[0][2] = -4;
        matrizA[1][0] = -2;
        matrizA[1][1] = 0;
        matrizA[1][2] = -2;
        matrizA[2][0] = 4;
        matrizA[2][1] = 2;
        matrizA[2][2] = 0;

        for (int i = 0;
                i
                < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[j][i] = matrizA[i][j];

                System.out.print("[" + matrizA[i][j] + "]");

            }
            System.out.println("");
        }

        System.out.println(
                "");

        for (int i = 0;
                i
                < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[j][i] = matrizB[i][j];
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
        int contador = 0;
        for (int i = 0;
                i
                < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrizA[i][j] + matrizB[i][j] == 0) {
                    contador++;
                }

            }
        }
        if (contador == 3) {
            System.out.println("Matriz anti simetrica");
        } else {
            System.out.println("Matriz NO simetrica");

        }
    }
}

    /*public static void main(String[] args) {

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];

        matrizA[0][0] = 0;
        matrizA[0][1] = 2;
        matrizA[1][0] = -4;
        matrizA[1][1] = -2;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizB[j][i] = matrizA[i][j];

                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizA[j][i] = matrizB[i][j];
                System.out.print("[" + matrizB[i][j] + "]");

            }
            System.out.println();
        }
        int contador = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                if (matrizA[i][j] + matrizB[i][j] == 0) {
                    contador++;
                }

            }
        }
        if(contador == 3){
            
         System.out.println("Matriz anti simetrica");
            }else{
                System.out.println("Matriz NO simetrica");
    }*/
