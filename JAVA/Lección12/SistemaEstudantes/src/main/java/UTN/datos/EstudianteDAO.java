package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    // Metodo listar
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        // Creamo algunos objetos que son necesarios para comunicarnos con la base de datos
        PreparedStatement ps; // Envia la sentencia a la basa de datos
        ResultSet rs; // Obtenemos el resultado de la base de datos
        // Creamos un objeto de tipo conexión
        Connection con = getConnection();
        //String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        String sql = "SELECT * FROM estudiantes2024 ORDER BY idestudiantes2024";
        //String sql = "SELECT * FROM estudiantes ORDER BY estudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstuduiante(rs.getInt("idestudiantes2024"));
                //estudiante.setIdEstuduiante(rs.getInt("idestudiante2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelfono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexión: " + e.getMessage());
            }
        }// Fin finally
        return estudiantes;
    }// Fin mérodo listar

    // Método por id -> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        //String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        String sql = "SELECT * FROM estudiantes2024 WHERE idestudiantes2024=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstuduiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelfono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; // Se encontro un registro
            }//Fin del if
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar estudiante: " + e.getMessage());
        }//Fin del catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexión: " + e.getMessage());
            }//Fin del catch
        }//Fin finally
        return false;
    }

    //Método agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        //String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono,email) VALUES (?,?,?,?)";
        String sql = "INSERT INTO estudiantes2024 (nombre, apellido, telefono,email) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelfono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrio un error al agregar estudiantes: " + e.getMessage());
        }// Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexión" + e.getMessage());
            }// Fin catch
        }// Fin finally
        return false;
    } // Fin método agregarEstudiante

    // Método para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        //        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        String sql = "UPDATE estudiantes2024 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2024=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelfono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstuduiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrio al modificar estudiante: " + e.getMessage());
        }// Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }// Fin catch
        }// Fin finally
        return false;
    }  // Fin Método modificarEstudiante

    public static void main(String[] args) {
        var estudiantesDao = new EstudianteDAO();
        // Modiciar estudiante
        var estudianteModificado = new Estudiante(1, "Juan Carlos", "Juarez", "123455656", "juarezjuan@mail.com");
        var modificado = estudiantesDao.modificarEstudiante(estudianteModificado);
        if (modificado)
            System.out.println("Estudiante modificado " + estudianteModificado);
        else
            System.out.println("No se modifico el estudiante " + estudianteModificado);

        // Agregar estudiante
//        var nuevoEstudiante = new Estudiante("Carlos", "Lara", "111414451", "carlosl@mail.com");
//        var agregado = estudiantesDao.agregarEstudiante(nuevoEstudiante);
//        if (agregado)
//            System.out.println("Estudiante agregado: " + nuevoEstudiante);
//        else
//            System.out.println("No se a agregado estudiante: " + nuevoEstudiante);


        // Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudiantesDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); // Funcón lambda para imprimir


        // Buscar por id
//        var estudiante1 = new Estudiante(1);
//        System.out.println("Estudiantes antes de la busqueda: " + estudiante1);
//        var encontrado = estudiantesDao.buscarEstudiantePorId(estudiante1);
//        if (encontrado)
//            System.out.println("Estudiante encontrado: " + estudiante1);
//        else
//            System.out.println("No se encontro el estudiante: " + estudiante1.getIdEstuduiante());

    }
}
