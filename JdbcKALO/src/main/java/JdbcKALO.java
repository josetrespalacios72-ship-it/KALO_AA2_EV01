import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcKALO {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/kalo";
        String usuario = "root";
        String password = "";

        try {
           Connection conexion = DriverManager.getConnection(url, usuario, password);

String sql = "DELETE FROM alimentos WHERE id = ?";
PreparedStatement ps = conexion.prepareStatement(sql);

ps.setInt(1, 1);

ps.executeUpdate();

System.out.println("Alimento eliminado correctamente");

conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}