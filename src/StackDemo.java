import java.util.Stack;

public class StackDemo {
    public StackDemo() {
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s);
        System.out.println(s.search("a"));
        System.out.println(s.search("z"));
    }
}
