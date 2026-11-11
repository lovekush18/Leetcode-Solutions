class Solution {
    public String compressedString(String word) {
        int n = word.length();
        int i = 0;
        int j = 0;
        String s = "";
        while(i<n){
            while(j<n && word.charAt(i)==word.charAt(j)){
                j++;
            }

            int len = j-i;
            while(len>9){
                s = s+9;
                s = s+(word.charAt(i));
                len = len-9;
                
            }
            s = s+(len);
            s = s+(word.charAt(i));
            i = j;
        
        }
        return s;
    }
}