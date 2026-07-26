class Solution {
    public int maximumProduct(int[] arr) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // int pr1 = nums[n-1]*nums[n-2]*nums[n-3];
        // int pr2 =  nums[0]*nums[1]*nums[n-1];
        // return Math.max(pr1 , pr2);


        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                thirdmax = secmax;
                secmax = max;
                max = arr[i];
            }
            else if(arr[i]>secmax){
                thirdmax = secmax;
                secmax = arr[i];
            }
            else if(arr[i]>thirdmax){
                thirdmax = arr[i];
                
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secmin = min;
                min = arr[i];
            }
            else if(arr[i]<secmin){
                secmin = arr[i];
            }

        }
        int a = max*secmax*thirdmax;
        int b = min*secmin*max;
        return Math.max(a,b);

        
        
    }
}
