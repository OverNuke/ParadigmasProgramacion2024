public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado{
    private int horasTrabajadas;
    public EmpleadoTiempoCompleto(String nombre, double salario, int id) {
        super(nombre, salario, id);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * getHorasTrabajadas();
    }

    @Override
    public double calcularIncentivo() {
        return (calcularSalario() * 0.03);
    }
}