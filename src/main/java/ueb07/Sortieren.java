package ueb07;

public class Sortieren {
    static <T> void swap(T[] a, int i, int j){
        T h = a[i];
        a[i] = a[j];
        a[j] = h;
    }
}
