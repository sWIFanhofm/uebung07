package ueb07;

import java.util.Comparator;

public class NameMatComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int c = o1.getName().compareTo(o2.getName());
        if(c == 0)
            return Integer.compare(o1.getMatrikel(), o2.getMatrikel());
        else
            return c;
    }
}
