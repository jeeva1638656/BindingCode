package DSA;

import java.util.Scanner;

public class Prime_Number {
    public Prime_Number() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = sc.nextInt();
        if (a % 2 != 0) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime");
        }

    }
}
