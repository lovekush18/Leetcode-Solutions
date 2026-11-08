class Solution {
public:
    int findNonMinOrMax(vector<int>& nums) {
        int no = -1;
        int maxi = INT_MIN;
        int mini = INT_MAX;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]>maxi){
                maxi = nums[i];
            }
            if(nums[i]<mini){
                mini = nums[i];
            }
            
        }
        for(int i=0;i<n;i++){
             if(nums[i]!=maxi && nums[i]!=mini){
                no = nums[i];
                break;
            }
        }

        return no;

    }
};