class Solution {
public:
    int smallestIndex(vector<int>& nums) {
        int n = nums.size();
        for(int i=0;i<n;i++){
            int m = fun(nums[i]);
            if(m==i){
                return i;
                
            }
        }
        return -1;
    }

    int fun(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum+=digit;
            num = num/10;
        }
        return sum;
    }
};