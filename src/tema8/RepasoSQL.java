package tema8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class RepasoSQL {
    public static void main(String args[]) throws SQLException {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/db.properties")) {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String url = prop.getProperty("db.url");
        String user = prop.getProperty("db.user");
        String password = prop.getProperty("db.password");

        String sentencia1 = "SELECT nombre, apellido FROM Profesor";
        String sentencia2 = "SELECT nombre, apellido FROM Estudiante WHERE fecha_nacimiento > '1980-01-01'";
        String sentencia3 = "SELECT nombre, apellido FROM Estudiante ORDER BY fecha_nacimiento ASC";
        String sentencia4 =
                "SELECT c.nombre_casa, COUNT(e.id_estudiante) AS total_estudiantes " +
                        "FROM Casa c JOIN Estudiante e ON c.id_casa = e.id_casa " +
                        "GROUP BY c.id_casa";
        String sentencia5 =
                "SELECT AVG(ea.calificacion) AS media, MAX(ea.calificacion) AS mejor_nota " +
                        "FROM Estudiante_Asignatura ea JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura " +
                        "WHERE a.nombre_asignatura = 'Pociones'";
        String sentencia6 =
                "SELECT DISTINCT anyo_curso " +
                        "FROM Estudiante";
        String sentencia7 =
                "SELECT nombre, apellido " +
                        "FROM Estudiante " +
                        "WHERE apellido LIKE 'P%'";
        String sentencia8 =
                "SELECT nombre, apellido " +
                        "FROM Estudiante " +
                        "WHERE anyo_curso like '4º' OR anyo_curso Like '5º'";
        String sentencia9 =
                "SELECT e.nombre, e.apellido " +
                        "FROM Estudiante e JOIN Casa c ON c.id_casa = e.id_casa " +
                        "WHERE e.anyo_curso like '5º' AND (c.nombre_casa LIKE 'Gryffindor' OR c.nombre_casa LIKE 'Slytherin')";
        String sentencia10 =
                "SELECT nombre, apellido " +
                        "FROM Estudiante " +
                        "ORDER BY fecha_nacimiento ASC LIMIT 5";
        String sentencia11 =
                "SELECT e.nombre, e.apellido, ea.calificacion AS nota_vuelo " +
                        "FROM Estudiantes e JOIN Estudiante_Asignatura ea ON e.id_estudiante = ea.id_estudiante " +
                        "JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura " +
                        "WHERE a.nombre_asignatura = 'Vuelo' AND ea.calificacion >= 8";
        String sentencia12 =
                "INSERT INTO Estudiantes (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) " +
                        "VALUES ('Nymphadora', 'Tonks', 4, '7º', '1973-11-25')";
        String sentencia13 =
                "UPDATE Casa " +
                        "SET jefe = (SELECT id_profesor FROM Profesor WHERE nombre = 'Pomona') " +
                        "WHERE nombre_casa = 'Hufflepuff'";
        String sentencia14 =
                "DELETE FROM Estudiante WHERE nombre = 'Tom'";
        String sentencia15 =
                "SELECT e.nombre, e.apellido, c.nombre_casa " +
                        "FROM Estudiante e JOIN Casa c ON e.id_casa = c.id_casa";
        String sentencia16 =
                "SELECT e.nombre, m.nombre_mascota, a.nombre_asignatura " +
                        "FROM Estudiante e LEFT JOIN Mascota m ON e.id_estudiante = m.id_estudiante " +
                        "JOIN Estudiante_Asignatura ea ON e.id_estudiante = ea.id_estudiante " +
                        "JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura";
        String sentencia17 =
                "SELECT nombre " +
                        "FROM Estudiante " +
                        "WHERE id_estudiante IN (" +
                        "SELECT id_estudiante " +
                        "FROM Estudiante_Asignatura " +
                        "WHERE id_asignatura = (SELECT id_asignatura FROM Asignatura WHERE nombre_asignatura = 'Encantamientos')" +
                        "AND calificacion > (" +
                        "SELECT AVG(calificacion) " +
                        "FROM Estudiante_Asignatura " +
                        "WHERE id_asignatura = (SELECT id_asignatura FROM Asignatura WHERE nombre_asignatura = 'Encantamientos')" +
                        "));";
        String sentencia18 =
                "SELECT c.nombre_casa " +
                        "FROM Casa c " +
                        "JOIN Estudiante e ON c.id_casa = e.id_casa " +
                        "JOIN Estudiante_Asignatura ea ON e.id_estudiante = ea.id_estudiante " +
                        "GROUP BY c.nombre_casa " +
                        "HAVING AVG(ea.calificacion) > 7";

        try (Connection con = DriverManager.getConnection(url, user, password);) {
//1
            PreparedStatement sentencia = con.prepareStatement(sentencia1);
            ResultSet resultados = sentencia.executeQuery();
            System.out.println("----Lista de Profesores----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("- " + nombre + " " + apellido);
            }
//2
            sentencia = con.prepareStatement(sentencia2);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Estudiantes nacidos despues de 1980----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("- " + nombre + " " + apellido);
            }
//3
            sentencia = con.prepareStatement(sentencia3);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Estudiantes ordenados por edad----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("- " + nombre + " " + apellido);
            }
//4
            sentencia = con.prepareStatement(sentencia4);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Número de estudiantes por casa----");
            while (resultados.next()) {
                String casa = resultados.getString("nombre_casa");
                int total_estudiantes = resultados.getInt("total_estudiantes");
                System.out.println("- " + casa + ": " + total_estudiantes + " estudiantes");
            }
//5
            sentencia = con.prepareStatement(sentencia5);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Número de estudiantes por casa----");
            while (resultados.next()) {
                double media = resultados.getDouble("media");
                double max = resultados.getDouble("mejor_nota");
                System.out.println("- Nota media: " + media + "\n- Mejor nota: " + max);
            }
//6
            sentencia = con.prepareStatement(sentencia6);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Años de curso sin duplicados----");
            while (resultados.next()) {
                int anio = resultados.getInt("anyo_curso");
                System.out.println("- " + anio);
            }
//7
            sentencia = con.prepareStatement(sentencia7);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Alumnos cuyo apellido empieza con P----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("- " + nombre + " " + apellido);
            }
//8
            sentencia = con.prepareStatement(sentencia8);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Alumnos cuyo apellido empieza con P----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String anyo_curso = resultados.getString("anyo_curso");
                System.out.println("- " + nombre + " " + apellido + ", " + anyo_curso);
            }
//9
            sentencia = con.prepareStatement(sentencia9);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Alumnos de 5º de Gryffindor y Slytherin----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("- " + nombre + " " + apellido);
            }
//10
            sentencia = con.prepareStatement(sentencia10);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Top 5 alumnos ordenados por edad----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                System.out.println("- " + nombre + " " + apellido);
            }
//11
            sentencia = con.prepareStatement(sentencia11);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Alumnos excelentes en vuelo----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int nota = resultados.getInt("nota_vuelo");
                System.out.println("- " + nombre + " " + apellido + ", " + nota);
            }
//12
            sentencia = con.prepareStatement(sentencia12);
            int cambios = sentencia.executeUpdate();
            System.out.println("\n----Insertado de nuevo alumno----");
            if (cambios > 0) {
                System.out.println("Estudiante 'Nymphadora Tomks' insertado correctamente.");
            }
//13
            sentencia = con.prepareStatement(sentencia13);
            cambios = sentencia.executeUpdate();
            System.out.println("\n----Actualización del jefe de Hufflepuff----");
            if (cambios > 0) {
                System.out.println("Jefe de Hufflepuff actualizado correctamente.");
            } else {
                System.out.println("No se encontro la casa o el jefe.");
            }
//14
            sentencia = con.prepareStatement(sentencia14);
            cambios = sentencia.executeUpdate();
            System.out.println("\n----Eliminado del estudiante 'Tom Riddle'----");
            if (cambios > 0) {
                System.out.println("El estudiante 'Tom Riddle' ha sido eliminado correctamente.");
            } else {
                System.out.println("No se encontro el estudiante.");
            }
//15
            sentencia = con.prepareStatement(sentencia15);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Lista de estudiantes junto con su casa----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String casa = resultados.getString("nombre_casa");
                System.out.println("- " + nombre + " " + apellido + ", de " + casa);
            }
//16
            sentencia = con.prepareStatement(sentencia16);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Lista de estudiantes con sus mascotas y asignaturas----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                String mascota = resultados.getString("nombre_mascota");
                String asignatura = resultados.getString("nombre_asignatura");
                if (mascota == null) {
                    mascota = "(sin mascota)";
                }
                System.out.println("- " + nombre + ":\nMascota: " + mascota + "\nAsignatura: " + asignatura);
            }
//17
            sentencia = con.prepareStatement(sentencia17);
            resultados = sentencia.executeQuery();
            System.out.println("\n----Estudiantes sobresalientes en Encantamientos----");
            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                System.out.println("- " + nombre);
            }
//18
            sentencia = con.prepareStatement(sentencia18);
            resultados = sentencia.executeQuery();
            System.out.println("\n---Lista de casas con media superior a 7----");
            while (resultados.next()) {
                String casa = resultados.getString("nombre_casa");
                System.out.println("- " + casa);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}