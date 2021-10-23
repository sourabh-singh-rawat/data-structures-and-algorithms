class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        
        printArray(arr);
        System.out.println("\nSorted using Insertion Sort: ");
        insertionSort(arr);
        printArray(arr);
    }
      
    public static void insertionSort(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int curr_value = arr[i];
            int prev_index = i-1;

            // shift the previous index values to right
            while(prev_index>=0 && arr[prev_index] > curr_value ) {
                arr[prev_index+1]=arr[prev_index];
                prev_index--;
            }

            arr[prev_index+1] = curr_value;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}