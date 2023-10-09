/*Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
not present return -1.
Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
Output 1: 6
Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
Output 2: -1*/

public class LastOccurrence {
    public static int findLastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int target1 = 4;
        int result1 = findLastOccurrence(arr1, target1);
        System.out.println("Output 1: " + result1);

        int[] arr2 = {2, 2, 2, 6, 6, 18, 29, 30, 30, 30};
        int target2 = 15;
        int result2 = findLastOccurrence(arr2, target2);
        System.out.println("Output 2: " + result2);
    }
}

