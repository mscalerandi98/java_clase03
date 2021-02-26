package clase04_Java2;

public class Contador {

    private int contador;

    public Contador() {
    this.contador = 0;
    }

    public Contador(Contador contador) {
    this.contador = contador.getContador();
    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int incremento(){
        return ++contador;
    }

    public int decremento(){
        return --contador;
    }
}
