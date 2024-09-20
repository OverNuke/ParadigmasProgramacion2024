import Model.Estudiante;
import Model.Maestro;
import UI.UIMenu.*;

import static UI.UIMenu.*;

public class App {

    public static void main(String[] args) {
        maestros.add(new Maestro("Kenny", "kenny@uv.mx",922));
        maestros.add(new Maestro("Luis Morales", "luismorales04@uv.mx", 1233));
        maestros.add(new Maestro("Patricia Martinez", "Patri@uv.mx", 1234));
        maestros.add(new Maestro("Magdiel Mercado", "Mag@uv.mx", 5786));



        estudiantes.add(new Estudiante("Juan", "juanito@estu.uv.mx", "3456789"));
        estudiantes.add(new Estudiante("Pedro", "zS15464760@estu.uv.mx", "648515"));
        estudiantes.add(new Estudiante("Maria", "zS22108439@estu.uv.mx","98471522"));
        estudiantes.add(new Estudiante("kevin", "zS22107021@estu.uv.mx", "934 385 4802"));

         mostrarMenu();
    }
}
