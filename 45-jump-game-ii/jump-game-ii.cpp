class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int minjumps = 0;
        int l = 0 ;
        int r = 0;
        while(r<n-1){
            int far = 0;
            for(int j = l;j<=r;j++){
                far = max(far,j+nums[j]);
            }
            l= r+1;
            r = far;
            minjumps++;
        }
        return minjumps;
        
    }

    
};