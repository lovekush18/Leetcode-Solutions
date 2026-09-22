class Solution {
    public int minDays(int[] arr, int m, int k) {
       int n = arr.length;
       int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){            
            if(arr[i]>max){
                max = arr[i];
            }
        }
        if(m*k > n) return -1;
        int l = 1 , hi = max;
        int ans = -1;
        while(l<=hi){
            int mid = l+(hi-l)/2;
            boolean q = fun(arr,mid,m,k);
            if(q==true){
                ans = mid;
                hi = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    static boolean fun(int[] arr, int day, int m, int k) {
        int cnt = 0;
        int ans = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
          
            }
            else{
                ans+=cnt/k;
                cnt = 0;
            }
            
        }
        ans+=cnt/k;
        if(ans>=m) return true;
        return false;
    }

}