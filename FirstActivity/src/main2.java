import java.util.Date;

public class main2 {
    public static void main(String[] args) {
        Maestro maestro = new Maestro("Kevin", 123, "Historia");
        maestro.setCorreo("kevin@example.com");
        maestro.setTelefono("1234567890");
        maestro.addCursoDisponible(new Date() , "12:00");
        maestro.addCursoDisponible(new Date() , "16:00");
        maestro.addCursoDisponible(new Date() , "18:00");
        System.out.println(maestro);
    }
}
