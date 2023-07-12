/*
Este es un proyecto bastante extenso y detallado que involucra la creación de varias clases y métodos. 
A continuación te presento una guía paso a paso para abordar este proyecto: 
1. Comienza por definir las clases para los diferentes componentes de la armadura, como `Bota`, `Guante`, `Consola`, 
`Sintetizador` y `Generador`. 
Estas clases deben tener atributos para representar su estado, como el consumo de energía y si están dañados o no. 
También deben tener métodos para realizar acciones con estos componentes, como usarlos y repararlos. 
2. Define la clase `Armadura` con atributos para representar su estado, como el color primario y secundario, 
el nivel de resistencia, 
el nivel de salud y los dispositivos que la componen. 
También debe tener métodos para realizar acciones con la armadura, como caminar, correr, propulsar, volar, escribir y leer.
3. Agrega métodos a la clase `Armadura` para mostrar el estado de la armadura y sus dispositivos, como el nivel de salud y 
el estado de la batería. 
4. Agrega lógica a los métodos de la clase `Armadura` para manejar el consumo de energía al realizar acciones con la armadura.
Por ejemplo, al caminar o correr se debe consumir energía de las botas y al propulsarse o volar se debe 
consumir energía de las botas y los guantes. 
5. Agrega lógica a los métodos de la clase `Armadura` para manejar el daño a los dispositivos. 
Por ejemplo, al usar un dispositivo hay una probabilidad de que se dañe y no pueda ser utilizado hasta que sea reparado. 
6. Agrega un método a la clase `Armadura` para revisar y reparar los dispositivos dañados. 
Este método debe intentar reparar los dispositivos dañados hasta que queden reparados o queden destruidos. 
7. Define una clase `Radar` para representar el radar de JARVIS. Esta clase debe tener atributos para representar los 
objetos detectados por el radar y métodos para agregar objetos al radar, calcular la distancia a los objetos y detectar enemigos. 
8. Agrega un método a la clase `Armadura` para que JARVIS pueda atacar a los enemigos detectados por el radar. Este método 
debe disparar a los enemigos hostiles que estén dentro del alcance de los guantes hasta destruirlos o hasta que se agote 
la energía.
9. Agrega un método a la clase `Armadura` para que JARVIS pueda tomar acciones evasivas cuando detecte enemigos hostiles en 
el radar. 
Este método debe alejar la armadura de los enemigos hasta una distancia segura. 
Este es solo un esquema general del proyecto y puedes modificarlo y agregar más detalles según tus necesidades.
 */
package Prubas_ejInt;

/**
 *
 * @author JesusNjo
 */
public class Generador {

    private float energiaMaxima;
    private float energiaActual;

    public Generador() {
        this.energiaMaxima = Float.MAX_VALUE;
        this.energiaActual = Float.MAX_VALUE;
    }

    public void gastoEnergia(int energiaConsumida) {
        energiaActual -= energiaConsumida;

        if (energiaActual < 0) {
            energiaActual = 0;
        }

    }

    public float nivelDeBateria() {
        return energiaActual / energiaMaxima * 100;
    }

}
