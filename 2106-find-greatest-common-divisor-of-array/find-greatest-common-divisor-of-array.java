class Solution {
    public int findGCD(int[] nums) {
        
        int small = nums[0];
        int great = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<small){
                small = nums[i];
            }
            if(nums[i]>great){
                great = nums[i];
            }
        }
        return GCD(small,great);
    }
            
         public int GCD(int a, int b){
            if(a==0){
                return b;
            }
            return GCD(b%a,a);
         }
    
}