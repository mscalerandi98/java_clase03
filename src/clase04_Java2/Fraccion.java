package clase04_Java2;

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

        int sumaNumerador = numerador + denominador*entero;
        this.numerador = sumaNumerador;
        return (double) numerador/denominador;
    }

    public void resta (int sumando) {
        this.numerador += (-sumando * this.denominador);
    }

    public void multiplicar (Fraccion multiplicando) {
        this.numerador *= multiplicando.getNumerador();
        this.denominador *= multiplicando.getDenominador();
    }

    public void multiplicar (int multiplicando) {
        this.numerador *= multiplicando;
    }

    public void dividir (Fraccion dividendo) {
        this.numerador *= dividendo.getDenominador();
        this.denominador *= dividendo.getNumerador();
    }

    public void dividir (int dividendo) {
        this.denominador *= dividendo;
    }

}
