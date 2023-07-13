/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estancias.persistencia;

import java.util.ArrayList;

/**
 *
 * @author JesusNjo
 */
public class DAOSentencias extends DAO {
    
    // a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    
        
        public void familiasMasTresH(ArrayList<String> familias) throws Exception {
        try {
            
            
            String sql = "SELECT nombre,numero_hijos FROM familias where numero_hijos >= 3;";
            consultarBD(sql);

            while (resultado.next()) {
                familias.add(resultado.getString("nombre")+ " - "+resultado.getString("numero_hijos"));
            }
            desconectarDB();

        } catch (Exception e) {
            e.printStackTrace();
            desconectarDB();
            throw e;
        }
    }
        
        
   // b) Buscar y listar las casas disponibles para el periodo comprendido entre el 
         //1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido
        
        public void casasDisp(ArrayList<String> fechas){
            
            try {
                
                String sql = "SELECT * FROM casas WHERE pais = 'Reino Unido' AND fecha_desde BETWEEN '2020-08-01' AND '2020-08-31';";
                
                consultarBD(sql);
                
                while(resultado.next()){
                    
                }
            } catch (Exception e) {
            }
        }
        
        
        
        
    
}
