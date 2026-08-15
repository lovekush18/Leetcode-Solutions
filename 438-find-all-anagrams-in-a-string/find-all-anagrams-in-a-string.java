class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] pcount = new int[26];
        for(int i = 0;i<p.length();i++){
            char ch = p.charAt(i);
            pcount[ch-'a']++;
        }
        int left = 0;
        int[] scount = new int[26];
        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            scount[ch1-'a']++;

            if(i-left+ 1 > p.length()){
                char ch2 = s.charAt(left);
                scount[ch2-'a']--;
                left++;
            }

            if(i-left+ 1 == p.length() && Arrays.equals(pcount,scount)){
                list.add(left);

            }
        }
        return list;
    }
}