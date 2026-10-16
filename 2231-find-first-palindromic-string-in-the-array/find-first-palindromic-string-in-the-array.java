class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i=0;i<words.length;i++){
            String s1 = words[i];
            if(s1.equals(reverse(s1))){
                ans = s1;
                break;
            }
        }
        return ans;
    }

    public static String reverse(String s){
        int m = s.length();
        int i = 0;
        int j = m-1;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        return sb.toString();
    }
}