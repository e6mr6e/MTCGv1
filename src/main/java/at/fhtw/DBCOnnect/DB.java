package at.fhtw.DBCOnnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB {
    public static void main(String[] args) {
        Connection connection = DatabaseConnector.connect();
        if (connection != null) {

            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Verbindung zur Datenbank fehlgeschlagen.");
        }
    }
}
