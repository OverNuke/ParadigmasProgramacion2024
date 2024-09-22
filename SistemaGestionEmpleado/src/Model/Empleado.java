package Model;

public abstract class Empleado {
    private String nombre;
    private int ID;
    private double salario;

    public Empleado(String nombre, int ID, double salario) {
        this.nombre = nombre;
        this.ID = ID;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();
}
