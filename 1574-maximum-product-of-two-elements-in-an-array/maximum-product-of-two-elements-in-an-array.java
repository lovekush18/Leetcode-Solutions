class Solution {
    public int maxProduct(int[] nums) {
        // int n = nums.length;
        // int max = 0;
        // for(int i = 0;i<n-1;i++){
        //     for(int j = i+1;j<n;j++){
        //         int cur = (nums[i]-1)*(nums[j]-1);
        //         max = Math.max(max,cur);
        //     }
        // }
        // return max;

        // int n = nums.length;
        // Arrays.sort(nums);
        // return (nums[n-1]-1)*(nums[n-2]-1);

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                secmax = max;
                max = nums[i];
            }
            else if(nums[i]>secmax){
                secmax = nums[i];
            }
        }
        return (max-1)*(secmax-1);



        
    }
}