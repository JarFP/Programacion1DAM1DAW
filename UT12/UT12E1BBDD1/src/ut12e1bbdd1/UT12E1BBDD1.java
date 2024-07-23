
package ut12e1bbdd1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class UT12E1BBDD1 {


    public static void main(String[] args) {
        
        // datos de la base de datos
        String usuario = "root";
        String pass = "";
        String baseDatos = "jdbc:MySQL://localhost/tienda";
        
        
        try{
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            System.out.println("Conexión establecida");
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        
    }
    
}
