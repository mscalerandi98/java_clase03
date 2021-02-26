package clase04_Java2.figuras;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}
