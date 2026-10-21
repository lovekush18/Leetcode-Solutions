class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        int maxind = 0;
        for(int i = 0;i<n;i++){
            if(i<=maxind){
                maxind = max(maxind,i+nums[i]);
            }
            else{
                return false;
            }
            if(maxind >= n-1){
                return true;
            }
        }
        return false;
    }
};