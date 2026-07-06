class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int upcase = 0;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                upcase++;
            }
        }
        if(upcase==n || upcase ==0 || (upcase==1 && Character.isUpperCase(word.charAt(0)))){
                return true;
        }
        return false;
       }
}