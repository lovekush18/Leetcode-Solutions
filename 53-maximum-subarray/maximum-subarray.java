class Solution {
    public int maxSubArray(int[] nums) {
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // for(int start = 0; start<n;start++){
        //     int cursum = 0;
        //         for(int end = start; end<n; end++){
        //             cursum = cursum+nums[end];
        //             if(cursum>max){
        //                 max = cursum;
        //             }
        //         }
            
        // }
        // return max;
        int n = nums.length;
        int cursum = 0;
        int maxsum = nums[0];
        for(int i=0;i<n;i++){
            cursum = cursum+nums[i];
            if(cursum>maxsum){
                maxsum = cursum;
            }
            if(cursum<0) cursum = 0;
        }
        return maxsum;
    }
}