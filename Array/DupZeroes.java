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

    public static void transfer(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }

    public static int[] duplicate(int[] nums) {
        int z = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                z++;
            }
        }
        int i = n - 1;
        int j = n + z - 1;
        while (i != j) {
            transfer(nums, i, j);
            j--;
            if (nums[i] == 0) {
                transfer(nums, i, j);
                j--;
            }
            i--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 4, 0 };
        // int arr[] = { 8, 5, 6, 7, 0, 0, 0, 0, 7 };
        // System.out.println(duplicateZero(arr));
        duplicate(arr);
        printArray(arr);
    }
}
