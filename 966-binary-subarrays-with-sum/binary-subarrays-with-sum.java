class Solution {
    
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        // int sum = 0;
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        //       if(map.containsKey(sum - k)) {
        //         count+= map.get(sum - k);
        //       }
        //      if(map.containsKey(sum)) {
        //         int count1 = map.get(sum);
        //         map.put(sum, count1 + 1);
        //     } else {
        //         map.put(sum, 1);
        //     }    
        // }
        //  return count;

        public int fun(int[] nums, int goal) {
        if(goal<0) return 0;
        int l = 0, r = 0, sum = 0, count = 0;
        int n = nums.length;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            if(sum<=goal){
                count = count+(r-l+1);
            }
            r++;
        }
        return count;
        }
        public int numSubarraysWithSum(int[] nums, int goal) {
            return fun(nums,goal)-fun(nums,goal-1);
        }
    
}