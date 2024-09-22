import Model.EmpleadoTiempoCompleto;
import Model.EmpleadoTiempoParcial;

public class MainApp {

    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleadoTiempoCompleto =
                new EmpleadoTiempoCompleto("Kevin",22017021,267,40);

        EmpleadoTiempoParcial empleadoTiempoParcial =
                new EmpleadoTiempoParcial("Miguel",9234950,93,26);

        System.out.printf("""
                (1) Empleado a tiempo completo:
                %s
                (2) Empleado a tiempo parcial:
                %s
                """, empleadoTiempoCompleto,empleadoTiempoParcial);
    }
}
