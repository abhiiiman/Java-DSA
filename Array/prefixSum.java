package Array;

public class prefixSum {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        int n = nums.length;
        int leftArray[] = new int[n];
        for (int i = 1; i < n; i++) {
            leftArray[i] = leftArray[i-1] + nums[i-1];
        }
        printArray(nums);
        printArray(leftArray);
    }
}
