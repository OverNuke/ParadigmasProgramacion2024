public abstract class Empleado {
    private String nombre;
    private double salario;
    private int id;


    public Empleado(String nombre, double salario, int id) {
        this.nombre = nombre;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calcularSalario();
}
