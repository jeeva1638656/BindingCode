package CollectionDemo;

import java.util.ArrayList;

public class ListDemo {
    public ListDemo() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int a = list.indexOf(6);
        System.out.println(a);
    }
}
