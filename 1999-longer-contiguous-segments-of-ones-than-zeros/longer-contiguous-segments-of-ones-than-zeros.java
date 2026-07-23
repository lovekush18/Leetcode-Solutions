class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();
        int czero = 0;
        int cone = 0;
        int maxzero = 0;
        int maxone = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='1'){
                czero = 0;
                cone++;
            }
            else if(ch=='0'){
                cone = 0;
                czero++;
            }
            maxone = Math.max(maxone,cone);
            maxzero = Math.max(maxzero,czero);
            
        }
        if(maxone>maxzero){
            return true;
        }
        return false;
        
    }
}