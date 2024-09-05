import UI.UIMenu;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // mostrarMenu();
        // UIMenu.estudianteMenu();
        Maestro maestro = new Maestro();
        Maestro ma = new Maestro("lkjh");
        Maestro mae = new Maestro("tetga","lokujhgv");
        System.out.printf("%d %d %d ",maestro.getId(),ma.getId(),mae.getId());
    }


}
