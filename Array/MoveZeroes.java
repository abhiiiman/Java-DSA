package Array;

public class MoveZeroes {
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // method to declare and init the array.

    public void moveZero(int[] arr) {
        int newArray[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                newArray[index] = arr[i];
                index++;
            }
        }

        printArray(newArray);
    }

    public void moveZeroSwap(int[] arr){
        
    }

    public static void main(String[] args) {
        int myArray[] = { 0, 0, 43, 0, 5, 63, 33, 0, 67, 0, 10 };

        // method-1
        MoveZeroes array_demo = new MoveZeroes();
        System.out.println("original array:");
        array_demo.printArray(myArray);
        array_demo.moveZero(myArray);

        // method-2

    }
}
