/*
Programacion 3: Clase 11 y 12
Lucas Salinas
Proyecto estudiantes
*/
package UTN.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;

        var baseDatos = "estudiantes";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "admin";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario,password);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio en error en la conexion de tipo: "+ e.getMessage());
        }
        return conexion;
    }
}