package Array;

public class AddUpdate {

    // method to print the array.

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // method to declare and init the array.

    public void ArrayDemo() {
        int myArray[] = new int[5];

        // adding the Elements here in the array.

        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        System.out.println("Original Array:");
        printArray(myArray);

        myArray[4] = 1000;
        System.out.println("Modified Array");
        printArray(myArray);
    }

    public static void main(String[] args) {
        AddUpdate array_demo = new AddUpdate();
        array_demo.ArrayDemo();
    }

}
