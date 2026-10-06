class Solution {
    public String sortSentence(String s) {
       
         String[] arr = s.split(" ");
        
         int n = arr.length;
          String[] ans = new String[n];
         for(int i=0;i<n;i++){
            String el = arr[i];
            char[] arr1 = el.toCharArray();
            int m = arr1.length;
            int pos = arr1[m-1]-'0';
            String ans1 = el.substring(0,m-1);
            ans[pos-1] = ans1;
 
         }

         StringBuilder sb = new StringBuilder();
         for(int i=0;i<n;i++){
            sb.append(ans[i] + " ");
         }
         String up = sb.toString();
         return up.trim();
        
    }
}