class Solution {
    public char findKthBit(int n, int k) {
        double length = Math.pow(2,n)-1;
        return fun(n,k);
    }

    public static char fun(int n , int k){
            int len = (int)Math.pow(2,n)-1;
            if(n==1) return '0';
            if(k<=len/2){
                return fun(n-1 , k);
            }
            else if(k==(Math.ceil(len/2.0))){
                return '1';
            }
            else {
                char ch = fun(n-1,len-k+1);
                ch = ch =='1'?'0':'1';
                return ch;
            }
    }
}