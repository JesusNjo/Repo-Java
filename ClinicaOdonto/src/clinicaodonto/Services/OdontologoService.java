/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaodonto.Services;

import clinicaodonto.Entities.Odontologo;
import clinicaodonto.persistence.OdontologoJpaController;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JesusNjo
 */
public class OdontologoService {
    
    Odontologo odontologo = new Odontologo();
    OdontologoJpaController odontologoJpa = new OdontologoJpaController();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void ingresarOdontologo(){
        try {
            System.out.println("Ingrese el nombre del medico");
            odontologo.setNombre(input.next());
            System.out.println("Ingrese el apellido del medico");
            odontologo.setApellido(input.next());
            System.out.println("Ingrese el DNI del medico");
            odontologo.setDni(input.nextInt());
            System.out.println("Ingrese la especialidad del medico");
            odontologo.setEspecialidad(input.next());
            
            odontologoJpa.create(odontologo);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public int eliminarOdontologo() throws Exception{
        
            int nombreN = 0;
        try {
            List<Odontologo> listaOdonto = odontologoJpa.findOdontologoEntities();
            System.out.println("--LISTA DE ODONTOLOGOS--");
            for (Odontologo odontologo1 : listaOdonto) {
                System.out.println(odontologo1.getId() + " - "+odontologo1.getNombre() + " "+odontologo1.getApellido());
            }
            System.out.println("Indique el ID del odontologo que desea eliminar");
            nombreN = input.nextInt();
            boolean encontrado = true;
            for (Odontologo odontologo1 : listaOdonto) {
                if(nombreN == odontologo1.getId()){
                    odontologoJpa.destroy(nombreN);
                    encontrado = false;
                }
            }
            if(encontrado){
                System.out.println("Odontologo no conseguido..");
            }
            
        } catch (Exception e) {
            throw e;
        }
        
        return nombreN;
    }
}
