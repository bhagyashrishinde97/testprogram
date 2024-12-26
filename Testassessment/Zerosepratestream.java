package Testassessment;

import java.util.Arrays;

public class Zerosepratestream {


        // Method to move zeros to the end using Streams
        public static void moveZerosToEnd(int[] arr) {
            int[] nonZeros = Arrays.stream(arr).filter(x -> x != 0).toArray();
            long zeroCount = Arrays.stream(arr).filter(x -> x == 0).count();
            int[] result = new int[arr.length];

            System.arraycopy(nonZeros, 0, result, 0, nonZeros.length);
            for (int i = nonZeros.length; i < arr.length; i++) {
                result[i] = 0;
            }

            System.arraycopy(result, 0, arr, 0, arr.length);
        }

        // Method to bring zeros to the front using Streams
        public static void moveZerosToFront(int[] arr) {
            int[] nonZeros = Arrays.stream(arr).filter(x -> x != 0).toArray();
            long zeroCount = Arrays.stream(arr).filter(x -> x == 0).count();
            int[] result = new int[arr.length];

            for (int i = 0; i < zeroCount; i++) {
                result[i] = 0;
            }
            System.arraycopy(nonZeros, 0, result, (int) zeroCount, nonZeros.length);
            System.arraycopy(result, 0, arr, 0, arr.length);
        }

        // Method to print the array
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {14, 0, 5, 2, 0, 3, 0};

            // Move zeros to the end of the array using Streams
            System.out.println("Original Array:");
            printArray(arr);
            moveZerosToEnd(arr);
            System.out.println("After Moving Zeros to the End using Streams:");
            printArray(arr);

            // Reset the array for the next operation

            moveZerosToFront(arr);
            System.out.println("After Moving Zeros to the Beginning using Streams:");
            printArray(arr);
        }
    }


