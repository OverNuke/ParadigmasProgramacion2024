package Model;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuario {

    private String matricula;
    private String semestre;
    ArrayList <CitaMaestro> tutoriasAgendades = new ArrayList<>();
    // Constructor

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

    public void  addTutoriaMaestro (Maestro maestro, Date fecha, String hora) {
        CitaMaestro citaMaestro = new CitaMaestro(maestro,this);
        citaMaestro.agendar(fecha,hora);
        tutoriasAgendades.add(citaMaestro);
    }

    public ArrayList<CitaMaestro> getTutoriasAgendades() {
        return tutoriasAgendades;
    }
}