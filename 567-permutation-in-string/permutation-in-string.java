class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            arr1[ch-'a']++;
        }
        int left = 0;
        int[] arr2 = new int[26];
        for(int i = 0;i<s2.length();i++){
            char ch2 = s2.charAt(i);
            arr2[ch2-'a']++;

            if(i-left+1 > s1.length()){
                char ch3 = s2.charAt(left);
                arr2[ch3-'a']--;
                left++;
            }

            if(i-left+1 == s1.length() && Arrays.equals(arr1,arr2)){
                return true;
            }

        }
        return false;
        
    }
}