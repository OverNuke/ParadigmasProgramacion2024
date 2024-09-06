public class Estudiante {

    private String nombre;
    private String correo;
    private String matricula;
    private String telefono;
    private String semestre;

    public Estudiante(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters & Setters
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getSemestre() { return semestre; }

    public void setSemestre(String semestre) { this.semestre = semestre; }
}
