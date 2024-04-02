package DSA;

public class Data {
    public Data() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        int size = arr.length;
        int[] res = new int[4];

        int i;
        for(i = 0; i < size; ++i) {
            res[i] = arr[i] / 2;
        }

        for(i = 0; i < size; ++i) {
            System.out.println(res[i]);
        }

    }
}