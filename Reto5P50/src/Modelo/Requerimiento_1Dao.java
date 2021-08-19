package Modelo;
import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> respuesta = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select Fecha_Inicio, Constructora, Ciudad, Acabados, Banco_Vinculado, Serial from Proyecto where Clasificacion = 'Casa' limit 25;";


        
            try (Statement statement = conexion.createStatement(); ResultSet resultSet = statement.executeQuery(consulta)) {
                
                
                while (resultSet.next()) {
                    Requerimiento_1 requerimiento1 = new Requerimiento_1();
                    requerimiento1.setFecha(resultSet.getString("Fecha_Inicio"));
                    requerimiento1.setConstructora(resultSet.getString("Constructora"));
                    requerimiento1.setCiudad(resultSet.getString("Ciudad"));
                    requerimiento1.setBanco(resultSet.getString("Banco_Vinculado"));
                    requerimiento1.setAcabados(resultSet.getString("Acabados"));
                    requerimiento1.setSerial(resultSet.getString("Serial"));
                    respuesta.add(requerimiento1);
                }
                
            }

        } catch (SQLException e) {
            System.err.println("Error consultando ranking de los 25 proyectos clasificados por casa: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        return respuesta;

    }
}
