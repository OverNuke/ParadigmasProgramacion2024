public class Maestro {
    // Atributos
    public static int id = 0;
    private String nombre;
    private String especialidad;

    // Constructor
    public Maestro() {
        System.out.println("Hola, yo me ejecute primero");
        id++;
    }

    // Comportamiento / Método
    public void mostrarNombre () {
        System.out.println("Nombre: " + nombre);
    }
    public void mostrarID() {
        System.out.println("ID: " + id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
