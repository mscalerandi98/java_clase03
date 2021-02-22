import java.util.Scanner;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Cuantos pares quiere mostrar: ");
        int entero = s.nextInt();

        for (int i = 0; i<entero; i++){
            if (esPar(i)){
                System.out.println(i);
            }
        }


        s.close();

    }

    public static boolean esPar(int entero){
       return entero%2 == 0;
    }
}
