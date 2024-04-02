package DSA;

public class Min_and_Max {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("" + max + " " + min);
    }
}