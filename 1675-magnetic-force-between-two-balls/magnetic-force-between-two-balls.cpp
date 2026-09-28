class Solution {
public:
    int maxDistance(vector<int>& nums, int m) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        int l = 1 , h = nums[n-1]-nums[0];
        while(l<=h){
            int mid = l+(h-l)/2;
            int a = fun(nums,mid);
            if(a>=m){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return h;
    }

    int fun(vector<int>& arr, int minforce) {
        int cntofballs = 1 , lastball = arr[0];
        for(int i=0;i<arr.size();i++){
            int a = abs(arr[i]-lastball);
            if(a>=minforce){
                cntofballs++;
                lastball = arr[i];
            }
        }
        return cntofballs;
    }

    
};