package ueb07;

import java.util.Comparator;

public class Sortieren {
    static <T> void swap(T[] a, int i, int j){
        T h = a[i];
        a[i] = a[j];
        a[j] = h;
    }

    static <T extends Comparable<T>> void bubbleSort(T[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i].compareTo(a[j]) > 0)
                    swap(a, i, j);
            }
        }
    }

    static <T> void bubbleSort(T[] a, Comparator<T> c){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(c.compare(a[i], a[j]) > 0)
                    swap(a, i, j);
            }
        }
    }
}
