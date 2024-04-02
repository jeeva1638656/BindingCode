package StringPrograms;

public class StringDemo1 {
    public StringDemo1() {
    }

    public static void main(String[] args) {
        String s1 = new String("You cannot Change me");
        String s2 = new String("You cannot Change me");
        System.out.println(s1 == s2);
        String s3 = "You cannot Change me";
        System.out.println(s1 == s3);
        String s4 = "You cannot Change me";
        System.out.println(s3 == s4);
        String s5 = "You cannotChange me";
        System.out.println(s4 == s5);
        String s6 = "You cannot";
        String s7 = s6 + "Change me";
        System.out.println(s4 == s7);
        String s8 = "You cannot";
        String s9 = "You cannotChange me";
        System.out.println(s4 == s9);
        String s10 = "ababa82u2b";
        System.out.println(s10.replace("a", "jeeva"));
        System.out.println(s10.substring(2, 6));
        String s11 = new String("jeevadeveloper");
        String s12 = s11.toUpperCase();
        String s13 = s11.toLowerCase();
        System.out.println(s12 == s11);
        System.out.println(s13 == s11);
    }
}
