import UI.UIMenu;

import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // mostrarMenu();
        // UIMenu.estudianteMenu();

        Maestro maestro = new Maestro("Kevin");
        System.out.println(maestro.getNumPersonal() + " "+ maestro.getNombre());
        // Agregar tutorías
        maestro.addCursoDisponible(new Date() , "12:00");
        maestro.addCursoDisponible(new Date() , "16:00");
        maestro.addCursoDisponible(new Date() , "18:00");
        //Listar tutorias
        for (Maestro.TutoriasDisponibles tuto : maestro.getTutoriasDisponibles()) {
            System.out.println(tuto.getFecha()+ " " +tuto.getHora());
        }

        Maestro maestro2 = new Maestro("Tom");
        System.out.println(maestro2.getNumPersonal() + " "+ maestro2.getNombre());
        // Agregar tutorías
        maestro2.addCursoDisponible(new Date() , "11:00");
        maestro2.addCursoDisponible(new Date() , "13:00");
        maestro2.addCursoDisponible(new Date() , "16:00");
        //Listar tutorias
        for (Maestro.TutoriasDisponibles tuto : maestro2.getTutoriasDisponibles()) {
            System.out.println(tuto.getFecha()+ " " +tuto.getHora());
        }


        ClaseExterna ins = new ClaseExterna();
        ClaseExterna.ClaseInterna insInterna = ins.new ClaseInterna();
        insInterna.saludar();
        ins.metodoExterno();
    }
}


