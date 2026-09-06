class Solution {
    public int[] searchRange(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[2];
        int first = lb(nums,k);
        int sec = ub(nums,k);
        if(first == n || nums[first]!=k){
            arr[0] = -1;
            arr[1] = -1;
        }
        else{
            arr[0] = first;
            arr[1] = sec-1;
        }
        return arr;
       
    }

    public int lb(int[] nums, int k) {
        int n = nums.length;
        int l = 0 , h = n-1;
        int lowerbound = n;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]>=k){
                lowerbound = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return lowerbound;
    }
    
    public int ub(int[] nums, int k) {
        int n = nums.length;
        int l = 0 , h = n-1;
        int upperbound = n;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]>k){
                upperbound = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return upperbound;
    }
   
}