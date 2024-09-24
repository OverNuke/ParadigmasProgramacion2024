package Model;

public class EmpleadoTiempoCompleto extends Empleado implements IEmpleado {
    private int horasTrabajadas;

    public EmpleadoTiempoCompleto(String nombre, int ID, double salario, int horasTrabajadas) {
        super(nombre, ID, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() * horasTrabajadas;
    }

    @Override
    public double calcularIncentivo() {
        return  Math.round(0.05 * calcularSalario());
    }

    @Override
    public String toString() {
        return "El empleado a tiempo completo: " +getNombre()+ " tiene un salario de: $"+calcularSalario()+"\n"
                + "con un incentivo de $"+calcularIncentivo();
    }
}
