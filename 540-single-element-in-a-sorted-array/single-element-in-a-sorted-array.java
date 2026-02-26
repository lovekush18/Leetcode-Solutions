class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n  = nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int low=0,high=n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            int first = mid, second=mid;
            if(nums[mid]==nums[mid-1]){
                first = mid-1;
            }
            else{
                second = mid+1;
            }
            int leftcount = first-low, secondcount = high-second;
            if(leftcount%2!=0){
                high = first-1;
            }
            else{
                low = second+1;
            }
        }
        return -1;
        
    }
}