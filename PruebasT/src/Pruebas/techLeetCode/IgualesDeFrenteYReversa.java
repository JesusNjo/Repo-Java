/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
package Pruebas.techLeetCode;

/**
 *
 * @author JesusNjo
 */
public class IgualesDeFrenteYReversa {

//    public boolean isPalindrome(int x) {
//        
//       String aux = Integer.toString(x);
//      
//       int i = 0;
//       int j = aux.length() -1;
//
//       while(i<j){
//
//           if(aux.charAt(i)!= aux.charAt(j)){
//               return false;
//           }
//           i++;
//           j--;
//       }
//        System.out.println(x);
//       return true;
//       
//       
//   
//    }
    public static void main(String[] args) {
        IgualesDeFrenteYReversa c = new IgualesDeFrenteYReversa();

        boolean result = c.sonIguales(121);
        System.out.println(result);

        System.out.println(c.sonIguales(12321));

        System.out.println("--------------");

        boolean resultS = c.sonIgualesS("reconocer");
        System.out.println(resultS);

        String pana = "ana";
        System.out.println(c.sonIgualesS(pana.toLowerCase()));
    }

    public boolean sonIguales(int n) {

        String aux = Integer.toString(n);
        int i = 0;
        int j = aux.length() - 1;

        while (i < j) {
            if (aux.charAt(i) != aux.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean sonIgualesS(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}
