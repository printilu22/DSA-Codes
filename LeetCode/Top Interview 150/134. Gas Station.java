class Solution {
    public int  index(int gas[], int cost[], int start){
        int tank = gas[start] - cost[start]; //70-2=68
        int i = (start+1) % gas.length;
        if(tank <= 0) return -1;   // i=4%5 =4     
        while(tank + gas[i] >= cost[i]){ //3+5= 8>2
            if(i == start){ 
                return start;
            }
            tank += gas[i] - cost[i];  //3+5 = 8-2=6
            i = (i+1) % gas.length; //
        }
        return -1;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int m = cost.length;
        int ans = -1;
        if(n == 1 && gas[0] >= cost[0]) return 0;
        for(int i=0; i<n; i++){
            ans = index(gas,cost,i);
            if(ans != -1){
                break;
            }
        }
        return ans;
        
    }
}
