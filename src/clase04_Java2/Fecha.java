package clase04_Java2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private GregorianCalendar calendar;

    public Fecha() {
        this.calendar = new GregorianCalendar();
        this.calendar.setLenient(false);
    }

    public Fecha(int dia, int mes, int anio) {
        this.calendar = new GregorianCalendar();
        this.calendar.setLenient(false);
        try {
            setAnio(anio);
            setMes(mes);
            setDia(dia);
        } catch (ParseException e) {
            //Si la fecha no es correcta, pasará por aquí
            System.out.println("Fecha "+dia+"/"+mes+"/"+anio+" invalida");
        }
    }

    public int getDia() {
        return calendar.get(Calendar.DATE);
    }

    public void setDia(int dia) throws ParseException {
        this.calendar.set(Calendar.DATE,dia);
    }

    public int getMes() {
        return calendar.get(Calendar.MONTH);
    }

    public void setMes(int mes) throws ParseException {
        this.calendar.set(Calendar.MONTH,mes);
    }

    public int getAnio() {
        return calendar.get(Calendar.YEAR);
    }

    public void setAnio(int anio) throws ParseException {
        this.calendar.set(Calendar.YEAR,anio);
    }

    public void diaManiana(int dia) {
        this.calendar.add(Calendar.DATE,1);
    }

    public static boolean fechaValida(int dia, int mes, int anio) {
        boolean fechaValida = false;

        try {
            //Formato de fecha (día/mes/año)
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            //Comprobación de la fecha
            formatoFecha.parse(dia + "/" + mes + "/" + anio);
            fechaValida = true;
        } catch (ParseException e) {
            //Si la fecha no es correcta, pasará por aquí
            fechaValida = false;
        }

        return fechaValida;
    }

    @Override
    public String toString() {
        return getDia()+"/"+getMes()+"/"+getAnio();
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(1,1,2021);
        System.out.println(fecha.toString());
        System.out.println(fechaValida(31,12,2021));
        System.out.println(fechaValida(30,13,2021));
        try {
            fecha.setDia(32);
        } catch (ParseException e) {
            System.out.println("32 no es un dia valido");
        }
    }
}
