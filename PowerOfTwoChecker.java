/*Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]
Input 1: n = 15
Output 1: False
Input 2: n = 32
Output 2: True */


    public class PowerOfTwoChecker {

        public static void main(String[] args) {
            int n1 = 15;
            System.out.println("Is " + n1 + " a power of two? " + isPowerOfTwo(n1));
    
            int n2 = 32;
            System.out.println("Is " + n2 + " a power of two? " + isPowerOfTwo(n2));
        }
    
        public static boolean isPowerOfTwo(int n) {
            if (n <= 0) {
                return false; // Negative numbers and zero are not powers of two.
            }
    
            // A power of two has only one bit set to '1' in its binary representation.
            // Use bitwise operations to check this condition.
            return (n & (n - 1)) == 0;
        }
    }
    

