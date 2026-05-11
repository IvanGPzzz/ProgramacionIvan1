package tema8.hogwarts;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Operaciones {
    private Connection conectar() throws SQLException {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("db.properties")) {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return DriverManager.getConnection(
                prop.getProperty("db.url"),
                prop.getProperty("db.user"),
                prop.getProperty("db.password")
        );
    }

    public List<Asignatura> listaAsignaturas() {
        List<Asignatura> asignaturas = new ArrayList<>();
        String consulta = "SELECT * FROM Asignatura";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
            System.out.println("----LISTA ACTUAL DE ASIGNATURAS----");
            while (rs.next()) {
                Asignatura asignatura = new Asignatura();
                asignatura.setId(rs.getInt("id_asignatura"));
                asignatura.setNombre(rs.getString("nombre"));
                asignatura.setAula(rs.getString("aula"));
                asignatura.setObligatoria(rs.getBoolean("obligatoria"));
                asignaturas.add(asignatura);
            }
            System.out.println("\n");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return asignaturas;
    }

    public void estudiantesCasa(String casa) {
        String consulta = "SELECT e.nombre, e.apellido " +
                "FROM Estudiante e JOIN Casa c ON e.id_casa = c.id_casa " +
                "WHERE c.nombre = ?";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            sentencia.setString(1, casa);
            ResultSet rs = sentencia.executeQuery();
            System.out.println("----ESTUDIANTES DE " + casa + "----");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                System.out.println(nombre + " " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void mascotaEstudiante(String nombre,  String apellido) {
        String consulta = "SELECT m.nombre FROM Mascota m " +
                "JOIN Estudiante e ON m.id_estudiante = e.id_estudiante " +
                "WHERE e.nombre = ? AND e.apellido = ?";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia= cone.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellido);
            ResultSet rs = sentencia.executeQuery();
            System.out.println("La mascota de " + nombre + " " + apellido + " es:");
            while (rs.next()) {
                String mascota = rs.getString("nombre");
                System.out.println(mascota);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void numEstudiantesCasa() {
        String consulta = "SELECT c.nombre, COUNT(e.id_estudiante) AS cant_estudiantes " +
                "FROM Casa c JOIN Estudiante e ON c.id_casa = e.id_casa " +
                "GROUOP BY c.nombre";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia= cone.prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
            System.out.println("- Cantidad de estudiantes por casa:");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cant_estudiantes");
                System.out.println(nombre + ": " + cantidad + " estudiantes.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarAsignatura(String nombre, String aula, boolean obligatoria) {
        String consulta = "INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES (?, ?, ?)";
        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.setString(2, aula);
            sentencia.setBoolean(3, obligatoria);
            sentencia.executeUpdate();
            System.out.println("Asignatura insertada correctamente.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void modificarAula(int id, String nuevaAula) {
        String consulta = "UPDATE Asignatura SET aula = ? WHERE id_asignatura = ?";
        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            sentencia.setString(1, nuevaAula);
            sentencia.setInt(2, id);
            sentencia.executeUpdate();
            System.out.println("Aula actualizada correctamente.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminarAsignatura(String nombre) {
        String consulta = "DELETE FROM Asignatura WHERE nombre=?";
        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.executeUpdate();
            System.out.println(" Asignatura eliminada correctamente.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
