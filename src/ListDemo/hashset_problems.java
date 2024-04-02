package ListDemo;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_problems {
    public hashset_problems() {
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("JEEVA");
        set.add("Arasu Engineering College");
        set.add("09_06_2001");
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            String element = (String)iterator.next();
            System.out.println(element);
        }

    }
}
