package clase04_Java2;

public class CuentaCorriente {

    private String nombre;
    private String dni;
    private String nroCuentaCorriente;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.nombre = cuentaCorriente.getNombre();
        this.dni = cuentaCorriente.getDni();
        this.nroCuentaCorriente = cuentaCorriente.getNroCuentaCorriente();
        this.saldo = cuentaCorriente.getSaldo();
    }

    public CuentaCorriente(String nombre, String dni, String nroCuentaCorriente, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.nroCuentaCorriente = nroCuentaCorriente;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNroCuentaCorriente() {
        return nroCuentaCorriente;
    }

    public void setNroCuentaCorriente(String nroCuentaCorriente) {
        this.nroCuentaCorriente = nroCuentaCorriente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double ingreso){
        this.saldo += ingreso;
        System.out.println("Su saldo es: " + this.saldo);
    }

    public void egreso(double egreso){
        this.saldo -= egreso;
        System.out.println("Su egreso es: " + egreso + " y su saldo es: " + this.saldo);
    }

    public void reintegro(double reintegro){
        reintegro = reintegro*0.2;
        this.saldo += reintegro;
        System.out.println("Su reintegro es de: " + reintegro + " y su saldo es: " + this.saldo);
    }

    public void transferencia(double transferencia){
        this.saldo -= transferencia;
        System.out.println("Su transferencia es: " + transferencia + " y su saldo es: " + this.saldo);
    }
}
