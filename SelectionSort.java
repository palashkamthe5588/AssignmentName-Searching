public class SelectionSort {
   

        public static void main(String[] args) {
            int[] arr = {3, 5, 1, 6, 0};
            
            System.out.println("Input Array:");
            printArray(arr);
            
            selectionSortDescending(arr);
            
            System.out.println("\nOutput Array (Descending Order):");
            printArray(arr);
        }
    
        public static void selectionSortDescending(int[] arr) {
            int n = arr.length;
            
            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;
                
                // Find the index of the maximum element in the unsorted portion of the array
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[maxIndex]) {
                        maxIndex = j;
                    }
                }
                
                // Swap the maximum element with the current element
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    

