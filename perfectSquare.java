/*Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer 
with itself.

Example 1:

Input: num = 16

Output: true

Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:

Input: num = 14

Output: false

Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer*/



public class perfectSquare {
        public static boolean isperfectSquare(int num) {
            if (num < 0) {
                return false;
            }
    
            if (num <= 1) {
                return true;
            }
    
            long left = 1; // Start with the left boundary at 1.
            long right = num / 2; // The largest possible square root of 'num' is 'num / 2'.
    
            while (left <= right) {
                long mid = left + (right - left) / 2; // Calculate the middle value.
    
                long square = mid * mid; // Calculate the square of the middle value.
    
                if (square == num) {
                    return true; // If the square is equal to the input number, it's a perfect square.
                } else if (square < num) {
                    left = mid + 1; // If the square is less than the input number, move the left boundary to the right.
                } else {
                    right = mid - 1; // If the square is greater than the input number, move the right boundary to the left.
                }
            }
    
            return false; // If the loop completes without finding a perfect square, return false.
        }
    
        public static void main(String[] args) {
            int num1 = 16;
            boolean result1 = isperfectSquare(num1);
            System.out.println("Is " + num1 + " a perfect square? " + result1); // Output: true
    
            int num2 = 14;
            boolean result2 = isperfectSquare(num2);
            System.out.println("Is " + num2 + " a perfect square? " + result2); // Output: false
        }
    }
    

