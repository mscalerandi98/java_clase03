package clase06_Java4.dakar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrera implements Comparator<Vehiculo> {
    private double distancia;
    private int premioEnUSD;
    private String nombre;
    private int cantVehiculosPermitidos;
    private List<Vehiculo> listaVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(double distancia, int premioEnUSD, String nombre, int cantVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnUSD = premioEnUSD;
        this.nombre = nombre;
        this.cantVehiculosPermitidos = cantVehiculosPermitidos;
        this.listaVehiculos = new ArrayList<>();
        this.socorristaAuto = new SocorristaAuto();
        this.socorristaMoto = new SocorristaMoto();
    }

    public double posicionCarrera(Vehiculo v) {
        return (v.getVelocidad() * v.getAceleracion() / 2 / (v.getAnguloDeGiro() * (v.getPeso() - v.getRuedas() * 100)));
    }

    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        double resta = posicionCarrera(v1) - posicionCarrera(v2);
        return (resta < 0 ? -1 : (resta > 0 ? 1 : 0));
    }

    public void ganador() {
        Vehiculo ganador = null;

        for (Vehiculo v : listaVehiculos) {
            if (ganador == null || compare(ganador,v) > 0) {
                ganador = v;
            }
        }

        System.out.printf("El ganador de los %d USD de la carrera %s es %s%n",this.premioEnUSD,this.nombre,ganador);
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, int anguloDeGiro, String patente) {
        if (listaVehiculos.size() >= cantVehiculosPermitidos) {
            System.out.println("No se pudo agregar el auto patente " + patente + " ya que se alcanzo el maximo de vehiculos permitidos para la carrera");
        } else {
            listaVehiculos.add(new Auto(velocidad,aceleracion,anguloDeGiro,patente));
        }
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, int anguloDeGiro, String patente) {
        if (listaVehiculos.size() >= cantVehiculosPermitidos) {
            System.out.println("No se pudo agregar la moto patente " + patente + " ya que se alcanzo el maximo de vehiculos permitidos para la carrera");
        } else {
            listaVehiculos.add(new Moto(velocidad,aceleracion,anguloDeGiro,patente));
        }
    }

    public void eliminarVehiculo(Vehiculo v) {
        eliminarVehiculoConPatente(v.getPatente());

    }
    public void eliminarVehiculoConPatente(String patente) {
        List<Vehiculo> temp = new ArrayList<>();

        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().compareTo(patente) == 0) temp.add(v);
        }

        for (Vehiculo v : temp) {
            listaVehiculos.remove(v);
            System.out.println("El vehiculo patente " + v.getPatente() + " fue removido de la carrera");
        }
    }

    public void socorrerAuto(String patente) {

        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().compareTo(patente) == 0) socorristaAuto.socorrer((Auto) v);
        }
    }

    public void socorrerMoto(String patente) {

        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().compareTo(patente) == 0) socorristaMoto.socorrer((Moto) v);
        }
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
