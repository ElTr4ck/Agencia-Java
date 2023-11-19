package agencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoDAO {
    public static void guardarAuto(Auto auto) {
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "INSERT INTO Auto (placa, modelo, anio, sucursal_nombre) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, auto.getPlacas());
                statement.setString(2, auto.getModelo());
                statement.setInt(3, auto.getAnio());
                statement.setString(4, auto.getSucursalNombre());
                statement.executeUpdate();

                int filasAfectadas = statement.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa. Filas afectadas: " + filasAfectadas);
                } else {
                    System.out.println("No se insertó ninguna fila. Verifica tu sentencia SQL.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarAuto(String placas) {
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "DELETE FROM Auto WHERE placa = ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, placas);
                int filasAfectadas = statement.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Eliminación exitosa. Filas afectadas: " + filasAfectadas);
                } else {
                    System.out.println("No se eliminó ninguna fila. Verifica tu sentencia SQL.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Auto obtenerAutoPorPlacas(String placas) {
        Auto auto = null;
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "SELECT * FROM Auto WHERE placa = ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, placas);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        String modelo = resultSet.getString("modelo");
                        int anio = resultSet.getInt("anio");
                        String color = resultSet.getString("color");
                        String sucursalNombre = resultSet.getString("sucursal_nombre");
                        auto = new Auto(modelo, anio, placas, sucursalNombre);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return auto;
    }

    public static List<Auto> obtenerTodosLosAutos() {
        List<Auto> autos = new ArrayList<>();
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "SELECT * FROM Auto";
            try (PreparedStatement statement = conexion.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String modelo = resultSet.getString("modelo");
                    int anio = resultSet.getInt("anio");
                    String placas = resultSet.getString("placa");
                    String color = resultSet.getString("color");
                    String sucursalNombre = resultSet.getString("sucursal_nombre");
                    Auto auto = new Auto(modelo, anio, placas, sucursalNombre);
                    autos.add(auto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return autos;
    }
}
