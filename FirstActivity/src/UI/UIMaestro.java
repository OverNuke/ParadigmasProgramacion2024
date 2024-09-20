package UI;

import Model.Maestro;

import java.util.ArrayList;
import java.util.Scanner;
import static UI.UIMenu.*;

public class UIMaestro {
    public static ArrayList<Maestro> maestrosConTutorias = new ArrayList<>();
    public static void maestrosMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido " + maestrologeado.getNombre());
            System.out.println("..::Maestros::..");
            System.out.printf("1. Agregar curso\n2. Listar mis cursos\n3. Salir\n");
            opcion = Integer.valueOf(sc.nextLine());

            switch (opcion) {
                case 1:
                    agregarTuroria();
                    break;
                case 2:
                    listarCursos();
                    break;
                case 3:
                    System.out.println("Bye...");
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != 3);
    }

    public static void agregarTuroria () {
        System.out.println("--Agregar tutoria--");

        boolean tutoriaAgregada = true;
        do {
            System.out.println("Ingresa la fecha del curso [dd/mm/aaaa]: ");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("Ingresa la hora del curso [hh:mm]: ");
            String hora = sc.nextLine();

            boolean tutoriaValidada = true;

            do {
                System.out.println("La tutoría es: " + fecha + " a las " + hora);
                System.out.print("1. Agregar tutoría\n2. Cambiar\n");
                int respuesta = sc.nextInt();
                if (respuesta == 2) {
                    tutoriaValidada = false;
                } else if (respuesta == 1) {
                    tutoriaAgregada = false;
                    tutoriaValidada = false;
                    maestrologeado.addCursoDisponible(fecha, hora);
                    consultarMaestroConTutoria(maestrologeado);
                } else {
                    System.out.println("Opción no valida");
                }
            } while (tutoriaValidada);

        } while (tutoriaAgregada);
    }

    private static void consultarMaestroConTutoria(Maestro maestrologeado) {
        if (!maestrosConTutorias.contains(maestrologeado)) {
            maestrosConTutorias.add(maestrologeado);
        }
    }

    public static void listarCursos () {
        System.out.println("Listar cursos");

        if (maestrologeado.getTutoriasDisponibles().size() == 0) { // isEmpty()
            System.out.println("No tienes cursos disponibles");
        } else {
            for (int i = 0; i < maestrologeado.getTutoriasDisponibles().size(); i++) {
                System.out.println((i+1) + ".- " + maestrologeado.getTutoriasDisponibles().get(i).getFecha() + " "
                        + maestrologeado.getTutoriasDisponibles().get(i).getHora());
            }
        }
        System.out.println();
    }
}
