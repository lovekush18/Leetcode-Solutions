class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        boolean ans = false;
        int low = 0 , high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                ans = true;
                break;
            }

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                
            }

            else if(nums[low]<=nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            
            else if(nums[mid]<=nums[high]){
                    if(nums[mid] <target && target <= nums[high]){
                        low = mid+1;
                    }
                    else{
                        high = mid-1;
                    }
            }
            
        }
        return ans;
        
    }
}