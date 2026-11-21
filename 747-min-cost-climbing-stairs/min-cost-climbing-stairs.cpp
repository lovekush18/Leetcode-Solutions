class Solution {
public:
    int minCostClimbingStairs(vector<int>& nums) {
       
        int n = nums.size();
        vector<int> dp(n);
        dp[0] = nums[0];
        if(n>1) dp[1] = nums[1];
        for(int i=2;i<n;i++){
            dp[i] = nums[i]+min(dp[i-1],dp[i-2]);
        }
        return min(dp[n-1],dp[n-2]);
    }
    
};