package Tienda.Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public abstract class DAO {
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
   
    private final String usuario = "root";
    private final String pass = "root";
    private final String DB = "tienda";
    private final String driver = "com.mysql.jdbc.Driver";
    
    
 protected void conectarDB() throws ClassNotFoundException, SQLException{
        try {
            Class.forName(driver);
            String urlDB= "jdbc:mysql://localhost:3306/"+DB+"?useSSL=false";
            conexion = DriverManager.getConnection(urlDB,usuario,pass);
            
            
            
        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        }
        
    }
 protected void desconectarDB() throws Exception{

     try {
         if(conexion != null){
             conexion.close();
         }
         if(sentencia != null){
             sentencia.close();
         }
         if(resultado != null){
             resultado.close();
         }
     } catch (Exception e) {
         throw e;
         
     }
     
}
 protected void crud(String sql) throws Exception{
     try {
         conectarDB();
         sentencia = conexion.createStatement();
         sentencia.executeUpdate(sql);
     } catch (Exception e) {
         throw e;
     }finally{
         desconectarDB();
     }
 }
 protected void consula(String sql) throws Exception{
     try {
         conectarDB();
         sentencia = conexion.createStatement();
         resultado = sentencia.executeQuery(sql);
     } catch (Exception e) {
         throw e;
     }
 }
}