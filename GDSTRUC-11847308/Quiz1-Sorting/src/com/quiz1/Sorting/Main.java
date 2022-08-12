package com.quiz1.Sorting;

public class Main {

        public static void main(String[] args) {

            int[] numbers = new int [7];

            numbers[0] = 68;
            numbers[1] = 419;
            numbers[2] = -32;
            numbers[3] = 38;
            numbers[4] = 54;
            numbers[5] = 82;
            numbers[6] = -4;


            System.out.println("Before Bubble/Selection sort:");
            printArrayElements(numbers);


            descSelectionSort(numbers);

            System.out.println("\n\nAfter Bubble/Selection sort:");
            printArrayElements(numbers);


        }

        //Ascending Bubble Sort
        private static void ascBubbleSort(int[] arr){
            for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--){
                for (int i = 0; i < lastSortedIndex; i++){
                    if (arr[i] > arr[i + 1]){
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
        //Descending Bubble Sort
        private static void descBubbleSort(int[] arr){
            for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--){
                for (int i = 0; i < lastSortedIndex; i++){
                    if (arr[i] < arr[i + 1]){
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }

        private static void printArrayElements(int[] arr){
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }



        // Ascending Selection Sort
        private static void selectionSort(int[] arr){
            for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
                int largestIndex = 0;

                for(int i = 1; i <= lastSortedIndex; i++){
                    if (arr[i] > arr[largestIndex]){
                        largestIndex = i;
                    }

                }
                int temp = arr[lastSortedIndex];
                arr[lastSortedIndex] = arr[largestIndex];
                arr[largestIndex] = temp;
            }


        }

        //Descending Selection Sort
        private static void reverseSelectionSort(int[] arr){
            for (int lastSortedIndex = 0; lastSortedIndex < arr.length; lastSortedIndex++) {
                int largestIndex = arr.length - 1;

                for(int i = arr.length - 1; i >= lastSortedIndex; i--){
                    if (arr[i] > arr[largestIndex]){
                        largestIndex = i;
                    }

                }
                int temp = arr[lastSortedIndex];
                arr[lastSortedIndex] = arr[largestIndex];
                arr[largestIndex] = temp;
            }


        }

        private static void descSelectionSort(int[] arr){
            for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
                int largestIndex = 0;

                for(int i = 1; i <= lastSortedIndex; i++){
                    if (arr[i] < arr[largestIndex]){
                        largestIndex = i;
                    }

                }
                int temp = arr[lastSortedIndex];
                arr[lastSortedIndex] = arr[largestIndex];
                arr[largestIndex] = temp;
            }


        }
    }


