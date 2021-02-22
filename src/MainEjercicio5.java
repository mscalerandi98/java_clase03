import java.util.Scanner;

public class MainEjercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int cantidadDeNumeros = s.nextInt();
        System.out.println("Ingrese un numero: ");
        int cantidadDeDigitos = s.nextInt();
        System.out.println("Ingrese un numero: ");
        int digito = s.nextInt();

        int cantidadActual = 0;
        int indice = 0;
        while (cantidadActual<cantidadDeNumeros){
            if (validarCondicionUsuario(cantidadDeDigitos, digito, indice)){
                System.out.println(indice);
                cantidadActual ++;
            }
            indice ++;
        }

        s.close();

    }

    public static boolean validarCondicionUsuario(int cantidadDigitos, Integer digito, Integer numero){

        String sDigito = digito.toString();
        String sNumero = numero.toString();
        int contador = 0;

        int posicion = sNumero.indexOf(sDigito);

        while (sNumero.indexOf(sDigito) > -1){
            contador ++;
            if (contador == cantidadDigitos ){
                return true;
            }
            sNumero = sNumero.substring(posicion +1, sNumero.length());
        }
        return false;
    }
}
