/*Q4. Given a number, count the number of set bits in that number without using an extra space.
Note : bit ‘1’ is also known as set bit. */

public class SetBitCounter {

        public static void main(String[] args) {
            int number1 = 7;
            System.out.println("Number of set bits in " + number1 + ": " + countSetBits(number1));
    
            int number2 = 15;
            System.out.println("Number of set bits in " + number2 + ": " + countSetBits(number2));
        }
    
        public static int countSetBits(int number) {
            int count = 0;
            
            while (number > 0) {
                number = number & (number - 1); // Clear the rightmost set bit
                count++;
            }
            
            return count;
        }
    }
    
