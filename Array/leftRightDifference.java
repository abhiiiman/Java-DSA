package Array;

public class leftRightDifference {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // brute sol.
    public static void brute_sol() {
        int nums[] = { 10, 4, 8, 3 };
        int n = nums.length;
        int rightArray[] = new int[n];
        int leftArray[] = new int[n];
        int answer[] = new int[n];
        for (int i = 1; i < n; i++) {
            leftArray[i] = leftArray[i - 1] + nums[i - 1];
        }
        for (int i = n - 1; i > 0; i--) {
            rightArray[i - 1] = rightArray[i] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftArray[i] - rightArray[i]);
        }
        System.out.println("Original Array:");
        printArray(nums);
        System.out.println("prefixSum Array:");
        printArray(leftArray);
        System.out.println("suffixSum Array:");
        printArray(rightArray);
        System.out.println("DifferenceSum Array:");
        printArray(answer);
    }

    // optimal sol.
    public static void main(String[] args) {
        int nums[] = { 10, 4, 8, 3 };
        int n = nums.length;
        int answer[] = new int[n];
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            int diff = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
            answer[i] = diff;
        }
        printArray(answer);
    }
}
