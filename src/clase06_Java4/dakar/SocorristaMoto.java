package clase06_Java4.dakar;

public class SocorristaMoto implements Socorrista<Moto>{
    @Override
    public void socorrer(Moto v) {
        System.out.println("Socorriendo moto " + v.getPatente());
    }
}
