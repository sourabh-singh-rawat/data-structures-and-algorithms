class ReverseArray {
    public static void main(String args[]) { 
        // driver code
        int[] array = { 1, 2, 3, 4, 5, 6}; // input
        
        printArray(array);

        reverseArrayIterative(array);        
        System.out.println("Reversed array is ");
        printArray(array);
    }

    public static void reverseArrayIterative(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[end];
            arr[end] = arr[start]; 
            arr[start] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}