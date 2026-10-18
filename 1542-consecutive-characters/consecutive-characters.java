class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int maxcount = Integer.MIN_VALUE;
        while(i<n){
            while(j<n && s.charAt(i)==s.charAt(j)){
                j++;
            }
            int count = j-i;
            i = j;
            maxcount = Math.max(count,maxcount);
        }
        return maxcount;
    }
}