class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String m = String.valueOf(x);
        List<Integer> list = new ArrayList<>();
         for(int i=0;i<words.length;i++){
            String s1 = words[i];
            if(s1.contains(m)){
                list.add(i);
            }
         }
         return list;
    }
}