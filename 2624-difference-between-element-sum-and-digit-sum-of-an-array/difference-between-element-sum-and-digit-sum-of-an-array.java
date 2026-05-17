class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            element_sum+= nums[i];
            int digit = nums[i];
            while(digit>0){
                
                int l = digit%10;
                digit_sum+= l;
                digit = digit/10;
            }
        }
        int j = Math.abs(element_sum - digit_sum);
        return j;
        
    }
}