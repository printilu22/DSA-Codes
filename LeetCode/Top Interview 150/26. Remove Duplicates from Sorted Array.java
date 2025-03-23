class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int k = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[k]){
                k++;
            }
            nums[k] = nums[i];
        }
        return k+1;
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int n = nums.length;
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int num : nums){
//             if(!list.contains(num)){
//                 list.add(num);
//             }
//         }
//         int i;
//         for(i=0; i<list.size(); i++){
//             nums[i] = list.get(i);
//         }
//         return i;
//     }
// }
