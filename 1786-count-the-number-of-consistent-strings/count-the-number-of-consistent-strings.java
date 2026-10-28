class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            String s = words[i];
            boolean flag = true;
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                String a = String.valueOf(ch);
                if(!(allowed.contains(a))){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                count++;
            }
        }
        return count;
    }
}