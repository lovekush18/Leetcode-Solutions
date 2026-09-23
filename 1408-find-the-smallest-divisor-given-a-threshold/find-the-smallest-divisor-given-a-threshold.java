class Solution {
    public int smallestDivisor(int[] nums, int threshold){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int ans = -1;
        int low = 1 , high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            int k = fun(nums,mid);
            if(k<=threshold){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
        
    }

    static int fun(int[] arr , int l){
        
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            double val = Math.ceil((double)arr[i]/l);
            sum+=(int)val;
        }
        return sum;
    }
}