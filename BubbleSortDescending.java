/*
Q1. Write a program to sort an array in descending order using bubble sort.
Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0} */


    public class BubbleSortDescending {
        public static void main(String[] args) {
            int[] arr = {3, 5, 1, 6, 0};
            
            System.out.println("Input Array:");
            printArray(arr);
            
            bubbleSortDescending(arr);
            
            System.out.println("\nOutput Array (Descending Order):");
            printArray(arr);
        }
    
        public static void bubbleSortDescending(int[] arr) {
            int n = arr.length;
            boolean swapped;
            
            do {
                swapped = false;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] < arr[i]) { // Compare adjacent elements in descending order
                        // Swap arr[i-1] and arr[i]
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);
        }
    
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
          



