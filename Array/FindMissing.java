package Array;

public class FindMissing {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int arraySum = 0;

    public int missingNum1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        int n = arr.length + 1;
        int rangeSum = n * (n + 1) / 2;
        int missingValue = rangeSum - arraySum;
        return missingValue;
    }

    // aliter method - best
    public int missingNum2(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int myArray[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
        FindMissing arrayDemo = new FindMissing();
        System.out.println("Original Array:");
        arrayDemo.printArray(myArray);
        // int missing1 = arrayDemo.missingNum1(myArray);
        int missing2 = arrayDemo.missingNum2(myArray);
        System.out.printf("Missing Value in the range 1 - %d:\n", myArray.length + 1);
        // System.out.println(missing1);
        System.out.println(missing2);
    }
}
