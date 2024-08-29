public class Main {
    public static void main(String[] args) {
        Maestro maestro = new Maestro();
        maestro.setNombre("Mr.Sigma");
        maestro.mostrarNombre();
        maestro.mostrarID();
        System.out.println("------------------");

        Maestro.id++;

        Maestro maestro2 = new Maestro();
        maestro2.setNombre("Mrs.Bubble");
        maestro2.mostrarNombre();
        maestro2.mostrarID();
        System.out.println("------------------");
        Maestro.id++;
        System.out.println(Maestro.id);
        System.out.println("------------------");
        Calculadora.sumar(4,8);
        System.out.println(Calculadora.PI);
    }
}
