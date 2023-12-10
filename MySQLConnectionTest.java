import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase?defaultAuthenticationPlugin=mysql_native_password";
        String user = "root";
        String password = "root";

        System.out.println("Connecting to the MySQL database...");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Successfully connected to the MySQL database!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the MySQL database.");
            e.printStackTrace();
        }
    }
}