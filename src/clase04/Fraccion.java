package clase04;

public class Fraccion {

    private int denominador;
    private int numerador;

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public double sumar(int numeradorFraccion, int denominadorFraccion){
        int sumaNumerador = numerador*denominadorFraccion + denominador*numeradorFraccion;
        int sumaDenominador = denominador*denominadorFraccion;
        this.numerador = sumaNumerador;
        this.denominador = sumaDenominador;
        return (double) numerador/denominador;
    }
    public double sumar(int entero){

        int sumaNumerador = numerador + denominador*a;
        this.numerador = sumaNumerador;
        return (double) numerador/denominador;
    }
    public int restar(int a, int b){
        return a-b;
    }
    public int restar(int a){
        return a;
    }
    public int multiplicar(int a, int b){
        return a*b;
    }
    public int multiplicar(int a) {
        return a;
    }
    public int dividir(int a, int b){
        return a/b;
    }
    public int dividir(int a){
        return a;
    }


}
