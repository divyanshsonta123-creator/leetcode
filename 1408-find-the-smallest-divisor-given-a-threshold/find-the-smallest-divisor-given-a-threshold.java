class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int start = 1;
        int end = 0;

        // Find maximum element
        for (int i = 0; i < nums.length; i++) {
            end = Math.max(end, nums[i]);
        }

        int ans = 0;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (sum(nums, mid) <= threshold) {

                // mid is possible answer
                ans = mid;

                // Try smaller divisor
                end = mid - 1;
            }
            else {

                // Sum is too large
                // Need bigger divisor
                start = mid + 1;
            }
        }

        return ans;
    }

    static int sum(int arr[], int mid) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            // Ceiling division
            sum += (arr[i] + mid - 1) / mid;
        }

        return sum;
    }
}