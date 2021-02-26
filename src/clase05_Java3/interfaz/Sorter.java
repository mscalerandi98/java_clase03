package clase05_Java3.interfaz;

import java.util.Comparator;

public interface Sorter<T>{
     <T> void sort(T arr[], Comparator<T> c);
}
