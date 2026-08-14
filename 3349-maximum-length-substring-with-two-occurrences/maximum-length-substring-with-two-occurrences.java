class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int l = 0 , r = 0;
        int maxlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                int c1 = map.get(ch);
                map.put(ch,c1+1);
            }
            else{
                map.put(ch,1);
            }
            while(map.get(ch)>2){
                char ch2 = s.charAt(l);
                int c2 = map.get(ch2);
                if(c2==1){
                    map.remove(ch2);
                }
                else{
                    map.put(ch2,c2-1);
                }
                l++;
            }
            if(map.get(ch)<=2){
                maxlen = Math.max(maxlen,r-l+1);
                r++;
            }
        }
        return maxlen;
        
    }
}