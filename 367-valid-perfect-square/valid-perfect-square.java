class Solution {
    public boolean isPerfectSquare(int n) {

        for(int i = 1;i<=n/i;i++){
            if(n%i==0){
                int ist = i;
                int sec = n/i;
                if(ist==sec) return true;
            }
        }
        return false;
        
        
        
    }
}