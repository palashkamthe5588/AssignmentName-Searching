
    public class OddOccurrenceFinder {

        public static void main(String[] args) {
            int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
            int oddOccurrenceElement = findOddOccurrenceElement(arr);
            System.out.println("The odd occurring element is " + oddOccurrenceElement);
        }
    
        public static int findOddOccurrenceElement(int[] arr) {
            int result = 0;
            
            // XOR all elements in the array
            for (int i = 0; i < arr.length; i++) {
                result ^= arr[i];
            }
            
            return result;
        }
    }
    

