package icomcaremaster.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bankcom
 */
public class ConnectionManager {

    public static Connection ConnectionManager(
            String url,
            String user,
            String password
    ) throws SQLException, ClassNotFoundException {

        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection connectDB = DriverManager.getConnection(url, user, password);

        return connectDB;
    }

    public static void closeDB(Connection connectDB) throws SQLException {
        connectDB.close();
    }

}
