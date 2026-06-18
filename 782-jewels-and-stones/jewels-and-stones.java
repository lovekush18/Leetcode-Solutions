class Solution {
    public int numJewelsInStones(String jewels, String stones) { 
        int m = jewels.length();
        int n = stones.length();
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> map = new HashSet<>();
        for(int i=0;i<m;i++){
            char ch = jewels.charAt(i);
            set.add(ch);
        }
        for(int i=0;i<n;i++){
            char ch = stones.charAt(i);
            map.add(ch);
        }
         for(int i=0;i<n;i++){
            char ch = stones.charAt(i);
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    
        
    }
}