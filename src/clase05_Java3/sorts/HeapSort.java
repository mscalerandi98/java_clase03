package clase05_Java3.sorts;

import clase05_Java3.interfaz.Sorter;

import java.util.Comparator;

public class HeapSort implements Sorter<HeapSort> {

    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        int n = arr.length;

        // Reorganizar array
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, c, n, i);

        //Extraer uno por uno un elemento del montón
        for (int i = n - 1; i > 0; i--) {
            // Mover actual al final
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //llamar a max heapify en el montón reducido
            heapify(arr, c, i, 0);
        }
    }

    // Para apilar un subárbol enraizado con el nodo i que es
    //     un índice en arr []. n es el tamaño del montón
    private <T> void heapify(T[] arr, Comparator<T> c, int n, int i)
    {
        int largest = i; // se inicializa
        int izquierda = 2 * i + 1; // izquierda = 2*i + 1
        int derecha = 2 * i + 2; // derecha = 2*i + 2

        // Si el izquierdo es el mas grande
        if (izquierda < n && c.compare(arr[izquierda],arr[largest]) > 0)
            largest = izquierda;

        // si es el derecho
        if (derecha < n && c.compare(arr[derecha],arr[largest]) > 0)
            largest = derecha;

        // si el mas grande no es raiz
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Apila de forma recursiva el subárbol afectado
            heapify(arr, c, n, largest);
        }
    }
}
