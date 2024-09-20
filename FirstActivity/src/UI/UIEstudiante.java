package UI;

import java.util.Scanner;
import static UI.UIMenu.*;

public class UIEstudiante {
    public static final String [] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agostro","Septiembre","Octubre","Noviembre","Diciembre"};

    public static void estudianteMenu() {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("..::Estudiantes::..");
            System.out.print("1. Agendar tutoría\n2. Consultar mis tutoría\n0. cancelar\n");
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta) {
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
        } while (respuesta != 0);
    }


    private static void agendarTutoria() {
        System.out.println("..::Agendar tutoria::..");

        for (int i = 0; i < maestros.size(); i++) {
            if (!maestros.get(i).getTutoriasDisponibles().isEmpty()) {
                System.out.println("Maestro: " + maestros.get(i).getNombre());
                System.out.printf("""
                        Tutorías disponibles:
                        (%d) %s 
                        """,i+1, maestros.get(i).getTutoriasDisponibles());
            }
        }

    }
    private static void consultarTutoria() {
        System.out.println("..::Consultar mis tutoria::..");
    }
}
