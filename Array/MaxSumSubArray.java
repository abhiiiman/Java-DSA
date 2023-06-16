package Array;

public class MaxSumSubArray {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMaxSum(int[] arr, int k) { // k here is window size.
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0; // sum of the sub array
        int i = 0; // start pointer of the subarray
        int j = 0; // pointer for the end of the subarray.
        while (j < n) { // 0-n
            sum += arr[j];
            if (j - i + 1 < k) { // len of subarray < window size
                j++;
            } else if (j - i + 1 == k) { // window size hit
                maxSum = Math.max(maxSum, sum);
                sum -= arr[i];
                i++; // leaves the first element of the sub array . sliding happens
                j++; // add the next upcoming element into the subarray
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int myArray[] = { 2, 5, 1, 8, 2, 9, 1 };
        printArray(myArray);
        System.out.println(findMaxSum(myArray, 4));
    }
}
