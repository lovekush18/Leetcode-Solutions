class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i))){
                return s.toLowerCase();
            }
        }
        return s;
        
    }
}