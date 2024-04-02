package ListDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public ListIteratorDemo() {
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Jeeva");
        l.add("Bharani");
        l.add("Ajay");
        l.add("Surya");
        System.out.println(l);

        String s;
        for(ListIterator itr = l.listIterator(); itr.hasNext(); System.out.println(s)) {
            s = (String)itr.next();
            if (s.equals("Ajay")) {
                itr.remove();
            } else if (s.equals("Bharani")) {
                itr.set("Sanjay");
            } else if (s.equals("Surya")) {
                itr.add("Iam Ready");
            }
        }

        System.out.println(l.getClass().getName());
    }
}
