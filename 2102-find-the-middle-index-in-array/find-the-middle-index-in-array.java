class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int totsum = 0;
        for(int i=0;i<n;i++){
            totsum += nums[i];
        }
        int leftsum = 0;
        for(int i = 0; i < nums.length; i++){
           int rightSum = totsum - leftsum - nums[i];
                if(leftsum == rightSum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}