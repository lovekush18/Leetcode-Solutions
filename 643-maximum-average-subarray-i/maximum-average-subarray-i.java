class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = k-1;
        int sum = 0;
        while(i<=j){
            sum+=nums[i];
            i++;
        }
        int maxsum = sum;
        int l = 0;
        while(j<n-1){
            sum = sum-nums[l];
            l++;
            j++;
            sum = sum+nums[j];
            maxsum = Math.max(sum,maxsum);
        }
        double avg = (double)maxsum/k;
        return avg;
    }
}