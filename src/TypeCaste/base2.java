package TypeCaste;

public class base2 extends father {
    public base2() {
    }

    public static void main(String[] args) {
        base2 b = new der4();
        der4 d = (der4)b;
        d.der4();
    }

    String base2(String a) {
        a = "bharani";
        return a;
    }
}
