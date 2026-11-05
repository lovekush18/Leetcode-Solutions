class Solution {
    public char nextGreatestLetter(char[] len, char target) {
        int n = len.length;
        char ans = len[0];
        int l = 0 , h = n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(len[mid]>target){
                ans = len[mid];
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;

    }
}