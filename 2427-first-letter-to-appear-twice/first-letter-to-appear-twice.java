class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        char repchr = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                repchr = ch;
                return repchr;
            }
            else{
                set.add(ch);
            }
        }
        return '*';
        
    }
}