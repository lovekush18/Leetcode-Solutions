class Solution {
public:
    int missingMultiple(vector<int>& nums, int k) {
        int n = nums.size();
       
        int missing = 0;
        int small = INT_MAX;
        unordered_set<int> set;
        for(int i = 0;i<n;i++){
            set.insert(nums[i]);
        }
        for(int i = 1;i<=n+1;i++){
            if(!(set.count(k*i))){
                missing = k*i;
                small = min(missing,small);
            }
            
        }
        return small;
   

        
    }
};