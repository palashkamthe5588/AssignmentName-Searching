/*Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
Output 1: 6
Input 2: arr = [ 0 0 0 0 0 1 1]
Output 2: 2 */


// Time complexity : O(logn)
// Space complexity : O(1)
public class CountOnesInSortedBinaryArray {
       public static int countOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary search to find the first occurrence of 1
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == 1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // The count of 1's is the total length minus the last occurrence index
        return arr.length - left;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int[] arr2 = {0, 0, 0, 0, 0, 1, 1};

        int count1 = countOnes(arr1);
        int count2 = countOnes(arr2);

        System.out.println("Output 1: " + count1); // Output 1: 6
        System.out.println("Output 2: " + count2); // Output 2: 2
    }
}