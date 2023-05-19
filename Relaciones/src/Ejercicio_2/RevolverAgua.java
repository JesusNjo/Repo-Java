/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Ejercicio_2;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class RevolverAgua {

    private int posicionAc;
    private int posicionAg;

 

    public RevolverAgua() {
    }

    public int getPosicionAc() {
        return posicionAc;
    }

    public void setPosicionAc(int posicionAc) {
        this.posicionAc = posicionAc;
    }

    public int getPosicionAg() {
        return posicionAg;
    }

    public void setPosicionAg(int posicionAg) {
        this.posicionAg = posicionAg;
    }

    public void llenarRevolverA() {
        RevolverAgua pos = new RevolverAgua();
        this.posicionAc = (int) (Math.random() * 6) + 1;
        this.posicionAg = (int) (Math.random() * 6) + 1;

        pos.setPosicionAc(posicionAc);
        pos.setPosicionAg(posicionAg);
        
    }

    public boolean mojar() {
        
        
        if (posicionAc == posicionAg) {

            return true;
        } else {
            siguienteChorro();
            return false;
        }
    }

    public void siguienteChorro() {
        
        
        if (posicionAc == 6) {
            this.posicionAc = 1;
            
            
        } else {
            this.posicionAc++;
        }
    }

    @Override
    public String toString() {
        return "Posición actual :" + posicionAc + "\nPosición del agua: " + posicionAg;
    }

}
