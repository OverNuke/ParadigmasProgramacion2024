package UI;

import Model.Estudiante;
import Model.Maestro;
import Model.Secretaria;

import java.util.ArrayList;
import java.util.Scanner;
import static UI.UIEstudiante.*;
import static UI.UIMaestro.*;
import static UI.UISecretaria.*;

public class UIMenu {

    public static ArrayList <Maestro> maestros = new ArrayList<>();
    public static ArrayList <Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList <Secretaria> secretarias = new ArrayList<>();
    public static Maestro maestrologeado = new Maestro();
    public static Estudiante estudiantelogeado = new Estudiante();
    public static Secretaria secretarialogeado = new Secretaria();

    public static void mostrarMenu () {
        Scanner sc = new Scanner(System.in);
        int opcion ;
        do {
            System.out.println("..::Bienvenidos::..");
            System.out.println("Seleccione una opción:");
            System.out.print("1. Maestro\n2. Estudiante\n3. Secretaria\n0. Salir\n");
            // int opcion = sc.nextInt();
            opcion = Integer.valueOf(sc.nextLine());
            switch (opcion) {
                case 1:
                    loginUsuario(1);
                    break;
                case 2:
                    loginUsuario(2);
                    break;
                case 3:
                    loginUsuario(3);
                    break;
                case 0:
                    System.out.println("Bye...");
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != 0);
    }

    public static void loginUsuario (int tipoUsuario) {
        /*
        * 1. Maestro
        * 2. Estudiante
        * 3. Secretaria
         */
        Scanner sc = new Scanner(System.in);
        boolean usuarioEncontrado = false;
        String correo;

        do {

            System.out.println("Ingrese su correo");
            correo = sc.nextLine();

            if (tipoUsuario == 1) {
                for (Maestro maestro : maestros) {
                    if (maestro.getCorreo().equals(correo)) {
                        maestrologeado = maestro;
                        usuarioEncontrado = true;
                        System.out.println("Bienvenido " + maestro.getNombre());
                        maestrosMenu();
                    }
                }
            } else if (tipoUsuario == 2) {
                for (Estudiante estudiante : estudiantes) {
                    if (estudiante.getCorreo().equals(correo)) {
                        usuarioEncontrado = true;
                        estudiantelogeado = estudiante;
                        System.out.println("Bienvenido " + estudiante.getNombre());
                        estudianteMenu();
                    }
                }
            } else if (tipoUsuario == 3) {
                for (Secretaria secretaria : secretarias) {
                    if (secretaria.getCorreo().equals(correo)) {
                        usuarioEncontrado = true;
                        secretarialogeado = secretaria;
                        System.out.println("Bienvenido " + secretaria.getNombre());
                        secretariaMenu();
                    }
                }
            }


        } while (!usuarioEncontrado);
    }
}
