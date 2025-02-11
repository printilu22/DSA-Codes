class Solution {
   public static int trap(int height[]) {
        int n = height.length;
        int[] left = new int[n];
        left[0] = height[0];
        for(int i =1;i < n ; i++){
            left[i] = Math.max(height[i],left[i-1]);
        }

        int[] rigth = new int[n];
        rigth[n-1] = height[n-1];
        for(int i =n-2 ; i >=0 ;i--){
            rigth[i] = Math.max(height[i],rigth[i+1]);
        }
        int maxwater =0 ;
        for(int i = 0 ; i < n ; i++){
            int water = Math.min(left[i] , rigth[i]);
            maxwater += water - height[i];
        }
        return maxwater;
    }
}
