/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Ejercicio_3;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class Barajas {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Cartas> baraja = new ArrayList();
    private ArrayList<Cartas> monton = new ArrayList();

    public Barajas() {
    }

    public ArrayList<Cartas> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Cartas> baraja) {
        this.baraja = baraja;
    }

    public void crearBarajasC() {
        String[] tipo = {"Oro", "Espadas", "Bastos", "Copas"};

        for (String aux : tipo) {
            for (int i = 1; i <= 12; i++) {
                if (i == 8 || i == 9) {
                    continue;
                }

                Cartas carta = new Cartas();

                carta.setNumero(i);
                carta.setCarta(aux);
                baraja.add(carta);
            }
        }
       

        int op = 0;
        do {
            System.out.println("Menú de la baraja");
            System.out.println("1:Barajar\n2:Pedir siguiente carta\n3:Mostrar cantidad de cartas disponibles"
                    + "\n4:Pedir una carta\n5:Mostrar cartas del montón\n6:Mostrar barajas del mazo\n0: Salir");
            op = input.nextInt();
            switch (op) {
                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja();
                    break;
                case 0:
                    System.out.println("Haz salido del menú del juego!");break;
                    
                default: System.out.println("Opción invalida");
            }
        } while (op != 0);

    }

    public void barajar() {
        System.out.println("---------------");
        Collections.shuffle(baraja);
        for (Cartas cartas : baraja) {
            System.out.println(cartas);
        }

    }

    public void siguienteCarta() {
        if (baraja.isEmpty()) {
            System.out.println("No quedán cartas en su mazo");

        } else {
            monton.add(baraja.get(0));
            baraja.remove(0);

            System.out.println("Carta añadida al monto!");
        }

    }

    public void cartasDisponibles() {
        System.out.print("Cartas disponibles en el mazo: ");
        System.out.println(baraja.size());
    }

    public void darCartas() {
        int cant;

        if (baraja.isEmpty()) {
            System.out.println("No hay cartas en el monton");
        } else {
            System.out.println("Indique la cantidad de cartas que quiere");
            cant = input.nextInt();
            for (int i = 0; i < cant; i++) {
                monton.add(baraja.get(0));
                baraja.remove(0);

            }
            for (Cartas cartas : monton) {
                System.out.println(cartas);
            }
            System.out.println("Cartas añadida a su baraja");
        }

    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("El montón está vacío!");
        } else {

            for (Cartas cartas : monton) {
                System.out.println(cartas);
            }
        }

    }
    
    public void mostrarBaraja(){
         for (Cartas cartas : baraja) {
            System.out.println(cartas);
        }
    }
}
