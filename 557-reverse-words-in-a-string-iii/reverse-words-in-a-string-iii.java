class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i= 0;i<n;i++){
            String s1 = arr[i];
           
            for(int j=0;j<s1.length();j++){
                st.push(s1.charAt(j));
            }
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            sb.append(" ");
            
             
        }      
        String l = sb.toString();
        return l.strip();
        
    }
}