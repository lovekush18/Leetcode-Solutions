class Solution {
    public boolean checkIfPangram(String sen) {
        int n = sen.length();
        HashSet<Character> has = new HashSet<>();
        for(int i=0;i<n;i++){
            char ch = sen.charAt(i);
            has.add(ch);
        }
        int count = 0;
        for(char c = 'a';c<='z';c++){
            if(!has.contains(c)){
                return false;
            }
        }
        return true;
          
    }
}