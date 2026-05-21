class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] arr2 = new int[n];
        Stack<Integer> st = new Stack<>();
        
        arr2[n-1] = 0;
        
        st.push(n-1);
        
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                arr2[i] = st.peek()-i;
            }
            else{
                arr2[i] = 0;
            }
            st.push(i);
        }
        return arr2;
        
    }
}