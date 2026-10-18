class Solution {
    public String countAndSay(int n) {
        return fun(n);
    }
    public String fun(int n){
        if(n==1){
            return "1";
        }
        String a = fun(n-1);
        String ans = "";
        int i = 0;
        int j = 0;
        int m = a.length();
        while(i<m){
            while(j<m && a.charAt(i)==a.charAt(j)){
                j++;
            }
            
            ans+=(j-i);
            ans = ans+a.charAt(i);
            i = j;
            
        }
        return ans;
    }
}