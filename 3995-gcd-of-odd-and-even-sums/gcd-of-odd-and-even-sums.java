class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = 0;
        int evensum = 0;
        for(int i=1;i<=n;i++){
            oddsum+= 2*i-1;
        }
        for(int i=1;i<=n;i++){
            evensum+= 2*i;
        }
        int gcd = 1;
        for (int i = 1; i <= Math.min(oddsum,evensum); i++) {
            if (oddsum % i == 0 && evensum % i == 0) {
                gcd = i;
            }

        }
        return gcd;
        
    }
}