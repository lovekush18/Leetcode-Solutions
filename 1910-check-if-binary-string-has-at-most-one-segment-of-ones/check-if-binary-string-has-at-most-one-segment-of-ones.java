class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n) {
            if (j < n && s.charAt(j) == '0') {
                j++;
                i = j;
                continue;
            }
            while (j < n && s.charAt(j) == '1') {
                j++;
            }
            count++;

            if (count > 1) {
                return false;
            }
            i = j;
        }

        return true;
        
    }
}