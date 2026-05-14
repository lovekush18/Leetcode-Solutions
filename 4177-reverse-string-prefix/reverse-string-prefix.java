class Solution {
    public String reversePrefix(String s, int k) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        for(int i=k;i<n;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
}