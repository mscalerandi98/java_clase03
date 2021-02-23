package clase03;

import java.util.Scanner;

public class MainEjercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int cantidadNecesaria = s.nextInt();
        int indice = 0;
        int cantidad = 0;

       while (cantidad<cantidadNecesaria){
        if (validarNumPrimo(indice)){
            System.out.println(indice);
            cantidad ++;
        }
        indice++;
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
