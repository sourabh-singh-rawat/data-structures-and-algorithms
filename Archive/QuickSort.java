import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 2, 4 };
        System.out.println("Unsorted: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    // quickSort
    // partition(arr, low, high)
    // (i=-1) [5(low),1(j=1),3(low),2(high), 4(high, pivot)]
    // 1. find the index of pivot in the sorted list
    // 2. all element smaller than pivot are in the left and all element larger than pivot are in right
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // {5,1,3,2,4}
            // {1,3,2,4,5}
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // pivot index in the sorted list

        // {5,1,3,2,4}
        // {1,3,2,5,4}
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
