import Model.Estudiante;
import Model.Maestro;
import UI.UIEstudiante;
import UI.UIMaestro;
import UI.UIMenu;
import UI.UIMenu.*;

import static UI.UIMenu.*;

public class App {

    public static void main(String[] args) {
//        maestros.add(new Maestro("Kenny", "kenny@uv.mx",922));
//        maestros.add(new Maestro("Luis Morales", "luismorales04@uv.mx", 1233));
        Maestro maestro3 = new Maestro("Patricia Martinez", "Patri@uv.mx", 1234);
        maestros.add(new Maestro("Magdiel Mercado", "Mag@uv.mx", 5786));



        estudiantes.add(new Estudiante("Juan", "juanito@estu.uv.mx", "3456789"));
        estudiantes.add(new Estudiante("Pedro", "zS15464760@estu.uv.mx", "648515"));
        estudiantes.add(new Estudiante("Maria", "zS22108439@estu.uv.mx","98471522"));
        estudiantes.add(new Estudiante("kevin", "zS22107021@estu.uv.mx", "934 385 4802"));

        // mostrarMenu();
        Maestro maestro1 = new Maestro("Kenny", "kenny@uv.mx",922);
        maestro1.addCursoDisponible("12/09/2021", "12:00");
        maestro1.addCursoDisponible("19/09/2021", "13:00");
        maestro1.addCursoDisponible("15/12/2021", "14:00");
        maestro1.addCursoDisponible("18/12/2021", "16:00");

        Maestro maestro2 = new Maestro("Luis Morales", "luismorales04@uv.mx", 1233);
        maestro2.addCursoDisponible("16/09/2021", "17:00");
        maestro2.addCursoDisponible("20/09/2021", "18:00");
        maestro2.addCursoDisponible("17/12/2021", "19:00");

        maestros.add(maestro1);
        maestros.add(maestro2);
        maestros.add(maestro3);
        UIMaestro.maestrosConTutorias.add(maestro1);
        UIMaestro.maestrosConTutorias.add(maestro2);
        UIMenu.mostrarMenu();
    }
}
