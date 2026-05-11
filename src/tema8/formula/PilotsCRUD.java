package tema8.formula;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PilotsCRUD {

    private static Connection conectar() throws SQLException {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("formuladb.properties")) {
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

    public static void CreatePilot(Piloto p) {
        String consulta = "INSERT INTO drivers (code, forename, surname, dob, nationallity, url) VAUES (?, ?, ?, ?, ?, ?)";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);

            sentencia.setString(1, p.getCodigo());
            sentencia.setString(2, p.getNombre());
            sentencia.setString(3, p.getApellido());
            sentencia.setDate(4, p.getFechaNacimiento());
            sentencia.setString(5, p.getNacionalidad());
            sentencia.setString(6, p.getUrl());

            int filas = sentencia.executeUpdate();
            if (filas > 0) {
                System.out.println("El piloto " + p.getNombre() + p.getApellido() + " ha sido añadido correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Piloto ReadPilot(int id) {
        Piloto piloto = null;
        String consulta = "SELECT * FROM drivers WHERE driverid = ?";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia= cone.prepareStatement(consulta);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                piloto = new Piloto(
                        rs.getInt("driverid"),
                        rs.getString("code"),
                        rs.getString("forename"),
                        rs.getString("surname"),
                        rs.getDate("dob"),
                        rs.getString("nationality"),
                        rs.getString("url")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return piloto;
    }

    public static List<Piloto> ReadPilots() {
        List<Piloto> pilotos = new ArrayList<>();
        String consulta = "SELECT * FROM drivers";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia= cone.prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                Piloto piloto = new Piloto(
                        rs.getInt("driverid"),
                        rs.getString("code"),
                        rs.getString("forename"),
                        rs.getString("surname"),
                        rs.getDate("dob"),
                        rs.getString("nationality"),
                        rs.getString("url")
                );
                pilotos.add(piloto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pilotos;
    }

    public static void UpdatePilot(Piloto p) {
        String consulta = "UPDATE drivers SET code = ?, forename = ?, surname = ?, dob = ?, nationality = ?, url = ? WHERE driverid = ?";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);

            sentencia.setString(1, p.getCodigo());
            sentencia.setString(2, p.getNombre());
            sentencia.setString(3, p.getApellido());
            sentencia.setDate(4, p.getFechaNacimiento());
            sentencia.setString(5, p.getNacionalidad());
            sentencia.setString(6, p.getUrl());

            int filas = sentencia.executeUpdate();
            if (filas > 0) {
                System.out.println("El piloto " + p.getNombre() + p.getApellido() + " ha sido actualizado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void DeletePilot(Piloto p) {
        String consulta = "DELETE FROM drivers WHERE driverid = ?";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);

            sentencia.setInt(1, p.getIdPiloto());

            int filas = sentencia.executeUpdate();
            if (filas > 0) {
                System.out.println("El piloto " + p.getNombre() + p.getApellido() + " ha sido eliminado correctamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void ShowPilotClassification() {
        String consulta = "SELECT * FROM get_drivers_standings()";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();
            System.out.println("----CLASIFICACIÓN----");
            while (rs.next()) {
                String nombre = rs.getString("driver");
                long puntos = rs.getLong("points");
                System.out.println("- " +  nombre + ": " + puntos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void ShowBuildersClassification() {
        String consulta =
                "SELECT c.name AS Equipo, r.points AS Puntos " +
                "FROM constructors c JOIN drivers d ON c.constructorid = d.driverid " +
                "JOIN results r ON d.driverid = r.driverid " +
                "GROUP BY Equipo " +
                "ORDER BY Puntos DESC";

        try (Connection cone = conectar()) {
            PreparedStatement sentencia = cone.prepareStatement(consulta);
            ResultSet rs = sentencia.executeQuery();

            System.out.println("----CLASIFICACIÓN POR EQUIPOS----");
            while (rs.next()) {
                String equipo = rs.getString("Equipo");
                long puntos = rs.getLong("Puntos");
                System.out.println("- " +  equipo + ": " + puntos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
