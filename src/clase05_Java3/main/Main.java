package clase05_Java3.main;

import clase05_Java3.model.Persona;
import clase05_Java3.model.SortUtil;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona();
        Persona p2 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();
        Persona p7 = new Persona();

        p.setNombre("Carlos");
        p2.setNombre("Ruben");
        p4.setNombre("Matias");
        p5.setNombre("Julian");
        p6.setNombre("Camila");
        p7.setNombre("Juan");
        //System.out.println(p2.precedeA(p));

       // int [] arrayInt = {2,33,45,21,6,77,88};

        Persona [] p3 = {p,p2, p4, p5, p6, p7};
        SortUtil.ordenar(p3);
        for (int i = 0; i<p3.length; i++){
            System.out.println(p3[i].toString());
        }

        //Celular[] p10 = {p,p2, p4, p5, p6, p7};

    }
}
