package ListDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationDemo {
    public EnumerationDemo() {
    }

    public static void main(String[] args) {
        Vector v = new Vector();

        for(int i = 0; i <= 10; ++i) {
            v.addElement(i);
        }

        System.out.println(v);
        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator l = v.listIterator();

        while(e.hasMoreElements()) {
            Integer i = (Integer)e.nextElement();
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }   System.out.println(v);
        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(l.getClass().getName());
    }
}

