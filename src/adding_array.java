public class adding_array {
    public adding_array() {
    }

    public static void main(String[] args) {
        new adding_array();
        int[] arr = new int[]{10, 2, 1, 7, 5, 18};
        int sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
            sum += arr[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }
}
