class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.println(LinearSearch(arr, 3));
    }

    static int LinearSearch(int[] arr, int item) {

        // iterate over arr to find the item (if found return its index)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item){
                return i;
            }
        }

        // item not found
        return -1;
    }
}