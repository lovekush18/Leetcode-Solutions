class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int pro = 1;
        int l = 0,r=0;
        while(r<n){
            if(k<=1){
                return 0;
            }
            pro*=nums[r];
            while(pro>=k){
                pro/=nums[l];
                l++;
            }
            if(pro<k){
                count+=(r-l+1);
            }
            r++;
        }
        return count;
        
    }
}