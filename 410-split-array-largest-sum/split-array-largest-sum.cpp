class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        int max = INT_MIN;
        int n = nums.size();
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int ans = -1;
        int l = max , h = sum;
        while(l<=h){
            int mid = l+(h-l)/2;
            int a = fun(nums,mid);
            if(a==k){
                ans = mid;
                h = mid-1;
            }
            else if(a<k){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }

    int fun(vector<int>& vec ,int maxval){
        int sum = 0;
        int cntofarr = 1;
        int n = vec.size();
        for(int i = 0;i<n;i++){
            if(vec[i]+sum<=maxval){
                sum+=vec[i];
            }
            else{
                cntofarr++;
                sum = vec[i];
            }
        }
        return cntofarr;
    }
};