class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCostClimbingStairs2(arr,0,n),minCostClimbingStairs2(arr,1,n));
    }
    public int minCostClimbingStairs2(int[] arr , int i , int n) {
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans =arr[i]+Math.min(minCostClimbingStairs2(arr,i+1,n),minCostClimbingStairs2(arr,i+2,n));
        dp[i] = ans;
        return ans;
    }
}