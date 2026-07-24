class Solution {
    public int longestOnes(int[] arr, int k) {
        // int n = arr.length;
        // int maxlen = 0;
        // for(int i=0;i<n;i++){
        //     int flip = 0;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]==0){
        //             flip++;
        //         }
        //         if(flip<=k){
        //             maxlen = Math.max(maxlen,j-i+1);
        //         }
               
        //     }
        // }
        // return maxlen;
        int n = arr.length;
        int l = 0, r = 0;
        int flip = 0;
        int maxlen = 0;
        while(r<n){
            if(arr[r]==0){
                flip++;
            }
            while(flip>k){
                if(arr[l]==0){
                   flip--;
                }
                l++;    
            }
            if(flip<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;

        }
        return maxlen;
        
    }
}