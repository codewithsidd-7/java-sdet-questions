package SlidingWindow;

public class SlidingWindowBasics {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubarray(arr, k));
    }

    public static int maxSumSubarray(int[] arr, int k) {
        int sum = 0;
        int max;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        max = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (max < sum) {
                max = sum;
            }
        }
        return max;


    }
}
