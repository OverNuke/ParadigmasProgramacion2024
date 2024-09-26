public class App {
    public static void main(String[] args) {
        EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial("Juan", 100, 1);
        empleadoTiempoParcial.setHorasPorSemana(40);
        System.out.println("Salario de empleado tiempo parcial: " + empleadoTiempoParcial.calcularSalario());
        System.out.println("Incentivo de empleado tiempo parcial: " + empleadoTiempoParcial.calcularIncentivo());

        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Pedro", 200, 2);
        empleadoTiempoCompleto.setHorasTrabajadas(40);
        System.out.println("Salario de empleado tiempo completo: " + empleadoTiempoCompleto.calcularSalario());
        System.out.println("Incentivo de empleado tiempo completo: " + empleadoTiempoCompleto.calcularIncentivo());
    }
}
