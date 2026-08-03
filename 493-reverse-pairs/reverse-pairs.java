class Solution {

    int count = 0;
    // Total reverse pairs

    public int reversePairs(int[] nums) {

        sort(nums);

        return count;
    }

    int[] sort(int[] arr) {

        if (arr.length <= 1)
            return arr;
        // Base case

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        countPairs(left, right);
        // Count reverse pairs before merge

        return merge(left, right);
        // Merge sorted halves
    }

    void countPairs(int[] left, int[] right) {

        int j = 0;

        for (int i = 0; i < left.length; i++) {

            while (j < right.length &&
                  (long) left[i] > 2L * right[j]) {

                j++;
            }

            count += j;
            // All right[0...j-1] form reverse pairs
        }
    }

    int[] merge(int[] left, int[] right) {

        int[] ans = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {

                ans[k++] = left[i++];

            } else {

                ans[k++] = right[j++];
            }
        }

        while (i < left.length)
            ans[k++] = left[i++];

        while (j < right.length)
            ans[k++] = right[j++];

        return ans;
    }
}