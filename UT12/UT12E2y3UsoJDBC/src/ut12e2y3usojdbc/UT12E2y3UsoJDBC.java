package ut12e2y3usojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dam
 */
public class UT12E2y3UsoJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // datos de la base de datos
        String usuario = "root";
        String pass = "";
        String baseDatos = "jdbc:MySQL://localhost/tienda";
        
        
        //Obteniendo datos
        System.out.println("----- Obteniendo datos -----");
        try{
            // establecemos la conexión usando Connection y DriverManager
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            
            // preparamos la consulta y la ejecutamos
            String consulta = "SELECT nombre, precio FROM producto";
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            ResultSet resultado = instruccion.executeQuery();

            // tratamos los datos resultantes de la ejecución de la consulta
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                Double precio = resultado.getDouble("precio");
                System.out.println("Producto: " + nombre + " - " + precio + "€");
            }
            
            // cerramos la conexión
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        
        //Insertando datos
        System.out.println("----- Insertando datos -----");
        try{
            // establecemos la conexión usando Connection y DriverManager
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            
            // preparamos la consulta y la ejecutamos
            String consulta = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES (?,?,?)"; // tendremos que parametrizar los valores
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            // configuramos los valores ? de nuestra consulta
            instruccion.setString(1, "NUEVO PRODUCTO INSERTADO");
            instruccion.setDouble(2, 50.5);
            instruccion.setInt(3, 1);
            int resultado = instruccion.executeUpdate();
            
            // si la inserción se ha producido correctamente tendremos un 1 o un 2 en el resultado
            if(resultado > 0) {
                System.out.println("Producto insertado correctamente.");
            }
            
            
            // cerramos la conexión
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        // Comprobamos que el producto se ha insertado correctamente
        System.out.println("----- Obteniendo datos tras insertar el producto -----");
        try{
            // establecemos la conexión usando Connection y DriverManager
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            
            // preparamos la consulta y la ejecutamos
            String consulta = "SELECT nombre, precio FROM producto";
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            ResultSet resultado = instruccion.executeQuery();

            // tratamos los datos resultantes de la ejecución de la consulta
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                Double precio = resultado.getDouble("precio");
                System.out.println("Producto: " + nombre + " - " + precio + "€");
            }
            
            // cerramos la conexión
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        
        //Actualizando datos
        System.out.println("----- Actualizando datos -----");
        try{
            // establecemos la conexión usando Connection y DriverManager
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            
            // preparamos la consulta y la ejecutamos
            String consulta = "UPDATE producto SET precio = ? WHERE nombre = ?";
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            instruccion.setDouble(1, 35.5);
            instruccion.setString(2, "NUEVO PRODUCTO INSERTADO");
            int resultado = instruccion.executeUpdate();
            
            // si se modifica correctamente puede retornar 1 o 2
            if(resultado > 0) {
                System.out.println("Producto actualizado correctamente.");
            }            
            
            // cerramos la conexión
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        System.out.println("----- Obteniendo datos tras actualizar el producto -----");
        try{
            // establecemos la conexión usando Connection y DriverManager
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            
            // preparamos la consulta y la ejecutamos
            String consulta = "SELECT nombre, precio FROM producto";
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            ResultSet resultado = instruccion.executeQuery();

            // tratamos los datos resultantes de la ejecución de la consulta
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                Double precio = resultado.getDouble("precio");
                System.out.println("Producto: " + nombre + " - " + precio + "€");
            }
            
            // cerramos la conexión
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        
        //Borrando datos
        System.out.println("----- Borrando datos -----");
        try{
            // establecemos la conexión usando Connection y DriverManager
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            
            // preparamos la consulta y la ejecutamos
            String consulta = "DELETE FROM producto WHERE nombre = ?";
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            instruccion.setString(1, "NUEVO PRODUCTO INSERTADO");
            int resultado = instruccion.executeUpdate();
            
            // si se borra correctamente puede retornar 1 o 2
            if(resultado > 0) {
                System.out.println("Producto borrado correctamente.");
            }            
            
            // cerramos la conexión
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
        System.out.println("----- Obteniendo datos tras borrar el producto -----");
        try{
            // establecemos la conexión usando Connection y DriverManager
            Connection conexion = DriverManager.getConnection(baseDatos, usuario, pass);
            
            // preparamos la consulta y la ejecutamos
            String consulta = "SELECT nombre, precio FROM producto";
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            ResultSet resultado = instruccion.executeQuery();

            // tratamos los datos resultantes de la ejecución de la consulta
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                Double precio = resultado.getDouble("precio");
                System.out.println("Producto: " + nombre + " - " + precio + "€");
            }
            
            // cerramos la conexión
            conexion.close();
        } catch (SQLException e){
            System.out.println(e);
        }
                
        
    }
    
}
