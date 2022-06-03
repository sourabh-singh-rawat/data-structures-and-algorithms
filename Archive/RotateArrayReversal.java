public class RotateArrayReversal {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        // rotate using reversal algorithm
        rotate(arr, 2);
        print(arr);
    }

    static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + ", ");
    }

    static void rotate(int[] arr, int d) {
        int n = arr.length;
        // divide array into two parts
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
