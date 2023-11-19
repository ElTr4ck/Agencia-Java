package agencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SucursalDAO {
    public static void guardarSucursal(Sucursal sucursal) {
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "INSERT INTO Sucursal (nombre) VALUES (?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, sucursal.getNombre());
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

    public static Sucursal obtenerSucursalPorNombre(String nombre) {
        Sucursal sucursal = null;
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "SELECT * FROM Sucursal WHERE nombre = ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, nombre);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        sucursal = new Sucursal(resultSet.getString("nombre"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sucursal;
    }

    public static void desplegarTodasLasSucursales() {
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "SELECT * FROM Sucursal";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String nombre = resultSet.getString("nombre");
                        Sucursal sucursal = new Sucursal(nombre);
                        System.out.println(sucursal);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}