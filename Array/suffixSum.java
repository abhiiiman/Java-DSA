package Array;

public class suffixSum {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 10, 4, 8, 3 };
        int n = nums.length;
        int rightArray[] = new int[n];
        for (int i = n - 1; i > 0; i--) {
            rightArray[i - 1] = rightArray[i] + nums[i];
        }
        printArray(nums);
        printArray(rightArray);
    }
}
