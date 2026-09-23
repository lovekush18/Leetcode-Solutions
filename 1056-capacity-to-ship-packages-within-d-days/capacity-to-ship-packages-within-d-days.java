class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            sum+=arr[i];
        }

        int i = max , j = sum;
        int ans1 = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            int ans = fun(arr,mid);
            if(ans<=days){
                ans1 = mid;
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return ans1;
    }

    public static int fun(int[] arr, int capacity) {
        int sum1 = 0;
        int day = 1;
        for(int i=0;i<arr.length;i++){
        
            if(sum1+arr[i]<=capacity){
                sum1+=arr[i];
            }
            else{
                day++;
                sum1=0;
                sum1+=arr[i];
            }
        }
        return day;
    }

}