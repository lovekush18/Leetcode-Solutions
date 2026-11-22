class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        boolean flagB = false;
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            if(c1=='b'){
                flagB = true;
            }
            if(c1=='a' && (flagB==true)){
                return false;
            }
        }
        return true;
    }
}