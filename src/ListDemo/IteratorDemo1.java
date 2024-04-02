package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public IteratorDemo1() {
    }

    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        for(int i = 0; i <= 20; ++i) {
            l.add(i);
        }

        Iterator itr = l.iterator();

        while(itr.hasNext()) {
            Integer i = (Integer)itr.next();
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                System.out.println("hi ");
            }
        }

        System.out.println(l);
    }
}
