package clase05_Java3.sorts;

import clase05_Java3.interfaz.Sorter;

import java.util.Comparator;
import java.util.Stack;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        Stack<Integer> stack = new Stack();
        stack.push(0);
        stack.push(arr.length);

        while (!stack.isEmpty()) {
            int end = stack.pop();
            int start = stack.pop();
            if (end - start < 2) {
                continue;
            }
            int p = start + ((end - start) / 2);
            p = partition(arr, c, p, start, end);

            stack.push(p + 1);
            stack.push(end);

            stack.push(start);
            stack.push(p);

        }
    }

    //Método de utilidad para dividir la matriz en una matriz más pequeña, y
    //comparar números para reorganizarlos según el algoritmo de clasificación rápida.

    private static <T> int partition(T[] input, Comparator<T> c, int position, int start, int end) {
        int l = start;
        int h = end - 2;
        T piv = input[position];
        swap(input, position, end - 1);

        while (l < h) {
            if (c.compare(input[l],piv) < 0) {
                l++;
            } else if (c.compare(input[h],piv) >= 0) {
                h--;
            } else {
                swap(input, l, h);
            }
        }
        int idx = h;
        if (c.compare(input[h],piv) < 0) {
            idx++;
        }
        swap(input, end - 1, idx);
        return idx;
    }

    /**
     * *Método de utilidad para intercambiar dos números en una matriz dada
     */
    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
