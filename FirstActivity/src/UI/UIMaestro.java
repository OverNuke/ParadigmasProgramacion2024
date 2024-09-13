package UI;

import java.util.Scanner;
import static UI.UIMenu.*;

public class UIMaestro {
    public static void maestrosMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
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
        System.out.println("Ingresa la fecha del curso [dd/mm/aaaa]: ");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        System.out.println("Ingresa la hora del curso [hh:mm]: ");
        String hora = sc.nextLine();
    }

    public static void listarCursos () {
        System.out.println("Listar cursos");
    }
}
