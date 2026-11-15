class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        String s = String.valueOf(n);
        String s1 = "";
        int u = s.length();
        for(int i=0;i<u;i++){
            char c1 = s.charAt(i);
            if(c1!='0'){
                s1+=c1;
            }
        }
        int sum = 0;
        int m = s1.length();
        for(int j=0;j<m;j++){
            char c1 = s1.charAt(j);
            int val = c1-'0';
            sum+=val;
        }
        int l1 = Integer.parseInt(s1);
        return (long)l1*sum;
    }
} 