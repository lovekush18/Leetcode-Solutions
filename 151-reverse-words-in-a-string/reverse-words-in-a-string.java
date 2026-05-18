class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        
         String[] arr = s.trim().split("\\s+");
        int n = arr.length;
        for(int i=0;i<n;i++){
            String m = arr[i];
            st.push(m);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}