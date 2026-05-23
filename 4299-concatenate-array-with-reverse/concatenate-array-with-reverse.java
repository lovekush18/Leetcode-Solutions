class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
            arr[n+i] = nums[n-1-i];
        }
        return arr;

        
    }
}