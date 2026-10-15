class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i =0 , j =1;
        int n = nums.length;
        while(i<n && j<n){
            if(i%2==0 && nums[i]%2==0){
                i+=2;
            }
            else if(j%2==1 && nums[j]%2==1){
                j+=2;
            }
            else{
                int tem =nums[i];
                nums[i]=nums[j];
                nums[j]=tem;
            }
        }
        return nums;
        
    }
}