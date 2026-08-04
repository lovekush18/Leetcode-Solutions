class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        int l = 0 ,r = 0 ;
        long count = 0,sum=0;
        while(r<n){
            sum+=nums[r];
            long score = sum*(r-l+1);
            while(score>=k){
                sum-=nums[l];
                l++;
                score = sum*(r-l+1);
            }
            if(score<k){
                count+=(r-l+1);
            }
            r++;

        }
        return count;
        
        
    }
}