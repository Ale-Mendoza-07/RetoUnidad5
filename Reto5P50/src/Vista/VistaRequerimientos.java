
package Vista;
import Controlador.ControladorRequerimientos;
import Modelo.Requerimiento_1;
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientos {
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("25 Proyectos Clasificados por Casa");
        try {
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();

            System.out.println("Clasificación por Casa");

            requerimiento1.forEach(req1 -> {
                System.out.printf("%s %s %s %s %s %s %n",
                        req1.getFecha(),
                        req1.getConstructora(),
                        req1.getCiudad(),
                        req1.getAcabados(),
                        req1.getBanco(),
                        req1.getSerial());
            });

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
    
}
