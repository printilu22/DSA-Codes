class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1;
        int b = n-1;
        int c = m+n-1;
        for (int i = m; i < m+n; i++) {
            for (int j = 0; j < n; j++) {
                if(nums1[c] < nums2[b] ){
                    nums1[c] = nums2[b];
                    b--;
                    c--;
                }
                
            }
        }
        Arrays.sort(nums1);
        
    }
}
