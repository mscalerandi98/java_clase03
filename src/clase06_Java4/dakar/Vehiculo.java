package clase06_Java4.dakar;

public abstract class Vehiculo {
    private double velocidad;
    private double aceleracion;
    private int anguloDeGiro;
    private String patente;
    private int peso;
    private int ruedas;

    public Vehiculo(double velocidad, double aceleracion, int anguloDeGiro, String patente, int peso, int ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " patente " + getPatente();
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public int getPeso() {
        return peso;
    }

    public int getRuedas() {
        return ruedas;
    }
}
