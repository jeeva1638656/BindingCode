public class Bunnies {
    static int count = 0;

    Bunnies() {
        while(count < 10) {
            new Bunnies(++count);
        }

    }

    Bunnies(int x) {
    }

    public static void main(String[] args) {
        new Bunnies();
        new Bunnies(count);
        System.out.println(count);
    }
}