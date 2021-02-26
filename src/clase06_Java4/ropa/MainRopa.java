package clase06_Java4.ropa;

import java.util.ArrayList;
import java.util.List;

public class MainRopa {
    public static void main(String[] args) {
        Prenda prenda = new Prenda("Nike","XL");
        List<Prenda> p = new ArrayList<>();
        p.add(prenda);


         GuardarRopa g = new GuardarRopa();
         g.guardarPrendas(p);
         g.mostrarPrendas();
         g.devolverPrendas(1);
         g.mostrarPrendas();
    }
}
