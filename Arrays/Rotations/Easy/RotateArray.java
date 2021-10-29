class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        
        printArray(arr);
        for(int i = 0; i < d; i++)
            rotateByOne(arr);
        
        System.out.println("\nRotated Array: ");
        printArray(arr);
    }

    static void rotateByOne(int[] arr) {
        // 1,2,3,4,5
        // 2,3,4,5,1
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
    }
}