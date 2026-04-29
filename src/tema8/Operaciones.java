package tema8;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Operaciones {
    private Connection conectar() throws SQLException {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/db.properties")) {
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
            System.out.println("----LISTA DE ASIGNATURAS----");
            while (rs.next()) {
                Asignatura asignatura = new Asignatura();
                asignatura.setId(rs.getInt("id_asignatura"));
                asignatura.setNombre(rs.getString("nombre"));
                asignatura.setAula(rs.getString("aula"));
                asignatura.setObligatoria(rs.getBoolean("obligatoria"));
                asignaturas.add(asignatura);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return asignaturas;
    }

    public void estudiantesCasa(String casa) {
        String consulta = "select e.nombre, e.apellido " +
                "from Estudiante e join Casa c on e.id_casa = c.id_casa " +
                "where c.nombre = ?";

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
        String consulta = "select m.nombre from Mascota m " +
                "join Estudiante e on m.id_estudiante = e.id_estudiante " +
                "where e.nombre = ? and e.apellido = ?";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia= cone.prepareStatement(consulta);
            sentencia.setString(1, nombre);
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

    public void numEstudiantesCasa(String casa) {
        String consulta = "select c.nombre, count(c.id_estudiante) as cant_estudiantes " +
                "from Casa c join Estudiante e on c.id_casa = e.id_casa" +
                "group by c.nombre";

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
        String consulta = "insert into Asignatura (nombre, aula, obligatoria) values (?, ?, ?)";
        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            sentencia.setString(2, aula);
            sentencia.setBoolean(3, obligatoria);
            sentencia.executeUpdate();
            System.out.println("C insertada correctamente.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void modificarAsignatura(int id, String nuevaAula) {
        String consulta = "update Asignatura set aula = ? where id_asignatura = ?";
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

    public void eliminarAsignatura(int id) {
        String consulta = "delete from Asignatura where id_asignatura=?";
        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            sentencia.setInt(1, id);
            sentencia.executeUpdate();
            System.out.println(" Asignatura eliminada correctamente.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
