package Array;

public class Reverse {
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
        printArray(myArray);
        for (int index = myArray.length - 1; index >= 0; index--) {
            System.out.print(myArray[index] + " ");
        }
    }

    public static void main(String[] args) {
        Reverse array_demo = new Reverse();
        array_demo.ArrayDemo();
    }
}
