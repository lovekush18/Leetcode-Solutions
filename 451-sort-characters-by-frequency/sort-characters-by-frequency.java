class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch,count+1);
            }
            else{
                 map.put(ch,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        int u = list.size();
        list.sort((a,b)->
        {
            if(map.get(a)!=map.get(b)){
                return map.get(b)-map.get(a);
            }
            else if(map.get(a)==map.get(b)){
                return a-b;
            }
            else{
                return 0;
            }
            
        }
        );
        int ind = 0;
        for(int i=0;i<u;i++){
            char ch = list.get(i);
            int fr = map.get(ch);
            for(int j=0;j<fr;j++){
                sb.append(ch);
            }
        }
        return sb.toString();
        
        
    }
}