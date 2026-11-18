class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = nums.clone();
        int n = arr.length;
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                nums[j] = arr[i];
                j++;

            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                nums[j] = arr[i];
                j++;

            }
        }
        return nums;
        
    }
}