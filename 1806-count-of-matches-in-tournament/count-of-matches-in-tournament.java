class Solution {
    public int numberOfMatches(int n) {
        int sum = 0;
        while(n>1){
            while(n>1 && n%2==0){
            int matches = n/2;
            sum+=matches;
            n = n/2;
        }
        while(n>1 && n%2==1){
            int matches = (n-1)/2;
            sum+=matches;
            n = ((n-1)/2)+1;
        }
        }
        return sum;
        
    }
}