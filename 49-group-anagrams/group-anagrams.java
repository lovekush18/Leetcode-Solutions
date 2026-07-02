class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = s.length;
        for(int i=0;i<n;i++){
            String word = s[i];
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                List<String> list1 = new ArrayList<>();
                map.put(key, list1);
            }
            List<String> list2 = map.get(key);
            list2.add(word);
        }
       List<List<String>> list = new ArrayList<>(map.values());
       return list;
           
    }
}