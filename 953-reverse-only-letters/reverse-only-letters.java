class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        StringBuffer sb = new StringBuffer(s);
        int i = 0 , j =n-1;

        while(i<j){
            if(!Character.isLetter(sb.charAt(i))){
                i++;
            }
            else if(!Character.isLetter(sb.charAt(j))){
                j--;
            }
            else{
            char tem = sb.charAt(i);
            sb.setCharAt(i , sb.charAt(j));
            sb.setCharAt(j , tem);
            i++;
            j--;
            }
        }
        return sb.toString();
     }
}