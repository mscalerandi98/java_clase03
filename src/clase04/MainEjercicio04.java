package clase04;

public class MainEjercicio04 {
    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println(c.incremento());
        System.out.println(c.incremento());

        Libro l = new Libro();
        l.setAutor("Capussoto");
        l.setIsbn("2319239789");
        l.setTitulo("La odisea de los giles");
        l.setEstaPrestado(true);
        System.out.println(l.toString());
        l.prestamo();
        l.devolucion();

        l.setEstaPrestado(false);
        l.prestamo();
        l.devolucion();

        Fraccion f = new Fraccion();
        f.setDenominador(5);
        f.setNumerador(10);

        System.out.println(f.sumar(5,2));
        System.out.println(f.sumar(8));
    }
}
