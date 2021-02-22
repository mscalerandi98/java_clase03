import java.util.Scanner;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int primo = s.nextInt();

      boolean esPrimo = validarNumPrimo(primo);
       if (esPrimo){
           System.out.println(primo + " es un numero primo");
       }else{
           System.out.println("El numero ingresado no es primo");
       }

        s.close();

    }

    public static boolean validarNumPrimo(int primo){

        if (primo == 0 || primo == 1){
            return false;
        }

        int contador = 2;
        boolean esPrimo = true;

        while (primo>contador && esPrimo){
        if (primo%contador != 0){
            contador++;
        }else{
            esPrimo = false;
        }

        }
        return esPrimo;
    }
}
