package Array;

public class SecondMax {
    // method to print the array.

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // method to declare and init the array.

    public int findSecondMax(int[] arr) {

        // starting w the smallest Integer value here.
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int myArray[] = { -1, 2, 43, 4, 5, 63, 33, 45, 67, 4343, 10 };

        SecondMax array_demo = new SecondMax();
        System.out.println("original array:");
        array_demo.printArray(myArray);
        int result = array_demo.findSecondMax(myArray);
        System.out.printf("Second Maximum Value from the Array = %d", result);
    }
}
