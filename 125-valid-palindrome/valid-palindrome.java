class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String s1 = sb.toString();
        if(pallindrome(s1)==true){
            return true;
        }
        return false;
    }

        public boolean pallindrome(String s){
            int n = s.length();
            int i = 0 , j = n-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;  
            }
            return true;
           
        }
    
}