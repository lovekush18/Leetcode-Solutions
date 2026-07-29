class Solution {
    public boolean isPowerOfFour(int n) {
        if(isPowerOfTwo(n) && perfectSquare(n) == true){
            return true;
        }
        return false;
    }

        public boolean isPowerOfTwo(int n){
            if(n<=0) return false;
            if((n & (n-1))==0){
                return true;
            }
            return false;
        }

        public boolean perfectSquare(int n){
            double d = Math.sqrt(n);
            int n1 = (int)(d);
            if((n1*n1) == n){
                return true;
            }
            return false;
        }

        


        // if(n<=0) return false;
        // while(n%4==0){
        //     n = n/4;
        // }
        // if(n==1) return true;
        // return false;

    
}