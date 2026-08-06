class Solution {
    public boolean isPrime(int n) {
        
        if(n<=1) return false;
        for(int i=2; i * i <= n; i++){
            if(n%i==0){
                return false;
                
            }
        }
        return true;
        
    }

    public boolean completePrime(int n) {
        
        String s = String.valueOf(n);
        int j = s.length();
        
        String sufix = " ";
         int prefix = 0;

        for (int i = 0; i < s.length(); i++) {

            prefix = prefix * 10 + (s.charAt(i) - '0');

            if (!isPrime(prefix))

                return false;

        }

        // Suffix check

        for (int i = 0; i < s.length(); i++) {

            int suffix = Integer.parseInt(s.substring(i));

            if (!isPrime(suffix))

                return false;

        }
    
        return true;
    }

    
}