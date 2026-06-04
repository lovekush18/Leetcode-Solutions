class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int count = 0;
        int maxcount=0;
        for(int i=0;i<n;i++){
            if(i==0 || s.charAt(i)==s.charAt(i-1)){
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