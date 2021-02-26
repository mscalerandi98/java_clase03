package clase05_Java3.model;

import clase05_Java3.interfaz.Precedable;

public class Celular implements Precedable<Celular> {
    private int numero;
    private String titular;

    public Celular(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Celular() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    @Override
    public int precedeA(Celular celular) {
        return numero - celular.getNumero();
    }

}
