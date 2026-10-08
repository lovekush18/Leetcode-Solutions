class Solution {
    static long mod = 1000000007;
    public int countGoodNumbers(long n) {
        
        long even = pow(5,(n+1)/2)%mod;
        long odd = pow(4,(n/2))%mod;
        return (int)((even*odd)%mod);
      
    }

    public static long pow(long a , long b){
        if(b==0){
            return 1;
        }
        long ans = pow(a,b/2);
        if(b%2==0){
            return (ans*ans)%mod;
        }
        else{
            return (ans*ans*a)%mod;
        }
    }
}