package Array;

public class DupZeroes {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] duplicateZero(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                for (int j = n - 2; j >= i; j--) {
                    nums[j + 1] = nums[j];
                }
                i++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 4, 0 };
        System.out.println(duplicateZero(arr));
        printArray(arr);
    }
}
