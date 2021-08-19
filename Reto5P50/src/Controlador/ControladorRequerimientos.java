package Controlador;
import Modelo.Requerimiento_1;
import Modelo.Requerimiento_1Dao;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorRequerimientos {
    private final Requerimiento_1Dao requerimiento1Dao;
     public ControladorRequerimientos() {
        this.requerimiento1Dao = new Requerimiento_1Dao();
        

    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        return this.requerimiento1Dao.requerimiento1();

    }
}
