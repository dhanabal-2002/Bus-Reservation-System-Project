package BusReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url ="jdbc:mysql://localhost:3306/busresv";
    private static final String name ="root";
    private static final String password ="Password";

    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url,name,password);
    }
}
