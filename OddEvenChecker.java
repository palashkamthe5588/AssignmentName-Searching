/*Q.3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
Input 8, Even
3, False */


    public class OddEvenChecker {

        public static void main(String[] args) {
            int number1 = 8;
            System.out.println(number1 + " is " + (isEven(number1) ? "Even" : "Odd"));
    
            int number2 = 3;
            System.out.println(number2 + " is " + (isEven(number2) ? "Even" : "Odd"));
        }
    
        public static boolean isEven(int number) {
            // Use a bitwise AND operation to check the LSB.
            // If it's 0, the number is even; if it's 1, the number is odd.
            return (number & 1) == 0;
        }
    }
    


