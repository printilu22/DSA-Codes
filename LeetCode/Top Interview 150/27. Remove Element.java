class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}


// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int n = nums.length;
//         int[] temp = new int[n];  // New array to store valid elements
//         int j = 0;  

//         for (int i = 0; i < n; i++) {
//             if (nums[i] != val) {
//                 temp[j++] = nums[i];  // Store valid elements
//             }
//         }

//         // Copy back the valid elements to the original array
//         for (int i = 0; i < j; i++) {
//             nums[i] = temp[i];
//         }

//         return j;  // Length of valid elements
//     }
// }
