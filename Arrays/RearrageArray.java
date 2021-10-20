class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        printArray(arr);
        System.out.println("");
        printArray(rearrangeArray(arr));
    }

    // O(n^2)
    public static int[] rearrangeArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    newArr[i] = i;
                    break;
                }
                else
                    newArr[i] = -1;
            }
        }

        return newArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}