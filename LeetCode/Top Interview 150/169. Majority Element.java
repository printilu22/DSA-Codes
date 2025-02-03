class Solution {
    public int majorityElement(int[] nums) {
          HashMap<Integer, Integer> countMap = new HashMap<>();

          for(int num: nums){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
          }

          int maxcount = 0;
          int maxEle = -1;

          for(int key : countMap.keySet()){
            if(countMap.get(key) > maxcount){
                maxcount = countMap.get(key);
                maxEle = key;

            }
          }
          return maxEle;
    }
}
