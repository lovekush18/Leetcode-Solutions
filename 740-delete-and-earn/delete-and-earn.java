class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
        }
        int[] points = new int[max+1];
        for(int i=0;i<n;i++){
            points[nums[i]]+=nums[i];
        }
        int[] dp = new int[max+1];
        dp[0] = points[0];
        if(max>=1) dp[1] = Math.max(points[0],points[1]);
        for(int i=2;i<points.length;i++){
            dp[i] = Math.max(dp[i-1],points[i]+dp[i-2]);
        }
        return dp[max];
    }
    
}