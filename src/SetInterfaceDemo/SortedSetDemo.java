package SetInterfaceDemo;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public SortedSetDemo() {
    }

    public static void main(String[] args) {
        SortedSet hc = new TreeSet();
        hc.add("a");
        hc.add("b");
        hc.add("jhs");
        hc.add("hd");
        System.out.println(hc);
        System.out.println(hc.first());
        System.out.println(hc.last());
    }
}
