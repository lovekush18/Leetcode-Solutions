class Solution {
public:
    int findMin(vector<int>& arr) {
        // int min = INT_MAX;
        // for(int i = 0;i<nums.size();i++){
        //     if(nums[i]<min){
        //         min = nums[i];
        //     }
        // }
        // return min;

        int min = INT_MAX;
        int n = arr.size();
        int l = 0 , h = n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[l]<=arr[mid]){
                if(arr[l]<min){
                    min = arr[l];
                }
                l = mid+1;
            }
            if(arr[mid]<=arr[h]){
                if(arr[mid]<min){
                    min = arr[mid];
                }
                h = mid-1;
            
            }
        }
        return min;
    }
};