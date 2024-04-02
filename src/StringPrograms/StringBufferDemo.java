package StringPrograms;

public class StringBufferDemo {
    public StringBufferDemo() {
    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Mr");
        s.append("Jeeva");
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("jeeva");
        StringBuffer s2 = new StringBuffer("jeeva");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
