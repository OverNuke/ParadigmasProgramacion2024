public class ClaseExterna {
    private String nombre = "kevin";

    public class ClaseInterna {
        public void saludar () {
            System.out.println("hola " + nombre +", soy una clase interna.");
        }
    }

    public void metodoExterno () {
        class ClaseLocal {
            public void saludar () {
                System.out.println("Hola " + nombre + ", soy una clase local.");
            }
        }
        ClaseLocal claseLocal = new ClaseLocal();
        claseLocal.saludar();
    }
}
