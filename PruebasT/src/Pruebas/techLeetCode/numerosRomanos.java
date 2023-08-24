/*
La clase Solution contiene un método público llamado romanToInt que recibe un parámetro de tipo
String llamado s. Este parámetro representa el número romano que se quiere convertir a entero.

Dentro del método romanToInt, se declara e inicializa una variable de tipo int 
llamada result con el valor 0. Esta variable va a almacenar el resultado de la conversión.

Luego, se usa un bucle for para recorrer la cadena s de izquierda a derecha. 
a variable i representa el índice del carácter actual en la cadena. El bucle se repite mientras i sea menor 
que la longitud de la cadena s.

Dentro del bucle, se llama a la función auxiliar getValue pasándole como argumento 
el carácter en la posición i de la cadena s. Esta función retorna el valor numérico correspondiente 
al símbolo romano que recibe como parámetro. Por ejemplo, si el carácter es ‘I’, la función retorna 1. Si el
carácter es ‘V’, la función retorna 5. Y así sucesivamente. El valor retornado se almacena en una variable de 
tipo int llamada value.

Después, se usa una condición if para verificar si el símbolo actual es menor que el
siguiente. Para eso, se compara el valor de value con el valor de getValue(s.charAt(i + 1)).
Además, se verifica que i no sea el último índice de la cadena, para evitar un error de índice fuera de rango.
Si la condición se cumple, significa que se trata de un caso excepcional donde se debe restar el valor del símbolo 
actual al resultado. Por eso, se hace result = result - value.

Si la condición no se cumple, significa que se trata de un caso normal donde se debe
sumar el valor del símbolo actual al resultado. Por eso, se hace result = result + value.

Al finalizar el bucle, se ha recorrido toda la cadena s y se ha calculado el valor 
entero correspondiente al número romano. Por eso, se retorna el valor de result.

La función auxiliar getValue es una función pública que recibe un parámetro de tipo 
char llamado c. Este parámetro representa un símbolo romano. La función usa una estructura 
switch para evaluar el valor de c y retornar el valor numérico asociado a cada caso. Por ejemplo,
si c es ‘I’, la función retorna 1. Si c es ‘V’, la función retorna 5. Y así sucesivamente. Si c no es 
ninguno de los casos válidos, la función retorna 0 por defecto.
 */
package Pruebas.techLeetCode;

/**
 *
La condición if que mencionas es la que se usa para verificar si el símbolo actual es
* menor que el siguiente. Recuerda que en ese caso, se debe restar el valor del símbolo actual al resultado.

La condición tiene dos partes que se deben cumplir ambas para que se ejecute el bloque 
* de código dentro del if. La primera parte es i < s.length() - 1. Esta parte verifica 
* que el índice i no sea el último de la cadena s. Esto es necesario porque si i fuera 
* el último índice, no habría un símbolo siguiente y se produciría un error al intentar
* acceder a la posición i + 1 de la cadena. Por ejemplo, si la cadena s fuera “XIV”, 
* el último índice sería 2 y la longitud de la cadena sería 3. Si i fuera 2, entonces i + 1 
* sería 3 y s.charAt(3) daría un error porque no hay ningún carácter en esa posición.

La segunda parte es value < getValue(s.charAt(i + 1)). Esta parte 
* compara el valor del símbolo actual con el valor del símbolo siguiente. 
* El valor del símbolo actual se obtiene con la función auxiliar getValue y s
* e almacena en la variable value. El valor del símbolo siguiente se obtiene con
* la misma función pero pasándole como argumento el carácter en la posición i + 1 
* de la cadena s. Por ejemplo, si la cadena s fuera “XIV” y i fuera 0, entonces el 
* símbolo actual sería ‘X’ y el símbolo siguiente sería ‘I’. El valor de ‘X’ se obtendría 
* con getValue(‘X’) y sería 10. El valor de ‘I’ se obtendría con getValue(s.charAt(1)) y sería 1.
* Luego, se compararía si 10 es menor que 1, lo cual es falso.

Si ambas partes de la condición se cumplen, significa que el 
* símbolo actual es menor que el siguiente y se debe restar su 
* valor al resultado. Por ejemplo, si la cadena s fuera “XIV” y i fuera 1,
* entonces el símbolo actual sería ‘I’ y el símbolo siguiente sería ‘V’. El 
* valor de ‘I’ se obtendría con getValue(‘I’) y sería 1. El valor de ‘V’ se obtendría con
* getValue(s.charAt(2)) y sería 5. Luego, se compararía si 1 es menor que 5, lo cual es 
* verdadero. Además, se verificaría que i no fuera el último índice de la cadena, lo cual
* también es verdadero porque i es 1 y la longitud de la cadena es 3. Entonces, se ejecutaría
* el bloque de código dentro del if y se restaría el valor de ‘I’ al resultado.
 */
public class numerosRomanos {
    
    public void fun() {
        String s = "XII";
        
        System.out.println(romanToInt(s));
    }

   public int romanToInt(String s) {
        // Inicializa una variable para almacenar el resultado
        int result = 0;

        // Recorre la cadena s de izquierda a derecha
        for (int i = 0; i < s.length(); i++) {
            // Obtiene el valor del símbolo actual usando la función auxiliar
            int value = getValue(s.charAt(i));
            // Si el símbolo actual es menor que el siguiente
            if (i < s.length() - 1 && value < getValue(s.charAt(i + 1))) {
                // Resta el valor al resultado
                result -= value;
            } else {
                // Suma el valor al resultado
                result += value;
            }
        }

        // Retorna el resultado
        return result;
    }

    // Función auxiliar que retorna el valor numérico de cada símbolo romano
    public int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    
}
