class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(arr, 0, arr.length - 1, 2));
    }

    static int binarySearch(int[] arr, int l, int r, int item) {
        // item in mid
        int mid = (l + r) / 2;
        if (arr[mid] == item)
            return mid;

        // item in left or right
        if (l < r) {
            if (arr[mid] < item)
                return binarySearch(arr, mid + 1, r, item);
            else
                return binarySearch(arr, l, mid - 1, item);
        }
        return -1;
    }
}