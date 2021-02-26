package clase04_Java2.figuras;

public class CalculadorDeArea {
    public static double areaPromedio(FiguraGeometrica[] arr) {
        double suma = 0;
        double promedio = 0;

        for (FiguraGeometrica figuraGeometrica : arr) {
            suma += figuraGeometrica.area();
        }

        promedio = suma / arr.length;
        return promedio;
    }
}
