class Solution{
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        Arrays.fill(dp,-1);
        return rob2(nums,0,n-1,dp);
    }
    public int rob2(int[] nums , int i , int j , int[] dp) {
        if(i>j) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+Math.max(rob2(nums,i+2,j,dp),rob2(nums,i+3,j,dp));
        int skip = Math.max(rob2(nums,i+1,j,dp),rob2(nums,i+3,j,dp));
        return dp[i] = Math.max(pick,skip);
    }
}