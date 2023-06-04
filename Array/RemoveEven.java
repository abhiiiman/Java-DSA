package Array;

public class RemoveEven {
    // method to print the array.

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // method to declare and init the array.

    public void ArrayDemo() {

        int myArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int oddCount = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                oddCount++;
            }
        }

        int newArray[] = new int[oddCount];
        int index = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                newArray[index] = myArray[i];
                index++;
            }
        }

        System.out.println("Original Array:");
        printArray(myArray);
        System.out.println("New Array:");
        printArray(newArray);

    }

    public static void main(String[] args) {
        RemoveEven array_demo = new RemoveEven();
        array_demo.ArrayDemo();
    }
}
