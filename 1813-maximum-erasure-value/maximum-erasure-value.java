class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 0 , r = 0;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(r<n){
            sum+=nums[r];
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            if(!set.contains(nums[r])){
                set.add(nums[r]);
                maxsum = Math.max(sum,maxsum);
            }
            r++;
            
        }
        return maxsum;
        
    }
}