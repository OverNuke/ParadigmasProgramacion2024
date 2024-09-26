public class EmpleadoTiempoParcial extends Empleado implements IEmpleado{
    private int horasPorSemana;
    public EmpleadoTiempoParcial(String nombre, double salario, int id) {
        super(nombre, salario, id);
    }

    public int getHorasPorSemana() {
        return horasPorSemana;
    }

    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * getHorasPorSemana();
    }

    @Override
    public double calcularIncentivo() {
        return (calcularSalario() * 0.03);
    }
}
