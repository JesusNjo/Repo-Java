/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author JesusNjo
 */
public class CursoService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public CursoClass crearCurso() {
        CursoClass cur = new CursoClass();
        System.out.println("Ingrese el nombre del curso");
        cur.setNombreCurso(input.next());
        System.out.println("Ingrese la cantidad de horas a cursar por dia");
        cur.setCantidadHorasPorDia(input.nextByte());
        System.out.println("Ingrese la cantidad de dias a cursar por semana");
        cur.setCantidadDiasPorSemana(input.nextByte());
        System.out.println("Ingrese el precio por hora");
        cur.setPrecioPorHora(input.nextInt());
        String[] opciones = {"Mañana", "Tarde", "Noche"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Que turno desea crear este curso?", "Mañana, tarde, noche", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada == 0) {
            cur.setTurno(opciones[0]);
            System.out.println(cur.getTurno());
        } else if (opcionSeleccionada == 1) {
            cur.setTurno(opciones[1]);
        } else if (opcionSeleccionada == 2) {
            cur.setTurno(opciones[2]);
        }

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos a cursar")); //Para crear prompt en JAVA
        System.out.println("Ingrese los alumnos a cursar: ");
        String[] alum = new String[num];
        for (int i = 0; i < alum.length; i++) {
            alum[i] = input.next();
        }
        cur.setAlumnos(alum);
        return cur;
    }

    public void mostrarInfo(CursoClass p1) {
        System.out.println("\nNombre: " + p1.getNombreCurso()
                + "\nCantidad de horas por dia: " + p1.getCantidadHorasPorDia() + " Hrs"
                + "\nCantidad de dias por semana: " + p1.getCantidadDiasPorSemana()
                + "\nTurno : " + p1.getTurno()
                + "\nCosto por hora: " + p1.getPrecioPorHora() + "$"
                + "\nAlumnos: " + Arrays.toString(p1.getAlumnos())
                + "\n\nGanacias totales por semana:  "
                + ((p1.getCantidadHorasPorDia() * p1.getPrecioPorHora()) * p1.getCantidadDiasPorSemana()) * p1.getAlumnos().length);

    }
}
