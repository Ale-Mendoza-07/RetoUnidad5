package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    private static final String DATABASE_LOCATION = "C:\\Users\\Ana Maria\\Documents\\UTP_MINTIC\\Ciclo 2\\Retos\\Reto 4_Mio\\reto4_p50\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
    
}
