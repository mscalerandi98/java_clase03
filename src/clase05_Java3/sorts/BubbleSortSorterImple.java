package clase05_Java3.sorts;

import clase05_Java3.interfaz.Sorter;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{
    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        int i, j, n = arr.length;
        T temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (c.compare(arr[j + 1],arr[j]) < 0)
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
