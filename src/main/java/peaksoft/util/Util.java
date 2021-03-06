package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private final Connection connection;

    public Util() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project_db",
                "postgres",
                "postgresql22");
    }

    public Connection getConnection() {
        return connection;

    }
}
