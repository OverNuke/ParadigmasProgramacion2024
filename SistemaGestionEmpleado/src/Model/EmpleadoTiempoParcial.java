package Model;

public class EmpleadoTiempoParcial extends Empleado implements IEmpleado {
    private int horasPorSemana;

    public EmpleadoTiempoParcial(String nombre, int ID, double salario, int horasPorSemana) {
        super(nombre, ID, salario);
        this.horasPorSemana = horasPorSemana;
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    @Override
    public double calcularSalario() {
        return horasPorSemana * getSalario();
    }

    @Override
    public double calcularIncentivo() {
        return Math.round(0.03 * calcularSalario());
    }

    @Override
    public String toString() {
        return "El empleado a tiempo parcial: " +getNombre()+ " tiene un salario de: $"+calcularSalario()+"\n"
                + "con un incentivo de $"+calcularIncentivo();
    }
}
