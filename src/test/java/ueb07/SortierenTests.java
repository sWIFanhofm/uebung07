package ueb07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    @Test
    void bubbleSort1(){
        Student s1 = new Student(1, "Fritz");
        Student s2 = new Student(2, "Jochen");
        Student s3 = new Student(3, "Kathrin");
        Student s4 = new Student(4, "Elisabeth");

        Student[] a = {s4, s3, s2, s1};
        Student[] ref = {s1, s2, s3, s4};

        Sortieren.bubbleSort(a);
        assertArrayEquals(ref, a);
    }

    @Test
    void bubbleSort2(){
        Student s1 = new Student(1, "Fritz");
        Student s2 = new Student(2, "Jochen");
        Student s3 = new Student(3, "Kathrin");
        Student s4 = new Student(4, "Elisabeth");

        Student[] a = {s1, s2, s3, s4};
        Student[] ref = {s4, s1, s2, s3};

        Sortieren.bubbleSort(a, new NameComparator());
        assertArrayEquals(ref, a);
    }

    @Test
    void bubbleSort3(){
        Student s1 = new Student(1, "Fritz");
        Student s2 = new Student(2, "Jochen");
        Student s3 = new Student(3, "Fritz");
        Student s4 = new Student(4, "Elisabeth");

        Student[] a = {s1, s2, s3, s4};
        Student[] ref = {s4, s1, s3, s2};

        Sortieren.bubbleSort(a, new NameMatComparator());
        assertArrayEquals(ref, a);
    }
}
