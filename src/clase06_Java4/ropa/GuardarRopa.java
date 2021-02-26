package clase06_Java4.ropa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardarRopa {
    private Map<Integer, List<Prenda>> diccionario;
    private int contador;

    public GuardarRopa(Map<Integer, List<Prenda>> diccionario, int contador) {
        this.diccionario = diccionario;
        this.contador = contador;
    }

    public GuardarRopa() {
        this.diccionario = new HashMap<>();
        this.contador = 1;
    }

    public Map<Integer, List<Prenda>> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(Map<Integer, List<Prenda>> diccionario) {
        this.diccionario = diccionario;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int guardarPrendas(List<Prenda> listaDePrenda) {
        this.getDiccionario().put(this.getContador(), listaDePrenda);
        return contador++;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> entry : diccionario.entrySet()) {
            for (Prenda p :
                    entry.getValue()) {
                System.out.println("Marca: " + p.getMarca() + ", Modelo: " + p.getModelo() +
                        " y su identificador es: " + entry.getKey());
            }
            System.out.println("vacio");
        }
    }

    public List<Prenda> devolverPrendas(int numero) {
        List<Prenda> listaDePrenda = this.diccionario.get(numero);
        this.diccionario.remove(numero);
        return listaDePrenda;

    }
}
