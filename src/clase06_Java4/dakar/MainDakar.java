package clase06_Java4.dakar;

import java.util.List;

public class MainDakar {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(100.5,1000000, "Copa meteoro", 5);
        carrera.darDeAltaAuto(120,30, 40, "CHO888");
        carrera.darDeAltaAuto(110,20, 55, "MES123");
        carrera.darDeAltaMoto(150,15, 70, "DEF456");
        carrera.darDeAltaMoto(180,10, 60, "ABC123");
        carrera.darDeAltaAuto(100,40, 65, "YAY000");
        carrera.darDeAltaMoto(120,20, 80, "KKE999");

        carrera.socorrerAuto("MES123");
        carrera.eliminarVehiculoConPatente("MES123");

        List<Vehiculo> listaVehiculos = carrera.getListaVehiculos();
        carrera.eliminarVehiculo(listaVehiculos.get(0));

        carrera.darDeAltaMoto(120,20, 80, "KKE999");
        carrera.socorrerMoto("KKE999");

        carrera.ganador();

    }
}
