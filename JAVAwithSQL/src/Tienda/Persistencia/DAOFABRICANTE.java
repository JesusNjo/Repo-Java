package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;

public class DAOFABRICANTE extends DAO {

    public void crearFabricante(Fabricante fabricante) throws Exception {

        try {
            
            if (fabricante == null) {
                throw new Exception("El fabricante no puede estar vacio");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre)" + "values('"
                    + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "');";

            crud(sql);
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }

    }

    public void modificar(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("El valor no puede ir vacio");
            }
            String sql = "UPDATE fabricante SET " + "codigo = '" + fabricante.getCodigo() + "' WHERE nombre = '" + fabricante.getNombre() + "';";

            crud(sql);
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    public void eliminar(String codigo) throws Exception {

        try {
            if (codigo == null) {
                throw new Exception("Necesita enviar un codigo");
            }
            String sql = "DELETE from fabricante where codigo = '" + codigo + "'";

            crud(sql);
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }
    
    public void consultarDato(String codigo) throws Exception{
        
        try {
            if(codigo == null){
                throw new Exception("No puede ir vacio");
            }
            
            String sql = "SELECT FROM fabricante where codigo = '"+codigo+"';";
            consula(sql);
        } catch (Exception e) {
            desconectarDB();
            throw e;
        }
    }

    

}
