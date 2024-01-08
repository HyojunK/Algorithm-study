class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }

        if(nums1.length > 1) {
            Arrays.sort(nums1);
        }
    }
}