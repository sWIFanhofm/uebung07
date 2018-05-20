package ueb07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SortierenTests {

    @Test
    void swap(){
        Integer[] a = {1, 2 ,3};

        Sortieren.swap(a, 0, 2);
        assertEquals(3, (int) a[0]);
        assertEquals(1, (int) a[2]);
        assertEquals(2, (int) a[1]);
    }
}
