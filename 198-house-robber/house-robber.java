class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return rob2(nums,0,n);
    }
    public int rob2(int[] nums , int i , int n) {
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int go = nums[i]+rob2(nums,i+2,n);
        int skip = rob2(nums,i+1,n);
        int ans = Math.max(go,skip);
        dp[i] = ans;
        return ans;
        
    }
}