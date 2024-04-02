package TreeSet;


import java.util.Comparator;

public class MyComparator3 implements Comparator {
    public MyComparator3() {
    }

    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;
        return -i1.compareTo(i2);
    }
}
