class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        if(s.charAt(0)=='0') return 0;
        dp[0] = 1;
       
        for(int i=1;i<n;i++){
            char ch = s.charAt(i);
            if(ch!='0'){
                dp[i] += dp[i-1];
            }
            String s1 = s.substring(i-1,i+1);
            int num = Integer.parseInt(s1);
            if(num>=10 && num<=26){
                if(i==1){
                    dp[i]+=1;
                }
                else{
                    dp[i]+=dp[i-2];
                }
            }
            
        }
        return dp[n-1];
    }
}