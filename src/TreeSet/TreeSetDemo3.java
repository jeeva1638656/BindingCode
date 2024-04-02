package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo3 {
    public TreeSetDemo3() {
    }

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator3());
        t.add(20);
        t.add(5);
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(25);
        t.add(25);
        t.add(30);
        System.out.println(t);
    }
}
