package StringPrograms;

public class StringImmutabilityDemo {
    public StringImmutabilityDemo() {
    }

    public static void main(String[] args) {
        String s1 = new String("Jeeva");
        String s5 = new String("Jeeva");
        System.out.println(s1 == s1);
        System.out.println(s1 == s1);
        System.out.println(s1 == s1);
        System.out.println(s1.equals(s1));
        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));
    }
}
