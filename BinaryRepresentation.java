   /*Problem 1: given a number, print its binary representation. [easy]
Input 1: number = 5
Output 1: 101
Input 2: number = 10
Output 2: 1010*/

    public class BinaryRepresentation {

        public static void main(String[] args) {
            int number1 = 5;
            System.out.println("Binary representation of " + number1 + ": " + toBinaryString(number1));
    
            int number2 = 10;
            System.out.println("Binary representation of " + number2 + ": " + toBinaryString(number2));
        }
    
        public static String toBinaryString(int number) {
            return Integer.toBinaryString(number);
        }
    }
    
