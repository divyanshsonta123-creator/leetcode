class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Pass actual lengths, not length - 1
        int arr[] = merge(nums1, nums2, nums1.length, nums2.length);

        int n = arr.length;

        // Odd length → middle element
        if (n % 2 != 0) {
            return arr[n / 2];
        }

        // Even length → average of two middle elements
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        
    }
     static int[] merge(int left[], int right[],int m,int n) {
        int i = 0;                         // index for left
        int j = 0;                         // index for right
        int k = 0;                         // index for answer
        int ans[] = new int[m +n];

        // pick the smaller of left[i] and right[j] for ascending order
        while (i < m && j < n) {
            if (left[i] <= right[j]) {     // <= ensures stability (left elements come before equal right elements)
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements (if any)
        while (i < m) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < n) {
            ans[k] = right[j];
            j++;
            k++;
        }
       

        return ans;
    }
}