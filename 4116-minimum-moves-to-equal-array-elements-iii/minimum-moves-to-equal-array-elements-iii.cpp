class Solution {
public:
    int minMoves(vector<int>& nums) {
        int n = nums.size();
        int minmoves = 0;
        int maxu = INT_MIN;
        for(int i=0;i<n;i++){
            maxu = max(maxu,nums[i]);
        }
        for(int i=0;i<n;i++){
            minmoves+=maxu-nums[i];
        }
        return minmoves;
    }
};