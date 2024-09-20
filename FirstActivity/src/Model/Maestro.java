package Model;

import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario {
    private int numPersonal;

    private String especialidad;


    // Constructor
    public Maestro(String nombre) {
        super(nombre);
    }

    public Maestro() {
        System.out.println("Default constructor");
    }

    public Maestro(String nombre, String telefono) {
        super(nombre, telefono);
    }

    public Maestro (String nombre, int numPersonal, String especialidad) {
        super(nombre);
        this.numPersonal = numPersonal;
        this.especialidad = especialidad;
    }
    public Maestro(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
    }

    public Maestro(String nombre, String correo, int numPersonal) {
        super(nombre, correo);
        this.numPersonal = numPersonal;
    }


    /* Comportamiento | Método */
    public void mostrarNombre () {
        System.out.println("Nombre: " + getNombre());
    }
    public void mostrarID() {
        System.out.println("ID: " + numPersonal);
    }

    // Getters & Setters
    public int getNumPersonal() { return numPersonal; }

    public void setNumPersonal(int numPersonal) { this.numPersonal = numPersonal; }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }



    ArrayList <TutoriasDisponibles> tutoriasDisponibles = new ArrayList <> ();

    public void addCursoDisponible(String fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }
    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    // Clase anidada
    public static class TutoriasDisponibles extends CitaTutoria {
        public TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }
    }

    @Override
    public String toString() {
      return super.toString()+"Numero Personal: "+numPersonal+" Especialidad: "+especialidad+'\n'+
              "Tutorias Disponibles: \n"+tutoriasDisponibles.toString();
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un maestro");
    }
}
