class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0 , j =0;
        while(i<sb.length()){
            j = i;
            while(j<sb.length() && sb.charAt(i)==sb.charAt(j)){
                j++;
            }
            int count = j-i;
            if(count>2){
                sb.delete(i+2,j);
                j = i+2;
            }
            i = j;

        }
        return sb.toString();
    }
}