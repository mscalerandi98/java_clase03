package clase05_Java3.sorts;

import clase05_Java3.interfaz.Sorter;

import java.util.Comparator;

public class MainFactory {
    private static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.print(t+" | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Integer[] iArr = {2,1,54,3,1,34,5,22,4,6};
        int n = 100000;
        Integer[] iArr = new Integer[n];
        for (int i = 0 ; i < n; i++) {
            iArr[i] = n - i;
        }
        String[] sArr = {"Juan","Pepe","Matias","Florencia","Melany","Sofia"};

        MyFactory mf = new MyFactory();
        Sorter sorter = (Sorter) mf.getInstance("sorter");

        Comparator<Integer> ci = (a, b) -> a - b;
        Comparator<String> cs = (a,b) -> a.compareTo(b);

        //System.out.println(System.currentTimeMillis());

        //printArray(iArr);
        Timer sTimer = new Timer();
        sTimer.start();
       // sorter.sort(iArr,ci);
        sTimer.stop();
        System.out.println("Ordenado en "+sTimer.elapsedTime()+" milisegundos");
        //printArray(iArr);

        printArray(sArr);
        Timer aTimer = new Timer();
        aTimer.start();
        sorter.sort(sArr,cs);
        aTimer.stop();
        System.out.println("Ordenado en "+aTimer.elapsedTime()+" milisegundos");
        printArray(sArr);
    }
}
