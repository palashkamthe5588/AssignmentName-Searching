public class CountOccurences {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target1 = 5;
        int target2 = 6;

        int count1 = countOccurrences(nums, target1);
        int count2 = countOccurrences(nums, target2);

        if (count1 != -1) {
            System.out.println("Target " + target1 + " occurs " + count1 + " times");
        } else {
            System.out.println("Target " + target1 + " is not found in the array");
        }

        if (count2 != -1) {
            System.out.println("Target " + target2 + " occurs " + count2 + " times");
        } else {
            System.out.println("Target " + target2 + " is not found in the array");
        }
    }

    public static int countOccurrences(int[] nums, int target) {
        int firstIndex = findFirstIndex(nums, target);
        int lastIndex = findLastIndex(nums, target);

        if (firstIndex != -1 && lastIndex != -1) {
            return lastIndex - firstIndex + 1;
        } else {
            return -1;
        }
    }

    public static int findFirstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstIndex;
    }

    public static int findLastIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                lastIndex = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastIndex;
    }
}