class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        int l = 1 , hi = max;
        int ans = -1;
        while(l<=hi){
            int mid = l+(hi-l)/2;
            int u = fun(piles,mid);
            if(u<=h){
                ans = mid;
                hi = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
     public int fun(int[] piles, int h) {
        int totaltime = 0;
        for(int i = 0;i<piles.length;i++){
            double a = Math.ceil((double)piles[i]/h);
            totaltime+=a;
        }
        return totaltime;
     }

}