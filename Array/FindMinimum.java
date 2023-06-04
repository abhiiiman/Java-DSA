package Array;

public class FindMinimum {
    // method to print the array.

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // method to declare and init the array.

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int myArray[] = { -1, 2, 43, 4, 5, 63, 33, 45, 67, 4343, 10 };

        FindMinimum array_demo = new FindMinimum();
        System.out.println("original array:");
        array_demo.printArray(myArray);
        int result = array_demo.findMin(myArray);
        System.out.printf("Minimum Value from the Array = %d", result);
    }
}
