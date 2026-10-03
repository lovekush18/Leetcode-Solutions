class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
       return fun(n);

        
    }

    public int fun(int n){
        if(n==0) return 0;
        int digit = n%2;
        int compl = 1-digit;
        return compl + 2*fun(n/2);
    }
}