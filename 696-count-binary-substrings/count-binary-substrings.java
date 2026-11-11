class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int i = 0 , j = 0;
        int prev = 0;
        int count = 0;
        while(i<n){
            while(j<n && s.charAt(j)==s.charAt(i)){
                j++;
            }
            int cur = j-i;
            count+=Math.min(prev,cur);
            prev = cur;
            i = j;
        }
        return count;
    }
}