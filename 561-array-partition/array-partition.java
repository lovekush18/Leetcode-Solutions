class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            Math.min(nums[i],nums[i+1]);
            sum = sum+nums[i];
        }
        return sum;
    }
}