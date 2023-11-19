package agencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PinturaDAO {
    public static boolean guardarPintura(String pintura, String placas){
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "INSERT INTO pintura (color, auto_placa) VALUES (?,?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, pintura);
                statement.setString(2, placas);
                int filasAfectadas = statement.executeUpdate();
                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa. Filas afectadas: " + filasAfectadas);
                } else {
                    System.out.println("No se insertó ninguna fila. Verifica tu sentencia SQL.");
                    return false;
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
