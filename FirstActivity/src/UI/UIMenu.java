package UI;

import java.util.Scanner;

public class UIMenu {
    public static final String [] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agostro","Septiembre","Octubre","Noviembre","Diciembre"};

    public static void mostrarMenu () {
        Scanner sc = new Scanner(System.in);
        int opcion ;
        do {
            System.out.println("..::Bienvenidos::..");
            System.out.println("Seleccione una opción:");
            System.out.print("1. Maestro\n2. Estudiante\n0. Salir\n");
            // int opcion = sc.nextInt();
            opcion = Integer.valueOf(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("..::Maestros::..");
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 0:
                    System.out.println("Bye...");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != 0);
    }

    public static void estudianteMenu () {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("..::Estudiantes::..");
            System.out.print("1. Agendar tutoria\n2. Consultar mis tutoria\n0. cancelar\n");
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta) {
                case 1:
                    System.out.println("..::Agendar tutoria::..");
                    for (int i = 0; i < MESES.length - 1; i++) {
                        System.out.println((i + 1) +". "+ MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("..::Consultar mis tutoria::..");
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
}
