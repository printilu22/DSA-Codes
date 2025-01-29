class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }

        int maxReach = 0, edge = 0, count = 0;
        
        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);  
            
            if (i == edge) {  // We need to jump
                count++;
                edge = maxReach;  
                
                if (edge >= n - 1) break;  // If we can reach the last index, stop early
            }
        }
        
        return count;
        // int maxjump = 0;
        // int count = 0;
        // int prevmax = 0;
        // for(int i=0; i<n-1; i++){
        //     if(i > maxjump) return 0;
        //     if(nums[i] == n){
        //         count++;
        //         return count;
        //     }
        //     prevmax = maxjump;
        //     maxjump = Math.max(maxjump, i + nums[i]);
        //     if(prevmax != maxjump){
        //         count++;
        //     }
            

        // }
        // return count;


    }    
}
