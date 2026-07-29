class Solution {
    public int maxPower(String s) {
        int n = s.length();
        if(n==1) return 1;
        int count = 1;
        int maxcount=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            if(count>maxcount){
                maxcount = count;
            }
            
        }
        return maxcount;
        
    }
}