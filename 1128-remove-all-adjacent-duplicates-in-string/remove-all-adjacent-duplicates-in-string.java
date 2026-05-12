class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        StringBuffer sv = new StringBuffer();
        while(!st2.isEmpty()){
             sv.append(st2.pop());
        
        
        }
        return sv.toString();
        
       
    }
}