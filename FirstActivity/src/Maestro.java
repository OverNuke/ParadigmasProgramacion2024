public class Maestro {
    // Le pertenece a la clase -> Atributo
    public static int ID = 1;
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
        System.out.println("Sobrecarga con un argumento");
        this.nombre = nombre;
        this.id = ID;
        ID++;

    }

    public Maestro(String nombre, String especialidad) {
        System.out.println("Sobrecarga con dos argumento");
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.id = ID;
        ID++;
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
