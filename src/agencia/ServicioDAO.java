package agencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;

public class ServicioDAO {
    public static boolean guardarServicio(String tipo, boolean pagado, int presupuesto, String placas){
        try (Connection conexion = ConexBD.obtenerConexion()) {
            String sql = "INSERT INTO servicio (tipo, pagado, presupuesto, auto_placa) VALUES (?,?,?,?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, tipo);
                statement.setBoolean(2, pagado);
                statement.setInt(3, presupuesto);
                statement.setString(4, placas);
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
