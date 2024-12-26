package Testassessment;

import java.util.ArrayList;
import java.util.List;

public class Zerosepratelist {


        public static void moveZerosToEnd(int[] arr) {
            List<Integer> list = new ArrayList<>();
            int zeroCount = 0;

            for (int num : arr) {
                if (num != 0) {
                    list.add(num);
                } else {
                    zeroCount++;
                }
            }

            for (int i = 0; i < zeroCount; i++) {
                list.add(0);
            }


            for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
            }
        }


        public static void moveZerosToFront(int[] arr) {
            List<Integer> list1 = new ArrayList<>();
            int zeroCount = 0;

            for (int num : arr) {
                if (num == 0) {
                    zeroCount++;
                }
            }

            for (int i = 0; i < zeroCount; i++) {
                list1.add(0);
            }


            for (int num : arr) {
                if (num != 0) {
                    list1.add(num);
                }
            }


           for (int i = 0; i < arr.length; i++) {
                arr[i] = list1.get(i);
            }
        }



        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {14, 0, 5, 2, 0, 3, 0};

            System.out.println("Original Array:");
            printArray(arr);
            moveZerosToEnd(arr);
            System.out.println("After Moving Zeros at the end");
            printArray(arr);

            moveZerosToFront(arr);
            System.out.println("After Moving Zeros to the Beginning");
            printArray(arr);
        }
    }

