class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char a = s.charAt(i);
            if(a=='*'){
                st.pop();
            }
            else{
                st.push(a);
            }
        }
        String l = "";
        int l1 = st.size();
        for(int i=0;i<l1;i++){
            char el = st.get(i);
            l+=el;
        }
        return l;
    }
}