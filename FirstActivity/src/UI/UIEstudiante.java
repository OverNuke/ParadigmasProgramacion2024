package UI;

import Model.Maestro;

import java.util.Scanner;
import static UI.UIMenu.*;

public class UIEstudiante {
    public static final String [] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agostro","Septiembre","Octubre","Noviembre","Diciembre"};

    public static void estudianteMenu() {
        Scanner sc = new Scanner(System.in);
        int validacion;
        do {
            System.out.println("Bienvenido " + estudiantelogeado.getNombre());
            System.out.println("..::Estudiantes::..");
            System.out.print("1. Agendar tutoría\n2. Consultar mis tutoría\n0. cancelar\n");
            validacion = Integer.valueOf(sc.nextLine());
            switch (validacion) {
                case 1:
                    agendarTutoria();
                    break;
                case 2:
                    consultarTutoria();
                    break;
                case 0:
                    System.out.println("Bye...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (validacion != 0);
    }


    public static void agendarTutoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("..::Agendar tutoria::..");
        int validacion;
        do {
            int i = 0;
            System.out.println("Seleccione un maestro:");
            for (Maestro maestro : UIMaestro.maestrosConTutorias) {
                System.out.printf("""
                    (%d) - %s
                    """, ++i, maestro.getNombre());
            }
            int maestroSelec = sc.nextInt();
            Maestro maestroSeleccionado = UIMaestro.maestrosConTutorias.get(maestroSelec - 1);
            System.out.println("Selecciona una tutoria:");
            i = 0;
            for (Maestro.TutoriasDisponibles mtd : maestroSeleccionado.getTutoriasDisponibles()) {
                System.out.printf("""
                    (%d) - %s %s
                    """, ++i, mtd.getFecha(), mtd.getHora());
            }

            int tutoSelec = sc.nextInt();
            Maestro.TutoriasDisponibles tutoSeleccionada = maestroSeleccionado.getTutoriasDisponibles().get(tutoSelec - 1);



            do {
                System.out.printf("""
                    El maestro seleccionado fue: %s.
                    La tutoría seleccionada fue: %s %s.
                    """, maestroSeleccionado.getNombre(),tutoSeleccionada.getFecha(), tutoSeleccionada.getHora());
                System.out.println("1. Agendar\n2. Cambiar");
                validacion = sc.nextInt();
            } while (validacion < 1 || validacion > 2);
            if (validacion == 1) {
                System.out.println("Tutoria agendada");
                UIMenu.estudiantelogeado.addTutoriaEstudiante(maestroSeleccionado, tutoSeleccionada.getFechaDate(), tutoSeleccionada.getHora());
            }
        } while (validacion != 1);

    }
    private static void consultarTutoria() {
        System.out.println("..::Consultar mis tutoria::..");
    }
}
