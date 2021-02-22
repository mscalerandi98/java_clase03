import java.util.Scanner;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese cantidad de repeticiones: ");
        int numerador = s.nextInt();
        System.out.println("Ingrese valor multiplo: ");
        int denominador = s.nextInt();

        for (int i = 0; i<numerador; i++){
            System.out.println(i*denominador);
        }

        s.close();

    }

}
