package UTN.conexion;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection() {
        Connection connexion = null;
        // Variables para conectarnos a la base de datos
        //var baseDatos ="estudiantes2024";
        var baseDatos = "estudiantes"; // Por si la hicieron con el año del profe
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        //var password = "tu_clave";
        var password = "02091898";

        // Cargamos la clase del driver de mysql en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrió un error en la conexión" + e.getMessage());
        }// Fin catch
        return connexion;
    }// Fin método Connection
}
