package clase04_Java2.figuras;

public class MainFigura {
    public static void main(String[] args) {
        FiguraGeometrica[] figuraGeometrica = new FiguraGeometrica[3];
        Circulo circulo = new Circulo(3);
        circulo.imprimirArea();
        figuraGeometrica[0] = circulo;//el primer elemento del array

        Rectangulo rectangulo = new Rectangulo(2,4);
        rectangulo.imprimirArea();
        figuraGeometrica[1] = rectangulo;//el segundo elemento del array

        Triangulo triangulo = new Triangulo(2,4);
        figuraGeometrica[2] = triangulo;//el tercer elemento del array
        triangulo.imprimirArea();

        System.out.printf("El area promedio es %.4f", CalculadorDeArea.areaPromedio(figuraGeometrica));
    }
}
