package TreeSet;

import java.util.Comparator;

class MyComparator implements Comparator {
    MyComparator() {
    }

    public int compare(Object obj1, Object obj2) {
        Integer i = (Integer)obj1;
        Integer i2 = (Integer)obj2;
        if (i < i2) {
            return 1;
        } else {
            return i > i2 ? -1 : 0;
        }
    }
}
