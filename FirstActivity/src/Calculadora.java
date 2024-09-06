public class Calculadora {
    public static final double PI = 3.14159265358979323846;

    public static void sumar (int a, int b) {
        int resultado = a + b;
        System.out.println("Resultado: "+resultado);
    }
    public static void sumar (int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println("Soy el primer método de sobrecarga");
        System.out.println("Resultado: "+resultado);
    }
    public static void sumar (double a, double b, double c) {
        double resultado = a + b + c;
        System.out.println("Soy el segundo método de sobrecarga");
        System.out.println("Resultado: "+resultado);
    }

}
