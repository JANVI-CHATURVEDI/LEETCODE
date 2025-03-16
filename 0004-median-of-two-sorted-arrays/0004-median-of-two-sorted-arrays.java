class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int j = 0, k = 0, l = 0;
        int[] arr = new int[n + m];

        // Merge two sorted arrays
        while (j < n && k < m) {
            if (nums1[j] < nums2[k]) {
                arr[l++] = nums1[j++];
            } else {
                arr[l++] = nums2[k++];
            }
        }

        // Copy remaining elements of nums1 (if any)
        while (j < n) {
            arr[l++] = nums1[j++];
        }

        // Copy remaining elements of nums2 (if any)
        while (k < m) {
            arr[l++] = nums2[k++];
        }

        // Find median
        int size = n + m;
        if (size % 2 != 0) {  // Odd length
            return arr[size / 2];
        } else {  // Even length
            return (arr[size / 2 - 1] + arr[size / 2]) / 2.0;
        }
    }
}
