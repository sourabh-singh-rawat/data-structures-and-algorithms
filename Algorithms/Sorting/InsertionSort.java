class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        
        printArray(arr);
        System.out.println("\nSorted using Insertion Sort: ");
        insertionSort(arr);
        printArray(arr);   
    }     

    public static void insertionSort(int[] arr) {
        // iterate over each array index
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) continue; // don't do anything with i=0;

            // while arr[i] < arr[i - 1] // note i = 1, 2, 3, 4
            while (arr[i] < arr[i-1]) { // arr[1] < arr[0]
                printArray(arr);
                System.out.println("i: " + i);

                // swap
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;

                i--;

                if (i == 0) // no need to anything with i=0
                    break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}