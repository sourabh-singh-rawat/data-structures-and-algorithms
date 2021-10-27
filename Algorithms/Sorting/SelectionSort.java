class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        printArray(arr);
        System.out.println("\nSorted using Selection Sort: ");
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int min_value = arr[i];
            int min_value_index = i;

            // find the smallest value and its index in the array
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min_value) {
                    // new min
                    min_value = arr[j];
                    min_value_index = j;
                }
            }

            // swap min value to first index
            int temp = arr[min_value_index]; // arr[3] = 1
            arr[min_value_index] = arr[i]; // arr[3] = 4
            arr[i] = temp; // arr[0] = 1
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}