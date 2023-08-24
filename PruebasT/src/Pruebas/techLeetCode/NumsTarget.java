/*
Dada una matriz de números enteros y un objetivo entero, devuelva índices de los dos números de tal manera que se sumen al objetivo.

Puede suponer que cada entrada tendría exactamente una solución, y no puede usar el mismo elemento dos veces.

Puede devolver la respuesta en cualquier orden.

Ejemplo 1:

Entrada: nums = [2,7,11,15], target = 9
Salida: [0,1]
Explicación: Porque nums[0] + nums[1] == 9, devolvemos [0, 1].





Los valores que compara son los que están en el array que se llama `nums`. Este array es el que recibes como parámetro de la función. Por ejemplo, si el array es [3, 2, 4] y el objetivo es 6, entonces el código hace lo siguiente:

- Empieza el primer bucle con i = 0. Esto significa que el primer número que se va a comparar es el que está en la
posición 0 del array, es decir, el 3.

- Empieza el segundo bucle con j = i + 1, es decir, j = 1. Esto significa que el segundo número que se va a 
comparar es el que está en la posición 1 del array, es decir, el 2.

- Compara si nums[i] + nums[j] == target, es decir, si 3 + 2 == 6. Esto es falso, así que no devuelve nada y 
sigue con el siguiente valor de j.

- Incrementa j en 1, así que ahora j = 2. Esto significa que el segundo número que se va a comparar es el que 
está en la posición 2 del array, es decir, el 4.

- Compara si nums[i] + nums[j] == target, es decir, si 3 + 4 == 6. Esto es verdadero, así que devuelve los índices 
i y j, es decir, [0, 2].

- Termina el segundo bucle y el primero.

¿Te queda más claro? ¿Tienes alguna otra pregunta? 😊
 */
package Pruebas.techLeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JesusNjo
 */
public class NumsTarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumsTarget numT = new NumsTarget();
        ArrayList<Integer> lista = new ArrayList();
        lista.add(2);
        lista.add(7);
        lista.add(11);
        lista.add(15);
        int target = 9;
        ArrayList<Integer> result = numT.target(lista, target);
        for (Integer integer : result) {
            System.out.print("["+integer+"]");
        }
        System.out.println();
        System.out.println(numT.target(lista,target));
//        int[] nums = new int[4];
//        int target;
//        nums[0]=2;
//        nums[1]=7;
//        nums[2]=11;
//        nums[3]=15;
//        target = 26;
//        
//        ArrayList<Integer> newArray = new ArrayList();
//        
//        for (int i = 0; i <nums.length; i++) {
//            for (int j = i+1; j<nums.length; j++) {
//                if(nums[i] + nums[j] == target){
//                    newArray.add(i);
//                    newArray.add(j);
//                }
//            }
//        }
//        
//        for (Integer integer : newArray) {
//            System.out.print(integer + " ");
//        }

        System.out.println("-----------");
    ArrayList<Integer> listPr = numT.targetSP();
    
        for (Integer integer : listPr) {
            System.out.println(integer);
        }

    }
    
    public ArrayList<Integer> target(ArrayList<Integer> lista, int target){
        
        ArrayList<Integer> listaN = new ArrayList();
        
        
        for(int i=0; i<lista.size();i++){
            for(int j = i + 1; j<lista.size();j++){
                if(lista.get(i) + lista.get(j) == target){
                    listaN.add(i);
                    listaN.add(j);
                }
            }
        }
        
        return listaN;
        
    }
    
    public ArrayList<Integer> targetSP(){
        ArrayList<Integer> List = new ArrayList();
        ArrayList<Integer> newList = new ArrayList();
        
        List.add(3);
        List.add(3);
        
        int target = 6;
        
        
        for (Integer integer : List) {
            int num = List.indexOf(integer);
            for (int i = num+1; i <List.size(); i++) {
                if(integer + List.get(i)== target){
                    
                if(!newList.contains(num) && !newList.contains(i)){
                    newList.add(num);
                    newList.add(i);
                }
                }
            }
        }
        
        return newList;
    }
  
}
