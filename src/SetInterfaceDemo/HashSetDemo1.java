package SetInterfaceDemo;

import java.util.HashSet;

public class HashSetDemo1 {
    public HashSetDemo1() {
    }

    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("b");
        h.add("z");
        h.add("sa");
        h.add("Jeevaj");
        h.add("1");
        h.add("c");
        System.out.println(h.add("z"));
        System.out.println(h);
    }
}
