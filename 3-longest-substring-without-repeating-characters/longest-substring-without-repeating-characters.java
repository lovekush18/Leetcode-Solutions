class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int n = s.length();
        // int maxlen = 0;
        // for(int i=0;i<n;i++){
        //     HashSet<Character> set = new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         char ch = s.charAt(j);
        //         if(!set.contains(ch)){
        //             set.add(ch);
        //         }
        //         else{
        //             break;
        //         }
        //         maxlen = Math.max(maxlen,j-i+1);
        //     }
        // }
        // return maxlen;
      

      // Sliding Window 
      int n = s.length();
      int l = 0, r = 0, maxlen = 0;
      HashSet<Character> set = new HashSet<>();
      while(r<n){
        char ch = s.charAt(r);
        
        while((set.contains(ch))){
            set.remove(s.charAt(l));
            l++;
        }
        
        if(!set.contains(ch)){
            set.add(ch);
            maxlen =Math.max(maxlen,r-l+1);
        }
        r++;
      }
     return maxlen;
    }
}