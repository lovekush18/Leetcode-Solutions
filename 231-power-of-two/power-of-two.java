class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n = n/2;
        }
        if(n==1) return true;
        return false;



        // if(n<=0) return false;
        // if(n==1) return true;
        // if((n & (n-1)) ==0)
        // return true;
        // return false;
        
    }
}