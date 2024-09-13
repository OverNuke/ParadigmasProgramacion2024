package Model;

public class Estudiante extends Usuario {

    private String matricula;
    private String semestre;

    // Constructor

    public Estudiante() { }

    public Estudiante(String nombre) {
        super(nombre);
    }

    public Estudiante(String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
    }

    // Getters & Setters

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getSemestre() { return semestre; }

    public void setSemestre(String semestre) { this.semestre = semestre; }

    @Override
    public String toString() {
        return super.toString() + "Matricula: " + matricula + " Semestre: " + semestre + "\n";
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un estudiante");
    }
}
