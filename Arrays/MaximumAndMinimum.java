class MaximumAndMinimum {
    public static void main(String[] args) {
        // driver code
        int[] arr = { -1, -2, 0, 3, 1 };

        MinMax answer = minMaxLinearSearch(arr);
        System.out.println("Min: " + answer.min);
        System.out.println("Max: " + answer.max);
    }

    static class MinMax {
        int min;
        int max;
    }

    public static MinMax minMaxLinearSearch(int[] arr) {
        MinMax p = new MinMax();
        // initializing p.max and p.min

        p.min = arr[0];
        p.max = arr[0];

        // if 1 element in arr then return with p (best case)
        if (arr.length == 1)
            return p;

        // more than two items (worst case / average case)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < p.min) p.min = arr[i];
            if (arr[i] > p.max) p.max = arr[i];
        }

        return p;
    }
}