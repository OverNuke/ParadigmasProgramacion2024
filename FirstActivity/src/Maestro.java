import java.util.ArrayList;
import java.util.Date;

public class Maestro {
    // Le pertenece a la clase -> Atributo
    private static int ID = 1;
    // Atributos de la clase
    private int id;
    private String nombre;
    private String especialidad;

    // Constructor
    public Maestro() {
        System.out.println("Hola, yo me ejecute primero");
        this.id = ID;
        ID++;
    }

    public Maestro(String nombre) {
        this.nombre = nombre;
        this.id = ID;
        ID++;

    }

    /* Comportamiento | Método*/
    public void mostrarNombre () {
        System.out.println("Nombre: " + nombre);
    }
    public void mostrarID() {
        System.out.println("ID: " + id);
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList <TutoriasDisponibles> tutoriasDisponibles = new ArrayList <> ();

    // Clase anidada
    public static class TutoriasDisponibles {
        private int id;
        private Date fecha;
        private String hora;


        public TutoriasDisponibles(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }


    }
}
