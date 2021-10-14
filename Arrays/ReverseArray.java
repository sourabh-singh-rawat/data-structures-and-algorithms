class ReverseArray {
    public static void main(String args[]) { 
        // driver code
        int[] array = { 1, 2, 3, 4, 5, 6}; // input
        int[] reversedArray = new int[6]; // reversed output
        
        printArray(array);

        reversedArray = reverseArrayIterative(array);        
        System.out.println("Reversed array is ");
        printArray(reversedArray);
    }

    public static int[] reverseArrayIterative(int[] arr) {
        int start = 0; // 0
        int end = arr.length - 1; // 5

        while(start < end) { // condition to check before swapping
            int temp = arr[end];
            arr[end] = arr[start]; // arr[5] = arr[0] // arr[5] = 0
            arr[start] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}