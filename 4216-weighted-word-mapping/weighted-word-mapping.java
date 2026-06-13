class Solution {
    public String mapWordWeights(String[] words, int[] weights)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum = 0;
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                int pos = weights[ch-'a'];
                sum+=pos;
            }
            
            int mod = sum%26;
            char s = (char)('z'-mod);
            sb.append(s);
        }
        return sb.toString();
    }
}