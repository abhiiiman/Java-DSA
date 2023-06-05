package Array;

public class ResizeArray {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity) {
        int newArray[] = new int[capacity];
        // copying the elements here.
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
        return arr;
    }

    public static void main(String[] args) {
        int myArray[] = { 0, 0, 43, 0, 5 };

        ResizeArray array_demo = new ResizeArray();
        System.out.println("original array:");
        array_demo.printArray(myArray);
        System.out.println("After resizing the array:");
        int resultArray[] = array_demo.resize(myArray, 3*(myArray.length));
        array_demo.printArray(resultArray);
    }

}
