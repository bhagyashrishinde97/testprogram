package Testassessment;

public class Zeroseparate{
    // Method to move zeros to the end of the array
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                if (nonZeroIndex != i) {
                    arr[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }

    // Method to move zeros to the beginning of the array
    public static void moveZerosToFront(int[] arr) {
        int zeroIndex = arr.length - 1;

        // Traverse the array backwards and move non-zero elements to the back
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[zeroIndex] = arr[i];
                if (zeroIndex != i) {
                    arr[i] = 0;
                }
                zeroIndex--;
            }
        }
    }

    // Method to print the array
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {14, 0, 5, 2, 0, 3, 0};

        // Move zeros to the end of the array
        System.out.println("Original Array:");
        print(arr);
        moveZerosToEnd(arr);
        System.out.println("After Move Zeros to the End:");
        print(arr);

        // Reset array for the next operation

        moveZerosToFront(arr);
        System.out.println("After Move Zeros to the Beginning:");
        print(arr);
    }
}
