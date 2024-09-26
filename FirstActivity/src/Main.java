import Model.Maestro;
import UI.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        UIMenu.mostrarMenu();
        // UIMenu.estudianteMenu();

        Maestro maestro = new Maestro("Kevin");
        System.out.println(maestro.getNumPersonal() + " "+ maestro.getNombre());
        // Agregar tutorías
//        maestro.addCursoDisponible(new Date() , "12:00");
//        maestro.addCursoDisponible(new Date() , "16:00");
//        maestro.addCursoDisponible(new Date() , "18:00");


        Maestro maestro2 = new Maestro("Tom");
        System.out.println(maestro2.getNumPersonal() + " "+ maestro2.getNombre());
        // Agregar tutorías
//        maestro2.addCursoDisponible(new Date() , "11:00");
//        maestro2.addCursoDisponible(new Date() , "13:00");
//        maestro2.addCursoDisponible(new Date() , "16:00");


    }
}


