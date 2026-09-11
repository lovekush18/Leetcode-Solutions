class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        if(n==1) return nums[0];
        int low = 0 , high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                if(nums[low]<min) min = nums[low];
                low++;
                high--;
             
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<min){
                    min = nums[low];
                }
                low = mid+1;
            }
            else if(nums[mid]<=nums[high]){
                if(nums[mid]<min){
                    min = nums[mid];
                }
                high = mid-1;
            }
         }
        return min;
    }
}