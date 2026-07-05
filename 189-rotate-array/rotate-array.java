class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;   // Handle k > n

        // STEP 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // STEP 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // STEP 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Pure recursive in-place reverse
    static void reverse(int[] arr, int start, int end) {

        // Base case: stop when pointers cross
        if (start >= end) {
            return;
        }

        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call inward
        reverse(arr, start + 1, end - 1);
    }
}
