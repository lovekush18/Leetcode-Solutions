class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n,0));

    }
     public int reverse(int n, int r) {
        if(n==0){
            return r;
        }
    return reverse(n/10 , r*10+n%10);
     }

}