package clase04_Java2.figuras;

public abstract class FiguraGeometrica {

    public abstract double area();

    public void imprimirArea() {
        System.out.printf("El area del %s es %.4f%n", this.getClass().getSimpleName(), area());
    }
}
