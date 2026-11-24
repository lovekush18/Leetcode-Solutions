class Solution {
    public int maxLength(int[] arr) {
        int maxlen = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int pr = 1;
            int gcd1 = 0;
            int lcm1 = 1;
            for(int j=i;j<n;j++){
               pr = pr*arr[j];
               gcd1 = gcd(gcd1,arr[j]);
               lcm1 = lcm(lcm1,arr[j]);
               if(pr == gcd1*lcm1){
                maxlen = Math.max(maxlen,j-i+1);
               }
                 
            }
        }
        return maxlen;
    }
    public int gcd(int a , int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int lcm(int a , int b){
        return a/gcd(a,b)*b;
    }
}