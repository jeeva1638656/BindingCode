package DSA;

import java.util.Scanner;

public class Odd_Even {
    public Odd_Even() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers :");
        int a = sc.nextInt();
        int[] arr = new int[a];

        int j;
        for (j = 0; j < a; ++j) {
            arr[j] = sc.nextInt();
        }

        System.out.println("Odd number");

        for (j = 0; j < arr.length; ++j) {
            if (arr[j] % 2 != 0) {
                System.out.println(arr[j]);
            }
        }

        System.out.println("Even numbers");

        for (j = 0; j < arr.length; ++j) {
            if (arr[j] % 2 == 0) {
                System.out.println(arr[j]);
            }
        }
    }
}
