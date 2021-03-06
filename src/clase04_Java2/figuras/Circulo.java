package clase04_Java2.figuras;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(int radio) { this.radio = radio;}

    @Override
    public double area() {
        return Math.PI * Math.sqrt(this.radio);
    }
}
