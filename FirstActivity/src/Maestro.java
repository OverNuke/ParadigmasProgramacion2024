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

    public Maestro(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
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

    public void addCursoDisponible(Date fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }
    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    // Clase anidada
    public static class TutoriasDisponibles {
        private int id = 0;
        private Date fecha;
        private String hora;


        public TutoriasDisponibles(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public Date getFecha() {
            return fecha;
        }

        public String getHora() {
            return hora;
        }
    }
}
