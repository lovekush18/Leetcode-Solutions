class Solution {
public:
    int countElements(vector<int>& nums) {
        int count = 0;
        int n = nums.size();
        int maxele = INT_MIN;
        int minele = INT_MAX;
        for(int i=0;i<n;i++){
            maxele = max(nums[i],maxele);
        }
        for(int i=0;i<n;i++){
            minele = min(nums[i],minele);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>minele && nums[i]<maxele){
                count++;
            }
        }
        return count;
    }
};