package at.fhtw.DBCOnnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnector {

    private static String dbUrl = "jdbc:postgresql://172.17.0.2:5432/swen1db";
    private static String dbUser = "pwd123456";
    private static String dbPassword = "pwd123456";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
