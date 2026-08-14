class Solution {
    public boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Duplicate values
            // Cannot determine which half is sorted
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            // LEFT half is sorted
            else if (nums[start] <= nums[mid]) {

                // Target lies in LEFT half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            // RIGHT half is sorted
            else {

                // Target lies in RIGHT half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}