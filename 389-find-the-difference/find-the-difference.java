class Solution {
    public char findTheDifference(String s, String t) {
        int m = s.length();
        int n = t.length();
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<m;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<n;i++){
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                int count = map2.get(ch);
                map2.put(ch,count+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        ArrayList<Character> arr = new ArrayList<>(map2.keySet());
        for(int i=0;i<arr.size();i++){
            char ch = arr.get(i);
            if(map.get(ch)!=map2.get(ch)){
                return ch;
            }
        }
        return '#';


        
    }
}